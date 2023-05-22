package com.uepb.lufh.avalia.core.gateway;

import com.uepb.lufh.avalia.core.domain.QuestionDomain;

import java.util.List;
import java.util.Optional;

public interface QuestionGateway {
    Optional<List<QuestionDomain>> findQuestionListByQuestionIds(List<Long> questionIds);
    Optional<QuestionDomain> findQuestionById(Long id);

}
