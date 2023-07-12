package com.uepb.lufh.avalia.core.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter
public class ReportDomain {

    private Long reportId;
    private RequestEvaluationDomain requestEvaluationDomain;
    private QuestionnaireDomain questionnaireDomain;
    private final List<AnswerDomain> answers;


}
