package com.uepb.lufh.avalia.entrypoint.contract.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.uepb.lufh.avalia.entrypoint.contract.model.ModelClass;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * QuestionInput
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-10T12:53:00.057977-03:00[America/Fortaleza]")
public class QuestionInput {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("class")
  private ModelClass propertyClass;

  /**
   * Gets or Sets productType
   */
  public enum ProductTypeEnum {
    SOFTWARE("Software"),
    
    HARDWARE("Hardware"),
    
    HARDWARE_SOFTWARE("Hardware/Software");

    private String value;

    ProductTypeEnum(String value) {
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
    public static ProductTypeEnum fromValue(String value) {
      for (ProductTypeEnum b : ProductTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("productType")
  private ProductTypeEnum productType;

  @JsonProperty("baseQuestion")
  private String baseQuestion;

  @JsonProperty("detailedQuestion")
  private String detailedQuestion;

  public QuestionInput id(Long id) {
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

  public QuestionInput propertyClass(ModelClass propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  /**
   * Get propertyClass
   * @return propertyClass
  */
  @Valid 
  @Schema(name = "class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public ModelClass getPropertyClass() {
    return propertyClass;
  }

  public void setPropertyClass(ModelClass propertyClass) {
    this.propertyClass = propertyClass;
  }

  public QuestionInput productType(ProductTypeEnum productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Get productType
   * @return productType
  */
  
  @Schema(name = "productType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public ProductTypeEnum getProductType() {
    return productType;
  }

  public void setProductType(ProductTypeEnum productType) {
    this.productType = productType;
  }

  public QuestionInput baseQuestion(String baseQuestion) {
    this.baseQuestion = baseQuestion;
    return this;
  }

  /**
   * Get baseQuestion
   * @return baseQuestion
  */
  
  @Schema(name = "baseQuestion", example = "Is it designed minimal?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getBaseQuestion() {
    return baseQuestion;
  }

  public void setBaseQuestion(String baseQuestion) {
    this.baseQuestion = baseQuestion;
  }

  public QuestionInput detailedQuestion(String detailedQuestion) {
    this.detailedQuestion = detailedQuestion;
    return this;
  }

  /**
   * Get detailedQuestion
   * @return detailedQuestion
  */
  
  @Schema(name = "detailedQuestion", example = "Is only (and all) information, essential to decision making, displayed on the screen?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDetailedQuestion() {
    return detailedQuestion;
  }

  public void setDetailedQuestion(String detailedQuestion) {
    this.detailedQuestion = detailedQuestion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionInput questionInput = (QuestionInput) o;
    return Objects.equals(this.id, questionInput.id) &&
        Objects.equals(this.propertyClass, questionInput.propertyClass) &&
        Objects.equals(this.productType, questionInput.productType) &&
        Objects.equals(this.baseQuestion, questionInput.baseQuestion) &&
        Objects.equals(this.detailedQuestion, questionInput.detailedQuestion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, propertyClass, productType, baseQuestion, detailedQuestion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionInput {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    baseQuestion: ").append(toIndentedString(baseQuestion)).append("\n");
    sb.append("    detailedQuestion: ").append(toIndentedString(detailedQuestion)).append("\n");
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

