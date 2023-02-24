package com.uepb.lufh.avalia.core.domain;

import com.uepb.lufh.avalia.core.vo.CpfCnpjValueObject;
import com.uepb.lufh.avalia.entrypoint.contract.model.RequestEvaluationInput;
import com.uepb.lufh.avalia.entrypoint.contract.model.RequestEvaluationOutput;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestEvaluationDomain {

    private String id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Boolean urgency;
    private String testType;
    private String coverage;

    private ProductDomain productDomain;

    private CpfCnpjValueObject cpfCnpjValueObject;

    public RequestEvaluationDomain(RequestEvaluationInput requestEvaluationInput) {
        this.startDate = requestEvaluationInput.getStartDate().toLocalDateTime();
        this.endDate = requestEvaluationInput.getEndDate().toLocalDateTime();
        this.urgency = requestEvaluationInput.getUrgency();
        this.testType = requestEvaluationInput.getTestType().getValue();
        this.coverage = requestEvaluationInput.getCoverage();
    }

    public RequestEvaluationOutput toOutput() {
        RequestEvaluationOutput requestEvaluationOutput = new RequestEvaluationOutput();
        requestEvaluationOutput.setId(Long.valueOf(this.id));


        return requestEvaluationOutput;
    }

}
