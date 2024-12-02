import java.util.Objects;

public class Employee {

    private String fullName;
    private int department;
    private double salary;
    private int id;

    private static int idGenerator = 1;

    public Employee (String fullName, int department, int salary) {
        id = idGenerator++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "id " + id + ", Ф. И. О. " + fullName + ", отдел " + department + ", зарплата " + salary;
    }


}
