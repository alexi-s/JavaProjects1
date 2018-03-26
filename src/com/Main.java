package com;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int born = 1988;
//        final short currentYear = 2018;
//        final String myName = "Alex";

//        System.out.println("Hello. My age is " + (currentYear - born) + " and my myName is " + myName + ".");


//      ------------------------------------------------------------------------------------------------------

//        Scanner sc = new Scanner(System.in);
//        final short CURRENT_YEAR = 2018;
//        short born;
//        String name;
//
//        System.out.println("Enter your name:");
//        name = sc.nextLine();
//        System.out.println("Enter date:");
//        born = sc.nextShort();
//
//
//        System.out.println("Your name is " + name + " and your age is " + (CURRENT_YEAR - born));

//      ------------------------------------------------------------------------------------------------------

//        int i = 1;
//        System.out.println(++i);
//        System.out.println(i);

//      ------------------------------------------------------------------------------------------------------


//        int a = 5;
//        int b = 2;
//
//        int result = 5 % 2;
//        System.out.println(result);
//        System.out.println(107 % 4);

//        System.out.println("zxcvbsad\t sadqwe");
//        System.out.println("kowuer123\t \"zxc\"");
//        System.out.println("kowuer123\t \'zxc\'");
//        System.out.println("klajdsfu\t zxc");
//        System.out.println("klajdsfu\r zxc");

//      ------------------------------------------------------------------------------------------------------

//        int b = scanner.nextInt();
//        int a = scanner.nextInt();
//
//        if (a < b) {
//            System.out.println("a < b");
//        } else if (a > b){
//            System.out.println("a > b");
//        } else {
//            System.out.println("a and b are equal");
//        }
//        int a = scanner.nextInt();
//        if (a % 2 == 0) {
//            System.out.println("a - четное");
//        } else {
//            System.out.println("a - нечетное");
//        }

//      ------------------------------------------------------------------------------------------------------

//        Scanner sc = new Scanner(System.in);
//        double length = sc.nextDouble();
//        System.out.println("Please choose ");
//        System.out.println("1 - santimeters");
//        System.out.println("2 - decimeters");
//        System.out.println("3 - kilometers");
//        int choice = sc.nextInt();
//
//        switch (choice) {
//            case 1: {
//                length *= 100;
//                System.out.println(length + " cm");
//                break;
//            }
//            case 2: {
//                length *= 10;
//                System.out.println(length + " dm");
//                break;
//            }
//            case 3: {
//                length /= 1000;
//                System.out.println(length + " km");
//                break;
//            }
//            default:
//                System.out.println("Wrong choice! Enter value 1, 2 or 3");
//        }

//      ------------------------------------------------------------------------------------------------------

//        for (int i = 0; i < 10; i++) {
//            if (i == 5) {
//                continue;
//            }
//            System.out.println("Step # " + i);
//        }


//        Scanner sc = new Scanner(System.in);
//        int choice = 0;
//        int exit = 0;
//        double length = 0d;
//
//        do {
//            System.out.print("Введите длину в метрах: ");
//            length = sc.nextDouble();
//            System.out.println("Выберите единицу измерения ");
//            System.out.println("1 - сантиметры");
//            System.out.println("2 - дециметры");
//            System.out.println("3 - километры");
//            choice = sc.nextInt();
//            switch (choice) {
//                case 1: {
//                    length *= 100;
//                    System.out.println(length + " см");
//                    break;
//                }
//                case 2: {
//                    length *= 10;
//                    System.out.println(length + " дм");
//                    break;
//                }
//                case 3: {
//                    length /= 1000;
//                    System.out.println(length + " км");
//                    break;
//                }
//                default:
//                    System.out.println("Wrong choice! Enter value 1, 2 or 3");
//            }
//
//            System.out.println("Желаете выйти? выйти - 0, продолжить - любое целое число (кроме нуля)");
//            exit = sc.nextInt();
//            if (exit == 0) {
//                break;
//            }
//
//        } while (true);


//        Scanner scan = new Scanner(System.in);
//        int exit = 0;
//        int start = 0, end = 0;
//
//        while (true) {
//            System.out.print("Enter start value: ");
//            start = scan.nextInt();
//            System.out.print("Enter end value: ");
//            end = scan.nextInt();
//            // 33 66 99
//
//            if ((start > 0) && (end > 0)) {
//                if (start > end) {
//                    int temp = start;
//                    start = end;
//                    end = temp;
//                }
//
//                for (int i = start; i <= end; i++) {
//                    System.out.println(i);
//                    if (i != 33 || i != 66 || i != 99) {
//                        if (i % 2 == 0) {
//                            System.out.println("четное");
//                        }
//                        if (i >= 10 && i <= 20) {
//                            System.out.println("находится в промежутке [10..20]");
//                        }
//                    }
//                }
//            } else System.out.println("Error");
//
//            System.out.println("Желаете выйти? выйти - 1, продолжить - 0");
//            exit = scan.nextInt();
//            if (exit == 1) {
//                break;
//            }
//        }

//        Scanner scan = new Scanner(System.in);
//        System.out.print("Введите длину массива: ");
//        int arrLength = scan.nextInt();
//        System.out.println();

//        int[] arr = new int[arrLength];

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("arr[" + i + "] = ");
//            arr[i] = scan.nextInt();
//        }
//
//        System.out.println("Массив:");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("arr[" + i + "] = " + arr[i]);
//        }

//        Random rand = new Random();
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Введите длину массива: ");
//        int arrLength = scan.nextInt();
//        int arr[] = new int[arrLength];
//        int sum = 0;
//        int mult = 1;
//
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = rand.nextInt(10) - 5;
//        }
//
//        System.out.print("Массив: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        for (int i : arr) {
//            if(i >= 0){
//                sum += i;
//            } else {
//                mult *= i;
//            }
//        }
//
//        System.out.println("Сумма положительых элементов массива: " + sum);
//        System.out.println("Произведение отрицательных элементов массива: " + mult);

//--------------------------------------------------------------------------------------------------

        Random rand = new Random();

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(50);
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - 1; j++) {
//                if (arr[j] < arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }

        int min = arr[0], max = arr[0];
        for (int i : arr) {
            if (i < min){
                min = i;
            }
            if (i > max){
                max = i;
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}

