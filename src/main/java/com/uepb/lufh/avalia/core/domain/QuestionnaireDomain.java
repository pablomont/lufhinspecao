package com.uepb.lufh.avalia.core.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class QuestionnaireDomain {

    private final Long questionnaireId;
    private final String title;
    private final String evaluator;
    private final String creator;
    private List<QuestionDomain> questions;

    public void setQuestions(final List<QuestionDomain> questions) {
        this.questions = questions;
    }

}
