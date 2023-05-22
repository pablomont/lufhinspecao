package com.uepb.lufh.avalia.core.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;


@Builder
@Getter
@RequiredArgsConstructor
public class RequestEvaluationDomain {

    private final String id;
    private final LocalDateTime startDate;
    private final LocalDateTime endDate;
    private final Boolean urgency;
    private final String testType;
    private final String coverage;
    private final ProductDomain productDomain;

    private final CustomerDomain customerDomain;

}
