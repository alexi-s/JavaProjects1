package ua.itcloud.lessons.comp;

import java.util.Comparator;

/**
 * Created by student on 18.04.2018.
 */
public class Car implements Comparable {

    private int maxSpeed;
    private int year;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car(int maxSpeed, int year) {
        this.maxSpeed = maxSpeed;
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Car car1 = (Car) o;
        if (car1.getMaxSpeed() < this.maxSpeed) {
            return -1;
        }
        if (car1.getMaxSpeed() > this.maxSpeed) {
            return 1;
        }
        return 0;
    }
}
