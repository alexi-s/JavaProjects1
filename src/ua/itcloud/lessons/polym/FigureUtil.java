package ua.itcloud.lessons.polym;

/**
 * Created by student on 16.04.2018.
 */
public class FigureUtil {

    private static FigureUtil instance;

    private FigureUtil(){

    }

    public static FigureUtil getInstance(){
        if (instance == null) {
            System.out.println("Create instance");
            instance = new FigureUtil();
        }
        return instance;
    }

    public static void printInformation(Figure figure){
        System.out.println(figure.toString());
    }
}
