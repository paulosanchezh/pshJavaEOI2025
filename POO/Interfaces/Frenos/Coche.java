package POO.Clase1.EjercicioFrenable;

public class Coche implements Frenable {

    private boolean frenos;
    private int velocidad;

    public Coche(boolean frenos, int velocidad) {
        this.frenos = frenos;
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public void frenar() {
        frenos = true;
    }

    @Override
    public void soltarFrenos() {
        frenos = false;
        velocidad -=20;
    }
}
