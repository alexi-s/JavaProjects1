package ua.itcloud.lessons.str;

/**
 * Created by student on 20.04.2018.
 */
public class MainStr {

    public static void main(String[] args) {

        String str1 = "Hello Brain-Academy!";
        String str2 = " World";

//        System.out.println(str1 + str2);
//        String str3 = str1.concat(str2);
//        System.out.println(str3);
//        System.out.println(str1);

        System.out.println(str1);
        char s0 = str1.charAt(0);
        System.out.println(s0);

        String subString1 = str1.substring(6);
        System.out.println(subString1);
        String subString2 = str1.substring(6, 11);
        System.out.println(subString2);

        int index1 = str1.indexOf("e");
        System.out.println(index1);
        int index2 = str1.lastIndexOf("e");
        System.out.println(index2);
        System.out.println(str1.indexOf("x"));
        System.out.println(str1.indexOf('e'));
        System.out.println(str1.indexOf('e', 2));
        System.out.println(str1.indexOf("el"));

        System.out.println(str1.isEmpty());
        System.out.println("".isEmpty());  // анонимная переменная

        System.out.println(" Hello ".trim());
        System.out.println(" ".trim().isEmpty());
        System.out.println(" Hello World".trim().replaceAll("Hello", "Hell on the "));
        System.out.println(" Hello World".trim().replace('o', 'a'));
        System.out.println(" Hello World".trim().toUpperCase());
        System.out.println(" Hello World".trim().toLowerCase());

        System.out.println("Hello".equals("Hello"));
        System.out.println("Hello".equals("hello"));
        System.out.println("Hello".toLowerCase().equals("hello".toLowerCase()));
        System.out.println("Hello".equalsIgnoreCase("hello"));

        System.out.println("Hello".startsWith("He"));
        System.out.println("Hello".startsWith("he"));
        System.out.println("Hello".endsWith("lo"));
        System.out.println("Hello".endsWith("olo"));

        char[] chars = "Hello".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 65 && chars[i] <= 90) {
                System.out.println(chars[i] + " - upper case");
            } else {
                System.out.println(chars[i] + " - lower case");
            }
        }
        char[] reverted = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            reverted[chars.length - 1 - i] = chars[i];
        }

        String r = new String(reverted);
        System.out.println();
        System.out.println("New string: " + r);

    }
}
