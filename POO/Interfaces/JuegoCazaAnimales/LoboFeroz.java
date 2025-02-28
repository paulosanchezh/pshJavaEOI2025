package game;

public class LoboFeroz implements Depredador {
    @Override
    public void acechar() { System.out.println("Lobo acechando"); }

    @Override
    public void atacar() { System.out.println("Lobo atacando"); }

    @Override
    public void comer() { System.out.println("Lobo comiendo"); }
}
