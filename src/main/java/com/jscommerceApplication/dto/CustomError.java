package com.jscommerceApplication.dto;

import java.time.Instant;

/**
 * @author José Augusto Scherer - jose.a.scherer@gmail.com
 * @file CustomError
 * @since 16/10/2025 - 12:09
 * --------------------
 * Custom error messages
 * --------------------
 */
public class CustomError {

    private Instant instant;
    private Integer status;
    private String error;
    private String path;

    public CustomError(Instant instant, Integer status, String error, String path) {
        this.instant = instant;
        this.status = status;
        this.error = error;
        this.path = path;
    }

    public Instant getInstant() {
        return instant;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
