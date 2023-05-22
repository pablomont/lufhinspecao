package com.uepb.lufh.avalia.core.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Builder
@Getter
@RequiredArgsConstructor
public class QuestionDomain {

    private Long questionId;
    private String questionClass;
    private String productType;
    private String baseQuestion;
    private String detailedQuestion;

}
