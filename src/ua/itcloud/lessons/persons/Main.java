package ua.itcloud.lessons.persons;

/**
 * Created by student on 13.04.2018.
 */
public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("Ivan", "Popov", 45, 4000);
        Student student1 = new Student("Misha", "Voronin", 17);
        Student student2 = new Student("John", "Connor", 18, 4);
        Student student3 = new Student("Vasya", "Sinitsyn", 17, 2);
        Student student4 = new Student("Vasya", "Sinitsyn", 17, 2);

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

        System.out.println(teacher1.toString());
        System.out.println(teacher2.toString());

        System.out.println(teacher1.equals(teacher2));
        System.out.println("student1 and student2: " + student2.equals(student3));
        System.out.println("student3 and student4: " + student3.equals(student4));

    }
}
