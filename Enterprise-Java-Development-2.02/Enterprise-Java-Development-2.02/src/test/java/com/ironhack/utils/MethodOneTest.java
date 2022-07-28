package com.ironhack.utils;

import com.ironhack.ExerciceOne;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class MethodOneTest {



    ExerciceOne exerciceOne = new ExerciceOne();

    @Test
    public void methodOne_ZeroInput_ReturnEmptyArray() {
        assertArrayEquals(new int[]{},exerciceOne.methodOne(0));
    }

    @Test
    void methodOne_ThreeInput_ReturnArrayOfOneAndThree() {
        assertArrayEquals(new int[]{1,3}, exerciceOne.methodOne(3));
    }

    @Test
    void methodOne_NegativeNumber_ReturnAbsoluteValue() {
        assertArrayEquals(new int[]{1,3}, exerciceOne.methodOne(-3));
    }


}
