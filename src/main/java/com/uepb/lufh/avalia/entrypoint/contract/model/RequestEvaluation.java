package com.uepb.lufh.avalia.entrypoint.contract.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;

/**
 * Represents a request to evaluate a product.
 */
@ApiModel(description = "Represents a request to evaluate a product.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-22T02:43:06.822926-03:00[America/Fortaleza]")
public class RequestEvaluation   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("productId")
  private String productId;

  @JsonProperty("customerCpfCnpj")
  private String customerCpfCnpj;

  @JsonProperty("startDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  @JsonProperty("endDate")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDate;

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

  public RequestEvaluation id(Long id) {
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

  public RequestEvaluation productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  @ApiModelProperty(value = "")


  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public RequestEvaluation customerCpfCnpj(String customerCpfCnpj) {
    this.customerCpfCnpj = customerCpfCnpj;
    return this;
  }

  /**
   * Get customerCpfCnpj
   * @return customerCpfCnpj
  */
  @ApiModelProperty(value = "")


  public String getCustomerCpfCnpj() {
    return customerCpfCnpj;
  }

  public void setCustomerCpfCnpj(String customerCpfCnpj) {
    this.customerCpfCnpj = customerCpfCnpj;
  }

  public RequestEvaluation startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Entry date into lufh
   * @return startDate
  */
  @ApiModelProperty(value = "Entry date into lufh")

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public RequestEvaluation endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Planned departure date from lufh
   * @return endDate
  */
  @ApiModelProperty(value = "Planned departure date from lufh")

  @Valid

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public RequestEvaluation urgency(Boolean urgency) {
    this.urgency = urgency;
    return this;
  }

  /**
   * Get urgency
   * @return urgency
  */
  @ApiModelProperty(value = "")


  public Boolean getUrgency() {
    return urgency;
  }

  public void setUrgency(Boolean urgency) {
    this.urgency = urgency;
  }

  public RequestEvaluation testType(TestTypeEnum testType) {
    this.testType = testType;
    return this;
  }

  /**
   * Type of contracted test
   * @return testType
  */
  @ApiModelProperty(value = "Type of contracted test")


  public TestTypeEnum getTestType() {
    return testType;
  }

  public void setTestType(TestTypeEnum testType) {
    this.testType = testType;
  }

  public RequestEvaluation coverage(String coverage) {
    this.coverage = coverage;
    return this;
  }

  /**
   * Contracted scope
   * @return coverage
  */
  @ApiModelProperty(value = "Contracted scope")


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
    RequestEvaluation requestEvaluation = (RequestEvaluation) o;
    return Objects.equals(this.id, requestEvaluation.id) &&
        Objects.equals(this.productId, requestEvaluation.productId) &&
        Objects.equals(this.customerCpfCnpj, requestEvaluation.customerCpfCnpj) &&
        Objects.equals(this.startDate, requestEvaluation.startDate) &&
        Objects.equals(this.endDate, requestEvaluation.endDate) &&
        Objects.equals(this.urgency, requestEvaluation.urgency) &&
        Objects.equals(this.testType, requestEvaluation.testType) &&
        Objects.equals(this.coverage, requestEvaluation.coverage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productId, customerCpfCnpj, startDate, endDate, urgency, testType, coverage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestEvaluation {\n");
    
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

