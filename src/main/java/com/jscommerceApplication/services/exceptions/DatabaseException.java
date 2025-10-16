package com.jscommerceApplication.services.exceptions;

/**
 * @author José Augusto Scherer - jose.a.scherer@gmail.com
 * @file DatabaseExcpetion
 * @since 16/10/2025 - 13:33
 * --------------------
 * Data base error massages
 * --------------------
 */
public class DatabaseException extends RuntimeException {

    public DatabaseException(String message) {
        super(message);
    }
}
