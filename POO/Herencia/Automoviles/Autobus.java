public class Autobus extends Vehiculo {
    private int numAsientos;
    private int numPuertas;
    private int numVentanillas;

    public Autobus(int precioDia, String marcaModelo, int numLlantas, int numAsientos, int numPuertas, int numVentanillas) {
        super(precioDia, marcaModelo, numLlantas);
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
        this.numVentanillas = numVentanillas;
    }

    public void mostrarDatos(){ System.out.println(toString()); }

    public void pruebaDelMotor(){ System.out.println("Probando motor"); }

    @Override
    public String toString() {
        return "Autobus{" +
                "numAsientos=" + numAsientos +
                ", numPuertas=" + numPuertas +
                ", numVentanillas=" + numVentanillas +
                '}';
    }
}
