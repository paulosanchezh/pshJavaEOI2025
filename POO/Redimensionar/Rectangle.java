package ejercicio2;

public class Rectangle implements Resizable {
    private int ancho;
    private int alto;

    @Override
    public void resizeWidth(int width) { ancho = width; }

    @Override
    public void resizeHeight(int height) { alto = height; }
}
