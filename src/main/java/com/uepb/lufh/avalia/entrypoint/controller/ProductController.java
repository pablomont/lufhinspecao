package com.uepb.lufh.avalia.entrypoint.controller;

import com.uepb.lufh.avalia.core.usecase.product.CreateProductUseCase;
import com.uepb.lufh.avalia.entrypoint.contract.api.ProductsApi;
import com.uepb.lufh.avalia.entrypoint.contract.model.ProductInput;
import com.uepb.lufh.avalia.entrypoint.contract.model.ProductOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController implements ProductsApi {

    private final CreateProductUseCase createProductUsecase;


    @Override
    public ResponseEntity<ProductOutput> createProduct(final ProductInput productInput)  {
        return ResponseEntity.ok(createProductUsecase.execute(productInput));
    }

}
