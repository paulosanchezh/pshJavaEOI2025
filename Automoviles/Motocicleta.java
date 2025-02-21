public class Motocicleta extends Vehiculo {
    private int numAsientos;

    public Motocicleta(int precioDia, String marcaModelo, int numLlantas, int numAsientos) {
        super(precioDia, marcaModelo, numLlantas);
        this.numAsientos = numAsientos;
    }

    public void mostrarDatos(){ System.out.println("Num Asientos: " + numAsientos); }

    public void pruebaDelMotor(){ System.out.println("Probando motor"); }
}
