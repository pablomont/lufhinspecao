package com.uepb.lufh.avalia.entrypoint.contract.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.uepb.lufh.avalia.entrypoint.contract.model.QuestionOutput;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * It represents a grouping of questions that must be answered when analyzing a product.
 */

@Schema(name = "QuestionnaireOutput", description = "It represents a grouping of questions that must be answered when analyzing a product.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-29T11:54:54.008836-03:00[America/Fortaleza]")
public class QuestionnaireOutput {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("questions")
  @Valid
  private List<QuestionOutput> questions = null;

  @JsonProperty("evaluator")
  private String evaluator;

  @JsonProperty("creator")
  private String creator;

  @JsonProperty("title")
  private String title;

  public QuestionnaireOutput id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public QuestionnaireOutput questions(List<QuestionOutput> questions) {
    this.questions = questions;
    return this;
  }

  public QuestionnaireOutput addQuestionsItem(QuestionOutput questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<>();
    }
    this.questions.add(questionsItem);
    return this;
  }

  /**
   * Get questions
   * @return questions
  */
  @Valid 
  @Schema(name = "questions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<QuestionOutput> getQuestions() {
    return questions;
  }

  public void setQuestions(List<QuestionOutput> questions) {
    this.questions = questions;
  }

  public QuestionnaireOutput evaluator(String evaluator) {
    this.evaluator = evaluator;
    return this;
  }

  /**
   * Get evaluator
   * @return evaluator
  */
  
  @Schema(name = "evaluator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getEvaluator() {
    return evaluator;
  }

  public void setEvaluator(String evaluator) {
    this.evaluator = evaluator;
  }

  public QuestionnaireOutput creator(String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Get creator
   * @return creator
  */
  
  @Schema(name = "creator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public QuestionnaireOutput title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionnaireOutput questionnaireOutput = (QuestionnaireOutput) o;
    return Objects.equals(this.id, questionnaireOutput.id) &&
        Objects.equals(this.questions, questionnaireOutput.questions) &&
        Objects.equals(this.evaluator, questionnaireOutput.evaluator) &&
        Objects.equals(this.creator, questionnaireOutput.creator) &&
        Objects.equals(this.title, questionnaireOutput.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, questions, evaluator, creator, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionnaireOutput {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    evaluator: ").append(toIndentedString(evaluator)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

