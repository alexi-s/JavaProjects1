package ua.itcloud.lessons.oop;

import ua.itcloud.lessons.oop.Car;

/**
 * Created by student on 11.04.2018.
 */

public class BadCar extends Car {

    public BadCar() {
        super();
    }

    @Override
    public void show() {
        System.out.println("I'm very bad car");
    }


}
