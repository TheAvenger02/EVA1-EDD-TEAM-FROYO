package Intermedios;

import java.util.Scanner;

/**
 *
 * @author Froyo
 */
public class Borrar_Valores {
    
    public static void eliminar(int[] arreglo){
        int c = 0, auxiliar = 0;

        System.out.println("Tu arreglo inicial es: ");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 99) + 1;
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
        System.out.println("¿Qué número desea eliminar?");
        Scanner sc = new Scanner(System.in);
        int eliminar = sc.nextInt();

        for (int i = 0; i < arreglo.length; i++) {
            if (eliminar == arreglo[i]) {
                arreglo[i] = 0;
            }
        }
        System.out.println("Tu arreglo final es: ");

        for (int i = 0; i < arreglo.length; i++) {
            
            if(arreglo[i]!= 0){
            System.out.print(arreglo[i] + " ");
            }
        }
    }
}

/* Generar un arreglo de 15 posiciones, y llenarlo de valores random mayores a 0, ya que el 0 indicará espacio vacío.
Posteriormente se le deberá mostrar al usuario y preguntar qué número se desea eliminar.
Se borrarán todas las posibles repeticiones del número indicado y se deben recorrer los valores dentro del arreglo.

Por ejemplo (de 15 posiciones):
5 - 45 - 8 - 9 - 45 - 82 - 63 - 17 - 84 - 12 - 15 - 5 - 65 - 48 - 93

¿Qué número desea eliminar?
45

5 - 8 - 9 - 82 - 63 - 17 - 84 - 12 - 15 - 5 - 65 - 48 - 93 - 0 - 0
 */