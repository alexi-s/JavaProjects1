package com.oop;

import java.util.Scanner;

/**
 * Created by student on 28.03.2018.
 */
public class StudentWork {

    public Student createStudentFromConsole() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String firstName = scan.nextLine();
        System.out.print("Enter student age: ");
        int age = scan.nextInt();
        return new Student(firstName, age);
    }

    public void showSuccessMessage(Student student) {
        System.out.println("You have created new student:");
        System.out.println(student.toString());
    }
}
