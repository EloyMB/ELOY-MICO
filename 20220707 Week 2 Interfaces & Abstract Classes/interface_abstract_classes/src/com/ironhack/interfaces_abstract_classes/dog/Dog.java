package com.ironhack.interfaces_abstract_classes.dog;

import com.ironhack.interfaces_abstract_classes.animal.Animal;
import com.ironhack.interfaces_abstract_classes.pet.Pet;

public class Dog extends Animal implements Pet {
    private String name;

    public Dog(Integer numberOfLives, String name){
        super(numberOfLives);
        setName(name);
    }

    public void eat(){
        super.eat();
        System.out.println("The dog is full");
    }

    @Override
    public void makeAnAdorableSound(){
        System.out.println("Guau!!");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


}
