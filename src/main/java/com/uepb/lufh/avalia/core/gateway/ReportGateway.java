package com.uepb.lufh.avalia.core.gateway;

import com.uepb.lufh.avalia.core.domain.AnswerDomain;
import com.uepb.lufh.avalia.core.domain.QuestionDomain;
import com.uepb.lufh.avalia.core.domain.ReportDomain;

import java.util.Optional;

public interface ReportGateway {

    Optional<ReportDomain> save(final ReportDomain reportDomain, final QuestionDomain questionDomain, final AnswerDomain answerDomain);

    Long getCurrValReportSeq();

    void updateReportSeqVal(Long value);

}
