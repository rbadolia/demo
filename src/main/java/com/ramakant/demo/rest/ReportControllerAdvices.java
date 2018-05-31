package com.ramakant.demo.rest;

import com.ramakant.demo.exception.MonthNotFoundException;
import com.ramakant.demo.exception.SiteNotFoundException;
import com.ramakant.demo.rest.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ReportControllerAdvices {
    @ExceptionHandler(MonthNotFoundException.class)
    public ResponseEntity onDateTimeError(MonthNotFoundException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponse(e.getMessage(), HttpStatus.BAD_REQUEST.toString()));
    }

    @ExceptionHandler(SiteNotFoundException.class)
    public ResponseEntity onDateTimeError(SiteNotFoundException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorResponse(e.getMessage(), HttpStatus.BAD_REQUEST.toString()));
    }
}
