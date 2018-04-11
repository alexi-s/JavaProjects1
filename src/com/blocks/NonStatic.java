package com.blocks;

/**
 * Created by student on 11.04.2018.
 */
public class NonStatic {

    private static int counter = 0;

    private int num;

    static {
        System.out.println("Static block 1");

    }

    static {
        System.out.println("Static block 2");

    }

    {
        System.out.println("Non static block init");
        counter++;
    }

    public NonStatic(){
        System.out.println("Constructor init " + counter);
    }

    public NonStatic(int num) {
        this.num = num;
        System.out.println("Constructor init second " + counter);
    }

    public void show(){
        int i = 0;

        int k = 9;
        System.out.println(this.num);
//        System.out.println(num);
//        System.out.println(i + k);
    }

    public void say(){
        int k = 99;
        System.out.println(num);
    }


}
