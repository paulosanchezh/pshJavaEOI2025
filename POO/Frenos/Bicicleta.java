package POO.Clase1.EjercicioFrenable;

public class Bicicleta implements Frenable {

    private int marcha;
    private int velocidad;
    private boolean frenos;

    public Bicicleta(int marcha, int velocidad, boolean frenos) {
        this.marcha = marcha;
        this.velocidad = velocidad;
        this.frenos = frenos;
    }

    public int getMarcha() {
        return marcha;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void subirMarcha(){
        marcha += 1;
    }

    public void bajarMarcha(){
        marcha -= 1;
    }

    @Override
    public void frenar() {
        frenos = true;
    }

    @Override
    public void soltarFrenos() {
        frenos = false;
        velocidad -= 5;
    }
}
