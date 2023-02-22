package com.uepb.lufh.avalia.contract.api;

import com.uepb.lufh.avalia.contract.model.Question;
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
 * A delegate to be called by the {@link QuestionsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-22T00:56:03.914173-03:00[America/Fortaleza]")
public interface QuestionsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /questions : Add a new question
     *
     * @param question Question object that needs to be added to the form (required)
     * @return Internal server error (status code 500)
     * @see QuestionsApi#createQuestion
     */
    default ResponseEntity<Void> createQuestion(Question question) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /questions/{question_id} : Deletes a question
     *
     * @param questionId Question id to delete (required)
     * @return Invalid ID supplied (status code 400)
     *         or Question not found (status code 404)
     * @see QuestionsApi#deleteQuestion
     */
    default ResponseEntity<Void> deleteQuestion(Long questionId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /questions/{question_id} : Find question by ID
     *
     * @param questionId ID of question to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Question not found (status code 404)
     * @see QuestionsApi#findQuestion
     */
    default ResponseEntity<Question> findQuestion(Long questionId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"reference\" : { \"bibliography\" : \"bibliography\", \"type\" : \"Article\" }, \"baseQuestion\" : \"Is it designed minimal?\", \"answer\" : { \"severity\" : \"0 Not a usability problem at all\", \"weight\" : \"0 Necessary for every System\", \"possibleAnswers\" : [ \"possibleAnswers\", \"possibleAnswers\" ], \"choosenAnswer\" : \"choosenAnswer\" }, \"id\" : 0, \"detailedQuestion\" : \"Is only (and all) information, essential to decision making, displayed on the screen?\", \"class\" : { \"name\" : \"Aesthetic and minimalist design\" }, \"productType\" : \"Software\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Question> <id>123456789</id> <productType>aeiou</productType> <baseQuestion>Is it designed minimal?</baseQuestion> <detailedQuestion>Is only (and all) information, essential to decision making, displayed on the screen?</detailedQuestion> </Question>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
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
     * @see QuestionsApi#findQuestions
     */
    default ResponseEntity<List<Question>> findQuestions(String propertyClass,
        String reference,
        String productType) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"reference\" : { \"bibliography\" : \"bibliography\", \"type\" : \"Article\" }, \"baseQuestion\" : \"Is it designed minimal?\", \"answer\" : { \"severity\" : \"0 Not a usability problem at all\", \"weight\" : \"0 Necessary for every System\", \"possibleAnswers\" : [ \"possibleAnswers\", \"possibleAnswers\" ], \"choosenAnswer\" : \"choosenAnswer\" }, \"id\" : 0, \"detailedQuestion\" : \"Is only (and all) information, essential to decision making, displayed on the screen?\", \"class\" : { \"name\" : \"Aesthetic and minimalist design\" }, \"productType\" : \"Software\" }";
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
     * @param question Question object that needs to be added to the form (required)
     * @return Invalid ID supplied (status code 400)
     *         or Question not found (status code 404)
     *         or Validation exception (status code 405)
     * @see QuestionsApi#updateQuestion
     */
    default ResponseEntity<Void> updateQuestion(Long questionId,
        Question question) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
