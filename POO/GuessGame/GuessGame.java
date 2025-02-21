import java.util.Scanner;

public class GuessGame{
    Player p1;
    Player p2;
    Player p3;

    public GuessGame(Player p1, Player p2, Player p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void startGame(){
        boolean correcto = false;
        int numeroParaAdivinar;
        String seguir;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al juego!!");
        System.out.println("Intenta adivinar un numero del 1 al 9");
        numeroParaAdivinar = (int)(Math.random()*10);

        do{
            p1.guess();
            p2.guess();
            p3.guess();

            if(p1.getNumber() == numeroParaAdivinar)
                System.out.println("Acertaste, el numero era: " + p1.getNumber());
            else
                System.out.println("Fallaste mi rey");

            if(p2.getNumber() == numeroParaAdivinar)
                System.out.println("Acertaste, el numero era: " + p2.getNumber());
            else
                System.out.println("Fallaste mi rey");

            if(p3.getNumber() == numeroParaAdivinar)
                System.out.println("Acertaste, el numero era: " + p3.getNumber());
            else
                System.out.println("Fallaste mi rey");

            System.out.println("Seguir Jugando?: S N");
            seguir = sc.nextLine();
        }while(seguir.equals("S"));

    }
}
