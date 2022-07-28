package com.ironhack;

import java.util.Arrays;

public class ExerciceOne {
    public static void main(String[] args) {
        
       /* String[] keyWords = {"abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "extends", "false",
                "final", "finally", "float", "for", "goto", "if", "implements",
                "import", "instanceof", "int", "interface", "long", "native",
                "new", "null", "package", "private", "protected", "public",
                "return", "short", "static", "strictfp", "super", "switch",
                "synchronized", "this", "throw", "throws", "transient", "true",
                "try", "void", "volatile", "while"};

        System.out.println(methodTwo("Hello world"),keyWords);
    } */

        int[] prueba = methodOne(3);

        System.out.println(Arrays.toString(prueba));

    }

    public static int[] methodOne(int n) {

        int[] odds = new int[(n + 1) / 2];
        int start = 1;

            for (int i = 0; i < odds.length; i++) {
                odds[i] = start;
                start += 2;
            }
            return odds;
        }

}
