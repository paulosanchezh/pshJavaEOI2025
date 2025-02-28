package coche;

public class TodoTerreno extends Vehiculo {

    public TodoTerreno(String modelo, String color, int velocidadMax) {
        super(modelo, color, velocidadMax);
    }

    @Override
    public void acelerar() { System.out.println("Acelerando todoterreno"); }

    @Override
    public void frenar() { System.out.println("Frenando todoterreno"); }
}
