package com.jms.service.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ErrorResponseDto {

    private long errorCode;

    private String message;

    private List<String> errors;

    public ErrorResponseDto() {

    }

    public ErrorResponseDto(long code, String details) {
        this.errorCode= code;
        this.message = details;
    }
}
