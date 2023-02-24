package com.uepb.lufh.avalia.dataprovider.database.entity;

import com.uepb.lufh.avalia.core.domain.RequestEvaluationDomain;
import com.uepb.lufh.avalia.entrypoint.contract.model.Product;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;


@Entity
@Table(name = "request_evaluation")
@NoArgsConstructor
public class RequestEvaluationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_evaluation_id")
    private Long id;

    @Column(name = "start_date")
    private LocalDateTime startDate;


    @Column(name = "end_date")
    private LocalDateTime endDate;

    private Boolean urgency;

    @Column(name = "test_type")
    private String testType;

    @Column(name = "test_coverage")
    private String testCoverage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private ProductEntity productEntity;


    public RequestEvaluationEntity(final RequestEvaluationDomain requestEvaluationDomain) {
        this.startDate = requestEvaluationDomain.getStartDate();
        this.endDate = requestEvaluationDomain.getEndDate();
        this.urgency = requestEvaluationDomain.getUrgency();
        this.testType = requestEvaluationDomain.getTestType();
        this.testCoverage = requestEvaluationDomain.getCoverage();
        this.productEntity = new ProductEntity(requestEvaluationDomain.getProductDomain());
    }

    public RequestEvaluationDomain toDomain() {
        return null;
    }

}
