package ua.itcloud.lessons.oop;

/**
 * Created by student on 11.04.2018.
 */
public class SportCar extends Car{
    private boolean isSpoiler;

    public void setSpoiler(boolean spoiler) {
        colour = "red";
        isSpoiler = spoiler;
        maxSpeed = 99999999.999;
    }

    public boolean isSpoiler() {
        super.colour = "";
        sayMyName();
        return isSpoiler;
    }
}
