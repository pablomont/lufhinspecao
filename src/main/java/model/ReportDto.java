package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import model.QuestionnaireDto;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents the result of the evaluation
 */
@ApiModel(description = "Represents the result of the evaluation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-21T22:46:02.357514-03:00[America/Fortaleza]")
public class ReportDto   {
  @JsonProperty("requestEvaluationId")
  private Integer requestEvaluationId;

  @JsonProperty("reportDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime reportDate;

  @JsonProperty("questionare")
  private QuestionnaireDto questionare;

  public ReportDto requestEvaluationId(Integer requestEvaluationId) {
    this.requestEvaluationId = requestEvaluationId;
    return this;
  }

  /**
   * Get requestEvaluationId
   * @return requestEvaluationId
  */
  @ApiModelProperty(value = "")


  public Integer getRequestEvaluationId() {
    return requestEvaluationId;
  }

  public void setRequestEvaluationId(Integer requestEvaluationId) {
    this.requestEvaluationId = requestEvaluationId;
  }

  public ReportDto reportDate(OffsetDateTime reportDate) {
    this.reportDate = reportDate;
    return this;
  }

  /**
   * date the report was made
   * @return reportDate
  */
  @ApiModelProperty(value = "date the report was made")

  @Valid

  public OffsetDateTime getReportDate() {
    return reportDate;
  }

  public void setReportDate(OffsetDateTime reportDate) {
    this.reportDate = reportDate;
  }

  public ReportDto questionare(QuestionnaireDto questionare) {
    this.questionare = questionare;
    return this;
  }

  /**
   * Get questionare
   * @return questionare
  */
  @ApiModelProperty(value = "")

  @Valid

  public QuestionnaireDto getQuestionare() {
    return questionare;
  }

  public void setQuestionare(QuestionnaireDto questionare) {
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
    ReportDto report = (ReportDto) o;
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
    sb.append("class ReportDto {\n");
    
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

