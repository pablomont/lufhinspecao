package com.uepb.lufh.avalia.core.gateway;

import com.uepb.lufh.avalia.core.domain.RequestEvaluationDomain;

import java.util.Optional;

public interface RequestEvaluationGateway {
    Optional<RequestEvaluationDomain> save(RequestEvaluationDomain requestEvaluationDomain);
}
