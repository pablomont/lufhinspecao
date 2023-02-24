package com.uepb.lufh.avalia.entrypoint.contract.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.uepb.lufh.avalia.entrypoint.contract.model.Questionnaire;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
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

@Schema(name = "Report", description = "Represents the result of the evaluation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-24T02:03:13.939179-03:00[America/Fortaleza]")
public class Report {

  @JsonProperty("requestEvaluationId")
  private Integer requestEvaluationId;

  @JsonProperty("reportDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime reportDate;

  @JsonProperty("questionare")
  private Questionnaire questionare;

  public Report requestEvaluationId(Integer requestEvaluationId) {
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

  public Report reportDate(OffsetDateTime reportDate) {
    this.reportDate = reportDate;
    return this;
  }

  /**
   * date the report was made
   * @return reportDate
  */
  @Valid 
  @Schema(name = "reportDate", description = "date the report was made", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OffsetDateTime getReportDate() {
    return reportDate;
  }

  public void setReportDate(OffsetDateTime reportDate) {
    this.reportDate = reportDate;
  }

  public Report questionare(Questionnaire questionare) {
    this.questionare = questionare;
    return this;
  }

  /**
   * Get questionare
   * @return questionare
  */
  @Valid 
  @Schema(name = "questionare", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Questionnaire getQuestionare() {
    return questionare;
  }

  public void setQuestionare(Questionnaire questionare) {
    this.questionare = questionare;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Report report = (Report) o;
    return Objects.equals(this.requestEvaluationId, report.requestEvaluationId) &&
        Objects.equals(this.reportDate, report.reportDate) &&
        Objects.equals(this.questionare, report.questionare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestEvaluationId, reportDate, questionare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Report {\n");
    sb.append("    requestEvaluationId: ").append(toIndentedString(requestEvaluationId)).append("\n");
    sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
    sb.append("    questionare: ").append(toIndentedString(questionare)).append("\n");
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

