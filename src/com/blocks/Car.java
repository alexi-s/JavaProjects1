package com.blocks;

import java.lang.ref.SoftReference;

/**
 * Created by student on 11.04.2018.
 */
public class Car {

    private static int counter = 0;

    static
    {
        System.out.println("Static block");
    }

    {
        counter++;
        System.out.println("Non-static block");
    }

    public Car(){
        System.out.println("Constructor init, counter = " + counter);
    }

}
