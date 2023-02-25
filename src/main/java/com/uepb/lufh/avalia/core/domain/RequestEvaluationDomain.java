package com.uepb.lufh.avalia.core.domain;

import com.uepb.lufh.avalia.entrypoint.contract.model.RequestEvaluationOutput;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;


@Builder
@Getter
@RequiredArgsConstructor
public class RequestEvaluationDomain {

    private final String id;
    private final LocalDateTime startDate;
    private final LocalDateTime endDate;
    private final Boolean urgency;
    private final String testType;
    private final String coverage;
    private final ProductDomain productDomain;

    private final CustomerDomain customerDomain;


    public RequestEvaluationOutput toOutput() {
        RequestEvaluationOutput requestEvaluationOutput = new RequestEvaluationOutput();
        requestEvaluationOutput.setId(Long.valueOf(this.id));
        requestEvaluationOutput.setCoverage(coverage);
        requestEvaluationOutput.startDate(startDate);
        requestEvaluationOutput.setEndDate(endDate);
        requestEvaluationOutput.urgency(urgency);
        requestEvaluationOutput.testType(RequestEvaluationOutput.TestTypeEnum.fromValue(testType));
        requestEvaluationOutput.coverage(coverage);
        requestEvaluationOutput.setCustomerCpfCnpj(customerDomain.getCpfCnpjValueObject().toString());
        requestEvaluationOutput.setProductId(productDomain.getId().toString());

        return requestEvaluationOutput;
    }

}
