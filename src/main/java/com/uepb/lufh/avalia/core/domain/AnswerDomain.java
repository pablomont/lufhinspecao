package com.uepb.lufh.avalia.core.domain;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class AnswerDomain {

    private final Long id;

    private final String answer;

    private final String severity;

    private final String weight;

}
