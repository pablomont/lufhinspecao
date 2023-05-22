package com.uepb.lufh.avalia.core.domain;

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

}
