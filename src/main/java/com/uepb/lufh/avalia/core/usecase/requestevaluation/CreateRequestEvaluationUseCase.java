package com.uepb.lufh.avalia.core.usecase.requestevaluation;

import com.uepb.lufh.avalia.core.domain.CustomerDomain;
import com.uepb.lufh.avalia.core.domain.ProductDomain;
import com.uepb.lufh.avalia.core.domain.RequestEvaluationDomain;
import com.uepb.lufh.avalia.core.gateway.CustomerGateway;
import com.uepb.lufh.avalia.core.gateway.ProductGateway;
import com.uepb.lufh.avalia.core.gateway.RequestEvaluationGateway;
import com.uepb.lufh.avalia.dataprovider.exception.CustomerNotFoundException;
import com.uepb.lufh.avalia.dataprovider.exception.ProductNotFoundException;
import com.uepb.lufh.avalia.dataprovider.exception.RequestEvaluationNotSavedException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CreateRequestEvaluationUseCase {

    private static final String REGEX_NON_NUMERIC_CHARS = "[^\\d]+";
    public static final String EMPTY_STRING = "";
    private final ProductGateway productGateway;

    private final CustomerGateway customerGateway;
    private final RequestEvaluationGateway requestEvaluationGateway;

    public RequestEvaluationDomain execute(RequestEvaluationDomain requestEvaluationDomain, String productId, final String customerCpfCnpj){

        var cpfCnpj = customerCpfCnpj.replaceAll(REGEX_NON_NUMERIC_CHARS, EMPTY_STRING);

        ProductDomain productDomain = productGateway.findProductByProductId(Long.valueOf(productId)).orElseThrow(() -> {
            log.error("Product with id {} not found", productId);
            throw new ProductNotFoundException(productId);
        });

        CustomerDomain customerDomain = customerGateway.findCustomerByCpfCnpj(cpfCnpj).orElseThrow(() -> {
            log.error("Customer with cpfCnpj {} not found", customerCpfCnpj);
            throw new CustomerNotFoundException(customerCpfCnpj);
        });

        var requestEvaluationDomainToSave = RequestEvaluationDomain.builder()
            .productDomain(productDomain)
            .customerDomain(customerDomain)
            .startDate(requestEvaluationDomain.getStartDate())
            .endDate(requestEvaluationDomain.getEndDate())
            .coverage(requestEvaluationDomain.getCoverage())
            .urgency(requestEvaluationDomain.getUrgency())
            .testType(requestEvaluationDomain.getTestType())
            .build();

        return requestEvaluationGateway.save(requestEvaluationDomainToSave)
            .orElseThrow(() -> new RequestEvaluationNotSavedException(customerCpfCnpj,productId));

    }

}
