package com.uepb.lufh.avalia.entrypoint.contract.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Representa o tipo do produto
 */

@Schema(name = "ProductType", description = "Representa o tipo do produto")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T04:21:14.056060-03:00[America/Fortaleza]")
public class ProductType {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("productTypeName")
  private String productTypeName;

  public ProductType id(Long id) {
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

  public ProductType productTypeName(String productTypeName) {
    this.productTypeName = productTypeName;
    return this;
  }

  /**
   * Get productTypeName
   * @return productTypeName
  */
  
  @Schema(name = "productTypeName", example = "Medical Device", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getProductTypeName() {
    return productTypeName;
  }

  public void setProductTypeName(String productTypeName) {
    this.productTypeName = productTypeName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductType productType = (ProductType) o;
    return Objects.equals(this.id, productType.id) &&
        Objects.equals(this.productTypeName, productType.productTypeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productTypeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productTypeName: ").append(toIndentedString(productTypeName)).append("\n");
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

