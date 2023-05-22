package com.uepb.lufh.avalia.core.usecase.questionnaire;

import com.uepb.lufh.avalia.core.domain.QuestionnaireDomain;
import com.uepb.lufh.avalia.core.gateway.QuestionGateway;
import com.uepb.lufh.avalia.core.gateway.QuestionnaireGateway;
import com.uepb.lufh.avalia.dataprovider.exception.QuestionnaireNotSavedException;
import com.uepb.lufh.avalia.dataprovider.exception.QuestionsNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class CreateQuestionnaireUseCase {

    private final QuestionGateway questionGateway;

    private final QuestionnaireGateway questionnaireGateway;

    public QuestionnaireDomain execute(QuestionnaireDomain questionnaireDomain, final List<String> questionIds) {

        var questionIdsToSaveInQuestionnaire = questionIds.stream().map(Long::parseLong).collect(Collectors.toList());

        questionGateway.findQuestionListByQuestionIds(questionIdsToSaveInQuestionnaire)
            .ifPresentOrElse(questionnaireDomain::setQuestions, () -> {throw new QuestionsNotFoundException(questionIdsToSaveInQuestionnaire);});

        return questionnaireGateway.createQuestionnaire(questionnaireDomain).orElseThrow(QuestionnaireNotSavedException::new);
    }

}
