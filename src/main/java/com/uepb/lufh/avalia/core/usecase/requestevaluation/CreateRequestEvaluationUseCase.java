package com.uepb.lufh.avalia.core.usecase.requestevaluation;

import com.uepb.lufh.avalia.core.domain.CustomerDomain;
import com.uepb.lufh.avalia.core.domain.ProductDomain;
import com.uepb.lufh.avalia.core.domain.RequestEvaluationDomain;
import com.uepb.lufh.avalia.core.gateway.CustomerGateway;
import com.uepb.lufh.avalia.core.vo.CpfCnpjValueObject;
import com.uepb.lufh.avalia.core.gateway.ProductGateway;
import com.uepb.lufh.avalia.core.gateway.RequestEvaluationGateway;
import com.uepb.lufh.avalia.dataprovider.exception.NotFoundException;
import com.uepb.lufh.avalia.entrypoint.contract.model.RequestEvaluationInput;
import com.uepb.lufh.avalia.entrypoint.contract.model.RequestEvaluationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateRequestEvaluationUseCase {

    private final ProductGateway productGateway;

    private final CustomerGateway customerGateway;
    private final RequestEvaluationGateway requestEvaluationGateway;

    public RequestEvaluationOutput execute(RequestEvaluationInput requestEvaluationInput, String productId, final String customerCpfCnpj){

        ProductDomain productDomain = productGateway.findProductByProductId(Long.valueOf(productId)).orElseThrow(() -> {
            throw new NotFoundException("Product",productId);
        });

//        CustomerDomain customerDomain = customerGateway.findCustomerByCpfCnpj(customerCpfCnpj).orElseThrow(() -> {
//            throw new NotFoundException("Customer", customerCpfCnpj);
//        });

        var requestEvaluationDomaiun = RequestEvaluationDomain.builder()
            .productDomain(productDomain)
            //.customerDomain(customerDomain)
            .startDate(requestEvaluationInput.getStartDate().toLocalDateTime())
            .endDate(requestEvaluationInput.getEndDate().toLocalDateTime())
            .coverage(requestEvaluationInput.getCoverage())
            .urgency(requestEvaluationInput.getUrgency())
            .testType(requestEvaluationInput.getTestType().getValue())
            .build();

        return requestEvaluationGateway.save(requestEvaluationDomaiun).toOutput();

    }

}
