package com.uepb.lufh.avalia.entrypoint.contract.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.uepb.lufh.avalia.entrypoint.contract.model.AnsweredQuestion;
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
 * Questionnaire
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-11T22:27:20.267225-03:00[America/Fortaleza]")
public class Questionnaire {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("answeredQuestions")
  @Valid
  private List<AnsweredQuestion> answeredQuestions = null;

  public Questionnaire id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Questionnaire answeredQuestions(List<AnsweredQuestion> answeredQuestions) {
    this.answeredQuestions = answeredQuestions;
    return this;
  }

  public Questionnaire addAnsweredQuestionsItem(AnsweredQuestion answeredQuestionsItem) {
    if (this.answeredQuestions == null) {
      this.answeredQuestions = new ArrayList<>();
    }
    this.answeredQuestions.add(answeredQuestionsItem);
    return this;
  }

  /**
   * Get answeredQuestions
   * @return answeredQuestions
  */
  @Valid 
  @Schema(name = "answeredQuestions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<AnsweredQuestion> getAnsweredQuestions() {
    return answeredQuestions;
  }

  public void setAnsweredQuestions(List<AnsweredQuestion> answeredQuestions) {
    this.answeredQuestions = answeredQuestions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Questionnaire questionnaire = (Questionnaire) o;
    return Objects.equals(this.id, questionnaire.id) &&
        Objects.equals(this.answeredQuestions, questionnaire.answeredQuestions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, answeredQuestions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Questionnaire {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    answeredQuestions: ").append(toIndentedString(answeredQuestions)).append("\n");
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

