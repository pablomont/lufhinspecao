package com.uepb.lufh.avalia.entrypoint.contract.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@Schema(name = "Product", description = "Represents a product to be evaluated")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-24T00:23:07.669998-03:00[America/Fortaleza]")
public class Product {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("productName")
  private String productName;

  @JsonProperty("manufacterName")
  private String manufacterName;

  @JsonProperty("productType")
  private ProductType productType;

  @JsonProperty("productClass")
  private String productClass;

  @JsonProperty("completionLevel")
  private String completionLevel;

  public Product id(Long id) {
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

  public Product productName(String productName) {
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

  public Product manufacterName(String manufacterName) {
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

  public Product productType(ProductType productType) {
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

  public Product productClass(String productClass) {
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

  public Product completionLevel(String completionLevel) {
    this.completionLevel = completionLevel;
    return this;
  }

  /**
   * Get completionLevel
   * @return completionLevel
  */
  
  @Schema(name = "completionLevel", example = "Alfa Test, Beta Test", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getCompletionLevel() {
    return completionLevel;
  }

  public void setCompletionLevel(String completionLevel) {
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
    Product product = (Product) o;
    return Objects.equals(this.id, product.id) &&
        Objects.equals(this.productName, product.productName) &&
        Objects.equals(this.manufacterName, product.manufacterName) &&
        Objects.equals(this.productType, product.productType) &&
        Objects.equals(this.productClass, product.productClass) &&
        Objects.equals(this.completionLevel, product.completionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productName, manufacterName, productType, productClass, completionLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

