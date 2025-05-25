package com.dto;

import com.Exception.ErrorDetails;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class CustomException extends RuntimeException{

    private final String errorCode;
    private final int httpStatus;

    public CustomException(String message, String errorCode, int httpStatus) {
        super(message);
        this.errorCode = errorCode;
        this.httpStatus = httpStatus;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

}
