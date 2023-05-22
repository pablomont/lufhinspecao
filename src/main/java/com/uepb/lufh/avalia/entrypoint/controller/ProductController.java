package com.uepb.lufh.avalia.entrypoint.controller;

import com.uepb.lufh.avalia.core.domain.ProductClass;
import com.uepb.lufh.avalia.core.domain.ProductDomain;
import com.uepb.lufh.avalia.core.usecase.product.CreateProductUseCase;
import com.uepb.lufh.avalia.entrypoint.contract.api.ProductsApi;
import com.uepb.lufh.avalia.entrypoint.contract.model.ProductInput;
import com.uepb.lufh.avalia.entrypoint.contract.model.ProductOutput;
import com.uepb.lufh.avalia.entrypoint.contract.model.ProductType;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController implements ProductsApi {

    private final CreateProductUseCase createProductUsecase;


    @Override
    public ResponseEntity<ProductOutput> createProduct(final ProductInput productInput)  {

        var productDomain = ProductDomain.builder()
            .productName(productInput.getProductName())
            .productType(productInput.getProductType().getName().getValue())
            .completionLevel(productInput.getCompletionLevel().getValue())
            .manufacturerName(productInput.getManufacterName())
            .productClass(ProductClass.fromValue(productInput.getProductClass()))
            .build();

        return ResponseEntity.ok(createOutput(createProductUsecase.execute(productDomain)));
    }

    private ProductOutput createOutput(final ProductDomain productDomain) {
        var productType = new ProductType();
        productType.setName(ProductType.NameEnum.fromValue(productDomain.getProductType()));

        var productOutput = new ProductOutput();
        productOutput.setId(productDomain.getId());
        productOutput.setProductName(productDomain.getProductName());
        productOutput.setProductClass(productDomain.getProductClass().toString());
        productOutput.setProductType(productType);
        productOutput.setManufacterName(productDomain.getManufacturerName());
        productOutput.setCompletionLevel(productDomain.getCompletionLevel());

        return productOutput;
    }

}
