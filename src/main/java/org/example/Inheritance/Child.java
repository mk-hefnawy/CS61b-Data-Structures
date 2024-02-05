package org.example.Inheritance;

import org.example.Inheritance.animal.Animal;
import org.example.Inheritance.animal.Cat;

public class Child extends Parent{


    public void feed(Cat cat){
        System.out.println("Parent is feeding the cat");
    }
}
