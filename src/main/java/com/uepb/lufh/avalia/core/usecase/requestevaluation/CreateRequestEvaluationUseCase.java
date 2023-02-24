package com.uepb.lufh.avalia.core.usecase.requestevaluation;

import com.uepb.lufh.avalia.core.domain.ProductDomain;
import com.uepb.lufh.avalia.core.domain.RequestEvaluationDomain;
import com.uepb.lufh.avalia.core.gateway.ProductGateway;
import com.uepb.lufh.avalia.core.gateway.RequestEvaluationGateway;
import com.uepb.lufh.avalia.entrypoint.contract.model.RequestEvaluationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateRequestEvaluationUseCase {

    private final ProductGateway productGateway;
    private final RequestEvaluationGateway requestEvaluationGateway;

    public RequestEvaluationOutput execute(RequestEvaluationDomain evaluationDomain, String productId){


        ProductDomain productDomain = productGateway.findProductByProductId(Long.valueOf(productId)).orElseThrow(() -> {
            throw new RuntimeException("Produto inexistente na base");
        });

        evaluationDomain.setProductDomain(productDomain);
        return requestEvaluationGateway.save(evaluationDomain).toOutput();

    }

}
