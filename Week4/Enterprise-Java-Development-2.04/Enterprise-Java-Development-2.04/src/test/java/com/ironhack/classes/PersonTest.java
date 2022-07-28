package com.ironhack.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person = new Person (2, "Eloy", -1, "Ingeniero");

    @Test
    void setAge_LowerThanZero_ThrowException() {
        assertThrows(ArithmeticException.class, () -> {person.setAge(-1);});
    }
}