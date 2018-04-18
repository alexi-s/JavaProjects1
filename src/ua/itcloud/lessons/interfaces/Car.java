package ua.itcloud.lessons.interfaces;

/**
 * Created by student on 18.04.2018.
 */
public class Car implements Common {

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void sell() {
        System.out.println("Car has been sold");
    }
}
