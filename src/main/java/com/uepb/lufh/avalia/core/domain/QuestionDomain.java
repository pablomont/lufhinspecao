package com.uepb.lufh.avalia.core.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Builder
@Getter
@RequiredArgsConstructor
public class QuestionDomain {

    private final Long questionId;
    private final String questionClass;
    private final String productType;
    private final String baseQuestion;
    private final String detailedQuestion;

}
