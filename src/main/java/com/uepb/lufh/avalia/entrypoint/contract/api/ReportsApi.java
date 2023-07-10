/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.uepb.lufh.avalia.entrypoint.contract.api;

import com.uepb.lufh.avalia.entrypoint.contract.model.ReportInput;
import com.uepb.lufh.avalia.entrypoint.contract.model.ReportOutput;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-07-10T12:11:03.916856-03:00[America/Fortaleza]")
@Validated
@Tag(name = "reports", description = "Disponibiliza operações sobre os relatórios de uma avaliação.")
@RequestMapping("${openapi.lufhInspeo.base-path:/lufh-avalia}")
public interface ReportsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /reports : Add a new report
     *
     * @param reportInput  (required)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "createReport",
        summary = "Add a new report",
        tags = { "reports" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ReportOutput.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/reports",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<List<ReportOutput>> createReport(
        @Parameter(name = "ReportInput", description = "", required = true) @Valid @RequestBody ReportInput reportInput
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"requestEvaluationId\" : 6, \"answer\" : [ { \"severity\" : \"0 Not a usability problem at all\", \"answer\" : \"answer\", \"weight\" : \"0 Necessary for every System\" }, { \"severity\" : \"0 Not a usability problem at all\", \"answer\" : \"answer\", \"weight\" : \"0 Necessary for every System\" } ], \"questionnaireId\" : 1, \"id\" : 0 }, { \"requestEvaluationId\" : 6, \"answer\" : [ { \"severity\" : \"0 Not a usability problem at all\", \"answer\" : \"answer\", \"weight\" : \"0 Necessary for every System\" }, { \"severity\" : \"0 Not a usability problem at all\", \"answer\" : \"answer\", \"weight\" : \"0 Necessary for every System\" } ], \"questionnaireId\" : 1, \"id\" : 0 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /reports/{report_id} : Deletes a report
     *
     * @param reportId Report id to delete (required)
     * @return Invalid ID supplied (status code 400)
     *         or Report not found (status code 404)
     */
    @Operation(
        operationId = "deleteReport",
        summary = "Deletes a report",
        tags = { "reports" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Report not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/reports/{report_id}"
    )
    default ResponseEntity<Void> deleteReport(
        @Parameter(name = "report_id", description = "Report id to delete", required = true, in = ParameterIn.PATH) @PathVariable("report_id") Long reportId
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /reports/{report_id} : Find a report by ID
     *
     * @param reportId ID of report to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Report not found (status code 404)
     */
    @Operation(
        operationId = "findReport",
        summary = "Find a report by ID",
        tags = { "reports" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ReportOutput.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Report not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/reports/{report_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<ReportOutput> findReport(
        @Parameter(name = "report_id", description = "ID of report to return", required = true, in = ParameterIn.PATH) @PathVariable("report_id") Long reportId
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"requestEvaluationId\" : 6, \"answer\" : [ { \"severity\" : \"0 Not a usability problem at all\", \"answer\" : \"answer\", \"weight\" : \"0 Necessary for every System\" }, { \"severity\" : \"0 Not a usability problem at all\", \"answer\" : \"answer\", \"weight\" : \"0 Necessary for every System\" } ], \"questionnaireId\" : 1, \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /reports : Finds all reports
     *
     * @param requestEvaluationId Request evaluation id values that can be considered for filter (optional)
     * @param productType Product type values that can be considered for filter (optional)
     * @param reportDate Report date values that can be considered for filter (optional)
     * @return successful operation (status code 200)
     *         or Not found (status code 404)
     */
    @Operation(
        operationId = "findReports",
        summary = "Finds all reports",
        tags = { "reports" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ReportOutput.class)))
            }),
            @ApiResponse(responseCode = "404", description = "Not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/reports",
        produces = { "application/json" }
    )
    default ResponseEntity<List<ReportOutput>> findReports(
        @Parameter(name = "request_evaluation_id", description = "Request evaluation id values that can be considered for filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "request_evaluation_id", required = false) String requestEvaluationId,
        @Parameter(name = "product_type", description = "Product type values that can be considered for filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "product_type", required = false) String productType,
        @Parameter(name = "report_date", description = "Report date values that can be considered for filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "report_date", required = false) String reportDate
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"requestEvaluationId\" : 6, \"answer\" : [ { \"severity\" : \"0 Not a usability problem at all\", \"answer\" : \"answer\", \"weight\" : \"0 Necessary for every System\" }, { \"severity\" : \"0 Not a usability problem at all\", \"answer\" : \"answer\", \"weight\" : \"0 Necessary for every System\" } ], \"questionnaireId\" : 1, \"id\" : 0 }, { \"requestEvaluationId\" : 6, \"answer\" : [ { \"severity\" : \"0 Not a usability problem at all\", \"answer\" : \"answer\", \"weight\" : \"0 Necessary for every System\" }, { \"severity\" : \"0 Not a usability problem at all\", \"answer\" : \"answer\", \"weight\" : \"0 Necessary for every System\" } ], \"questionnaireId\" : 1, \"id\" : 0 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /reports/{report_id} : Update an existing report
     *
     * @param reportId Report id to update (required)
     * @param reportInput  (required)
     * @return Invalid ID supplied (status code 400)
     *         or Question not found (status code 404)
     *         or Validation exception (status code 405)
     */
    @Operation(
        operationId = "updateReport",
        summary = "Update an existing report",
        tags = { "reports" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Question not found"),
            @ApiResponse(responseCode = "405", description = "Validation exception")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/reports/{report_id}",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> updateReport(
        @Parameter(name = "report_id", description = "Report id to update", required = true, in = ParameterIn.PATH) @PathVariable("report_id") Long reportId,
        @Parameter(name = "ReportInput", description = "", required = true) @Valid @RequestBody ReportInput reportInput
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
