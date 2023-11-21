package com.example.calculadoraAPI.service;

import org.springframework.stereotype.Service;
import com.example.calculadoraAPI.exceptions.CalculadoraException;
import com.example.calculadoraAPI.validators.CalculadoraValidator;

@Service
public class CalculadoraService {

    CalculadoraValidator validation = new CalculadoraValidator();

    public int sumar( int numA, int numB){
        return numA+numB;
    } 

    public int restar(int numA, int numB){
        return numA-numB;
    }

    public int multiplicar(int numA, int numB) {
        return numA*numB;
    } 

    public int dividir(int numA, int numB) throws CalculadoraException{
        validation.validarDivisor(numB);
        return numA/numB;
    }
}
