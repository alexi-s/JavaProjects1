package ua.itcloud.lessons.oop;

/**
 * Created by student on 11.04.2018.
 */
public class Car {

    protected double maxSpeed;
    public String colour;

//    static {
//        System.out.println("Car block 1");
//    }

    public Car() {
        //System.out.println("Car constructor");
    }

    public Car(double maxSpeed, String colour) {
        System.out.println("Car constructor 2");
        this.maxSpeed = maxSpeed;
        this.colour = colour;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }


    public void show() {
        System.out.println("I'm the Car");
    }

    protected void sayMyName() {
        System.out.println("My Name");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (Double.compare(car.maxSpeed, maxSpeed) != 0) return false;
        return colour != null ? colour.equals(car.colour) : car.colour == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(maxSpeed);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        return result;
    }
}
