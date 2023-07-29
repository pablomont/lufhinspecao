/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.uepb.lufh.avalia.entrypoint.contract.api;

import com.uepb.lufh.avalia.entrypoint.contract.model.Error;
import com.uepb.lufh.avalia.entrypoint.contract.model.RequestEvaluationInput;
import com.uepb.lufh.avalia.entrypoint.contract.model.RequestEvaluationOutput;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-29T11:54:54.008836-03:00[America/Fortaleza]")
@Validated
@Tag(name = "request-evaluations", description = "Disponibiliza operações sobre as requisições de avaliação.")
@RequestMapping("${openapi.lufhInspeo.base-path:/lufh-avalia}")
public interface RequestEvaluationsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /request-evaluations : Add a new request-evaluation
     *
     * @param productId  (required)
     * @param customerCpfCnpj  (required)
     * @param requestEvaluationInput Request evaluation object (required)
     * @return A RequestEvaluationOutput object (status code 200)
     *         or Internal server error (status code 500)
     *         or Bad Request (status code 400)
     *         or Not found (status code 404)
     */
    @Operation(
        operationId = "createRequestEvaluation",
        summary = "Add a new request-evaluation",
        tags = { "request-evaluations" },
        responses = {
            @ApiResponse(responseCode = "200", description = "A RequestEvaluationOutput object", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RequestEvaluationOutput.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal server error"),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/request-evaluations",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<RequestEvaluationOutput> createRequestEvaluation(
        @NotNull @Parameter(name = "product_id", description = "", required = true, in = ParameterIn.HEADER) @RequestHeader(value = "product_id", required = true) String productId,
        @NotNull @Parameter(name = "customer_cpf_cnpj", description = "", required = true, in = ParameterIn.HEADER) @RequestHeader(value = "customer_cpf_cnpj", required = true) String customerCpfCnpj,
        @Parameter(name = "RequestEvaluationInput", description = "Request evaluation object", required = true) @Valid @RequestBody RequestEvaluationInput requestEvaluationInput
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"coverage\" : \"coverage\", \"productId\" : \"productId\", \"customerCpfCnpj\" : \"customerCpfCnpj\", \"endDate\" : \"2000-01-23T04:56:07.000+00:00\", \"urgency\" : true, \"testType\" : \"compliance inspection\", \"id\" : 0, \"startDate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /request-evaluations/{request_evaluation_id} : Deletes a request evaluation
     *
     * @param requestEvaluationId Request Evaluation id to delete (required)
     * @return No content (status code 204)
     *         or Not found (status code 404)
     */
    @Operation(
        operationId = "deleteRequestEvaluation",
        summary = "Deletes a request evaluation",
        tags = { "request-evaluations" },
        responses = {
            @ApiResponse(responseCode = "204", description = "No content"),
            @ApiResponse(responseCode = "404", description = "Not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/request-evaluations/{request_evaluation_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<Void> deleteRequestEvaluation(
        @Parameter(name = "request_evaluation_id", description = "Request Evaluation id to delete", required = true, in = ParameterIn.PATH) @PathVariable("request_evaluation_id") Long requestEvaluationId
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /request-evaluations/{request_evaluation_id} : Find request evaluation by ID
     *
     * @param requestEvaluationId ID of request evaluation to return (required)
     * @return successful operation (status code 200)
     *         or Not found (status code 404)
     */
    @Operation(
        operationId = "findRequestEvaluation",
        summary = "Find request evaluation by ID",
        tags = { "request-evaluations" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RequestEvaluationOutput.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/request-evaluations/{request_evaluation_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<RequestEvaluationOutput> findRequestEvaluation(
        @Parameter(name = "request_evaluation_id", description = "ID of request evaluation to return", required = true, in = ParameterIn.PATH) @PathVariable("request_evaluation_id") Long requestEvaluationId
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"coverage\" : \"coverage\", \"productId\" : \"productId\", \"customerCpfCnpj\" : \"customerCpfCnpj\", \"endDate\" : \"2000-01-23T04:56:07.000+00:00\", \"urgency\" : true, \"testType\" : \"compliance inspection\", \"id\" : 0, \"startDate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /request-evaluations : Finds all request-evaluations
     *
     * @param customerCpfCnpj CPF and CNPJ values that can be considered for filter (optional)
     * @return successful operation (status code 200)
     *         or Bad Request (status code 400)
     *         or Not found (status code 404)
     */
    @Operation(
        operationId = "findRequestEvaluations",
        summary = "Finds all request-evaluations",
        tags = { "request-evaluations" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = RequestEvaluationOutput.class)))
            }),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/request-evaluations",
        produces = { "application/json" }
    )
    default ResponseEntity<List<RequestEvaluationOutput>> findRequestEvaluations(
        @Parameter(name = "customer_cpf_cnpj", description = "CPF and CNPJ values that can be considered for filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "customer_cpf_cnpj", required = false) String customerCpfCnpj
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"coverage\" : \"coverage\", \"productId\" : \"productId\", \"customerCpfCnpj\" : \"customerCpfCnpj\", \"endDate\" : \"2000-01-23T04:56:07.000+00:00\", \"urgency\" : true, \"testType\" : \"compliance inspection\", \"id\" : 0, \"startDate\" : \"2000-01-23T04:56:07.000+00:00\" }, { \"coverage\" : \"coverage\", \"productId\" : \"productId\", \"customerCpfCnpj\" : \"customerCpfCnpj\", \"endDate\" : \"2000-01-23T04:56:07.000+00:00\", \"urgency\" : true, \"testType\" : \"compliance inspection\", \"id\" : 0, \"startDate\" : \"2000-01-23T04:56:07.000+00:00\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /request-evaluations/{request_evaluation_id} : Update an existing request evaluation
     *
     * @param requestEvaluationId Request Evaluation id to update (required)
     * @param requestEvaluationInput  (required)
     * @return Not found (status code 404)
     */
    @Operation(
        operationId = "updateRequestEvaluation",
        summary = "Update an existing request evaluation",
        tags = { "request-evaluations" },
        responses = {
            @ApiResponse(responseCode = "404", description = "Not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/request-evaluations/{request_evaluation_id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> updateRequestEvaluation(
        @Parameter(name = "request_evaluation_id", description = "Request Evaluation id to update", required = true, in = ParameterIn.PATH) @PathVariable("request_evaluation_id") Long requestEvaluationId,
        @Parameter(name = "RequestEvaluationInput", description = "", required = true) @Valid @RequestBody RequestEvaluationInput requestEvaluationInput
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
