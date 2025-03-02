package ej4;

public class Manager extends Employee {
    private int grupoTrabajo;

    public Manager(String name, int salary, int grupoTrabajo) {
        super(name, salary);
        this.grupoTrabajo = grupoTrabajo;
    }

    @Override
    public void calculateSalary() { System.out.println("Su salario es " + this.getSalary()*0.95);}

    @Override
    public void displayInfo() { System.out.println(toString()); }

    @Override
    public String toString() {
        return super.toString() +
                "grupoTrabajo=" + grupoTrabajo +
                '}';
    }
}
