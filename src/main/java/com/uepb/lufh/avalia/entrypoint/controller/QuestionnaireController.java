package com.uepb.lufh.avalia.entrypoint.controller;

import com.uepb.lufh.avalia.core.domain.QuestionDomain;
import com.uepb.lufh.avalia.core.domain.QuestionnaireDomain;
import com.uepb.lufh.avalia.core.usecase.questionnaire.CreateQuestionnaireUseCase;
import com.uepb.lufh.avalia.entrypoint.contract.api.QuestionnairesApi;
import com.uepb.lufh.avalia.entrypoint.contract.model.ModelClass;
import com.uepb.lufh.avalia.entrypoint.contract.model.QuestionOutput;
import com.uepb.lufh.avalia.entrypoint.contract.model.QuestionnaireInput;
import com.uepb.lufh.avalia.entrypoint.contract.model.QuestionnaireOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class QuestionnaireController implements QuestionnairesApi {

    private final CreateQuestionnaireUseCase createQuestionnaireUseCase;

    @Override
    public ResponseEntity<QuestionnaireOutput> createQuestionaire(final QuestionnaireInput questionnaireInput) {

        var questionnaireDomain = QuestionnaireDomain.builder()
            .creator(questionnaireInput.getCreator())
            .evaluator(questionnaireInput.getEvaluator())
            .build();

        return ResponseEntity.ok(createOutput(createQuestionnaireUseCase.execute(questionnaireDomain, questionnaireInput.getQuestionIds())));
    }

    private QuestionnaireOutput createOutput(final QuestionnaireDomain questionnaireDomain) {
        var questionnaireOutput = new QuestionnaireOutput();
        questionnaireOutput.setCreator(questionnaireDomain.getCreator());
        questionnaireOutput.setEvaluator(questionnaireOutput.getEvaluator());
        questionnaireOutput.setId(questionnaireDomain.getQuestionnaireId());
        questionnaireOutput.setQuestions(createQuestionOutputList(questionnaireDomain.getQuestions()));

        return questionnaireOutput;
    }

    private List<QuestionOutput> createQuestionOutputList(final List<QuestionDomain> questions) {
        return questions.stream().map(this::createQuestionOutput).collect(Collectors.toList());
    }

    private QuestionOutput createQuestionOutput(final QuestionDomain questionDomain) {

        var questionOutput = new QuestionOutput();
        questionOutput.setBaseQuestion(questionDomain.getBaseQuestion());
        questionOutput.setDetailedQuestion(questionDomain.getDetailedQuestion());
        questionOutput.setProductType(QuestionOutput.ProductTypeEnum.fromValue(questionDomain.getProductType()));

        var modelClass = new ModelClass();
        modelClass.setName(ModelClass.NameEnum.fromValue(questionDomain.getQuestionClass()));

        questionOutput.setPropertyClass(modelClass);

        return questionOutput;
    }

}
