package com.uepb.lufh.avalia.core.usecase.question;

import com.uepb.lufh.avalia.core.domain.QuestionDomain;
import com.uepb.lufh.avalia.core.gateway.QuestionGateway;
import com.uepb.lufh.avalia.dataprovider.exception.QuestionNotSavedException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CreateQuestionUseCase {

    private final QuestionGateway questionGateway;

    public QuestionDomain execute(QuestionDomain questionDomain) {

        return questionGateway.save(questionDomain)
            .orElseThrow(QuestionNotSavedException::new);
    }

}
