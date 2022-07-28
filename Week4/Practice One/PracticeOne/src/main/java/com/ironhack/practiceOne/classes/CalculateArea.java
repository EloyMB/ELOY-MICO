package com.ironhack.practiceOne.classes;

import com.ironhack.practiceOne.enums.ShapeType;

import java.io.IOException;

public class CalculateArea {


    public static double calculateArea(ShapeType shapeType, double... shapeInput ) throws RuntimeException {
        double area = 0;
        if(shapeInput.length == 0){
            throw new RuntimeException("Nothing to calculate");
        }
        if(shapeType == shapeType.RECTANGLE){
            area = shapeInput[0] * shapeInput[1];
        }
        if(shapeType == shapeType.SQUARE){
            area = Math.pow(shapeInput[0],2 );
        }
        if(shapeType == shapeType.CIRCLE){
            area = Math.pow(shapeInput[0],2) * (Math.PI);
        }
        return area;
    }
}
