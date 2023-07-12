package com.uepb.lufh.avalia.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class QuestionDomain {

    private final Long questionId;
    private final String questionClass;
    private final String productType;
    private final String baseQuestion;
    private final String detailedQuestion;

}
