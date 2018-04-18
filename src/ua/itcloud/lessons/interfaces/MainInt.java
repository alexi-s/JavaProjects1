package ua.itcloud.lessons.interfaces;

/**
 * Created by student on 18.04.2018.
 */
public class MainInt {

    public static void main(String[] args) {

//        Common[] commons = new Common[2];
//        commons[0] = new Car();
//        commons[1] = new Human();
//
//        for (Common common : commons) {
//            common.move();
//            common.sell();
//        }

//        People p = new People();
//        p.move();

       Movable m = new Movable() {
            @Override
            public void move() {
                System.out.println("Own is moving");
            }
        };

        Car c = new Car();
        SomeMoves.makeMove(c);
        Human h = new Human();
        SomeMoves.makeMove(h);
        SomeMoves.makeMove(m);

        SomeMoves.makeMove(new Movable() {
            @Override
            public void move() {
                System.out.println("Anonimous is moving");
            }
        });
    }
}
