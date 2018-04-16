package ua.itcloud.lessons.polym;

/**
 * Created by student on 16.04.2018.
 */
public class Triangle extends Figure {

    private int height;
    private int width;

    public Triangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return (1.0/2) * width * height;
    }
}
