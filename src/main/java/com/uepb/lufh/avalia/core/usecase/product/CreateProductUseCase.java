package com.uepb.lufh.avalia.core.usecase.product;

import com.uepb.lufh.avalia.core.domain.ProductDomain;
import com.uepb.lufh.avalia.core.gateway.ProductGateway;
import com.uepb.lufh.avalia.dataprovider.exception.ProductNotSavedException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CreateProductUseCase {

    private final ProductGateway productGateway;

    public ProductDomain execute(ProductDomain productDomain) {
        return productGateway.save(productDomain)
            .orElseThrow(() -> new ProductNotSavedException(productDomain.getProductName()));
    }

}
