package ej4;

public abstract class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }

    public int getSalary() { return salary; }

    public void setSalary(int salary) { this.salary = salary; }

    public abstract void calculateSalary();

    public abstract void displayInfo();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
