package Principiante;
import java.util.Scanner;
import java.util.Arrays;

/**
 * @author Froyo
 */

public class Comparación {
    
    // Función que pide al usuario valores enteros y los guarda en el arreglo.
    public static void guardarNum(int[] arreglo) {
         
        // Creamos variable que guarda los datos introducidos.
        int num;
        Scanner input = new Scanner(System.in);
         
        for (int i = 0; i < arreglo.length; i++) {
            // Pedimos al usuario que introduzca la cantidad de números deseado.
            System.out.println("Introduce un número entero: ");
                num = input.nextInt();
            arreglo[i] = num;
        }        
    }
    
    // Función que imprime el arreglo.
    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[ " + arreglo[i]+ " ]");
        }
        System.out.println("");
    }

    // Función que compara si los dos arreglos son iguales o no.
    public static void comparar(int[] arreglo1, int[] arreglo2) {
        if (Arrays.equals(arreglo1, arreglo2)) {
            System.out.println("Los arreglos son iguales.");
        } else {
            System.out.println("Los arreglos son diferentes.");
        }
    }
}
