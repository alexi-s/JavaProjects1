package ua.itcloud.lessons.polym;

/**
 * Created by student on 16.04.2018.
 */
public class MainPol {

    private static final int SIZE = 5;

    public static void main(String[] args) {

        Figure s = new Square(3);
        Figure c = new Circle(5.55);

        Figure[] mas = new Figure[SIZE];

        mas[0] = s;
        mas[1] = c;
        mas[2] = new Triangle(4, 6);
        mas[3] = new Rectangle(3, 7);
        mas[4] = new Cube(6);

        FigureUtil figureUtil = FigureUtil.getInstance();
        FigureUtil figureUtil2 = FigureUtil.getInstance();
        System.out.println(figureUtil == figureUtil2);

        for (int i = 0; i < mas.length; i++) {
             figureUtil.printInformation(mas[i]);
            ///System.out.println(mas[i].getArea());
        }

    }
}
