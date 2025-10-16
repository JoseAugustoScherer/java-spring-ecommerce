package com.jscommerceApplication.controllers.handlers;

import com.jscommerceApplication.dto.CustomError;
import com.jscommerceApplication.services.exceptions.DatabaseException;
import com.jscommerceApplication.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

/**
 * @author José Augusto Scherer - jose.a.scherer@gmail.com
 * @file ControllerExceptionHandler
 * @since 16/10/2025 - 12:31
 * --------------------
 * [ BRIEF DESCRIPTION OF THE CLASS PURPOSE GOES HERE ]
 * --------------------
 */

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler (ResourceNotFoundException.class)
    public ResponseEntity<CustomError> exceptionHandler(ResourceNotFoundException e, HttpServletRequest request) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        CustomError err = new CustomError( Instant.now(), status.value(), e.getMessage(), request.getRequestURI() );
        return ResponseEntity.status(status).body(err);
    }

    @ExceptionHandler (DatabaseException.class)
    public ResponseEntity<CustomError> databaseException(DatabaseException e, HttpServletRequest request) {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        CustomError err = new CustomError( Instant.now(), status.value(), e.getMessage(), request.getRequestURI() );
        return ResponseEntity.status(status).body(err);
    }
}
