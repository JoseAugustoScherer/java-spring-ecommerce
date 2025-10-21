package com.jscommerceApplication.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 * @author José Augusto Scherer - jose.a.scherer@gmail.com
 * @file ValidationError
 * @since 21/10/2025 - 11:38
 * --------------------
 * Contains a list of entity fields and their respective error messages
 * --------------------
 */
public class ValidationError extends CustomError {

    private final List<FieldMessage> errors = new ArrayList<>();

    public ValidationError(Instant instant, Integer status, String error, String path) {
        super(instant, status, error, path);
    }

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String fieldName,  String message) {
        errors.add(new FieldMessage(fieldName, message));
    }
}
