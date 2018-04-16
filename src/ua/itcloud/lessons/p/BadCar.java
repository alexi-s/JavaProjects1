package ua.itcloud.lessons.p;

/**
 * Created by student on 16.04.2018.
 */
public class BadCar extends Car {

    private int speed;

    public BadCar(String name, int speed) {
        super(name);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "BadCar{" +
                "speed=" + speed +
                '}';
    }
}
