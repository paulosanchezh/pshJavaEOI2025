package ejercicio;

import java.time.format.FormatStyle;

public class AbstractTest {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(23,"tapa botella","rojo");
        System.out.println("El area de " + circulo.getNombre() + " de color " + circulo.getColor()
                + " su área es " + circulo.calcularArea());
    }
}
