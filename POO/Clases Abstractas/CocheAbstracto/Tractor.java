package coche;

public class Tractor extends Vehiculo {

    public Tractor(String modelo, String color, int velocidadMax) {
        super(modelo, color, velocidadMax);
    }

    @Override
    public void acelerar() { System.out.println("Acelerando tractor"); }

    @Override
    public void frenar() { System.out.println("Frenando tractor"); }
}
