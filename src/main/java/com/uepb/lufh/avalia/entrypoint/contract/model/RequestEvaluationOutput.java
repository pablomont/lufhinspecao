package com.uepb.lufh.avalia.entrypoint.contract.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents the output of a request to evaluate a product.
 */

@Schema(name = "RequestEvaluationOutput", description = "Represents the output of a request to evaluate a product.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T15:42:55.777299-03:00[America/Fortaleza]")
public class RequestEvaluationOutput {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("productId")
  private String productId;

  @JsonProperty("customerCpfCnpj")
  private String customerCpfCnpj;

  @JsonProperty("startDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime startDate;

  @JsonProperty("endDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime endDate;

  @JsonProperty("urgency")
  private Boolean urgency;

  /**
   * Type of contracted test
   */
  public enum TestTypeEnum {
    COMPLIANCE_INSPECTION("compliance inspection"),
    
    PERFORMANCE_MEASUREMENT("performance measurement"),
    
    HEURISTIC_EVALUATION("heuristic evaluation"),
    
    USER_OPINION("user opinion");

    private String value;

    TestTypeEnum(String value) {
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
    public static TestTypeEnum fromValue(String value) {
      for (TestTypeEnum b : TestTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("testType")
  private TestTypeEnum testType;

  @JsonProperty("coverage")
  private String coverage;

  public RequestEvaluationOutput id(Long id) {
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

  public RequestEvaluationOutput productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  
  @Schema(name = "productId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public RequestEvaluationOutput customerCpfCnpj(String customerCpfCnpj) {
    this.customerCpfCnpj = customerCpfCnpj;
    return this;
  }

  /**
   * Get customerCpfCnpj
   * @return customerCpfCnpj
  */
  
  @Schema(name = "customerCpfCnpj", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getCustomerCpfCnpj() {
    return customerCpfCnpj;
  }

  public void setCustomerCpfCnpj(String customerCpfCnpj) {
    this.customerCpfCnpj = customerCpfCnpj;
  }

  public RequestEvaluationOutput startDate(LocalDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Entry date into lufh
   * @return startDate
  */
  @Valid 
  @Schema(name = "startDate", description = "Entry date into lufh", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public LocalDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDateTime startDate) {
    this.startDate = startDate;
  }

  public RequestEvaluationOutput endDate(LocalDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Planned departure date from lufh
   * @return endDate
  */
  @Valid 
  @Schema(name = "endDate", description = "Planned departure date from lufh", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public LocalDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDateTime endDate) {
    this.endDate = endDate;
  }

  public RequestEvaluationOutput urgency(Boolean urgency) {
    this.urgency = urgency;
    return this;
  }

  /**
   * Get urgency
   * @return urgency
  */
  
  @Schema(name = "urgency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getUrgency() {
    return urgency;
  }

  public void setUrgency(Boolean urgency) {
    this.urgency = urgency;
  }

  public RequestEvaluationOutput testType(TestTypeEnum testType) {
    this.testType = testType;
    return this;
  }

  /**
   * Type of contracted test
   * @return testType
  */
  
  @Schema(name = "testType", description = "Type of contracted test", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public TestTypeEnum getTestType() {
    return testType;
  }

  public void setTestType(TestTypeEnum testType) {
    this.testType = testType;
  }

  public RequestEvaluationOutput coverage(String coverage) {
    this.coverage = coverage;
    return this;
  }

  /**
   * Contracted scope
   * @return coverage
  */
  
  @Schema(name = "coverage", description = "Contracted scope", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getCoverage() {
    return coverage;
  }

  public void setCoverage(String coverage) {
    this.coverage = coverage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestEvaluationOutput requestEvaluationOutput = (RequestEvaluationOutput) o;
    return Objects.equals(this.id, requestEvaluationOutput.id) &&
        Objects.equals(this.productId, requestEvaluationOutput.productId) &&
        Objects.equals(this.customerCpfCnpj, requestEvaluationOutput.customerCpfCnpj) &&
        Objects.equals(this.startDate, requestEvaluationOutput.startDate) &&
        Objects.equals(this.endDate, requestEvaluationOutput.endDate) &&
        Objects.equals(this.urgency, requestEvaluationOutput.urgency) &&
        Objects.equals(this.testType, requestEvaluationOutput.testType) &&
        Objects.equals(this.coverage, requestEvaluationOutput.coverage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productId, customerCpfCnpj, startDate, endDate, urgency, testType, coverage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestEvaluationOutput {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    customerCpfCnpj: ").append(toIndentedString(customerCpfCnpj)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    urgency: ").append(toIndentedString(urgency)).append("\n");
    sb.append("    testType: ").append(toIndentedString(testType)).append("\n");
    sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
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

