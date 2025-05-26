package com.Exception;


import com.dto.CustomException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorDetails> handleCustomException(CustomException e, HttpServletRequest request) {
        ErrorDetails errorDetails = new ErrorDetails(
                LocalDateTime.now(),
                e.getMessage(),
                e.getErrorCode(),
                e.getHttpStatus(),
                request.getRequestURI()
        );
        return ResponseEntity.status(e.getHttpStatus()).body(errorDetails);
    }

}
