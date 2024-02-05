package org.example.Inheritance.animal;

public interface Animal {

    default void makeSound(){
        System.out.println("Sound");
    }
}
