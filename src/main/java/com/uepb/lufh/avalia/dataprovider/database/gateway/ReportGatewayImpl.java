package com.uepb.lufh.avalia.dataprovider.database.gateway;

import com.uepb.lufh.avalia.core.domain.AnswerDomain;
import com.uepb.lufh.avalia.core.domain.QuestionDomain;
import com.uepb.lufh.avalia.core.domain.ReportDomain;
import com.uepb.lufh.avalia.core.gateway.ReportGateway;
import com.uepb.lufh.avalia.dataprovider.database.entity.ReportEntity;
import com.uepb.lufh.avalia.dataprovider.database.repository.ReportRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ReportGatewayImpl implements ReportGateway {

    private final ReportRepository reportRepository;

    @Override
    public Optional<ReportDomain> save(final ReportDomain reportDomain, final QuestionDomain questionDomain, final AnswerDomain answerDomain) {
        return Optional.of(reportRepository.save(new ReportEntity(reportDomain, questionDomain, answerDomain)).toDomain());
    }

    @Override
    public Long getCurrValReportSeq() {
        reportRepository.initializeSequence();
        return reportRepository.getCurrValReportSeq();
    }

    @Override
    public void updateReportSeqVal(final Long value) {
        reportRepository.updateReportSeqVal(value);
    }

}
