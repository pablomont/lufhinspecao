package com.uepb.lufh.avalia.entrypoint.contract.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;

/**
 * It represents a grouping of questions that must be answered when analyzing a product.
 */
@ApiModel(description = "It represents a grouping of questions that must be answered when analyzing a product.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-22T02:43:06.822926-03:00[America/Fortaleza]")
public class Questionnaire   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("questions")
  @Valid
  private List<Question> questions = null;

  @JsonProperty("evaluator")
  private String evaluator;

  @JsonProperty("creator")
  private String creator;

  public Questionnaire id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Questionnaire questions(List<Question> questions) {
    this.questions = questions;
    return this;
  }

  public Questionnaire addQuestionsItem(Question questionsItem) {
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
  @ApiModelProperty(value = "")

  @Valid

  public List<Question> getQuestions() {
    return questions;
  }

  public void setQuestions(List<Question> questions) {
    this.questions = questions;
  }

  public Questionnaire evaluator(String evaluator) {
    this.evaluator = evaluator;
    return this;
  }

  /**
   * Get evaluator
   * @return evaluator
  */
  @ApiModelProperty(value = "")


  public String getEvaluator() {
    return evaluator;
  }

  public void setEvaluator(String evaluator) {
    this.evaluator = evaluator;
  }

  public Questionnaire creator(String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Get creator
   * @return creator
  */
  @ApiModelProperty(value = "")


  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
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
        Objects.equals(this.questions, questionnaire.questions) &&
        Objects.equals(this.evaluator, questionnaire.evaluator) &&
        Objects.equals(this.creator, questionnaire.creator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, questions, evaluator, creator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Questionnaire {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    evaluator: ").append(toIndentedString(evaluator)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
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

