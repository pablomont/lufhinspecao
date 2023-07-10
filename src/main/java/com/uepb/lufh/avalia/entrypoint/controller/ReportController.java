package com.uepb.lufh.avalia.entrypoint.controller;

import com.uepb.lufh.avalia.core.domain.AnswerDomain;
import com.uepb.lufh.avalia.core.domain.ReportDomain;
import com.uepb.lufh.avalia.core.usecase.report.CreateReportUseCase;
import com.uepb.lufh.avalia.entrypoint.contract.api.ReportsApi;
import com.uepb.lufh.avalia.entrypoint.contract.model.Answer;
import com.uepb.lufh.avalia.entrypoint.contract.model.ReportInput;
import com.uepb.lufh.avalia.entrypoint.contract.model.ReportOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class ReportController implements ReportsApi {

    private final CreateReportUseCase createReportUseCase;

    @Override
    public ResponseEntity<ReportOutput> createReport(final ReportInput reportInput) {
        var reportDomain = ReportDomain.builder()
            .answers(buildAnswerDomainList(reportInput.getAnswer()))
            .questionnaireId(reportInput.getQuestionnaireId().longValue())
            .requestEvaluationId(reportInput.getRequestEvaluationId().longValue())
            .build();

        return ResponseEntity.ok(createOutput(createReportUseCase.execute(reportDomain)));
    }


    private ReportOutput createOutput(final ReportDomain reportDomain) {

        var answerList = reportDomain.getAnswers().stream().map(this::buildAnswer).collect(Collectors.toList());
        var reportOutput = new ReportOutput();

        reportOutput.setAnswer(answerList);
        reportOutput.setId(reportDomain.getReportId().intValue());
        reportOutput.setQuestionnaireId(reportDomain.getQuestionnaireId().intValue());
        reportOutput.setRequestEvaluationId(reportDomain.getRequestEvaluationId().intValue());

        return reportOutput;
    }

    private Answer buildAnswer(final AnswerDomain answerDomain) {

        var answer = new Answer();
        answer.setAnswer(answer.getAnswer());
        answer.setSeverity(Answer.SeverityEnum.fromValue(answerDomain.getSeverity()));
        answer.setWeight(Answer.WeightEnum.fromValue(answerDomain.getWeight()));

        return answer;
    }

    private List<AnswerDomain> buildAnswerDomainList(final List<Answer> answers) {

        return answers.stream().map(answer -> AnswerDomain.builder()
            .answer(answer.getAnswer())
            .weight(answer.getWeight().getValue())
            .severity(answer.getSeverity().getValue())
            .build()).collect(Collectors.toList());
    }

}
