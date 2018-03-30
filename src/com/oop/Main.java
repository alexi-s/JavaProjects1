package com.oop;

import java.util.Scanner;

/**
 * Created by student on 28.03.2018.
 */

//        StudentWork studentWork = new StudentWork();
//
//        Student student = studentWork.createStudentFromConsole();
//        studentWork.showSuccessMessage(student);

//        ArraysWork arraysWork = new ArraysWork();
//        int[] myArray = arraysWork.getArray();
//        arraysWork.printArray(myArray);

/*Bike ducatti = new Bike("Ducatti", 320);
        ducatti.setColour("black");
        ducatti.setWheelsNum(2);

        System.out.println(ducatti.toString());

        RepairService MotoService = new RepairService();
        MotoService.paintBike(ducatti, "red");
        System.out.println(MotoService.testDrive(ducatti));
        ducatti.setSpeed(350);
        System.out.println(ducatti.toString());

        MotoService.repairBike(ducatti);

        System.out.println();
        Bike yamaha = new Bike("Yamaha", "deep blue", 300, 2);
        System.out.println(yamaha.toString());*/

public class Main {

    public static void main(String[] args) {

        Methods m = new Methods();
        m.goFor(10);
        m.goFor(10.2);
        m.goFor(2, 8);
        m.goFor(1, 100, 10);


    }
}
