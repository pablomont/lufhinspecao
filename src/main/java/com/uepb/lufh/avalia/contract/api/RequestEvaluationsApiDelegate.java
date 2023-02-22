package com.uepb.lufh.avalia.contract.api;

import com.uepb.lufh.avalia.contract.model.Question;
import com.uepb.lufh.avalia.contract.model.RequestEvaluation;
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
 * A delegate to be called by the {@link RequestEvaluationsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-22T00:56:03.914173-03:00[America/Fortaleza]")
public interface RequestEvaluationsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /request-evaluations : Add a new request-evaluation
     *
     * @param question Question object that needs to be added to the form (required)
     * @return Internal server error (status code 500)
     * @see RequestEvaluationsApi#createRequestEvaluation
     */
    default ResponseEntity<Void> createRequestEvaluation(Question question) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /request-evaluations/{request_evaluation_id} : Deletes a request evaluation
     *
     * @param requestEvaluationId Request Evaluation id to delete (required)
     * @return Invalid ID supplied (status code 400)
     *         or Request Evaluation not found (status code 404)
     * @see RequestEvaluationsApi#deleteRequestEvaluation
     */
    default ResponseEntity<Void> deleteRequestEvaluation(Long requestEvaluationId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /request-evaluations/{request_evaluation_id} : Find request evaluation by ID
     *
     * @param requestEvaluationId ID of request evaluation to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Request evaluation not found (status code 404)
     * @see RequestEvaluationsApi#findRequestEvaluation
     */
    default ResponseEntity<RequestEvaluation> findRequestEvaluation(Long requestEvaluationId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"coverage\" : \"coverage\", \"productId\" : \"productId\", \"customerCpfCnpj\" : \"customerCpfCnpj\", \"endDate\" : \"2000-01-23T04:56:07.000+00:00\", \"urgency\" : true, \"testType\" : \"compliance inspection\", \"id\" : 0, \"startDate\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<null> <id>123456789</id> <productId>aeiou</productId> <customerCpfCnpj>aeiou</customerCpfCnpj> <startDate>2000-01-23T04:56:07.000Z</startDate> <endDate>2000-01-23T04:56:07.000Z</endDate> <urgency>true</urgency> <testType>aeiou</testType> <coverage>aeiou</coverage> </null>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
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
     *         or Not found (status code 404)
     * @see RequestEvaluationsApi#findRequestEvaluations
     */
    default ResponseEntity<List<RequestEvaluation>> findRequestEvaluations(String customerCpfCnpj) {
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
     * PUT /request-evaluations/{request_evaluation_id} : Update an existing request evaluation
     *
     * @param requestEvaluationId Request Evaluation id to update (required)
     * @param requestEvaluation  (required)
     * @return Invalid ID supplied (status code 400)
     *         or Request Evaluation not found (status code 404)
     *         or Validation exception (status code 405)
     * @see RequestEvaluationsApi#updateRequestEvaluation
     */
    default ResponseEntity<Void> updateRequestEvaluation(Long requestEvaluationId,
        RequestEvaluation requestEvaluation) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
