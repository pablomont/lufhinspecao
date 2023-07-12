package com.uepb.lufh.avalia.dataprovider.database.entity;

import com.uepb.lufh.avalia.core.domain.AnswerDomain;
import lombok.NoArgsConstructor;
import org.springframework.util.ObjectUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "answer")
@NoArgsConstructor
public class AnswerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answer_id")
    private Long id;

    @Column(name = "answer")
    private String answer;

    @Column(name = "severity")
    private String severity;

    @Column(name = "weight")
    private String weight;

    @OneToMany(mappedBy = "answerEntity")
    private List<ReportEntity> questionnaireQuestionAnswers;


    public AnswerEntity(AnswerDomain answerDomain){
        if(!ObjectUtils.isEmpty(answerDomain.getId()))
            this.id = answerDomain.getId();

        this.answer = answerDomain.getAnswer();
        this.severity = answerDomain.getSeverity();
        this.weight = answerDomain.getWeight();

    }

    public AnswerDomain toDomain() {
        return AnswerDomain.builder()
            .severity(severity)
            .weight(weight)
            .answer(answer)
            .id(id)
            .build();
    }

}
