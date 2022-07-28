package com.ironhack.utils;

import static org.junit.jupiter.api.Assertions.*;

import com.ironhack.exceptions.DivideByZeroException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathLibraryTest {

    MathLibrary mathLibrary;

    @BeforeEach
    void setUp() {
        mathLibrary = new MathLibrary();
    }

    @Test
    void divide_DivisorIsZero_ThrowsDivideByZeroException() {
        assertThrows(DivideByZeroException.class, () -> { mathLibrary.divide(1, 0); });
    }
}