package game;

public class Hiena implements Depredador{
    @Override
    public void acechar() { System.out.println("hiena acechando"); }

    @Override
    public void atacar() { System.out.println("hiena atacando"); }

    @Override
    public void comer() { System.out.println("hiena comiendo"); }
}
