package com.Exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ErrorDetails {

    private LocalDateTime timestamp;
    private String message;
    private String errorCode;
    private int httpStatus;
    private String path;


    public ErrorDetails(LocalDateTime timestamp, String message, String errorCode, int httpStatus, String path) {
        this.timestamp = timestamp;
        this.message = message;
        this.errorCode = errorCode;
        this.httpStatus = httpStatus;
        this.path = path;
    }
}
