package com.ironhack.utils;

public class StringLibrary {

    public String concatenateName(String name, String surname){
        String nameAndSurname = "";
        if (name == null && surname == null){
            nameAndSurname = "";
        } else if (name == null || name.isEmpty()) {
            nameAndSurname = surname;
        } else if (surname == null || surname.isEmpty()) {
            nameAndSurname = name;
        } else {
            nameAndSurname = name.concat(" ").concat(surname);
        }
        return nameAndSurname;
    }


}
