package com.uepb.lufh.avalia.dataprovider.database.repository;

import com.uepb.lufh.avalia.dataprovider.database.entity.ReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReportRepository extends JpaRepository<ReportEntity, Long> {


    @Query(value = "SELECT nextval('report_seq')", nativeQuery = true)
    void initializeSequence();

    @Query(value = "SELECT currval('report_seq')", nativeQuery = true)
    Long getCurrValReportSeq();

    @Modifying
    @Query(value = "ALTER SEQUENCE report_seq RESTART WITH :value", nativeQuery = true)
    void updateReportSeqVal(@Param("value") Long value);
}
