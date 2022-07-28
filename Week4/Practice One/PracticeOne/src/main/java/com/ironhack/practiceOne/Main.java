package com.ironhack.practiceOne;

import com.ironhack.practiceOne.classes.StringerHelper;

public class Main {

    public static void main(String[] args) {

        String string = "Hola mundo, como va?";

        System.out.println(StringerHelper.reverse(string));
        System.out.println(StringerHelper.encoder(string));
    }
}
