package ua.itcloud.lessons.p;

/**
 * Created by student on 16.04.2018.
 */
public class SportCar extends Car{

    private boolean isSpoiler;

    public SportCar(String name, boolean isSpoiler) {
        super(name);
        this.isSpoiler = isSpoiler;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "isSpoiler=" + isSpoiler +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SportCar)) return false;
        if (!super.equals(o)) return false;

        SportCar sportCar = (SportCar) o;

        return isSpoiler == sportCar.isSpoiler;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (isSpoiler ? 1 : 0);
        return result;
    }
}
