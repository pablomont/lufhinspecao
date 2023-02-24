/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.uepb.lufh.avalia.entrypoint.contract.api;

import com.uepb.lufh.avalia.entrypoint.contract.model.Customer;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-24T12:59:59.575611-03:00[America/Fortaleza]")
@Validated
@Tag(name = "customers", description = "Disponibiliza operações sobre os clientes que solicitaram uma avaliação de um determinado produto.")
@RequestMapping("${openapi.lufhInspeo.base-path:/lufh-avalia}")
public interface CustomersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /customers : Add a new customer
     *
     * @param customer Customer object that needs to have a product evaluation (required)
     * @return Internal server error (status code 500)
     */
    @Operation(
        operationId = "createCustomer",
        summary = "Add a new customer",
        tags = { "customers" },
        responses = {
            @ApiResponse(responseCode = "500", description = "Internal server error")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/customers",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> createCustomer(
        @Parameter(name = "Customer", description = "Customer object that needs to have a product evaluation", required = true) @Valid @RequestBody Customer customer
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /customers/{customer_cpf_cnpj} : Deletes a customer
     *
     * @param customerCpfCnpj Customer id to delete (required)
     * @return Invalid ID supplied (status code 400)
     *         or Customer not found (status code 404)
     */
    @Operation(
        operationId = "deleteCustomer",
        summary = "Deletes a customer",
        tags = { "customers" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Customer not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/customers/{customer_cpf_cnpj}"
    )
    default ResponseEntity<Void> deleteCustomer(
        @Parameter(name = "customer_cpf_cnpj", description = "Customer id to delete", required = true, in = ParameterIn.PATH) @PathVariable("customer_cpf_cnpj") Long customerCpfCnpj
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /customers/{customer_cpf_cnpj} : Find a customer by ID
     *
     * @param customerCpfCnpj CPF or CNPJ of customer to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Customer not found (status code 404)
     */
    @Operation(
        operationId = "findCustomer",
        summary = "Find a customer by ID",
        tags = { "customers" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Customer.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Customer.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Customer not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/customers/{customer_cpf_cnpj}",
        produces = { "application/json", "application/xml" }
    )
    default ResponseEntity<Customer> findCustomer(
        @Parameter(name = "customer_cpf_cnpj", description = "CPF or CNPJ of customer to return", required = true, in = ParameterIn.PATH) @PathVariable("customer_cpf_cnpj") Long customerCpfCnpj
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"phoneNumber\" : \"phoneNumber\", \"id\" : 0, \"cpfCnpj\" : \"cpfCnpj\", \"customerName\" : \"customerName\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Customer> <id>123</id> <customerName>aeiou</customerName> <cpfCnpj>aeiou</cpfCnpj> <email>aeiou</email> <phoneNumber>aeiou</phoneNumber> </Customer>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /customers : Finds all customers
     *
     * @param customerCpfCnpj CPF and CNPJ values that can be considered for filter (optional)
     * @return successful operation (status code 200)
     *         or Not found (status code 404)
     */
    @Operation(
        operationId = "findCustomers",
        summary = "Finds all customers",
        tags = { "customers" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Customer.class)))
            }),
            @ApiResponse(responseCode = "404", description = "Not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/customers",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Customer>> findCustomers(
        @Parameter(name = "customer_cpf_cnpj", description = "CPF and CNPJ values that can be considered for filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "customer_cpf_cnpj", required = false) String customerCpfCnpj
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"phoneNumber\" : \"phoneNumber\", \"id\" : 0, \"cpfCnpj\" : \"cpfCnpj\", \"customerName\" : \"customerName\", \"email\" : \"email\" }, { \"phoneNumber\" : \"phoneNumber\", \"id\" : 0, \"cpfCnpj\" : \"cpfCnpj\", \"customerName\" : \"customerName\", \"email\" : \"email\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /customers/{customer_cpf_cnpj} : Update an existing customer
     *
     * @param customerCpfCnpj Customer id to update (required)
     * @param customer Customer object that needs to have a product evaluation (required)
     * @return Invalid ID supplied (status code 400)
     *         or Customer not found (status code 404)
     *         or Validation exception (status code 405)
     */
    @Operation(
        operationId = "updateCustomer",
        summary = "Update an existing customer",
        tags = { "customers" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Customer not found"),
            @ApiResponse(responseCode = "405", description = "Validation exception")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/customers/{customer_cpf_cnpj}",
        consumes = { "application/json", "application/xml" }
    )
    default ResponseEntity<Void> updateCustomer(
        @Parameter(name = "customer_cpf_cnpj", description = "Customer id to update", required = true, in = ParameterIn.PATH) @PathVariable("customer_cpf_cnpj") Long customerCpfCnpj,
        @Parameter(name = "Customer", description = "Customer object that needs to have a product evaluation", required = true) @Valid @RequestBody Customer customer
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
