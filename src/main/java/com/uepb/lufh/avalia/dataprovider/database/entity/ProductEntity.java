package com.uepb.lufh.avalia.dataprovider.database.entity;

import com.uepb.lufh.avalia.core.domain.ProductClass;
import com.uepb.lufh.avalia.core.domain.ProductDomain;
import lombok.NoArgsConstructor;
import org.springframework.util.ObjectUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


@Entity
@Table(name = "product")
@NoArgsConstructor
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "manufacturer_name")
    private String manufacturerName;

    @Column(name = "completion_level")

    private String completionLevel;

    @Column(name = "product_type")
    private String productType;

    @Column(name = "product_class")
    private String productClass;

    @OneToMany(mappedBy = "productEntity")
    private List<RequestEvaluationEntity> evaluations;

    public ProductEntity(final ProductDomain productDomain) {
        if(!ObjectUtils.isEmpty(productDomain.getId()))
            this.productId = productDomain.getId();
        this.productName = productDomain.getProductName();
        this.manufacturerName = productDomain.getManufacturerName();
        this.completionLevel = productDomain.getCompletionLevel();
        this.productType = productDomain.getProductType();
        this.productClass = productDomain.getProductClass().toString();
    }

    public ProductDomain toDomain() {

        return ProductDomain.builder()
            .id(productId)
            .productName(productName)
            .manufacturerName(manufacturerName)
            .completionLevel(completionLevel)
            .productType(productType)
            .productClass(ProductClass.fromValue(productClass))
            .build();
    }

}
