package com.uepb.lufh.avalia.core.usecase.product;

import com.uepb.lufh.avalia.core.domain.ProductClass;
import com.uepb.lufh.avalia.core.domain.ProductDomain;
import com.uepb.lufh.avalia.core.gateway.ProductGateway;
import com.uepb.lufh.avalia.dataprovider.exception.ProductNotSavedException;
import com.uepb.lufh.avalia.entrypoint.contract.model.ProductInput;
import com.uepb.lufh.avalia.entrypoint.contract.model.ProductOutput;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CreateProductUseCase {

    private final ProductGateway productGateway;

    public ProductOutput execute(ProductInput productInput){

        var productDomain = ProductDomain.builder()
            .productName(productInput.getProductName())
            .productType(productInput.getProductType().getName().getValue())
            .completionLevel(productInput.getCompletionLevel().getValue())
            .manufacturerName(productInput.getManufacterName())
            .productClass(ProductClass.fromValue(productInput.getProductClass()))
            .build();

        return productGateway.save(productDomain)
            .orElseThrow(() -> new ProductNotSavedException(productInput.getProductName()))
            .toOutput();


    }

}
