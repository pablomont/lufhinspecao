package com.uepb.lufh.avalia.entrypoint;


import com.uepb.lufh.avalia.core.domain.RequestEvaluationDomain;
import com.uepb.lufh.avalia.core.usecase.requestevaluation.CreateRequestEvaluationUseCase;
import com.uepb.lufh.avalia.entrypoint.contract.api.RequestEvaluationsApi;
import com.uepb.lufh.avalia.entrypoint.contract.model.RequestEvaluationInput;
import com.uepb.lufh.avalia.entrypoint.contract.model.RequestEvaluationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RequestEvaluationsController implements RequestEvaluationsApi {

    private final CreateRequestEvaluationUseCase createRequestEvaluationUseCaseImpl;

    @Override
    public ResponseEntity<RequestEvaluationOutput> createRequestEvaluation(final String productId, final String customerCpfCnpj,
        final RequestEvaluationInput requestEvaluationInput) {
        return ResponseEntity.ok(createRequestEvaluationUseCaseImpl.execute(new RequestEvaluationDomain(requestEvaluationInput), productId));

    }

}
