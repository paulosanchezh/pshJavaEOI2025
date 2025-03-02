package ej4;

public class TestEmployee {
    public static void main(String[] args) {
        Manager manager = new Manager("Juan Castaña", 4000, 2);
        Programmer programmer = new Programmer("Andreu barbaro", 2500, "Todas las tareas realizadas");

        manager.calculateSalary();
        manager.displayInfo();

        programmer.calculateSalary();
        programmer.displayInfo();
    }

}
