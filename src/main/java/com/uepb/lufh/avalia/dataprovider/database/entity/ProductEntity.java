package com.uepb.lufh.avalia.dataprovider.database.entity;

import com.uepb.lufh.avalia.core.domain.ProductDomain;
import com.uepb.lufh.avalia.core.domain.RequestEvaluationDomain;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


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

    @OneToMany(mappedBy = "productEntity")
    private List<RequestEvaluationEntity> evaluations;

    public ProductEntity(final ProductDomain productDomain) {
        this.productId = productDomain.getId();
        this.productName = productDomain.getProductName();
        this.manufacturerName = productDomain.getManufacturerName();
        this.completionLevel = productDomain.getCompletionLevel();
        this.productType = productDomain.getProductType();
        this.evaluations = new ArrayList<>();
        //setEvaluations(productDomain.getRequestEvaluationDomainList());
    }

    public ProductDomain toDomain() {

        return ProductDomain.builder()
            .id(productId)
            //.requestEvaluationDomainList(evaluations.stream().map(RequestEvaluationEntity::toDomain).collect(
                //Collectors.toList()))
            .productName(productName)
            .manufacturerName(manufacturerName)
            .completionLevel(completionLevel)
            .productType(productType)
            .build();
    }

//    public void setEvaluations(final List<RequestEvaluationDomain> evaluations) {
//        this.evaluations = evaluations.stream().map(RequestEvaluationEntity::new).collect(Collectors.toList());
//        this.evaluations.forEach(evaluation -> evaluation.setProductEntity(this));
//    }

}
