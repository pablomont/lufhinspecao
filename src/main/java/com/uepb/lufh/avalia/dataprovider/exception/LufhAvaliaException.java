package com.uepb.lufh.avalia.dataprovider.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
@Getter
public class LufhAvaliaException extends RuntimeException{

    private final String message;

    private final HttpStatus httpStatus;

}
