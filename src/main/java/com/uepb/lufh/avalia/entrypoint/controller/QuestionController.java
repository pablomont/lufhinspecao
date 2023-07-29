package com.uepb.lufh.avalia.entrypoint.controller;

import com.uepb.lufh.avalia.core.domain.QuestionDomain;
import com.uepb.lufh.avalia.core.usecase.question.CreateQuestionUseCase;
import com.uepb.lufh.avalia.entrypoint.contract.api.QuestionsApi;
import com.uepb.lufh.avalia.entrypoint.contract.model.ModelClass;
import com.uepb.lufh.avalia.entrypoint.contract.model.QuestionInput;
import com.uepb.lufh.avalia.entrypoint.contract.model.QuestionOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class QuestionController implements QuestionsApi {

    private final CreateQuestionUseCase createQuestionUseCase;

    @Override
    public ResponseEntity<QuestionOutput> createQuestion(final QuestionInput questionInput) {

        var questionDomain = QuestionDomain.builder()
            .baseQuestion(questionInput.getBaseQuestion())
            .detailedQuestion(questionInput.getDetailedQuestion())
            .questionClass(questionInput.getPropertyClass().getName().getValue())
            .productType(questionInput.getProductType().getValue())
            .build();

        return ResponseEntity.ok(createOutput(createQuestionUseCase.execute(questionDomain)));
    }

    private QuestionOutput createOutput(final QuestionDomain questionDomain) {

        var questionOutput = new QuestionOutput();
        questionOutput.setBaseQuestion(questionDomain.getBaseQuestion());
        questionOutput.setDetailedQuestion(questionDomain.getDetailedQuestion());
        questionOutput.setProductType(QuestionOutput.ProductTypeEnum.fromValue(questionDomain.getProductType()));

        var modelClass = new ModelClass();
        modelClass.setName(ModelClass.NameEnum.fromValue(questionDomain.getQuestionClass()));

        questionOutput.setPropertyClass(modelClass);
        questionOutput.setId(questionDomain.getQuestionId());

        return questionOutput;
    }

}
