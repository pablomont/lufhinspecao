package com.uepb.lufh.avalia.entrypoint.contract.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@Schema(name = "QuestionnaireInput", description = "It represents a grouping of questions that must be answered when analyzing a product.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-29T12:42:02.340173-03:00[America/Fortaleza]")
public class QuestionnaireInput {

  @JsonProperty("questionIds")
  @Valid
  private List<String> questionIds = null;

  @JsonProperty("creator")
  private String creator;

  @JsonProperty("title")
  private String title;

  public QuestionnaireInput questionIds(List<String> questionIds) {
    this.questionIds = questionIds;
    return this;
  }

  public QuestionnaireInput addQuestionIdsItem(String questionIdsItem) {
    if (this.questionIds == null) {
      this.questionIds = new ArrayList<>();
    }
    this.questionIds.add(questionIdsItem);
    return this;
  }

  /**
   * Get questionIds
   * @return questionIds
  */
  
  @Schema(name = "questionIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<String> getQuestionIds() {
    return questionIds;
  }

  public void setQuestionIds(List<String> questionIds) {
    this.questionIds = questionIds;
  }

  public QuestionnaireInput creator(String creator) {
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

  public QuestionnaireInput title(String title) {
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
    QuestionnaireInput questionnaireInput = (QuestionnaireInput) o;
    return Objects.equals(this.questionIds, questionnaireInput.questionIds) &&
        Objects.equals(this.creator, questionnaireInput.creator) &&
        Objects.equals(this.title, questionnaireInput.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionIds, creator, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionnaireInput {\n");
    sb.append("    questionIds: ").append(toIndentedString(questionIds)).append("\n");
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

