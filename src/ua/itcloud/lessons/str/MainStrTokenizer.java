package ua.itcloud.lessons.str;

import java.util.StringTokenizer;

/**
 * Created by student on 20.04.2018.
 */
public class MainStrTokenizer {

    public static void main(String[] args) {

        String ss = "Hello World, With all my life";

        StringTokenizer st = new StringTokenizer(ss, ",");
        System.out.println(st);
        while(st.hasMoreElements()){
            System.out.println(st.nextElement().toString().trim());
        }

    }
}
