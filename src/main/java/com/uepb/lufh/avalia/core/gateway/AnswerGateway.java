package com.uepb.lufh.avalia.core.gateway;

import com.uepb.lufh.avalia.core.domain.AnswerDomain;

import java.util.Optional;

public interface AnswerGateway {

    Optional<AnswerDomain> save(AnswerDomain answerDomain);
}
