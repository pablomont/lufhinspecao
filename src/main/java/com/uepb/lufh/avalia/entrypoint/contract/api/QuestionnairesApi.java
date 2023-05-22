/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.uepb.lufh.avalia.entrypoint.contract.api;

import com.uepb.lufh.avalia.entrypoint.contract.model.QuestionnaireInput;
import com.uepb.lufh.avalia.entrypoint.contract.model.QuestionnaireOutput;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-22T15:51:28.790186-03:00[America/Fortaleza]")
@Validated
@Tag(name = "questionnaires", description = "Disponibiliza operações sobre os questionários utilizado para avaliar o produto.")
@RequestMapping("${openapi.lufhInspeo.base-path:/lufh-avalia}")
public interface QuestionnairesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /questionnaires : Add a new questionnaire
     *
     * @param questionnaireInput  (optional)
     * @return Internal server error (status code 500)
     */
    @Operation(
        operationId = "createQuestionaire",
        summary = "Add a new questionnaire",
        tags = { "questionnaires" },
        responses = {
            @ApiResponse(responseCode = "500", description = "Internal server error")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/questionnaires",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> createQuestionaire(
        @Parameter(name = "QuestionnaireInput", description = "") @Valid @RequestBody(required = false) QuestionnaireInput questionnaireInput
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /questionnaires/{questionnaire_id} : Deletes a questionnaire
     *
     * @param questionnaireId Questionnaire id to delete (required)
     * @return Invalid ID supplied (status code 400)
     *         or Questionnaire not found (status code 404)
     */
    @Operation(
        operationId = "deleteQuestionnaire",
        summary = "Deletes a questionnaire",
        tags = { "questionnaires" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Questionnaire not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/questionnaires/{questionnaire_id}"
    )
    default ResponseEntity<Void> deleteQuestionnaire(
        @Parameter(name = "questionnaire_id", description = "Questionnaire id to delete", required = true, in = ParameterIn.PATH) @PathVariable("questionnaire_id") Long questionnaireId
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /questionnaires/{questionnaire_id} : Find questionnaire by ID
     *
     * @param questionnaireId ID of questionnaire to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Questionnaire not found (status code 404)
     */
    @Operation(
        operationId = "findQuestionnaire",
        summary = "Find questionnaire by ID",
        tags = { "questionnaires" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = QuestionnaireInput.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = QuestionnaireInput.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Questionnaire not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/questionnaires/{questionnaire_id}",
        produces = { "application/json", "application/xml" }
    )
    default ResponseEntity<QuestionnaireInput> findQuestionnaire(
        @Parameter(name = "questionnaire_id", description = "ID of questionnaire to return", required = true, in = ParameterIn.PATH) @PathVariable("questionnaire_id") Long questionnaireId
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"creator\" : \"creator\", \"questions\" : [ { \"reference\" : { \"bibliography\" : \"bibliography\", \"type\" : \"Article\" }, \"baseQuestion\" : \"Is it designed minimal?\", \"id\" : 0, \"detailedQuestion\" : \"Is only (and all) information, essential to decision making, displayed on the screen?\", \"class\" : { \"name\" : \"Aesthetic and minimalist design\" }, \"productType\" : \"Software\" }, { \"reference\" : { \"bibliography\" : \"bibliography\", \"type\" : \"Article\" }, \"baseQuestion\" : \"Is it designed minimal?\", \"id\" : 0, \"detailedQuestion\" : \"Is only (and all) information, essential to decision making, displayed on the screen?\", \"class\" : { \"name\" : \"Aesthetic and minimalist design\" }, \"productType\" : \"Software\" } ], \"id\" : 0, \"title\" : \"title\", \"evaluator\" : \"evaluator\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<QuestionnaireInput> <id>123456789</id> <Question> <id>123456789</id> <null> <name>aeiou</name> </null> <productType>aeiou</productType> <baseQuestion>Is it designed minimal?</baseQuestion> <detailedQuestion>Is only (and all) information, essential to decision making, displayed on the screen?</detailedQuestion> <null> <type>aeiou</type> <bibliography>aeiou</bibliography> </null> </Question> <evaluator>aeiou</evaluator> <creator>aeiou</creator> <title>aeiou</title> </QuestionnaireInput>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /questionnaires : Finds all questionnaires
     *
     * @param evaluator Evaluator values that can be considered for filter (optional)
     * @param creator Creator values that can be considered for filter (optional)
     * @return successful operation (status code 200)
     *         or Not found (status code 404)
     */
    @Operation(
        operationId = "findQuestionnaires",
        summary = "Finds all questionnaires",
        tags = { "questionnaires" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = QuestionnaireInput.class)))
            }),
            @ApiResponse(responseCode = "404", description = "Not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/questionnaires",
        produces = { "application/json" }
    )
    default ResponseEntity<List<QuestionnaireInput>> findQuestionnaires(
        @Parameter(name = "evaluator", description = "Evaluator values that can be considered for filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "evaluator", required = false) String evaluator,
        @Parameter(name = "creator", description = "Creator values that can be considered for filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "creator", required = false) String creator
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"creator\" : \"creator\", \"questions\" : [ { \"reference\" : { \"bibliography\" : \"bibliography\", \"type\" : \"Article\" }, \"baseQuestion\" : \"Is it designed minimal?\", \"id\" : 0, \"detailedQuestion\" : \"Is only (and all) information, essential to decision making, displayed on the screen?\", \"class\" : { \"name\" : \"Aesthetic and minimalist design\" }, \"productType\" : \"Software\" }, { \"reference\" : { \"bibliography\" : \"bibliography\", \"type\" : \"Article\" }, \"baseQuestion\" : \"Is it designed minimal?\", \"id\" : 0, \"detailedQuestion\" : \"Is only (and all) information, essential to decision making, displayed on the screen?\", \"class\" : { \"name\" : \"Aesthetic and minimalist design\" }, \"productType\" : \"Software\" } ], \"id\" : 0, \"title\" : \"title\", \"evaluator\" : \"evaluator\" }, { \"creator\" : \"creator\", \"questions\" : [ { \"reference\" : { \"bibliography\" : \"bibliography\", \"type\" : \"Article\" }, \"baseQuestion\" : \"Is it designed minimal?\", \"id\" : 0, \"detailedQuestion\" : \"Is only (and all) information, essential to decision making, displayed on the screen?\", \"class\" : { \"name\" : \"Aesthetic and minimalist design\" }, \"productType\" : \"Software\" }, { \"reference\" : { \"bibliography\" : \"bibliography\", \"type\" : \"Article\" }, \"baseQuestion\" : \"Is it designed minimal?\", \"id\" : 0, \"detailedQuestion\" : \"Is only (and all) information, essential to decision making, displayed on the screen?\", \"class\" : { \"name\" : \"Aesthetic and minimalist design\" }, \"productType\" : \"Software\" } ], \"id\" : 0, \"title\" : \"title\", \"evaluator\" : \"evaluator\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /questionnaires/{questionnaire_id} : Update an existing questionnaire
     *
     * @param questionnaireId Questionnaire id to update (required)
     * @param questionnaireOutput  (required)
     * @return Invalid ID supplied (status code 400)
     *         or Questionnaire not found (status code 404)
     *         or Validation exception (status code 405)
     */
    @Operation(
        operationId = "updateQuestionnaire",
        summary = "Update an existing questionnaire",
        tags = { "questionnaires" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Questionnaire not found"),
            @ApiResponse(responseCode = "405", description = "Validation exception")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/questionnaires/{questionnaire_id}",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> updateQuestionnaire(
        @Parameter(name = "questionnaire_id", description = "Questionnaire id to update", required = true, in = ParameterIn.PATH) @PathVariable("questionnaire_id") Long questionnaireId,
        @Parameter(name = "QuestionnaireOutput", description = "", required = true) @Valid @RequestBody QuestionnaireOutput questionnaireOutput
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
