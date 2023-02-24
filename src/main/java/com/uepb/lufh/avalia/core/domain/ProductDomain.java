package com.uepb.lufh.avalia.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDomain {
    private Long id;
    private String productName;
    private String manufacturerName;
    private String productType;
    private String completionLevel;

}
