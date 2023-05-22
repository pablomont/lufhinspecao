package com.uepb.lufh.avalia.entrypoint.controller;


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

        var requestEvaluationDomain = RequestEvaluationDomain.builder()
            .startDate(requestEvaluationInput.getStartDate())
            .endDate(requestEvaluationInput.getEndDate())
            .coverage(requestEvaluationInput.getCoverage())
            .urgency(requestEvaluationInput.getUrgency())
            .testType(requestEvaluationInput.getTestType().getValue())
            .build();

        return ResponseEntity.ok(createOutput(createRequestEvaluationUseCaseImpl.execute(requestEvaluationDomain, productId, customerCpfCnpj)));

    }

    private RequestEvaluationOutput createOutput(final RequestEvaluationDomain requestEvaluationDomain) {
        RequestEvaluationOutput requestEvaluationOutput = new RequestEvaluationOutput();
        requestEvaluationOutput.setId(Long.valueOf(requestEvaluationDomain.getId()));
        requestEvaluationOutput.setCoverage(requestEvaluationDomain.getCoverage());
        requestEvaluationOutput.startDate(requestEvaluationDomain.getStartDate());
        requestEvaluationOutput.setEndDate(requestEvaluationDomain.getEndDate());
        requestEvaluationOutput.urgency(requestEvaluationDomain.getUrgency());
        requestEvaluationOutput.testType(RequestEvaluationOutput.TestTypeEnum.fromValue(requestEvaluationDomain.getTestType()));
        requestEvaluationOutput.coverage(requestEvaluationDomain.getCoverage());
        requestEvaluationOutput.setCustomerCpfCnpj(requestEvaluationDomain.getCustomerDomain().getCpfCnpjValueObject().toString());
        requestEvaluationOutput.setProductId(requestEvaluationDomain.getProductDomain().getId().toString());

        return requestEvaluationOutput;
    }

}
