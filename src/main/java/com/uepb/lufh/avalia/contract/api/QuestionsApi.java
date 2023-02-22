/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.uepb.lufh.avalia.contract.api;

import com.uepb.lufh.avalia.contract.model.Question;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-02-22T00:56:03.914173-03:00[America/Fortaleza]")
@Validated
@Api(value = "questions", description = "the questions API")
public interface QuestionsApi {

    default QuestionsApiDelegate getDelegate() {
        return new QuestionsApiDelegate() {};
    }

    /**
     * POST /questions : Add a new question
     *
     * @param question Question object that needs to be added to the form (required)
     * @return Internal server error (status code 500)
     */

    @ApiOperation(value = "Add a new question", nickname = "createQuestion", notes = "", tags={ "questions", })
    @ApiResponses(value = { 

        @ApiResponse(code = 500, message = "Internal server error") })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/questions",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> createQuestion(

@ApiParam(value = "Question object that needs to be added to the form", required = true )   @Valid @RequestBody Question question) {
        return getDelegate().createQuestion(question);
    }


    /**
     * DELETE /questions/{question_id} : Deletes a question
     *
     * @param questionId Question id to delete (required)
     * @return Invalid ID supplied (status code 400)
     *         or Question not found (status code 404)
     */

    @ApiOperation(value = "Deletes a question", nickname = "deleteQuestion", notes = "", tags={ "questions", })
    @ApiResponses(value = { 

        @ApiResponse(code = 400, message = "Invalid ID supplied"),

        @ApiResponse(code = 404, message = "Question not found") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/questions/{question_id}"
    )
    default ResponseEntity<Void> deleteQuestion(@ApiParam(value = "Question id to delete", required = true) @PathVariable("question_id") Long questionId

) {
        return getDelegate().deleteQuestion(questionId);
    }


    /**
     * GET /questions/{question_id} : Find question by ID
     *
     * @param questionId ID of question to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Question not found (status code 404)
     */

    @ApiOperation(value = "Find question by ID", nickname = "findQuestion", notes = "", response = Question.class, tags={ "questions", })
    @ApiResponses(value = { 

        @ApiResponse(code = 200, message = "successful operation", response = Question.class),

        @ApiResponse(code = 400, message = "Invalid ID supplied"),

        @ApiResponse(code = 404, message = "Question not found") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/questions/{question_id}",
        produces = { "application/json", "application/xml" }
    )
    default ResponseEntity<Question> findQuestion(@ApiParam(value = "ID of question to return", required = true) @PathVariable("question_id") Long questionId

) {
        return getDelegate().findQuestion(questionId);
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

    @ApiOperation(value = "Finds all questions", nickname = "findQuestions", notes = "", response = Question.class, responseContainer = "List", tags={ "questions", })
    @ApiResponses(value = { 

        @ApiResponse(code = 200, message = "successful operation", response = Question.class, responseContainer = "List"),

        @ApiResponse(code = 404, message = "Not found") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/questions",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Question>> findQuestions(@ApiParam(value = "Class values that can be considered for filter", allowableValues = "Aesthetic and minimalist design, Consistency and standards, Error prevention, Flexibility and efficiency of use, Help and documentation, Help users recognize and recover from errors, Match between system and the real world, Recognition rather than recall, User control and freedom, Visibility of system status, Privacy & Security") @Valid @RequestParam(value = "class", required = false) String propertyClass

,@ApiParam(value = "Reference values that can be considered for filter", allowableValues = "Article, Book, eDocument, Standard") @Valid @RequestParam(value = "reference", required = false) String reference

,@ApiParam(value = "Product type values that can be considered for filter", allowableValues = "Software, Hardware, Hardware/Software") @Valid @RequestParam(value = "product_type", required = false) String productType

) {
        return getDelegate().findQuestions(propertyClass, reference, productType);
    }


    /**
     * PUT /questions/{question_id} : Update an existing question
     *
     * @param questionId Question id to update (required)
     * @param question Question object that needs to be added to the form (required)
     * @return Invalid ID supplied (status code 400)
     *         or Question not found (status code 404)
     *         or Validation exception (status code 405)
     */

    @ApiOperation(value = "Update an existing question", nickname = "updateQuestion", notes = "", tags={ "questions", })
    @ApiResponses(value = { 

        @ApiResponse(code = 400, message = "Invalid ID supplied"),

        @ApiResponse(code = 404, message = "Question not found"),

        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/questions/{question_id}",
        consumes = { "application/json", "application/xml" }
    )
    default ResponseEntity<Void> updateQuestion(@ApiParam(value = "Question id to update", required = true) @PathVariable("question_id") Long questionId

,

@ApiParam(value = "Question object that needs to be added to the form", required = true )   @Valid @RequestBody Question question) {
        return getDelegate().updateQuestion(questionId, question);
    }

}
