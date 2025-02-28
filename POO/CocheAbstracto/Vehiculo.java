package coche;

public abstract class Vehiculo {
    private String modelo;
    private String color;
    private int velocidadMax;

    public Vehiculo(String modelo, String color, int velocidadMax) {
        this.modelo = modelo;
        this.color = color;
        this.velocidadMax = velocidadMax;
    }

    public String getModelo() { return modelo; }

    public String getColor() { return color; }

    public int getVelocidadMax() { return velocidadMax; }

    public abstract void acelerar();

    public abstract void frenar();
}
