package com.uepb.lufh.avalia.entrypoint.contract.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ModelClass
 */

@JsonTypeName("Class")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-10T12:53:00.057977-03:00[America/Fortaleza]")
public class ModelClass {

  /**
   * Each class of a question is a Nilsen heuristic
   */
  public enum NameEnum {
    AESTHETIC_AND_MINIMALIST_DESIGN("Aesthetic and minimalist design"),
    
    CONSISTENCY_AND_STANDARDS("Consistency and standards"),
    
    ERROR_PREVENTION("Error prevention"),
    
    FLEXIBILITY_AND_EFFICIENCY_OF_USE("Flexibility and efficiency of use"),
    
    HELP_AND_DOCUMENTATION("Help and documentation"),
    
    HELP_USERS_RECOGNIZE_DIAGNOSE_AND_RECOVER_FROM_ERRORS("Help users recognize, diagnose, and recover from errors"),
    
    MATCH_BETWEEN_SYSTEM_AND_THE_REAL_WORLD("Match between system and the real world"),
    
    RECOGNITION_RATHER_THAN_RECALL("Recognition rather than recall"),
    
    USER_CONTROL_AND_FREEDOM("User control and freedom"),
    
    VISIBILITY_OF_SYSTEM_STATUS("Visibility of system status"),
    
    PRIVACY_SECURITY("Privacy & Security");

    private String value;

    NameEnum(String value) {
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
    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("name")
  private NameEnum name;

  public ModelClass name(NameEnum name) {
    this.name = name;
    return this;
  }

  /**
   * Each class of a question is a Nilsen heuristic
   * @return name
  */
  
  @Schema(name = "name", description = "Each class of a question is a Nilsen heuristic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelClass propertyClass = (ModelClass) o;
    return Objects.equals(this.name, propertyClass.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelClass {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

