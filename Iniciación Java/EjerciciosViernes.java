import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //actividad1();
        //actividad2();
        actividad3();
    }

    private static void actividad1() {
        Scanner sc = new Scanner(System.in);

        int entero1, entero2;

        System.out.println("Introduce el primer entero:");
        entero1 = sc.nextInt();

        System.out.println("Introduce el segundo entero:");
        entero2 = sc.nextInt();

        if(entero1 > entero2) System.out.println("El primer entero es mayor");
        else if(entero1 < entero2) System.out.println("El segundo entero es mayor");
        else System.out.println("Son iguales");

        sc.close();
    }

    private static void actividad2() {
        Scanner sc = new Scanner(System.in);

        int inicio = 0;
        int fin = 5;

        do{
            do{
                System.out.println("Introduce el primer entero:");
                inicio = sc.nextInt();

                if(inicio < 0)
                    System.out.println("El valor deber ser positivo");

            }while(inicio < 0);

            do{
                System.out.println("Introduce el segundo entero:");
                fin = sc.nextInt();

                if(fin < 0)
                    System.out.println("El valor deber ser positivo");

            }while(fin < 0);


            if(inicio > fin)
                System.out.println("ERROR: el valor de inicio es mayor que el de fin");

        }while(inicio > fin);

        while (inicio <= fin){
            System.out.println(inicio);
            inicio++;
        }
    }

    private static void actividad3() {
        Scanner sc = new Scanner(System.in);

        int inicio = 0;
        int fin = 5;

        do{
            do{
                System.out.println("Introduce el primer entero:");
                inicio = sc.nextInt();

                if(inicio < 0)
                    System.out.println("El valor deber ser positivo");

            }while(inicio < 0);

            do{
                System.out.println("Introduce el segundo entero:");
                fin = sc.nextInt();

                if(fin < 0)
                    System.out.println("El valor deber ser positivo");

            }while(fin < 0);


            if(inicio > fin)
                System.out.println("ERROR: el valor de inicio es mayor que el de fin");

        }while(inicio > fin);

        for (int i=inicio;i<=fin;i++){
            if(i%2 == 0)
                System.out.println(i);
        }
    }
}