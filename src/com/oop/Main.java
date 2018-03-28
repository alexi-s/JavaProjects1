package com.oop;

import java.util.Scanner;

/**
 * Created by student on 28.03.2018.
 */
public class Main {

    public static void main(String[] args) {

//        StudentWork studentWork = new StudentWork();
//
//        Student student = studentWork.createStudentFromConsole();
//        studentWork.showSuccessMessage(student);

        ArraysWork arraysWork = new ArraysWork();
        int[] myArray = arraysWork.getArray();
        arraysWork.printArray(myArray);

    }
}
