package com.uepb.lufh.avalia.entrypoint.contract.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.uepb.lufh.avalia.entrypoint.contract.model.ProductType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents a product to be evaluated
 */

@Schema(name = "ProductInput", description = "Represents a product to be evaluated")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T19:01:17.964952-03:00[America/Fortaleza]")
public class ProductInput {

  @JsonProperty("productName")
  private String productName;

  @JsonProperty("manufacterName")
  private String manufacterName;

  @JsonProperty("productType")
  private ProductType productType;

  @JsonProperty("productClass")
  private String productClass;

  /**
   * Gets or Sets completionLevel
   */
  public enum CompletionLevelEnum {
    ALFA_TEST("Alfa Test"),
    
    BETA_TEST("Beta Test"),
    
    FINISHED_PRODUCT("Finished Product"),
    
    LOW_FIDELITY_PROTOTYPE("Low Fidelity Prototype"),
    
    MEDIUM_FIDELITY_PROTOTYPE("Medium Fidelity Prototype"),
    
    SPECIFICATION("Specification");

    private String value;

    CompletionLevelEnum(String value) {
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
    public static CompletionLevelEnum fromValue(String value) {
      for (CompletionLevelEnum b : CompletionLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("completionLevel")
  private CompletionLevelEnum completionLevel;

  public ProductInput productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Get productName
   * @return productName
  */
  
  @Schema(name = "productName", example = "Iphone X", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public ProductInput manufacterName(String manufacterName) {
    this.manufacterName = manufacterName;
    return this;
  }

  /**
   * Get manufacterName
   * @return manufacterName
  */
  
  @Schema(name = "manufacterName", example = "Apple", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getManufacterName() {
    return manufacterName;
  }

  public void setManufacterName(String manufacterName) {
    this.manufacterName = manufacterName;
  }

  public ProductInput productType(ProductType productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Get productType
   * @return productType
  */
  @Valid 
  @Schema(name = "productType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public ProductType getProductType() {
    return productType;
  }

  public void setProductType(ProductType productType) {
    this.productType = productType;
  }

  public ProductInput productClass(String productClass) {
    this.productClass = productClass;
    return this;
  }

  /**
   * Get productClass
   * @return productClass
  */
  
  @Schema(name = "productClass", example = "Class I", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getProductClass() {
    return productClass;
  }

  public void setProductClass(String productClass) {
    this.productClass = productClass;
  }

  public ProductInput completionLevel(CompletionLevelEnum completionLevel) {
    this.completionLevel = completionLevel;
    return this;
  }

  /**
   * Get completionLevel
   * @return completionLevel
  */
  
  @Schema(name = "completionLevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public CompletionLevelEnum getCompletionLevel() {
    return completionLevel;
  }

  public void setCompletionLevel(CompletionLevelEnum completionLevel) {
    this.completionLevel = completionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductInput productInput = (ProductInput) o;
    return Objects.equals(this.productName, productInput.productName) &&
        Objects.equals(this.manufacterName, productInput.manufacterName) &&
        Objects.equals(this.productType, productInput.productType) &&
        Objects.equals(this.productClass, productInput.productClass) &&
        Objects.equals(this.completionLevel, productInput.completionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productName, manufacterName, productType, productClass, completionLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductInput {\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    manufacterName: ").append(toIndentedString(manufacterName)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    productClass: ").append(toIndentedString(productClass)).append("\n");
    sb.append("    completionLevel: ").append(toIndentedString(completionLevel)).append("\n");
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

