package com.uepb.lufh.avalia.dataprovider.database.gateway;

import com.uepb.lufh.avalia.core.domain.RequestEvaluationDomain;
import com.uepb.lufh.avalia.core.gateway.RequestEvaluationGateway;
import com.uepb.lufh.avalia.dataprovider.database.entity.RequestEvaluationEntity;
import com.uepb.lufh.avalia.dataprovider.database.repository.RequestEvaluationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class RequestEvaluationGatewayImpl implements RequestEvaluationGateway {

    private final RequestEvaluationRepository requestEvaluationRepository;

    @Override
    public Optional<RequestEvaluationDomain> save(final RequestEvaluationDomain requestEvaluationDomain) {
        log.info("Creating request evaluation, cpf: {}", requestEvaluationDomain.getCustomerDomain().getCpfCnpjValueObject().toString());
        return Optional.ofNullable(requestEvaluationRepository.save(new RequestEvaluationEntity(requestEvaluationDomain)).toDomain());
    }

}
