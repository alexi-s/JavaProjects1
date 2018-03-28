package com.oop;

/**
 * Created by student on 28.03.2018.
 */
public class Main_ {

    public static void main(String[] args) {

        Car lada = new Car();
        lada.setMaxSpeed(99);
        lada.setModel("Lada");
        lada.sayHello();

        Car audi = new Car();
        lada.setMaxSpeed(-999);
        lada.setModel("Lada");
        lada.sayHello();

        Car bmw = new Car(200, "BMW");
        bmw.sayHello();

        Car jiguli = new Car(78, "Jiguli", "Red");
        jiguli.sayHello();

        System.out.println(jiguli.toString());
    }
}
