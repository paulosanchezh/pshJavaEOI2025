package game;

public class Conejo implements Presa{
    @Override
    public void pasear() { System.out.println("Conejo paseando"); }

    @Override
    public void comer() { System.out.println("Conejo comiendo"); }

    @Override
    public void escapar() { System.out.println("Conejo escapando"); }
}
