package com.exception.example.main.error;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(ErrorCode errorCode) {
        super(errorCode.getMessage());
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}