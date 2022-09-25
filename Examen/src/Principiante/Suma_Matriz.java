package Principiante;
import java.util.Scanner;
/**
 *
 * @author Froyo
 */
public class Suma_Matriz {
    // Función que llena un matriz con valores de teclado.
    public static void llenar(int[][] matriz) {
        Scanner sc = new Scanner(System.in);
            for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                System.out.println("Introduzca el elemento [" + x + "," + y + "]");
                matriz[x][y] = sc.nextInt();
            }
            }
    }
    
    public static void imprimirMatriz(int[][] matriz) {
        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz[y].length; x++) {
                System.out.printf("%d ", matriz[y][x]);
            }
            System.out.println();
        }
    }

    public static void sumaFilas(int[][] matriz) {
        for (int y = 0; y < matriz.length; y++) {
            int suma = 0;
            for (int x = 0; x < matriz[y].length; x++) {
                System.out.printf("%d ", matriz[y][x]);
                suma += matriz[y][x];
            }
            System.out.printf("= %d\n", suma);
        }
    }

    public static void sumaColumnas(int[][] matriz) {
        // Imprimir la matriz normalmente
        imprimirMatriz(matriz);
        // Debajo de ella imprimir una línea divisora
        for (int x = 0; x < matriz[0].length; x++) {
            System.out.print("___");
        }
        System.out.println();
        // Luego recorrer por columna y sumar
        for (int x = 0; x < matriz[0].length; x++) {
            int suma = 0;
            for (int y = 0; y < matriz.length; y++) {
                suma += matriz[y][x];
            }
            System.out.printf("%d ", suma);
        }
        System.out.println();
    }
}