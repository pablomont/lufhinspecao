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
 * Representa o tipo do produto
 */

@Schema(name = "ProductType", description = "Representa o tipo do produto")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T15:51:28.790186-03:00[America/Fortaleza]")
public class ProductType {

  /**
   * Each product can be tested by usability testing
   */
  public enum NameEnum {
    WEBSITES("Websites"),
    
    MOBILE_APPLICATIONS("Mobile applications"),
    
    SOFTWARE("Software"),
    
    ELECTRONIC_GAMES("Electronic games"),
    
    PHYSICAL_PRODUCTS_WITH_ELECTRONIC_INTERFACES("Physical products with electronic interfaces"),
    
    HOME_APPLIANCES("Home appliances"),
    
    GPS_NAVIGATION_SYSTEMS("GPS navigation systems"),
    
    IN_CAR_ENTERTAINMENT_SYSTEMS("In-car entertainment systems"),
    
    VENDING_MACHINES("Vending machines"),
    
    ATMS_AUTOMATED_TELLER_MACHINES_("ATMs (Automated Teller Machines)"),
    
    ACCESS_CONTROL_SYSTEMS("Access control systems"),
    
    LIGHTING_AND_TEMPERATURE_CONTROL_SYSTEMS_IN_BUILDINGS("Lighting and temperature control systems in buildings"),
    
    MEDICAL_DEVICES("Medical devices"),
    
    CONSUMER_PRODUCTS("Consumer products");

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

  public ProductType name(NameEnum name) {
    this.name = name;
    return this;
  }

  /**
   * Each product can be tested by usability testing
   * @return name
  */
  
  @Schema(name = "name", description = "Each product can be tested by usability testing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ProductType productType = (ProductType) o;
    return Objects.equals(this.name, productType.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductType {\n");
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

