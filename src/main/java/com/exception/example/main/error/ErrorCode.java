package com.exception.example.main.error;

import lombok.Getter;

@Getter
public enum ErrorCode {

    AUTHENTICATION_FAILED(401, "AUTH_001", " AUTHENTICATION_FAILED."),
    Login_FAILED(401, "AUTH_002", " Login_FAILED.");

    private final String code;
    private final String message;
    private int status;

    ErrorCode(final int status, final String code, final String message) {
        this.status = status;
        this.message = message;
        this.code = code;
    }
}