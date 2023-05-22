package com.uepb.lufh.avalia.entrypoint.controller;

import com.uepb.lufh.avalia.core.domain.QuestionDomain;
import com.uepb.lufh.avalia.core.domain.QuestionnaireDomain;
import com.uepb.lufh.avalia.core.usecase.questionnaire.CreateQuestionnaireUseCase;
import com.uepb.lufh.avalia.entrypoint.contract.api.QuestionnairesApi;
import com.uepb.lufh.avalia.entrypoint.contract.model.ModelClass;
import com.uepb.lufh.avalia.entrypoint.contract.model.QuestionInput;
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
    public ResponseEntity<Void> createQuestionaire(final QuestionnaireInput questionnaireInput){

        var questionnaireDomain = QuestionnaireDomain.builder()
            .creator(questionnaireInput.getCreator())
            .evaluator(questionnaireInput.getEvaluator())
            .questions(createQuestionDomainList(questionnaireInput.getQuestions()))
            .build();

        var result = createOutput(createQuestionnaireUseCase.execute(questionnaireDomain));

        return null;
    }

    private QuestionnaireOutput createOutput(final QuestionnaireDomain questionnaireDomain) {
        var questionnaireOutput = new QuestionnaireOutput();
        questionnaireOutput.setCreator(questionnaireDomain.getCreator());
        questionnaireOutput.setEvaluator(questionnaireOutput.getEvaluator());
        questionnaireOutput.setId(questionnaireDomain.getQuestionnaireId());
        questionnaireOutput.setQuestions(createQuestionOutputList(questionnaireDomain.getQuestions()));

        return questionnaireOutput;
    }

    private List<QuestionDomain> createQuestionDomainList(final List<QuestionInput> questions) {

        return questions.stream().map(this::createQuestionDomain).collect(Collectors.toList());

    }

    private QuestionDomain createQuestionDomain(final QuestionInput questionInput) {
        return QuestionDomain.builder()
            .baseQuestion(questionInput.getBaseQuestion())
            .detailedQuestion(questionInput.getDetailedQuestion())
            .questionClass(questionInput.getPropertyClass().toString())
            .productType(questionInput.getProductType().getValue())
            //TODO .questionId(questionInput.getQuestionId()))
            .build();
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
