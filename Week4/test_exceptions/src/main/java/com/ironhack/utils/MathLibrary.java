package com.ironhack.utils;

import com.ironhack.exceptions.DivideByZeroException;

public class MathLibrary {

    public double divide(int numerator, int divisor) throws DivideByZeroException {
        if (divisor == 0) {
            throw new DivideByZeroException("No se puede dividir entre cero");
        }
        return numerator / divisor;
    }
}
