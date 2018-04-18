package ua.itcloud.lessons.comp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * Created by student on 18.04.2018.
 */
public class Compa {

    public static void main(String[] args) {
//        IntComparator comparator = new IntComparator();
//        Integer[] array = getArray();
//        System.out.println("Original array");
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array, comparator);
//        System.out.println("Sorted array");
//        System.out.println(Arrays.toString(array));

        Car[] cars = {new Car(33, 1996), new Car(25, 1932), new Car(11, 2018)};
        System.out.println("Original array");
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars);
        System.out.println("Sorted by comparable");
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Car car1 = (Car) o1;
                Car car2 = (Car) o2;
                if (car1.getYear() < car2.getYear()) {
                    return -1;
                }
                if (car1.getYear() > car2.getYear()) {
                    return 1;
                }
                return 0;
            }
        });
        System.out.println("Sorted by year");
        System.out.println(Arrays.toString(cars));
    }

    public static Integer[] getArray() {
        Integer[] result = new Integer[10];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(20);
        }
        return result;
    }
}
