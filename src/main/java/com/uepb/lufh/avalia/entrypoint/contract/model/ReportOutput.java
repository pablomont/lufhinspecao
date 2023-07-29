package com.uepb.lufh.avalia.entrypoint.contract.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.uepb.lufh.avalia.entrypoint.contract.model.Questionnaire;
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

@Schema(name = "ReportOutput", description = "Represents the result of the evaluation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-29T12:42:02.340173-03:00[America/Fortaleza]")
public class ReportOutput {

  @JsonProperty("evaluator")
  private String evaluator;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("requestEvaluationId")
  private Integer requestEvaluationId;

  @JsonProperty("questionnaire")
  private Questionnaire questionnaire;

  public ReportOutput evaluator(String evaluator) {
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

  public ReportOutput id(Integer id) {
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

  public ReportOutput requestEvaluationId(Integer requestEvaluationId) {
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

  public ReportOutput questionnaire(Questionnaire questionnaire) {
    this.questionnaire = questionnaire;
    return this;
  }

  /**
   * Get questionnaire
   * @return questionnaire
  */
  @Valid 
  @Schema(name = "questionnaire", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Questionnaire getQuestionnaire() {
    return questionnaire;
  }

  public void setQuestionnaire(Questionnaire questionnaire) {
    this.questionnaire = questionnaire;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportOutput reportOutput = (ReportOutput) o;
    return Objects.equals(this.evaluator, reportOutput.evaluator) &&
        Objects.equals(this.id, reportOutput.id) &&
        Objects.equals(this.requestEvaluationId, reportOutput.requestEvaluationId) &&
        Objects.equals(this.questionnaire, reportOutput.questionnaire);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluator, id, requestEvaluationId, questionnaire);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportOutput {\n");
    sb.append("    evaluator: ").append(toIndentedString(evaluator)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    requestEvaluationId: ").append(toIndentedString(requestEvaluationId)).append("\n");
    sb.append("    questionnaire: ").append(toIndentedString(questionnaire)).append("\n");
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

