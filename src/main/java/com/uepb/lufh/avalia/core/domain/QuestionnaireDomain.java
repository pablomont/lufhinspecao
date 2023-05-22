package com.uepb.lufh.avalia.core.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Builder
@Getter
@RequiredArgsConstructor
public class QuestionnaireDomain {

    private final Long questionnaireId;
    private final String title;
    private final String evaluator;
    private final String creator;
    private final List<QuestionDomain> questions;

}
