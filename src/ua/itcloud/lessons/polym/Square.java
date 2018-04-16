package ua.itcloud.lessons.polym;

/**
 * Created by student on 16.04.2018.
 */
public class Square extends Figure {

    protected int height;

    public Square(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * height;
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                '}';
    }
}
