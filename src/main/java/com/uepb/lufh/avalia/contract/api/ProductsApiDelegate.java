package com.uepb.lufh.avalia.contract.api;

import com.uepb.lufh.avalia.contract.model.Product;
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
 * A delegate to be called by the {@link ProductsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-22T00:21:14.348877-03:00[America/Fortaleza]")
public interface ProductsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /products : Add a new product
     *
     * @param product Product object that needs to be evaluated (required)
     * @return Internal server error (status code 500)
     * @see ProductsApi#createProduct
     */
    default ResponseEntity<Void> createProduct(Product product) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /products/{product_id} : Deletes a product
     *
     * @param productId Product id to delete (required)
     * @return Invalid ID supplied (status code 400)
     *         or Product not found (status code 404)
     * @see ProductsApi#deleteProduct
     */
    default ResponseEntity<Void> deleteProduct(Long productId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /products/{product_id} : Find product by ID
     *
     * @param productId ID of product to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Product not found (status code 404)
     * @see ProductsApi#findProduct
     */
    default ResponseEntity<Product> findProduct(Long productId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"manufacterName\" : \"Apple\", \"productClass\" : \"Class I\", \"completionLevel\" : \"Alfa Test, Beta Test\", \"id\" : 0, \"productName\" : \"Iphone X\", \"productType\" : { \"productTypeName\" : \"Medical Device\", \"id\" : 6 } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Product> <id>123456789</id> <productName>Iphone X</productName> <manufacterName>Apple</manufacterName> <productClass>Class I</productClass> <completionLevel>Alfa Test, Beta Test</completionLevel> </Product>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /products : Finds all products
     *
     * @param productName Product name values that can be considered for filter (optional)
     * @param productType Product type values that can be considered for filter (optional)
     * @return successful operation (status code 200)
     *         or Not found (status code 404)
     * @see ProductsApi#findProducts
     */
    default ResponseEntity<List<Product>> findProducts(String productName,
        String productType) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"manufacterName\" : \"Apple\", \"productClass\" : \"Class I\", \"completionLevel\" : \"Alfa Test, Beta Test\", \"id\" : 0, \"productName\" : \"Iphone X\", \"productType\" : { \"productTypeName\" : \"Medical Device\", \"id\" : 6 } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /products/{product_id} : Update an existing product
     *
     * @param productId Product id to update (required)
     * @param product Product object that needs to be evaluated (required)
     * @return Invalid ID supplied (status code 400)
     *         or Question not found (status code 404)
     *         or Validation exception (status code 405)
     * @see ProductsApi#updateProduct
     */
    default ResponseEntity<Void> updateProduct(Long productId,
        Product product) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
