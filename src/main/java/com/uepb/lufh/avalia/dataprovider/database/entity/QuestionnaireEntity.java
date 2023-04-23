package com.uepb.lufh.avalia.dataprovider.database.entity;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "questionnaire")
@NoArgsConstructor
public class QuestionnaireEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "questionnaire_id")
    private Long questionnaireId;

    @Column(name = "title")
    private String title;

    @Column(name = "evaluator")
    private String evaluator;

    @Column(name = "creator")
    private String creator;

    @ManyToMany
    @JoinTable(
        name = "questionnaire_question",
        joinColumns = @JoinColumn(name = "questionnaire_id"),
        inverseJoinColumns = @JoinColumn(name = "question_id"))
    private List<QuestionEntity> questionEntities;

}
