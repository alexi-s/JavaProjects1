package ua.itcloud.lessons.polym;

/**
 * Created by student on 16.04.2018.
 */
public class Rectangle extends Square {

    private int width;

    public Rectangle(int height, int width) {
        super(height);
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
