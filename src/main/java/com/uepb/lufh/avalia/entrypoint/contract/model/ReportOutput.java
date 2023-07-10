package com.uepb.lufh.avalia.entrypoint.contract.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.uepb.lufh.avalia.entrypoint.contract.model.Answer;
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

@Schema(name = "ReportOutput", description = "Represents the result of the evaluation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-10T12:11:03.916856-03:00[America/Fortaleza]")
public class ReportOutput {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("requestEvaluationId")
  private Integer requestEvaluationId;

  @JsonProperty("questionnaireId")
  private Integer questionnaireId;

  @JsonProperty("answer")
  @Valid
  private List<Answer> answer = null;

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

  public ReportOutput questionnaireId(Integer questionnaireId) {
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

  public ReportOutput answer(List<Answer> answer) {
    this.answer = answer;
    return this;
  }

  public ReportOutput addAnswerItem(Answer answerItem) {
    if (this.answer == null) {
      this.answer = new ArrayList<>();
    }
    this.answer.add(answerItem);
    return this;
  }

  /**
   * Get answer
   * @return answer
  */
  @Valid 
  @Schema(name = "answer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<Answer> getAnswer() {
    return answer;
  }

  public void setAnswer(List<Answer> answer) {
    this.answer = answer;
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
    return Objects.equals(this.id, reportOutput.id) &&
        Objects.equals(this.requestEvaluationId, reportOutput.requestEvaluationId) &&
        Objects.equals(this.questionnaireId, reportOutput.questionnaireId) &&
        Objects.equals(this.answer, reportOutput.answer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, requestEvaluationId, questionnaireId, answer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportOutput {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    requestEvaluationId: ").append(toIndentedString(requestEvaluationId)).append("\n");
    sb.append("    questionnaireId: ").append(toIndentedString(questionnaireId)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
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

