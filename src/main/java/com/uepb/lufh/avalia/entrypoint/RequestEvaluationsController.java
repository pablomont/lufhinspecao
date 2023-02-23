package com.uepb.lufh.avalia.entrypoint;


import com.uepb.lufh.avalia.entrypoint.contract.api.RequestEvaluationsApi;
import com.uepb.lufh.avalia.entrypoint.contract.model.RequestEvaluation;
import com.uepb.lufh.avalia.entrypoint.contract.model.RequestEvaluationInput;
import com.uepb.lufh.avalia.entrypoint.contract.model.RequestEvaluationOutput;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class RequestEvaluationsController implements RequestEvaluationsApi {

    @Override
    public ResponseEntity<RequestEvaluationOutput> createRequestEvaluation(final String productId, final String customerCpfCnpj,
        final RequestEvaluationInput requestEvaluationInput) {
        return ResponseEntity.of(Optional.of((new RequestEvaluationOutput())));

    }

}
