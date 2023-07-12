package com.uepb.lufh.avalia.dataprovider.database.entity;

import com.uepb.lufh.avalia.core.domain.QuestionDomain;
import com.uepb.lufh.avalia.core.domain.QuestionnaireDomain;
import lombok.NoArgsConstructor;
import org.springframework.util.ObjectUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.stream.Collectors;

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

    @Column(name = "creator")
    private String creator;

    @ManyToMany
    @JoinTable(
        name = "questionnaire_question",
        joinColumns = @JoinColumn(name = "questionnaire_id"),
        inverseJoinColumns = @JoinColumn(name = "question_id"))
    private List<QuestionEntity> questionEntities;

    @OneToMany(mappedBy = "questionnaireEntity")
    private List<ReportEntity> questionnaireQuestionAnswers;

    public QuestionnaireEntity(final QuestionnaireDomain questionnaireDomain) {
        if(!ObjectUtils.isEmpty(questionnaireDomain.getQuestionnaireId()))
            this.questionnaireId = questionnaireDomain.getQuestionnaireId();

        this.title = questionnaireDomain.getTitle();
        this.creator = questionnaireDomain.getCreator();
        this.questionEntities = buildQuestionEntityList(questionnaireDomain.getQuestions());
    }

    private List<QuestionEntity> buildQuestionEntityList(final List<QuestionDomain> questions) {
        return questions.stream().map(QuestionEntity::new)
            .collect(Collectors.toList());
    }

    public QuestionnaireDomain toDomain() {

        var questions = questionEntities.stream().map(QuestionEntity::toDomain).collect(Collectors.toList());
        return QuestionnaireDomain.builder()

            .questions(questions)
            .creator(this.creator)
            .questionnaireId(this.questionnaireId)
            .title(this.title)
            .build();
    }

}
