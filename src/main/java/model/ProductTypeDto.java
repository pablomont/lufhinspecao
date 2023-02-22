package model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Representa o tipo do produto
 */
@ApiModel(description = "Representa o tipo do produto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-21T22:46:02.357514-03:00[America/Fortaleza]")
public class ProductTypeDto   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("productTypeName")
  private String productTypeName;

  public ProductTypeDto id(Long id) {
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

  public ProductTypeDto productTypeName(String productTypeName) {
    this.productTypeName = productTypeName;
    return this;
  }

  /**
   * Get productTypeName
   * @return productTypeName
  */
  @ApiModelProperty(example = "Medical Device", value = "")


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
    ProductTypeDto productType = (ProductTypeDto) o;
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
    sb.append("class ProductTypeDto {\n");
    
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

