package game;

import java.util.Scanner;

public class GameTest {
    public static void main(String[] args) {
        Entorno entorno = new Entorno();
        Depredador jugadorCazador;
        Presa jugadorPresa;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escoge animal 1-Conejo 2-Bambi");
        switch (sc.nextInt()) {
            case 1: jugadorPresa = new Conejo();break;
            case 2: jugadorPresa = new Bambi();break;
            default: jugadorPresa = new Bambi();break;
        }

        System.out.println("Escoge cazador 1-Lobo 2-Hiena");
        switch (sc.nextInt()) {
            case 1: jugadorCazador = new LoboFeroz();break;
            case 2: jugadorCazador = new Hiena();break;
            default: jugadorCazador = new Hiena();break;
        }

        entorno.jugar(jugadorPresa, jugadorCazador);
    }
}
