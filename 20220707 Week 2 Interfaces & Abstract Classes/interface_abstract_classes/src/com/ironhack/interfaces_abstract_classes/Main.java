package com.ironhack.interfaces_abstract_classes;

import com.ironhack.interfaces_abstract_classes.animal.Animal;
import com.ironhack.interfaces_abstract_classes.cat.Cat;
import com.ironhack.interfaces_abstract_classes.dog.Dog;
import com.ironhack.interfaces_abstract_classes.pet.Pet;



public class Main {

    public static void main(String[] args) {
        Pet animal;
        animal = new Cat(7, "Robin");

        Dog dog = new Dog(1, "Yuki");

        animal.makeAnAdorableSound();
        System.out.println(dog.getName());

        //Animal myAnimal = new Animal(1); No se puede hacer xq es abstracto

        dog.eat();

        Cat cat = new Cat(7, "Lily");
        cat.eat();

    }
}
