package com.ironhack.classes.person;

public class Person {
    private String name;   // estas variables son las importantes. FINAL se usa para indicar una variable para una constante
    private String dni;   // public: puede ser accedido desde fuera. private: no puede ser accedido desde fuera
    private Integer age; //int es clase primitva, Integer es el equivalente pero es un objeto(se puede "combinar" con métodos)
    // los atributos de una clase se crean en privado y se crean getters y setters
    public Person(String name, String dni, Integer age){ //constructor siempre publico
        setName(name);
        setDni(dni);
        setAge(age);
    }
    public static void printMessage(){
        System.out.println("This is a message inside an static method.");
    }
    //GETTERS
    public String getName(){
        return this.name;
    }
    //SETTERS void, no devuelve
    public void setName(String name){
        this.name = name;
    }
    // alt + insertar
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        if (age < 0 || age >130){
            System.out.println("Age no bueno");
        } else {
            this.age = age;
        }
    }

}
