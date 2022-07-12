package com.meli.obterdiploma.handler;

import com.meli.obterdiploma.exception.ExceptionDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ExHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionDetails> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException
                                                                                               exception) {
        ExceptionDetails exceptionDetails = new ExceptionDetails(
                "Method Argument Not Valid",
                HttpStatus.BAD_REQUEST.value(),
                exception.getMessage(),
                LocalDateTime.now()
        );

        return new ResponseEntity<ExceptionDetails>(exceptionDetails, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ExceptionDetails> HttpMessageNotReadableExceptionHandler(HttpMessageNotReadableException
                                                                                               exception) {
        ExceptionDetails exceptionDetails = new ExceptionDetails(
                "Message Not Readable",
                HttpStatus.BAD_REQUEST.value(),
                exception.getMessage(),
                LocalDateTime.now()
        );

        return new ResponseEntity<ExceptionDetails>(exceptionDetails, HttpStatus.BAD_REQUEST);
    }
}
