package com.example.calculadoraAPI.validators;
import com.example.calculadoraAPI.exceptions.CalculadoraException;

public class CalculadoraValidator {


    public void validarDivisor(int b) throws CalculadoraException{
        if(b == 0){
            throw new CalculadoraException("El valor del divisor no puede ser cero");
        }

        if(b < 0){
            throw new CalculadoraException("El valor del divisor no puede ser menor a cero"); //matematicamente si se puede, esto es solo de ejemplo
        }

    }
}
