package com.uepb.lufh.avalia.dataprovider.database.entity;

import com.uepb.lufh.avalia.core.domain.RequestEvaluationDomain;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
@Setter
public class RequestEvaluationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_evaluation_id")
    private Long requestEvaluationId;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", nullable = false)
    private CustomerEntity customerEntity;


    public RequestEvaluationEntity(final RequestEvaluationDomain requestEvaluationDomain) {
        this.startDate = requestEvaluationDomain.getStartDate();
        this.endDate = requestEvaluationDomain.getEndDate();
        this.urgency = requestEvaluationDomain.getUrgency();
        this.testType = requestEvaluationDomain.getTestType();
        this.testCoverage = requestEvaluationDomain.getCoverage();
        this.productEntity = new ProductEntity(requestEvaluationDomain.getProductDomain());
        this.customerEntity = new CustomerEntity(requestEvaluationDomain.getCustomerDomain());
    }

    public RequestEvaluationDomain toDomain() {

        return RequestEvaluationDomain.builder()
            .id(String.valueOf(requestEvaluationId))
            .customerDomain(customerEntity.toDomain())
            .productDomain(productEntity.toDomain())
            .startDate(startDate)
            .endDate(endDate)
            .coverage(testCoverage)
            .urgency(urgency)
            .testType(testType)
            .build();
    }

}
