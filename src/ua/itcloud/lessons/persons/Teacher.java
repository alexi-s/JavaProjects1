package ua.itcloud.lessons.persons;

/**
 * Created by student on 13.04.2018.
 */
public class Teacher extends Human {
    private double salary;

    public Teacher() {
        super();
    }

    public Teacher(String firstName, String lastName, int age) {
        super(firstName, lastName, age);

    }

    public Teacher(String firstName, String lastName, int age, double salary) {
        super(firstName, lastName, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Teacher teacher = (Teacher) o;

        return Double.compare(teacher.salary, salary) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "Teacher{" +
                "salary=" + salary +
                '}';
    }
}
