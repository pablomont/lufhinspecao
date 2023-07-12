package com.uepb.lufh.avalia.entrypoint.controller;

import com.uepb.lufh.avalia.core.domain.AnswerDomain;
import com.uepb.lufh.avalia.core.domain.QuestionDomain;
import com.uepb.lufh.avalia.core.domain.QuestionnaireDomain;
import com.uepb.lufh.avalia.core.domain.ReportDomain;
import com.uepb.lufh.avalia.core.domain.RequestEvaluationDomain;
import com.uepb.lufh.avalia.core.usecase.report.CreateReportUseCase;
import com.uepb.lufh.avalia.entrypoint.contract.api.ReportsApi;
import com.uepb.lufh.avalia.entrypoint.contract.model.Answer;
import com.uepb.lufh.avalia.entrypoint.contract.model.AnsweredQuestion;
import com.uepb.lufh.avalia.entrypoint.contract.model.ModelClass;
import com.uepb.lufh.avalia.entrypoint.contract.model.QuestionOutput;
import com.uepb.lufh.avalia.entrypoint.contract.model.Questionnaire;
import com.uepb.lufh.avalia.entrypoint.contract.model.ReportInput;
import com.uepb.lufh.avalia.entrypoint.contract.model.ReportOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class ReportController implements ReportsApi {

    private final CreateReportUseCase createReportUseCase;

    @Override
    public ResponseEntity<ReportOutput> createReport(final ReportInput reportInput) {
        var reportDomain = ReportDomain.builder()
            .answers(buildAnswerDomainList(reportInput.getAnswers()))
            .questionnaireDomain(QuestionnaireDomain.builder().questionnaireId(reportInput.getQuestionnaireId().longValue()).build())
            .requestEvaluationDomain(RequestEvaluationDomain.builder().id(reportInput.getRequestEvaluationId().toString()).build())
            .build();

        return ResponseEntity.ok(createOutput(createReportUseCase.execute(reportDomain)));
    }


    private ReportOutput createOutput(final ReportDomain reportDomain) {

        var answers = reportDomain.getAnswers().stream().map(this::buildAnswers).collect(Collectors.toList());
        var questionOutputs = reportDomain.getQuestionnaireDomain().getQuestions().stream().map(this::buildQuestions).collect(Collectors.toList());

        var answeredQuestions = buildAnsweredQuestions(answers, questionOutputs);
        var questionnaire = new Questionnaire();
        questionnaire.setId(reportDomain.getQuestionnaireDomain().getQuestionnaireId().intValue());
        questionnaire.setAnsweredQuestions(answeredQuestions);

        var reportOutput = new ReportOutput();
        reportOutput.setQuestionnaire(questionnaire);
        reportOutput.setRequestEvaluationId(Integer.valueOf(reportDomain.getRequestEvaluationDomain().getId()));
        reportOutput.setId(reportDomain.getReportId().intValue());

        return reportOutput;
    }

    private List<AnsweredQuestion> buildAnsweredQuestions(final List<Answer> answers, final List<QuestionOutput> questionOutputs) {
        List<AnsweredQuestion> answeredQuestionList = new ArrayList<>(questionOutputs.size());

        for (int i = 0; i < questionOutputs.size(); i++) {
            var questionOutput = questionOutputs.get(i);
            var answer = answers.get(i);
            var answeredQuestion = new AnsweredQuestion();
            answeredQuestion.setQuestion(questionOutput);
            answeredQuestion.setAnswer(answer);
            answeredQuestionList.add(answeredQuestion);
        }

        return answeredQuestionList;
    }

    private QuestionOutput buildQuestions(final QuestionDomain questionDomain) {
        var question = new QuestionOutput();
        question.setId(questionDomain.getQuestionId());
        question.setDetailedQuestion(questionDomain.getDetailedQuestion());
        question.setBaseQuestion(questionDomain.getBaseQuestion());
        question.setProductType(QuestionOutput.ProductTypeEnum.fromValue(questionDomain.getProductType()));
        var modelClass = new ModelClass();
        modelClass.setName(ModelClass.NameEnum.fromValue(questionDomain.getQuestionClass()));
        question.setPropertyClass(modelClass);
        return question;
    }

    private Answer buildAnswers(final AnswerDomain answerDomain) {

        var answer = new Answer();
        answer.setAnswer(answerDomain.getAnswer());
        answer.setSeverity(Answer.SeverityEnum.fromValue(answerDomain.getSeverity()));
        answer.setWeight(Answer.WeightEnum.fromValue(answerDomain.getWeight()));
        answer.setId(answerDomain.getId().intValue());

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
