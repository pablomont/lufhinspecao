package com.uepb.lufh.avalia.dataprovider.database.entity;

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

    @OneToMany(mappedBy = "product")
    private List<RequestEvaluationEntity> evaluations;
}
