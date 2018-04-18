package ua.itcloud.lessons.comp;

import java.util.Comparator;

/**
 * Created by student on 18.04.2018.
 */
public class IntComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        int num1 = i1.intValue();
        int num2 = i2.intValue();
        if (num1 < num2) {
            return 1;
        }
        if (num1 > num2) {
            return -1;
        }
        return 0;
    }
}
