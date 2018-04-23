package ua.itcloud.lessons.exceptions;

/**
 * Created by student on 23.04.2018.
 */
public class MainExc {

    public static void main(String[] args) {
        try {
            System.out.println(getValue(1));
        } catch (ValueException e) {
            System.out.println(e.getMessage());
        } catch (NewCheckedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }

    public static int check(){
        int[] mas = {0, 2, 3};
        int result;

        try {
            result = mas[1] / mas[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            // e.printStackTrace();
            System.out.println(e);
            // result = mas[mas.length - 1];
            // System.exit(1); // заверршение программы
            result = 1;
            return result;
        } catch (ArithmeticException e){
            System.out.println(e);
            result = 0;
            return result;
        } catch (Exception e){
            System.out.println(e);
            result = 0;
        } finally {
            System.out.println("finally");
            result = 0;
            // return 44;
        }
        //System.out.println(result);
        return 6;
    }

    public static int getValue(int index) throws Exception { // ValueException, NewCheckedException {
        final int size = 10;
        int[] mas = new int[size];

        if (index == 0){
            throw new ValueException();
        } else {
            throw new NewCheckedException();
        }

        // return mas[index];
    }
}
