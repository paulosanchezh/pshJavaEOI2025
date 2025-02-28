package ejercicio;

public class Circulo extends Forma {
    private double radio;

    public Circulo(double radio, String nombre, String color) {
        super(nombre, color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() { return Math.PI*Math.pow(2,radio); }
}
