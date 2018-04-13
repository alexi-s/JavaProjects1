package ua.itcloud.lessons.oop;

import ua.itcloud.lessons.oop.Car;

/**
 * Created by student on 11.04.2018.
 */
public class SportCar extends Car {

    private boolean isSpoiler;
    public double maxSpeed;

//    static {
//        System.out.println("SC block 1");
//    }

    public SportCar() {
        super(1, "green");
        System.out.println("SC cons");
    }

    public SportCar(double maxSpeed, String colour, boolean isSpoiler) {
        super(maxSpeed, colour);
        this.isSpoiler = isSpoiler;
        System.out.println("SC cons 3");
    }

//    public SportCar(boolean isSpoiler) {
//        this.isSpoiler = isSpoiler;
//        System.out.println("SC cons 1");
//    }

    public void setSpoiler(boolean spoiler) {
        colour = "red";
        isSpoiler = spoiler;
        maxSpeed = 299;
    }

    public boolean isSpoiler() {
        super.colour = "";
        sayMyName();
        return isSpoiler;
    }

    @Override
    public void show() {
        System.out.println();
        super.show();
        System.out.println("I'm the Sport car");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
