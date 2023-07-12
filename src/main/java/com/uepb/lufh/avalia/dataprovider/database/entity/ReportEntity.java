package com.uepb.lufh.avalia.dataprovider.database.entity;

import com.uepb.lufh.avalia.core.domain.AnswerDomain;
import com.uepb.lufh.avalia.core.domain.QuestionDomain;
import com.uepb.lufh.avalia.core.domain.ReportDomain;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "report")
@NoArgsConstructor
@Setter
public class ReportEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "report_id")
    private Long reportId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "request_evaluation_id")
    private RequestEvaluationEntity requestEvaluationEntity;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "questionnaire_id")
    private QuestionnaireEntity questionnaireEntity;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private QuestionEntity questionEntity;

    @ManyToOne
    @JoinColumn(name = "answer_id")
    private AnswerEntity answerEntity;

    public ReportEntity(ReportDomain reportDomain, QuestionDomain questionDomain, AnswerDomain answerDomain){
        this.reportId = reportDomain.getReportId();
        this.questionnaireEntity = new QuestionnaireEntity(reportDomain.getQuestionnaireDomain());
        this.requestEvaluationEntity = new RequestEvaluationEntity(reportDomain.getRequestEvaluationDomain());
        this.questionEntity = new QuestionEntity(questionDomain);
        this.answerEntity = new AnswerEntity(answerDomain);
        createdAt = LocalDateTime.now();
    }

    public ReportDomain toDomain() {
        return ReportDomain.builder()
            .reportId(reportId)
            .requestEvaluationDomain(requestEvaluationEntity.toDomain())
            .questionnaireDomain(questionnaireEntity.toDomain())
            .build();
    }

}
