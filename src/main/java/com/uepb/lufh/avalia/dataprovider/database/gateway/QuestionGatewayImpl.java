package com.uepb.lufh.avalia.dataprovider.database.gateway;

import com.uepb.lufh.avalia.core.domain.QuestionDomain;
import com.uepb.lufh.avalia.core.gateway.QuestionGateway;
import com.uepb.lufh.avalia.dataprovider.database.entity.QuestionEntity;
import com.uepb.lufh.avalia.dataprovider.database.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class QuestionGatewayImpl implements QuestionGateway {

    private final QuestionRepository questionRepository;

    @Override
    public Optional<List<QuestionDomain>> findQuestionListByQuestionIds(final List<Long> questionIds) {
        return Optional.of(questionRepository.findAllByIdIn(questionIds))
            .map(this::buildQuestionDomainList);
    }

    @Override
    public Optional<QuestionDomain> save(final QuestionDomain questionDomain) {
        return Optional.of(questionRepository.save(new QuestionEntity(questionDomain)).toDomain());
    }

    private List<QuestionDomain> buildQuestionDomainList(final List<QuestionEntity> questionEntities) {

        return questionEntities.stream().map(QuestionEntity::toDomain)
            .collect(Collectors.toList());

    }

}
