package ua.itcloud;

import ua.itcloud.lessons.oop.Car;
import ua.itcloud.lessons.oop.SportCar;

/**
 * Created by student on 11.04.2018.
 */
public class MainCloud {

    public static void main(String[] args) {
        SportCar sc = new SportCar();

        sc.setMaxSpeed(320.7);
        sc.setSpoiler(true);

        System.out.println(sc.getMaxSpeed());
        System.out.println(sc.isSpoiler());

        Car c1 = new Car();
        c1.setMaxSpeed(120);

    }
}
