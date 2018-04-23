package ua.itcloud.lessons.prim;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by student on 23.04.2018.
 */
public class MainPrim {

    public static void main(String[] args) {
        int a = 55555;
        Integer num = new Integer(55555);
        System.out.println(a);
        System.out.println(num);
        System.out.println(num.doubleValue());
        System.out.println(num.shortValue());
        System.out.println((short)a);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.max(4, 8));
        System.out.println(Integer.parseInt("77"));
        System.out.println(Integer.toBinaryString(255));
        System.out.println(Integer.toHexString(255));

        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);

        Boolean b = new Boolean(true);
        Boolean b2 = true;
        Boolean b3 = true;
        System.out.println(b2 == b3);
        System.out.println(b == b2);
        System.out.println(b2.equals(b));
        System.out.println(b2.booleanValue() == b.booleanValue());

        System.out.println();
        System.out.println(Character.BYTES);
        System.out.println(Character.isDigit('3'));
        System.out.println(Character.isDigit('a'));

        Character[] c = {'c','f','d','a'};

        System.out.println(Arrays.toString(c));
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));

        System.out.println();
        char[] nums = String.valueOf(12345).toCharArray();
        Integer[] integers = new Integer[nums.length];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = Integer.valueOf(String.valueOf(nums[i]));
            System.out.println(integers[i]);
        }

    }
}
