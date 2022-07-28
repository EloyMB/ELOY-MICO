package com.ironhack.practice.classes;

import com.ironhack.practice.enums.ShapeType.ShapeType;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CalculateAreaTest {

    CalculateArea calculateArea = new CalculateArea();

    @Test
    void calculateArea_InputSquare_OutputCorrect() {
        double area = CalculateArea.calculateArea(ShapeType.SQUARE, 2);
        assertEquals(4, area);
    }

    @Test
    void calculateArea_InputCircle_OutputCorrect() {
        double area = CalculateArea.calculateArea(ShapeType.CIRCLE, 1);
        assertEquals(Math.PI, area);
    }

    @Test
    void calculateArea_InputRectangle_OutputCorrect() {
        double area = CalculateArea.calculateArea(ShapeType.RECTANGLE, 2, 3);
        assertEquals(6, area);
    }

    @Test
    void calculateArea_NoInput_OutputCorrect() {
        double area = CalculateArea.calculateArea(ShapeType.RECTANGLE, 2, 3);
        assertEquals(6, area);
    }

}