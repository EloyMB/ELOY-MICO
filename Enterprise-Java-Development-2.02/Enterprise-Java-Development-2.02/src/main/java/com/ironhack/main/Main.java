package com.ironhack.main;

import com.ironhack.player.Player;

public class Main {
    public static void main(String[] args) {

        String[] keyWords = {"abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "extends", "false",
                "final", "finally", "float", "for", "goto", "if", "implements",
                "import", "instanceof", "int", "interface", "long", "native",
                "new", "null", "package", "private", "protected", "public",
                "return", "short", "static", "strictfp", "super", "switch",
                "synchronized", "this", "throw", "throws", "transient", "true",
                "try", "void", "volatile", "while"};


       // EJERCICIO DOS

        System.out.println(methodTwo("This bootcamp is very abstract", keyWords));

        Player playerA = new Player(100, 5, 3);

        System.out.println(decrementsLives(playerA));

        Player playerB = new Player(20, 5, 3);

        attack(playerA, playerB);

        System.out.println(playerB.getHealth());

    }

    // EJERCICIO DOS

    public static boolean methodTwo (String string, String[] keyWords) {
        for (int i = 0; i < keyWords.length; i++) {
            if (string.contains(keyWords[i])) {
                return true;
            }
        }
        return false;
    }

    public static int decrementsLives(Player playerA) {
        playerA.setLives(playerA.getLives()-1);
        return playerA.getLives();
    }

    public static void attack (Player attacker, Player defender) {
        defender.setHealth(defender.getHealth()- attacker.getStrength());
    }
}
