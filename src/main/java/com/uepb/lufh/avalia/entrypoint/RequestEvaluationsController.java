package com.uepb.lufh.avalia.entrypoint;


import com.uepb.lufh.avalia.entrypoint.contract.api.RequestEvaluationsApi;
import com.uepb.lufh.avalia.entrypoint.contract.model.RequestEvaluation;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class RequestEvaluationsController implements RequestEvaluationsApi {


    @Override
    public ResponseEntity<List<RequestEvaluation>> findRequestEvaluations(final String customerCpfCnpj) {
        return ResponseEntity.of(Optional.of(Collections.singletonList(new RequestEvaluation())));
    }

}
