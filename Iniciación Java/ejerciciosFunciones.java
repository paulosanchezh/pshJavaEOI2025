import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Double> vectorNumeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int operacion;
        vectorNumeros = introducirNumeros(vectorNumeros);

        System.out.println("Operacion a realizar: 1 Suma - 2 Media");
        operacion = sc.nextInt();

        switch (operacion){
            case 1: System.out.println("La suma es: " + suma(vectorNumeros));break;
            case 2: System.out.println("La media es: " + media(suma(vectorNumeros), vectorNumeros.size()));break;
        }
    }

    private static double media(double media, int tamaño) {
        return media/tamaño;
    }

    private static double suma(List<Double> vectorNumeros) {
        double suma = 0;

        for( double numero : vectorNumeros){
            suma += numero;
        }

        return suma;
    }

    private static List introducirNumeros(List vectorNumeros) {
        double num;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("introducir numero (para terminar introduca 0");
            num = sc.nextDouble();

            if(num !=0)
                vectorNumeros.add(num);
        }while(num != 0);

        return vectorNumeros;
    }


}