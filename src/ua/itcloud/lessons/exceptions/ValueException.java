package ua.itcloud.lessons.exceptions;

/**
 * Created by student on 23.04.2018.
 */
public class ValueException extends Exception {

    @Override
    public String getMessage() {
        return "Wrong number";
    }
}
