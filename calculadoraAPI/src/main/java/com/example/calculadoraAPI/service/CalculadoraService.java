package com.example.calculadoraAPI.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    public int sumar( int numA, int numB){
        return numA+numB;
    } 

    public int restar(int numA, int numB){
        return numA-numB;
    }

    public int multiplicar(int numA, int numB) {
        return numA*numB;
    } 

    public int dividir(int numA, int numB){
        return numA/numB;
    }
}
