package com.uepb.lufh.avalia.entrypoint.contract.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * Represents the answer data for the questions
 */

@Schema(name = "Answer", description = "Represents the answer data for the questions")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-24T00:23:07.669998-03:00[America/Fortaleza]")
public class Answer {

  @JsonProperty("possibleAnswers")
  @Valid
  private List<String> possibleAnswers = null;

  @JsonProperty("choosenAnswer")
  private String choosenAnswer;

  /**
   * Gets or Sets severity
   */
  public enum SeverityEnum {
    _0_NOT_A_USABILITY_PROBLEM_AT_ALL("0 Not a usability problem at all"),
    
    _1_COSMETIC_PROBLEM_ONLY_NEED_NOT_BE_FIXED_UNLESS_EXTRA_TIME_IS_AVAILABLE("1 Cosmetic problem only. Need not be fixed unless extra time is available"),
    
    _2_MINOR_USABILITY_PROBLEM_FIXING_THIS_SHOULD_BE_GIVEN_LOW_PRIORITY("2 Minor usability problem. Fixing this should be given low priority"),
    
    _3_MAJOR_USABILITY_PROBLEM_IMPORTANT_TO_FIX_SHOULD_BE_GIVEN_HIGH_PRIORITY("3 Major usability problem. Important to fix. Should be given high priority"),
    
    _4_USABILITY_CATASTROPHE_IMPERATIVE_TO_FIX_THIS_BEFORE_PRODUCT_CAN_BE_RELEASED("4 Usability catastrophe. Imperative to fix this before product can be released");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SeverityEnum fromValue(String value) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("severity")
  private SeverityEnum severity;

  /**
   * Gets or Sets weight
   */
  public enum WeightEnum {
    _0_NECESSARY_FOR_EVERY_SYSTEM("0 Necessary for every System"),
    
    _1_NECESSARY_FOR_SYSTEMS_WITHOUT_MORE_THAN_ONE_DIALOG("1 Necessary for Systems without more than one Dialog"),
    
    _2_NECESSARY_FOR_SIMPLE_SYSTEMS_WITHOUT_DATA_HAVE_TO_BE_ENTERED_OR_WITH_STRICT_GUIDANCE_THROUGHOUT_THE_USAGE_PROCESS("2 Necessary for Simple Systems without data have to be entered or with strict guidance throughout the usage process"),
    
    _3_NECESSARY_FOR_COMPLEX_SYSTEMS_WITH_DATA_HAVE_TO_BE_ENTERED_ON_SEVERAL_DIALOGS("3 Necessary for Complex Systems with data have to be entered on several dialogs");

    private String value;

    WeightEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static WeightEnum fromValue(String value) {
      for (WeightEnum b : WeightEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("weight")
  private WeightEnum weight;

  public Answer possibleAnswers(List<String> possibleAnswers) {
    this.possibleAnswers = possibleAnswers;
    return this;
  }

  public Answer addPossibleAnswersItem(String possibleAnswersItem) {
    if (this.possibleAnswers == null) {
      this.possibleAnswers = new ArrayList<>();
    }
    this.possibleAnswers.add(possibleAnswersItem);
    return this;
  }

  /**
   * Get possibleAnswers
   * @return possibleAnswers
  */
  
  @Schema(name = "possibleAnswers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<String> getPossibleAnswers() {
    return possibleAnswers;
  }

  public void setPossibleAnswers(List<String> possibleAnswers) {
    this.possibleAnswers = possibleAnswers;
  }

  public Answer choosenAnswer(String choosenAnswer) {
    this.choosenAnswer = choosenAnswer;
    return this;
  }

  /**
   * Get choosenAnswer
   * @return choosenAnswer
  */
  
  @Schema(name = "choosenAnswer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getChoosenAnswer() {
    return choosenAnswer;
  }

  public void setChoosenAnswer(String choosenAnswer) {
    this.choosenAnswer = choosenAnswer;
  }

  public Answer severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Get severity
   * @return severity
  */
  
  @Schema(name = "severity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public Answer weight(WeightEnum weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
  */
  
  @Schema(name = "weight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public WeightEnum getWeight() {
    return weight;
  }

  public void setWeight(WeightEnum weight) {
    this.weight = weight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Answer answer = (Answer) o;
    return Objects.equals(this.possibleAnswers, answer.possibleAnswers) &&
        Objects.equals(this.choosenAnswer, answer.choosenAnswer) &&
        Objects.equals(this.severity, answer.severity) &&
        Objects.equals(this.weight, answer.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(possibleAnswers, choosenAnswer, severity, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Answer {\n");
    sb.append("    possibleAnswers: ").append(toIndentedString(possibleAnswers)).append("\n");
    sb.append("    choosenAnswer: ").append(toIndentedString(choosenAnswer)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

