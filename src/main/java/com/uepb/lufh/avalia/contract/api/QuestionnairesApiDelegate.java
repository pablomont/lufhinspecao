package com.uepb.lufh.avalia.contract.api;

import com.uepb.lufh.avalia.contract.model.Questionnaire;
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
 * A delegate to be called by the {@link QuestionnairesApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-22T00:56:03.914173-03:00[America/Fortaleza]")
public interface QuestionnairesApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /questionnaires : Add a new questionnaire
     *
     * @param questionnaire  (optional)
     * @return Internal server error (status code 500)
     * @see QuestionnairesApi#createQuestionaire
     */
    default ResponseEntity<Void> createQuestionaire(Questionnaire questionnaire) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /questionnaires/{questionnaire_id} : Deletes a questionnaire
     *
     * @param questionnaireId Questionnaire id to delete (required)
     * @return Invalid ID supplied (status code 400)
     *         or Questionnaire not found (status code 404)
     * @see QuestionnairesApi#deleteQuestionnaire
     */
    default ResponseEntity<Void> deleteQuestionnaire(Long questionnaireId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /questionnaires/{questionnaire_id} : Find questionnaire by ID
     *
     * @param questionnaireId ID of questionnaire to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Questionnaire not found (status code 404)
     * @see QuestionnairesApi#findQuestionnaire
     */
    default ResponseEntity<Questionnaire> findQuestionnaire(Long questionnaireId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"creator\" : \"creator\", \"questions\" : [ { \"reference\" : { \"bibliography\" : \"bibliography\", \"type\" : \"Article\" }, \"baseQuestion\" : \"Is it designed minimal?\", \"answer\" : { \"severity\" : \"0 Not a usability problem at all\", \"weight\" : \"0 Necessary for every System\", \"possibleAnswers\" : [ \"possibleAnswers\", \"possibleAnswers\" ], \"choosenAnswer\" : \"choosenAnswer\" }, \"id\" : 0, \"detailedQuestion\" : \"Is only (and all) information, essential to decision making, displayed on the screen?\", \"class\" : { \"name\" : \"Aesthetic and minimalist design\" }, \"productType\" : \"Software\" }, { \"reference\" : { \"bibliography\" : \"bibliography\", \"type\" : \"Article\" }, \"baseQuestion\" : \"Is it designed minimal?\", \"answer\" : { \"severity\" : \"0 Not a usability problem at all\", \"weight\" : \"0 Necessary for every System\", \"possibleAnswers\" : [ \"possibleAnswers\", \"possibleAnswers\" ], \"choosenAnswer\" : \"choosenAnswer\" }, \"id\" : 0, \"detailedQuestion\" : \"Is only (and all) information, essential to decision making, displayed on the screen?\", \"class\" : { \"name\" : \"Aesthetic and minimalist design\" }, \"productType\" : \"Software\" } ], \"id\" : 0, \"evaluator\" : \"evaluator\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Questionnaire> <id>123456789</id> <evaluator>aeiou</evaluator> <creator>aeiou</creator> </Questionnaire>";
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
     * @see QuestionnairesApi#findQuestionnaires
     */
    default ResponseEntity<List<Questionnaire>> findQuestionnaires(String evaluator,
        String creator) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"creator\" : \"creator\", \"questions\" : [ { \"reference\" : { \"bibliography\" : \"bibliography\", \"type\" : \"Article\" }, \"baseQuestion\" : \"Is it designed minimal?\", \"answer\" : { \"severity\" : \"0 Not a usability problem at all\", \"weight\" : \"0 Necessary for every System\", \"possibleAnswers\" : [ \"possibleAnswers\", \"possibleAnswers\" ], \"choosenAnswer\" : \"choosenAnswer\" }, \"id\" : 0, \"detailedQuestion\" : \"Is only (and all) information, essential to decision making, displayed on the screen?\", \"class\" : { \"name\" : \"Aesthetic and minimalist design\" }, \"productType\" : \"Software\" }, { \"reference\" : { \"bibliography\" : \"bibliography\", \"type\" : \"Article\" }, \"baseQuestion\" : \"Is it designed minimal?\", \"answer\" : { \"severity\" : \"0 Not a usability problem at all\", \"weight\" : \"0 Necessary for every System\", \"possibleAnswers\" : [ \"possibleAnswers\", \"possibleAnswers\" ], \"choosenAnswer\" : \"choosenAnswer\" }, \"id\" : 0, \"detailedQuestion\" : \"Is only (and all) information, essential to decision making, displayed on the screen?\", \"class\" : { \"name\" : \"Aesthetic and minimalist design\" }, \"productType\" : \"Software\" } ], \"id\" : 0, \"evaluator\" : \"evaluator\" }";
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
     * @param questionnaire  (required)
     * @return Invalid ID supplied (status code 400)
     *         or Questionnaire not found (status code 404)
     *         or Validation exception (status code 405)
     * @see QuestionnairesApi#updateQuestionnaire
     */
    default ResponseEntity<Void> updateQuestionnaire(Long questionnaireId,
        Questionnaire questionnaire) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
