package com.oop;

/**
 * Created by student on 30.03.2018.
 */
public class Methods {

    public static int counter = 0;
    public int s = 0;

    public Methods(){
        counter++;
    }

    public static void goFor(int end) {
        for (int i = 0; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void goFor(int start, int end){
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void goFor(int start, int end, int step){
        for (int i = start; i <= end; i += step) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void goAll(int... arr){
        int sum = 0;
        arr[0] = 100; // можем изменить переданный массив
        for (int i = 0; i < arr.length; i++) {
            // System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println();
        System.out.println("Sum = " + sum);
        System.out.println("Count = " + arr.length);
        System.out.println("Average = " + sum / arr.length);
    }

/*
    public int goFor(int end){
        for (int i = 0; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        return 1;
    }
*/

}
