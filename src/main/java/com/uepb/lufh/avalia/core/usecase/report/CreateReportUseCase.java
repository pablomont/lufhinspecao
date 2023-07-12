package com.uepb.lufh.avalia.core.usecase.report;

import com.uepb.lufh.avalia.core.domain.ReportDomain;
import com.uepb.lufh.avalia.core.gateway.AnswerGateway;
import com.uepb.lufh.avalia.core.gateway.QuestionnaireGateway;
import com.uepb.lufh.avalia.core.gateway.ReportGateway;
import com.uepb.lufh.avalia.core.gateway.RequestEvaluationGateway;
import com.uepb.lufh.avalia.dataprovider.exception.RequestEvaluationNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayDeque;

@Slf4j
@Service
@RequiredArgsConstructor
public class CreateReportUseCase {

    private final ReportGateway reportGateway;
    private final QuestionnaireGateway questionnaireGateway;
    private final RequestEvaluationGateway requestEvaluationGateway;

    private final AnswerGateway answerGateway;

    @Transactional
    public ReportDomain execute(ReportDomain reportDomain) {

        long requestEvaluationId = Long.parseLong(reportDomain.getRequestEvaluationDomain().getId());

        var requestEvaluationDomain = requestEvaluationGateway.findByRequestEvaluationId(requestEvaluationId)
            .orElseThrow(() -> {
                log.error("Request Evaluation with id {} not found", requestEvaluationId);
                throw new RequestEvaluationNotFoundException(requestEvaluationId);
            });

        Long questionnaireId = reportDomain.getQuestionnaireDomain().getQuestionnaireId();

        var questionnaireDomain = questionnaireGateway.findByQuestionnaireId(questionnaireId)
            .orElseThrow(() -> {
                log.error("Questionnaire with id {} not found", questionnaireId);
                throw new RequestEvaluationNotFoundException(questionnaireId);
            });

        var dequeAnswers = new ArrayDeque<>(reportDomain.getAnswers());
        reportDomain.getAnswers().clear();

        var seqValue = reportGateway.getCurrValReportSeq() + 1;
        questionnaireDomain.getQuestions().forEach(questionDomain ->
            answerGateway.save(dequeAnswers.removeFirst()).ifPresent(answerDomainResult -> {
                reportDomain.setRequestEvaluationDomain(requestEvaluationDomain);
                reportDomain.setQuestionnaireDomain(questionnaireDomain);
                reportDomain.setReportId(seqValue);
                reportGateway.save(reportDomain, questionDomain, answerDomainResult).
                    ifPresent(reportDomainResult -> reportDomain.setReportId(reportDomainResult.getReportId()));
                reportDomain.getAnswers().add(answerDomainResult);
            }));

        reportGateway.updateReportSeqVal(seqValue);
        return reportDomain;
    }

}
