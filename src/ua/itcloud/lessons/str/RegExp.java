package ua.itcloud.lessons.str;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by student on 20.04.2018.
 */
public class RegExp {
    public static void main(String[] args) {
        Pattern webPattern = Pattern.compile(".*(http|https)://.*");
        Matcher webMatcher = webPattern.matcher("hello https://google.com");
        boolean matchResult = webMatcher.matches();
        System.out.println(matchResult);
    }
}
