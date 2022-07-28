package com.ironhack.practice.classes;

public class StringerHelper {

    public static String reverse (String string) {
        StringBuilder sb = new StringBuilder(string);
        sb.reverse();
        return sb.toString();
    }

    public static String encoder(String string) throws RuntimeException, NullPointerException {

        if (string == null) throw new NullPointerException("Null");

        if (string == "") throw new RuntimeException("Write something please");

        if (string.contains("a") == false && string.contains("e") == false && string.contains("i") == false && string.contains("o") == false && string.contains("u") == false) {
            throw new  RuntimeException("There's no vowel in this sentence");
        }
        else {
            for (int i = 0; i < string.length(); i++) {
                string = string.replace("a", "4");
                string = string.replace("e", "3");
                string = string.replace("i", "1");
                string = string.replace("o", "0");
                string = string.replace("u", "2");
            }
        }
        return string;
    }
}
