package com.oop;

import java.util.Random;

/**
 * Created by student on 30.03.2018.
 */
public class ArithmeticMethods {

    public static int getMaxInt(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void printEvenFromArray(int... arr) {
        System.out.print("Even elements: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void printArrayEvenPos(int... arr) {
        System.out.print("Elements on even positions: ");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] generateArray(int maxLength) {
        Random rand = new Random();
        int[] array = new int[maxLength];
        for (int i = 0; i < maxLength; i++) {
            array[i] = rand.nextInt(10);
        }
        return array;
    }


}
