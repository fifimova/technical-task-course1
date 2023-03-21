public class Employee {
    private String fullName;
    private int department;
    private double salary;
    private static int id;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public Employee() {
        id++;
    }

    public int getId() {
        return this.id;
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

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО - " + this.fullName + ", номер отдела - " + this.department + ", зарплата: " + this.salary;
    }
}
