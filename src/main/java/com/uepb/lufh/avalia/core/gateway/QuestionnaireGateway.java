package com.uepb.lufh.avalia.core.gateway;

import com.uepb.lufh.avalia.core.domain.QuestionnaireDomain;

import java.util.Optional;

public interface QuestionnaireGateway {
    Optional<QuestionnaireDomain> createQuestionnaire(QuestionnaireDomain questionnaireDomain);
}
