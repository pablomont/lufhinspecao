package com.uepb.lufh.avalia.core.domain;

import com.uepb.lufh.avalia.core.vo.CpfCnpjValueObject;
import com.uepb.lufh.avalia.entrypoint.contract.model.RequestEvaluationInput;
import com.uepb.lufh.avalia.entrypoint.contract.model.RequestEvaluationOutput;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Builder
@Getter
public class RequestEvaluationDomain {

    private String id;
    private final LocalDateTime startDate;
    private final LocalDateTime endDate;
    private final Boolean urgency;
    private final String testType;
    private final String coverage;
    private ProductDomain productDomain;

    private CustomerDomain customerDomain;


    public RequestEvaluationOutput toOutput() {
        RequestEvaluationOutput requestEvaluationOutput = new RequestEvaluationOutput();
        requestEvaluationOutput.setId(Long.valueOf(this.id));


        return requestEvaluationOutput;
    }

}
