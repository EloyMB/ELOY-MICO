package com.ironhack.interfaces_abstract_classes.animal;

public abstract class Animal {
    private Integer numberOfLives;

    public Animal(Integer numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

    public void eat() {
        System.out.println("The animal is eating");
    }


}
