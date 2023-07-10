package com.uepb.lufh.avalia.core.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class ReportDomain {

    private final Long reportId;
    private final Long requestEvaluationId;
    private final Long questionnaireId;
    private final List<AnswerDomain> answers;
}
