package com.uepb.lufh.avalia.dataprovider.database.gateway;

import com.uepb.lufh.avalia.core.domain.RequestEvaluationDomain;
import com.uepb.lufh.avalia.core.gateway.RequestEvaluationGateway;
import com.uepb.lufh.avalia.dataprovider.database.entity.RequestEvaluationEntity;
import com.uepb.lufh.avalia.dataprovider.database.repository.RequestEvaluationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class RequestEvaluationGatewayImpl implements RequestEvaluationGateway {

    private final RequestEvaluationRepository requestEvaluationRepository;

    @Override
    public RequestEvaluationDomain save(final RequestEvaluationDomain requestEvaluationDomain) {
        return requestEvaluationRepository.save(new RequestEvaluationEntity(requestEvaluationDomain)).toDomain();
    }

}
