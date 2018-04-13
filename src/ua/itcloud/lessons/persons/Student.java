package ua.itcloud.lessons.persons;

/**
 * Created by student on 13.04.2018.
 */
public class Student extends Human {
    private int avgMark;

    public Student() {
        super();
    }

    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public Student(String firstName, String lastName, int age, int avgMark) {
        super(firstName, lastName, age);
        this.avgMark = avgMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Student student = (Student) o;

        return avgMark == student.avgMark;

    }

    public int getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(int avgMark) {
        this.avgMark = avgMark;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + avgMark;
        return result;
    }

    @Override
    public String toString() {
        return  super.toString() + "Student{" +
                "avgMark=" + avgMark +
                '}';
    }
}
