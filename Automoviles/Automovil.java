public class Automovil extends Vehiculo {
    private int numAsientos;
    private int numPuertas;

    public Automovil(int precioDia, String marcaModelo, int numLlantas, int numAsientos, int numPuertas) {
        super(precioDia, marcaModelo, numLlantas);
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
    }

    public void mostrarDatos(){ System.out.println(toString()); }

    public void pruebaDelMotor(){ System.out.println("Probando motor"); };

    @Override
    public String toString() {
        return "Automovil{" +
                "numAsientos=" + numAsientos +
                ", numPuertas=" + numPuertas +
                '}';
    }
}
