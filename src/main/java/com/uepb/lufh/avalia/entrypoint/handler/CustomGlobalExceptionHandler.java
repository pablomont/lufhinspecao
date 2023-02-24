package com.uepb.lufh.avalia.entrypoint.handler;

import com.uepb.lufh.avalia.dataprovider.exception.LufhAvaliaException;
import com.uepb.lufh.avalia.entrypoint.contract.model.Error;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(LufhAvaliaException.class)
    public ResponseEntity<Error> handleLufhAvaliaException(LufhAvaliaException ex) {

        var error = new Error();
        error.setMessage(ex.getMessage());
        return ResponseEntity.status(ex.getHttpStatus()).body(error);

    }

}
