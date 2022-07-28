package com.ironhack.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[]{5, 6, 1, 1};

        printArray(myArray);

        printFile("archivo.txt");

        convertToInt("abc");

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printFile(String path) {
        File file = new File(path);

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        } catch (FileNotFoundException exception) {
            System.out.println("File not found 404");
        } catch (NullPointerException exception) {
            System.out.println("No me vaciles");
        }
    }

    public static void convertToInt(String string) {

        try {
            Integer number = Integer.parseInt(string);
            System.out.println(number);
        } catch (NumberFormatException exception) {
            System.out.println("El valor de entrada no es un valor correcto");
        }
    }
}
