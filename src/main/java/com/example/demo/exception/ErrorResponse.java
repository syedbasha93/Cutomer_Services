package com.example.demo.exception;

import lombok.Data;

import java.util.List;

@Data
public class ErrorResponse {
    private int statusCode;
    private String message;
    private List<String> details;
}
