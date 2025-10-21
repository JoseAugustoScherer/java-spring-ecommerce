package com.jscommerceApplication.dto;

/**
 * @author José Augusto Scherer - jose.a.scherer@gmail.com
 * @file FieldMessage
 * @since 21/10/2025 - 11:37
 * --------------------
 * Custom error message for entity fields
 * --------------------
 */
public class FieldMessage {

    private final String fieldName;
    private final String message;

    public FieldMessage(String fieldName, String message) {
        this.fieldName = fieldName;
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getMessage() {
        return message;
    }
}
