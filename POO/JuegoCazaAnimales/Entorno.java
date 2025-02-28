package game;

import java.util.Scanner;

public class Entorno{

    public void jugar(Presa jugadorPresa, Depredador jugadorCazador) {

        jugadorPresa.pasear();
        jugadorCazador.acechar();
        jugadorPresa.pasear();
        jugadorCazador.acechar();
        jugadorPresa.pasear();
        jugadorCazador.acechar();
        jugadorCazador.atacar();

        int desenlace = (int) (Math.random() * 10 + 1);

        if (desenlace <= 5)
            System.out.println("Bambi escapó");
        else {
            System.out.println("Lobo mató a Bambi");
            jugadorCazador.comer();
        }
    }
}
