package ua.itcloud.lessons.polym;

/**
 * Created by student on 16.04.2018.
 */
public class Cube extends Square {

    public Cube(int height) {
        super(height);
    }

    @Override
    public double getArea() {
        return height * height * height;
    }

}
