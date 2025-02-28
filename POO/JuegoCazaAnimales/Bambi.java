package game;

public class Bambi implements Presa {
    @Override
    public void pasear() { System.out.println("Bambi paseando"); }

    @Override
    public void comer() { System.out.println("Bambi comiendo"); }

    @Override
    public void escapar() { System.out.println("Bambi escapando"); }
}
