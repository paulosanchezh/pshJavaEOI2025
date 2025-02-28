package coche;

public class Deportivo extends Vehiculo{

    public Deportivo(String modelo, String color, int velocidadMax) {
        super(modelo, color, velocidadMax);
    }

    @Override
    public void acelerar() { System.out.println("Acelerando moto"); }

    @Override
    public void frenar() { System.out.println("Frenando moto"); }
}
