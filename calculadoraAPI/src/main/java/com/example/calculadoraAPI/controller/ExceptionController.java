package com.example.calculadoraAPI.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.calculadoraAPI.exceptions.CalculadoraException;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(CalculadoraException.class)
    public ResponseEntity<String>handleCalculadoraException(CalculadoraException e) {
        return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
    }

}
