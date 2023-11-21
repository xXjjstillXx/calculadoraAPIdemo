package com.example.calculadoraAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculadoraAPI.exceptions.CalculadoraException;
import com.example.calculadoraAPI.service.CalculadoraService;

@RestController
@RequestMapping(path = "/api/operacion")
public class CalculadoraController {

    @Autowired
    CalculadoraService calculadoraService;

    @PostMapping("/sumar")
    public ResponseEntity<?> sumar(@RequestParam int numA, @RequestParam int numB){
        return new ResponseEntity<>( this.calculadoraService.sumar(numA ,numB) , HttpStatus.OK);
    }

    @PostMapping("/restar")
    public ResponseEntity<?> restar(@RequestParam int numA, @RequestParam int numB){
        return new ResponseEntity<>( this.calculadoraService.restar(numA, numB),HttpStatus.OK);
    }

    @PostMapping("/multiplicar")
    public ResponseEntity<?> multiplicar(@RequestParam int numA, @RequestParam int numB){
        return new ResponseEntity<>( this.calculadoraService.multiplicar(numA, numB),HttpStatus.OK);
    }

    @PostMapping("/dividir")
    public ResponseEntity<?> dividir(@RequestParam int numA, @RequestParam int numB) throws CalculadoraException{
        return new ResponseEntity<>(this.calculadoraService.dividir(numA, numB),HttpStatus.OK);
    }
}
