package com.ironhack.utils;

import java.util.ArrayList;

public class MathLibrary {
   public int add(int num1, int num2) {
        return num1 + num2;
    }

     /*public int product(int num1, int num2){
        return num1 * num2;
    } */

    public int[] buildArray(int size){

        if (size < 0) {
            size = 0;
        }
        return new int[size];
    }
    int result;
    public int arraySum(int[] array){
        result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

}