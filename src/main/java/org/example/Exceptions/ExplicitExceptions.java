package org.example.Exceptions;

public class ExplicitExceptions {

    public void someFunction(int x){
        if (x == 0) throw new IllegalArgumentException("x cannot be 0");

        System.out.println(x);

    }
}

