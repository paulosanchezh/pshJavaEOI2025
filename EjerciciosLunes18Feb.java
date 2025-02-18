import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        ejercicio4();
    }

    //EJERCICIO MEDIAS
    /*Dadas las notas de un alumno, quiero que me digáis cúal es la nota media de dicho alumno*/
    private static void ejercicio1() {
        List<Double> notas = new ArrayList<Double>();
        double media, sumaNotas = 0;

        notas.add(1.0);
        notas.add(2.7);
        notas.add(3.1);
        notas.add(4.4);
        notas.add(5.2);
        notas.add(6.9);
        notas.add(7.3);
        notas.add(8.0);

        for(Double nota : notas){
            sumaNotas+=nota;
        }

        media = sumaNotas/notas.size();

        System.out.println("la media es: " + media);
    }

    /*CONTAR PALABRAS EN BLANCO
      contar el numero de palabras en blanco de una lista de palabras*/
    private static void ejercicio2() {
        List<String> palabras = new ArrayList<>();
        int contadorPalabrasVacias = 0;

        palabras.add(" David");
        palabras.add("Toky ");
        palabras.add("");
        palabras.add(" ");
        palabras.add("      ");
        palabras.add("e    e");

        for(String palabra : palabras){
            //la función trim() elimina los espacios en blanco al final o principio de la cadena
            if(palabra.trim().isEmpty())
                contadorPalabrasVacias++;
            else
                System.out.println(palabra);
        }

        System.out.println("El número de palabras vacías son: " + contadorPalabrasVacias);
    }

    /*EJERCICIO CADENAS
      Dado este ejercicio, el problema es: Dime el número de digitos que aparecen*/
    private static void ejercicio3() {
        String texto = "Este es mi 11 4 texto de prueba";

        String soloDigitos = texto.replaceAll("[^0-9]", "");

        System.out.println(soloDigitos.length());
    }

    /*EJERCICIO ESTRUCTURA VARIOS ARRAYS
      lo que tenemos que hacer es aplicar un descuento de tipo1, de 100 euros
      aplicar descuento de tipo2, de 200 euros
     */
    private static void ejercicio4() {
       List<String> clientes = new ArrayList<>();
       List<String> idClientes = new ArrayList<>();
       List<Double> base = new ArrayList<>();

       clientes.add("David");
       idClientes.add("1_0002");
       base.add(500.25);

       clientes.add("linda");
       idClientes.add("1_0002");
       base.add(700.0);

       clientes.add("Toky");
       idClientes.add("2_0001");
       base.add(1000.0);

       for (int i=0; i<clientes.size(); i++){
           if(idClientes.get(i).startsWith("1")){
               base.set(i, base.get(i)-100);
               System.out.println("El cliente " + clientes.get(i) + " con id " + idClientes.get(i)
                       + " tiene un descuento de 100 euros y ahora pagará " + base.get(i));
           }

           if(idClientes.get(i).startsWith("2")) {
               base.set(i, base.get(i)-200);
               System.out.println("El cliente " + clientes.get(i) + " con id " + idClientes.get(i)
                       + " tiene un descuento de 200 euros y ahora pagará " + base.get(i));
           }
       }
    }
}