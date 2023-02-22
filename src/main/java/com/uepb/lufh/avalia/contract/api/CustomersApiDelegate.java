package com.uepb.lufh.avalia.contract.api;

import com.uepb.lufh.avalia.contract.model.Customer;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link CustomersApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-22T00:56:03.914173-03:00[America/Fortaleza]")
public interface CustomersApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /customers : Add a new customer
     *
     * @param customer Customer object that needs to have a product evaluation (required)
     * @return Internal server error (status code 500)
     * @see CustomersApi#createCustomer
     */
    default ResponseEntity<Void> createCustomer(Customer customer) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /customers/{customer_cpf_cnpj} : Deletes a customer
     *
     * @param customerCpfCnpj Customer id to delete (required)
     * @return Invalid ID supplied (status code 400)
     *         or Customer not found (status code 404)
     * @see CustomersApi#deleteCustomer
     */
    default ResponseEntity<Void> deleteCustomer(Long customerCpfCnpj) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /customers/{customer_cpf_cnpj} : Find a customer by ID
     *
     * @param customerCpfCnpj CPF or CNPJ of customer to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Customer not found (status code 404)
     * @see CustomersApi#findCustomer
     */
    default ResponseEntity<Customer> findCustomer(Long customerCpfCnpj) {
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
     * @see CustomersApi#findCustomers
     */
    default ResponseEntity<List<Customer>> findCustomers(String customerCpfCnpj) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"phoneNumber\" : \"phoneNumber\", \"id\" : 0, \"cpfCnpj\" : \"cpfCnpj\", \"customerName\" : \"customerName\", \"email\" : \"email\" }";
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
     * @see CustomersApi#updateCustomer
     */
    default ResponseEntity<Void> updateCustomer(Long customerCpfCnpj,
        Customer customer) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
