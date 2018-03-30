package com.oop;

/**
 * Created by student on 30.03.2018.
 */
public class Methods {

    public void goFor(int end) {
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

    public void goFor(double end){
        for (int i = 0; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
