package com.uepb.lufh.avalia.dataprovider.database.entity;

import com.uepb.lufh.avalia.core.domain.QuestionDomain;
import lombok.NoArgsConstructor;
import org.springframework.util.ObjectUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "question")
@NoArgsConstructor
public class QuestionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private Long id;

    @Column(name = "question_class")
    private String questionClass;

    @Column(name = "product_type")
    private String productType;

    @Column(name = "base_question")
    private String baseQuestion;

    @Column(name = "detailed_question")
    private String detailedQuestion;

    @ManyToMany(mappedBy = "questionEntities")
    private List<QuestionnaireEntity> questionnaireEntities;

    public QuestionEntity(final QuestionDomain questionDomain) {
        if(!ObjectUtils.isEmpty(questionDomain.getQuestionId()))
            this.id = questionDomain.getQuestionId();

        this.baseQuestion = questionDomain.getBaseQuestion();
        this.detailedQuestion = questionDomain.getDetailedQuestion();
        this.questionClass = questionDomain.getQuestionClass();
        this.productType = questionDomain.getProductType();
    }

    public QuestionDomain toDomain() {
        return QuestionDomain.builder()
            .questionId(this.id)
            .questionClass(this.questionClass)
            .baseQuestion(this.baseQuestion)
            .detailedQuestion(this.detailedQuestion)
            .productType(this.productType)
            .build();
    }

}
