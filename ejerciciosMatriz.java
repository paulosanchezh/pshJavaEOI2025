import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //Matriz esquinas
        for (int i=0; i< matriz.length; i++){
            for (int j=0; j< matriz[i].length; j++){
                if(esEsquina(i,j,matriz.length))
                    matriz[i][j] = 1;
                else
                    matriz[i][j] = 0;
            }
        }

        //Matriz digonal inferior
        for (int i=0; i< matriz.length; i++){
            for (int j=0; j< matriz[i].length; j++){
                if(i >= j)
                    matriz[i][j] = 1;
                else
                    matriz[i][j] = 0;
            }
        }

        //Imprimir Matriz
        for (int i=0; i< matriz.length; i++){
            for (int j=0; j< matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean esEsquina(int i, int j, int n) {
        return (i % (n - 1) == 0 && j % (n - 1) == 0);
    }
}