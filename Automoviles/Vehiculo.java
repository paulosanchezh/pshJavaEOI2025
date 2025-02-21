public class Vehiculo {
    protected int precioDia;
    protected String marcaModelo;
    protected int numLlantas;

    public Vehiculo(int precioDia, String marcaModelo, int numLlantas) {
        this.precioDia = precioDia;
        this.marcaModelo = marcaModelo;
        this.numLlantas = numLlantas;
    }

    public void mostrarCaracteristicas(){ System.out.println(toString()); }

    public void encerderMotor(){ System.out.println("Encendiendo Motor"); }

    public void apagarMotor(){ System.out.println("Apagando Motor"); }

    public void funciona(){ System.out.println("Funciona"); }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "precioDia=" + precioDia +
                ", marcaModelo='" + marcaModelo + '\'' +
                ", numLlantas=" + numLlantas +
                '}';
    }
}
