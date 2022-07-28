package com.ironhack.utils;


import org.junit.jupiter.api.*;
import org.junit.platform.commons.annotation.Testable;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MathLibraryTest {

    MathLibrary mathLibrary = new MathLibrary();

    @AfterEach
    void setUp() {

        System.out.println("Test passed");
    }



    @Test
    @Order(2)
    @DisplayName("Test number 1, result must be zero")
    public void add_ZeroPlusZero_ReturnZero(){
       int result = mathLibrary.add(0,0);
       assertEquals(0, result);
    }

    @Test
    @Order(1)
    public void add_TwoPositiveNumbers_ReturnSum(){
       int result = mathLibrary.add(1,2);
       assertEquals(3, result);
    }

    @Test
    public void buildArray_PositiveNumber_ArrayWithThisNumberLength() {
        assertArrayEquals(new int[]{0, 0, 0}, mathLibrary.buildArray(3));
    }

    @Test
    public void buildArray_Zero_EmptyArray() {
        assertArrayEquals(new int[]{}, mathLibrary.buildArray(0));
    }

    @Test
    public void buildArray_NegativeNumber_EmptyArray() {
           assertArrayEquals(new int[]{}, mathLibrary.buildArray(-3));
    }

    // TESTS CLASE 16/07/2022

    /* public void product_TwoPositiveNumbers_ReturnProduct() {
        assertEquals(20, mathLibrary.product(4,5));
    }
        */

    @DisplayName("Tests for arraySum")
    @Test
    public void arraySum_SumOfZeros_Zero() {
        assertEquals(0, mathLibrary.arraySum(new int[]{0, 0, 0}));
    }

    @Test
    public void arraySum_SumOfNegative_NegativeResult() {
        assertEquals(-6, mathLibrary.arraySum(new int[]{-1, -2, -3}));
    }

    @Test
    public void arraySum_PositiveAndNegativeSum_CorrectResult() {
        assertEquals(-5, mathLibrary.arraySum(new int[]{-1, 5, -9}));
    }



}