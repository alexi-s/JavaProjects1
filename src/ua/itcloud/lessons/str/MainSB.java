package ua.itcloud.lessons.str;

/**
 * Created by student on 20.04.2018.
 */
public class MainSB {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.length());

        sb.append("");
        System.out.println(sb.length());
        sb.append(" ");
        System.out.println(sb.length());
        System.out.println(sb.toString());

        sb.delete(1, 3);
        System.out.println(sb.toString());

        sb.insert(1, "Why");
        System.out.println(sb.toString());
        System.out.println(sb.reverse());
        System.out.println(sb);

        sb.append(" abracadabra abracadabra abracadabra");


        System.out.println(sb.length());
        sb.trimToSize();
        System.out.println(sb.length());

        String r1 = sb.toString();
    }
}
