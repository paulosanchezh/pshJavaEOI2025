package ej4;

public class Programmer extends Employee {
    private String tareas;

    public Programmer(String name, int salary, String tareas) {
        super(name, salary);
        this.tareas = tareas;
    }

    @Override
    public void calculateSalary() { System.out.println("Su salario es " + this.getSalary()*0.90); }

    @Override
    public void displayInfo() { System.out.println(toString()); }

    @Override
    public String toString() {
        return super.toString() +
                "tareas='" + tareas + '\'' +
                '}';
    }
}
