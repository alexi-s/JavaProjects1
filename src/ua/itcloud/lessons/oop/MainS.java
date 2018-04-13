package ua.itcloud.lessons.oop;

import ua.itcloud.lessons.oop.Car;
import ua.itcloud.lessons.oop.SportCar;
import ua.itcloud.lessons.oop.BadCar;

/**
 * Created by student on 11.04.2018.
 */
public class MainS {

    public static void main(String[] args) {

        Car c = new Car();
        Car sc = new SportCar(300, "red", true);
        Car bc = new BadCar();

        Car[] cars = new Car[3];
        cars[0] = c;
        cars[1] = sc;
        cars[2] = bc;

        for (int i = 0; i < cars.length; i++) {
            cars[i].show();
        }

    }
}
