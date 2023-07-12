package com.uepb.lufh.avalia.dataprovider.database.gateway;

import com.uepb.lufh.avalia.core.domain.AnswerDomain;
import com.uepb.lufh.avalia.core.gateway.AnswerGateway;
import com.uepb.lufh.avalia.dataprovider.database.entity.AnswerEntity;
import com.uepb.lufh.avalia.dataprovider.database.repository.AnswerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class AnswerGatewayImpl implements AnswerGateway {

    private final AnswerRepository answerRepository;

    @Override
    public Optional<AnswerDomain> save(final AnswerDomain answerDomain) {
        return Optional.ofNullable(answerRepository.save(new AnswerEntity(answerDomain)).toDomain());
    }

}
