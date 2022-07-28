package com.ironhack.interfaces_abstract_classes.cat;

import com.ironhack.interfaces_abstract_classes.animal.Animal;
import com.ironhack.interfaces_abstract_classes.pet.Pet;
public class Cat extends Animal implements Pet {
    private String name;

    public Cat(Integer numberOfLives, String name){
        super(numberOfLives);
        setName(name);
    }


    @Override
    public void makeAnAdorableSound(){
        System.out.println("Miau!!");
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating");
    }




    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
