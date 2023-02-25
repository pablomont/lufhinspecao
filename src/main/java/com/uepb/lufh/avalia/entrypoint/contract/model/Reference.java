package com.uepb.lufh.avalia.entrypoint.contract.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Reference
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-25T04:21:14.056060-03:00[America/Fortaleza]")
public class Reference {

  /**
   * type of reference
   */
  public enum TypeEnum {
    ARTICLE("Article"),
    
    BOOK("Book"),
    
    EDOCUMENT("eDocument"),
    
    STANDARD("Standard");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("bibliography")
  private String bibliography;

  public Reference type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * type of reference
   * @return type
  */
  
  @Schema(name = "type", description = "type of reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Reference bibliography(String bibliography) {
    this.bibliography = bibliography;
    return this;
  }

  /**
   * Get bibliography
   * @return bibliography
  */
  
  @Schema(name = "bibliography", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getBibliography() {
    return bibliography;
  }

  public void setBibliography(String bibliography) {
    this.bibliography = bibliography;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reference reference = (Reference) o;
    return Objects.equals(this.type, reference.type) &&
        Objects.equals(this.bibliography, reference.bibliography);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, bibliography);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reference {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bibliography: ").append(toIndentedString(bibliography)).append("\n");
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

