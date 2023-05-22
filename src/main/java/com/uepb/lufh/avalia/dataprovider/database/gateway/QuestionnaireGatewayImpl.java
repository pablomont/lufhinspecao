package com.uepb.lufh.avalia.dataprovider.database.gateway;

import com.uepb.lufh.avalia.core.domain.QuestionnaireDomain;
import com.uepb.lufh.avalia.core.gateway.QuestionnaireGateway;
import com.uepb.lufh.avalia.dataprovider.database.entity.QuestionnaireEntity;
import com.uepb.lufh.avalia.dataprovider.database.repository.QuestionnaireRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class QuestionnaireGatewayImpl implements QuestionnaireGateway {

    private final QuestionnaireRepository questionnaireRepository;


    @Override
    public Optional<QuestionnaireDomain> createQuestionnaire(final QuestionnaireDomain questionnaireDomain) {

        return Optional.of(questionnaireRepository.save(new QuestionnaireEntity(questionnaireDomain)))
            .map(QuestionnaireEntity::toDomain);
    }

}
