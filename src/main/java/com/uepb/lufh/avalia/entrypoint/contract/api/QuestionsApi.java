/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.uepb.lufh.avalia.entrypoint.contract.api;

import com.uepb.lufh.avalia.entrypoint.contract.model.QuestionInput;
import com.uepb.lufh.avalia.entrypoint.contract.model.QuestionOutput;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T15:42:55.777299-03:00[America/Fortaleza]")
@Validated
@Tag(name = "questions", description = "Disponibiliza operações sobre as questões.")
@RequestMapping("${openapi.lufhInspeo.base-path:/lufh-avalia}")
public interface QuestionsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /questions : Add a new question
     *
     * @param questionInput Question object that needs to be added to the form (required)
     * @return Internal server error (status code 500)
     */
    @Operation(
        operationId = "createQuestion",
        summary = "Add a new question",
        tags = { "questions" },
        responses = {
            @ApiResponse(responseCode = "500", description = "Internal server error")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/questions",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> createQuestion(
        @Parameter(name = "QuestionInput", description = "Question object that needs to be added to the form", required = true) @Valid @RequestBody QuestionInput questionInput
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /questions/{question_id} : Deletes a question
     *
     * @param questionId Question id to delete (required)
     * @return Invalid ID supplied (status code 400)
     *         or Question not found (status code 404)
     */
    @Operation(
        operationId = "deleteQuestion",
        summary = "Deletes a question",
        tags = { "questions" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Question not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/questions/{question_id}"
    )
    default ResponseEntity<Void> deleteQuestion(
        @Parameter(name = "question_id", description = "Question id to delete", required = true, in = ParameterIn.PATH) @PathVariable("question_id") Long questionId
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /questions/{question_id} : Find question by ID
     *
     * @param questionId ID of question to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Question not found (status code 404)
     */
    @Operation(
        operationId = "findQuestion",
        summary = "Find question by ID",
        tags = { "questions" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = QuestionOutput.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Question not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/questions/{question_id}",
        produces = { "application/json" }
    )
    default ResponseEntity<QuestionOutput> findQuestion(
        @Parameter(name = "question_id", description = "ID of question to return", required = true, in = ParameterIn.PATH) @PathVariable("question_id") Long questionId
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"reference\" : { \"bibliography\" : \"bibliography\", \"type\" : \"Article\" }, \"baseQuestion\" : \"Is it designed minimal?\", \"answer\" : { \"severity\" : \"0 Not a usability problem at all\", \"answer\" : \"answer\", \"weight\" : \"0 Necessary for every System\" }, \"id\" : 0, \"detailedQuestion\" : \"Is only (and all) information, essential to decision making, displayed on the screen?\", \"class\" : { \"name\" : \"Aesthetic and minimalist design\" }, \"productType\" : \"Software\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /questions : Finds all questions
     *
     * @param propertyClass Class values that can be considered for filter (optional)
     * @param reference Reference values that can be considered for filter (optional)
     * @param productType Product type values that can be considered for filter (optional)
     * @return successful operation (status code 200)
     *         or Not found (status code 404)
     */
    @Operation(
        operationId = "findQuestions",
        summary = "Finds all questions",
        tags = { "questions" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = QuestionOutput.class)))
            }),
            @ApiResponse(responseCode = "404", description = "Not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/questions",
        produces = { "application/json" }
    )
    default ResponseEntity<List<QuestionOutput>> findQuestions(
        @Parameter(name = "class", description = "Class values that can be considered for filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "class", required = false) String propertyClass,
        @Parameter(name = "reference", description = "Reference values that can be considered for filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "reference", required = false) String reference,
        @Parameter(name = "product_type", description = "Product type values that can be considered for filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "product_type", required = false) String productType
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"reference\" : { \"bibliography\" : \"bibliography\", \"type\" : \"Article\" }, \"baseQuestion\" : \"Is it designed minimal?\", \"answer\" : { \"severity\" : \"0 Not a usability problem at all\", \"answer\" : \"answer\", \"weight\" : \"0 Necessary for every System\" }, \"id\" : 0, \"detailedQuestion\" : \"Is only (and all) information, essential to decision making, displayed on the screen?\", \"class\" : { \"name\" : \"Aesthetic and minimalist design\" }, \"productType\" : \"Software\" }, { \"reference\" : { \"bibliography\" : \"bibliography\", \"type\" : \"Article\" }, \"baseQuestion\" : \"Is it designed minimal?\", \"answer\" : { \"severity\" : \"0 Not a usability problem at all\", \"answer\" : \"answer\", \"weight\" : \"0 Necessary for every System\" }, \"id\" : 0, \"detailedQuestion\" : \"Is only (and all) information, essential to decision making, displayed on the screen?\", \"class\" : { \"name\" : \"Aesthetic and minimalist design\" }, \"productType\" : \"Software\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /questions/{question_id} : Update an existing question
     *
     * @param questionId Question id to update (required)
     * @param questionInput Question object that needs to be added to the form (required)
     * @return Invalid ID supplied (status code 400)
     *         or Question not found (status code 404)
     *         or Validation exception (status code 405)
     */
    @Operation(
        operationId = "updateQuestion",
        summary = "Update an existing question",
        tags = { "questions" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Question not found"),
            @ApiResponse(responseCode = "405", description = "Validation exception")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/questions/{question_id}",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> updateQuestion(
        @Parameter(name = "question_id", description = "Question id to update", required = true, in = ParameterIn.PATH) @PathVariable("question_id") Long questionId,
        @Parameter(name = "QuestionInput", description = "Question object that needs to be added to the form", required = true) @Valid @RequestBody QuestionInput questionInput
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
