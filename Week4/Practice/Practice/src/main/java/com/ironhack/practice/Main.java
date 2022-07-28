package com.ironhack.practice;

import com.ironhack.practice.classes.StringerHelper;

public class Main {

    public static void main(String[] args) {

        String string = "Hola mundo, como va?";

        System.out.println(StringerHelper.reverse(string));
        System.out.println(StringerHelper.encoder(string));
    }
}
