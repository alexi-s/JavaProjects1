package ua.itcloud.lessons.p;

import ua.itcloud.lessons.p.*;

/**
 * Created by student on 16.04.2018.
 */
public class MainCar {

    public static void main(String[] args) {
        SportCar sc = new SportCar("", true);
        Car c = new Car("New Car");
        Car csc = new SportCar("", true);
        BadCar bc = new BadCar("", 10);

        //SportCar scs = (SportCar) new Object();
//        sc.equals(bc);

        Object o = new Car("car name");

        // SportCar ss = (SportCar) o;
        // Car ss = (Car) o;
        Car ss = (Car) o;
        System.out.println(ss.getName());

        System.out.println(sc instanceof SportCar);
        System.out.println(sc instanceof Car);
        System.out.println(sc.getClass());
    }
}
