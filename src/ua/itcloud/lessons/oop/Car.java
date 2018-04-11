package ua.itcloud.lessons.oop;

/**
 * Created by student on 11.04.2018.
 */
public class Car {

    protected double maxSpeed;
    String colour;

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void show(){
        System.out.println("Hello!!!");
    }

    protected void sayMyName(){
        System.out.println("My Name");
    }
}
