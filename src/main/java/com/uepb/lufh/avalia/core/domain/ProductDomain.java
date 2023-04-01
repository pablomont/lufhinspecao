package com.uepb.lufh.avalia.core.domain;

import com.uepb.lufh.avalia.entrypoint.contract.model.ProductOutput;
import com.uepb.lufh.avalia.entrypoint.contract.model.ProductType;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;


@Builder
@Getter
@RequiredArgsConstructor
public class ProductDomain {
    private final Long id;
    private final String productName;
    private final String manufacturerName;
    private final String productType;
    private final String completionLevel;

    private final ProductClass productClass;

    private final List<RequestEvaluationDomain> requestEvaluationDomainList;

    public ProductOutput toOutput() {

        var productType = new ProductType();
        productType.setName(ProductType.NameEnum.fromValue(this.getProductType()));

        var productOutput = new ProductOutput();
        productOutput.setId(this.id);
        productOutput.setProductName(this.productName);
        productOutput.setProductClass(this.productClass.toString());
        productOutput.setProductType(productType);
        productOutput.setManufacterName(this.manufacturerName);
        productOutput.setCompletionLevel(this.completionLevel);

        return productOutput;

    }

}
