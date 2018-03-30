package com.oop;

/**
 * Created by student on 30.03.2018.
 */
public class Bike {

    private String model;
    private String colour;
    private int speed;
    private int wheelsNum;

    public Bike() {

    }

    public Bike(String model, int speed){
        this.model = model;
        this.speed = speed;
    }

    public Bike(String model, String colour, int speed, int wheelsNum) {
        this.model = model;
        this.speed = speed;
        this.colour = colour;
        this.wheelsNum = wheelsNum;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWheelsNum() {
        return wheelsNum;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setWheelsNum(int wheelsNum) {
        this.wheelsNum = wheelsNum;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", speed=" + speed +
                ", wheelsNum=" + wheelsNum +
                '}';
    }
}
