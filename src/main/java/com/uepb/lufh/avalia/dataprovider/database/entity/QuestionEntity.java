package com.uepb.lufh.avalia.dataprovider.database.entity;

import lombok.NoArgsConstructor;

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
    private Long questionId;

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
}
