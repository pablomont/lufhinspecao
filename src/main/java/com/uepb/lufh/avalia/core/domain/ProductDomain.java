package com.uepb.lufh.avalia.core.domain;

import lombok.Builder;
import lombok.Getter;


@Builder
@Getter
public class ProductDomain {
    private Long id;
    private String productName;
    private String manufacturerName;
    private String productType;
    private String completionLevel;

}
