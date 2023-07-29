package com.uepb.lufh.avalia.entrypoint.contract.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.uepb.lufh.avalia.entrypoint.contract.model.AnswerInput;
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
 * Represents the result of the evaluation
 */

@Schema(name = "ReportInput", description = "Represents the result of the evaluation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-29T11:54:54.008836-03:00[America/Fortaleza]")
public class ReportInput {

  @JsonProperty("evaluator")
  private String evaluator;

  @JsonProperty("requestEvaluationId")
  private Integer requestEvaluationId;

  @JsonProperty("questionnaireId")
  private Integer questionnaireId;

  @JsonProperty("answers")
  @Valid
  private List<AnswerInput> answers = null;

  public ReportInput evaluator(String evaluator) {
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

  public ReportInput requestEvaluationId(Integer requestEvaluationId) {
    this.requestEvaluationId = requestEvaluationId;
    return this;
  }

  /**
   * Get requestEvaluationId
   * @return requestEvaluationId
  */
  
  @Schema(name = "requestEvaluationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Integer getRequestEvaluationId() {
    return requestEvaluationId;
  }

  public void setRequestEvaluationId(Integer requestEvaluationId) {
    this.requestEvaluationId = requestEvaluationId;
  }

  public ReportInput questionnaireId(Integer questionnaireId) {
    this.questionnaireId = questionnaireId;
    return this;
  }

  /**
   * Get questionnaireId
   * @return questionnaireId
  */
  
  @Schema(name = "questionnaireId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Integer getQuestionnaireId() {
    return questionnaireId;
  }

  public void setQuestionnaireId(Integer questionnaireId) {
    this.questionnaireId = questionnaireId;
  }

  public ReportInput answers(List<AnswerInput> answers) {
    this.answers = answers;
    return this;
  }

  public ReportInput addAnswersItem(AnswerInput answersItem) {
    if (this.answers == null) {
      this.answers = new ArrayList<>();
    }
    this.answers.add(answersItem);
    return this;
  }

  /**
   * Get answers
   * @return answers
  */
  @Valid 
  @Schema(name = "answers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<AnswerInput> getAnswers() {
    return answers;
  }

  public void setAnswers(List<AnswerInput> answers) {
    this.answers = answers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportInput reportInput = (ReportInput) o;
    return Objects.equals(this.evaluator, reportInput.evaluator) &&
        Objects.equals(this.requestEvaluationId, reportInput.requestEvaluationId) &&
        Objects.equals(this.questionnaireId, reportInput.questionnaireId) &&
        Objects.equals(this.answers, reportInput.answers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluator, requestEvaluationId, questionnaireId, answers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportInput {\n");
    sb.append("    evaluator: ").append(toIndentedString(evaluator)).append("\n");
    sb.append("    requestEvaluationId: ").append(toIndentedString(requestEvaluationId)).append("\n");
    sb.append("    questionnaireId: ").append(toIndentedString(questionnaireId)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
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

