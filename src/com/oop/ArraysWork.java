package com.oop;

import java.util.Random;

/**
 * Created by student on 28.03.2018.
 */
public class ArraysWork {

    private final int SIZE = 10;

    public int[] getArray() {
        int[] array = new int[SIZE];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        return array;
    }

    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
