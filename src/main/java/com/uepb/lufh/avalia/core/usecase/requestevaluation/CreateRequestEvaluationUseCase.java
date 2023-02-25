package com.uepb.lufh.avalia.core.usecase.requestevaluation;

import com.uepb.lufh.avalia.core.domain.CustomerDomain;
import com.uepb.lufh.avalia.core.domain.ProductDomain;
import com.uepb.lufh.avalia.core.domain.RequestEvaluationDomain;
import com.uepb.lufh.avalia.core.gateway.CustomerGateway;
import com.uepb.lufh.avalia.core.gateway.ProductGateway;
import com.uepb.lufh.avalia.core.gateway.RequestEvaluationGateway;
import com.uepb.lufh.avalia.dataprovider.exception.CustomerNotFoundException;
import com.uepb.lufh.avalia.dataprovider.exception.CustomerNotSavedException;
import com.uepb.lufh.avalia.dataprovider.exception.ProductNotFoundException;
import com.uepb.lufh.avalia.dataprovider.exception.RequestEvaluationNotSavedException;
import com.uepb.lufh.avalia.entrypoint.contract.model.RequestEvaluationInput;
import com.uepb.lufh.avalia.entrypoint.contract.model.RequestEvaluationOutput;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CreateRequestEvaluationUseCase {

    public static final String REGEX_CPF_CNPJ = "[^\\d]+";
    public static final String EMPTY_STRING = "";
    private final ProductGateway productGateway;

    private final CustomerGateway customerGateway;
    private final RequestEvaluationGateway requestEvaluationGateway;

    public RequestEvaluationOutput execute(RequestEvaluationInput requestEvaluationInput, String productId, final String customerCpfCnpj){

        var cpfCnpj = customerCpfCnpj.replaceAll(REGEX_CPF_CNPJ, EMPTY_STRING);

        ProductDomain productDomain = productGateway.findProductByProductId(Long.valueOf(productId)).orElseThrow(() -> {
            log.error("Product with id {} not found", productId);
            throw new ProductNotFoundException(productId);
        });

        CustomerDomain customerDomain = customerGateway.findCustomerByCpfCnpj(cpfCnpj).orElseThrow(() -> {
            log.error("Customer with cpfCnpj {} not found", customerCpfCnpj);
            throw new CustomerNotFoundException(customerCpfCnpj);
        });

        var requestEvaluationDomain = RequestEvaluationDomain.builder()
            .productDomain(productDomain)
            .customerDomain(customerDomain)
            .startDate(requestEvaluationInput.getStartDate())
            .endDate(requestEvaluationInput.getEndDate())
            .coverage(requestEvaluationInput.getCoverage())
            .urgency(requestEvaluationInput.getUrgency())
            .testType(requestEvaluationInput.getTestType().getValue())
            .build();

        return requestEvaluationGateway.save(requestEvaluationDomain)
            .orElseThrow(() -> new RequestEvaluationNotSavedException(customerCpfCnpj,productId))
            .toOutput();

    }

}
