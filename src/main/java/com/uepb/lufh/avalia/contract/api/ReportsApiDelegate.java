package com.uepb.lufh.avalia.contract.api;

import com.uepb.lufh.avalia.contract.model.Report;
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
 * A delegate to be called by the {@link ReportsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-22T00:56:03.914173-03:00[America/Fortaleza]")
public interface ReportsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /reports : Add a new report
     *
     * @param report  (required)
     * @return Internal server error (status code 500)
     * @see ReportsApi#createReport
     */
    default ResponseEntity<Void> createReport(Report report) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /reports/{report_id} : Deletes a report
     *
     * @param reportId Report id to delete (required)
     * @return Invalid ID supplied (status code 400)
     *         or Report not found (status code 404)
     * @see ReportsApi#deleteReport
     */
    default ResponseEntity<Void> deleteReport(Long reportId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /reports/{report_id} : Find a report by ID
     *
     * @param reportId ID of report to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Report not found (status code 404)
     * @see ReportsApi#findReport
     */
    default ResponseEntity<Report> findReport(Long reportId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"requestEvaluationId\" : 0, \"reportDate\" : \"2000-01-23T04:56:07.000+00:00\", \"questionare\" : { \"creator\" : \"creator\", \"questions\" : [ { \"reference\" : { \"bibliography\" : \"bibliography\", \"type\" : \"Article\" }, \"baseQuestion\" : \"Is it designed minimal?\", \"answer\" : { \"severity\" : \"0 Not a usability problem at all\", \"weight\" : \"0 Necessary for every System\", \"possibleAnswers\" : [ \"possibleAnswers\", \"possibleAnswers\" ], \"choosenAnswer\" : \"choosenAnswer\" }, \"id\" : 0, \"detailedQuestion\" : \"Is only (and all) information, essential to decision making, displayed on the screen?\", \"class\" : { \"name\" : \"Aesthetic and minimalist design\" }, \"productType\" : \"Software\" }, { \"reference\" : { \"bibliography\" : \"bibliography\", \"type\" : \"Article\" }, \"baseQuestion\" : \"Is it designed minimal?\", \"answer\" : { \"severity\" : \"0 Not a usability problem at all\", \"weight\" : \"0 Necessary for every System\", \"possibleAnswers\" : [ \"possibleAnswers\", \"possibleAnswers\" ], \"choosenAnswer\" : \"choosenAnswer\" }, \"id\" : 0, \"detailedQuestion\" : \"Is only (and all) information, essential to decision making, displayed on the screen?\", \"class\" : { \"name\" : \"Aesthetic and minimalist design\" }, \"productType\" : \"Software\" } ], \"id\" : 0, \"evaluator\" : \"evaluator\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Report> <requestEvaluationId>123</requestEvaluationId> <reportDate>2000-01-23T04:56:07.000Z</reportDate> </Report>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
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
     * @see ReportsApi#findReports
     */
    default ResponseEntity<List<Report>> findReports(String requestEvaluationId,
        String productType,
        String reportDate) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"requestEvaluationId\" : 0, \"reportDate\" : \"2000-01-23T04:56:07.000+00:00\", \"questionare\" : { \"creator\" : \"creator\", \"questions\" : [ { \"reference\" : { \"bibliography\" : \"bibliography\", \"type\" : \"Article\" }, \"baseQuestion\" : \"Is it designed minimal?\", \"answer\" : { \"severity\" : \"0 Not a usability problem at all\", \"weight\" : \"0 Necessary for every System\", \"possibleAnswers\" : [ \"possibleAnswers\", \"possibleAnswers\" ], \"choosenAnswer\" : \"choosenAnswer\" }, \"id\" : 0, \"detailedQuestion\" : \"Is only (and all) information, essential to decision making, displayed on the screen?\", \"class\" : { \"name\" : \"Aesthetic and minimalist design\" }, \"productType\" : \"Software\" }, { \"reference\" : { \"bibliography\" : \"bibliography\", \"type\" : \"Article\" }, \"baseQuestion\" : \"Is it designed minimal?\", \"answer\" : { \"severity\" : \"0 Not a usability problem at all\", \"weight\" : \"0 Necessary for every System\", \"possibleAnswers\" : [ \"possibleAnswers\", \"possibleAnswers\" ], \"choosenAnswer\" : \"choosenAnswer\" }, \"id\" : 0, \"detailedQuestion\" : \"Is only (and all) information, essential to decision making, displayed on the screen?\", \"class\" : { \"name\" : \"Aesthetic and minimalist design\" }, \"productType\" : \"Software\" } ], \"id\" : 0, \"evaluator\" : \"evaluator\" } }";
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
     * @param report  (required)
     * @return Invalid ID supplied (status code 400)
     *         or Question not found (status code 404)
     *         or Validation exception (status code 405)
     * @see ReportsApi#updateReport
     */
    default ResponseEntity<Void> updateReport(Long reportId,
        Report report) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
