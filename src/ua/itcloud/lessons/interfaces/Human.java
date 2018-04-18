package ua.itcloud.lessons.interfaces;

/**
 * Created by student on 18.04.2018.
 */
public class Human extends People implements Common {

/*    @Override
    public void move() {
        System.out.println("Human is moving");
    }
*/

    @Override
    public void sell() {
        System.out.println("Human has been sold");
    }
}
