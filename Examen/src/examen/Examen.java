package examen;
import Intermedios.Borrar_Valores;
import Intermedios.Insertar_Valores;
import Principiante.Filtrar_Valores;
import Principiante.Comparación;
import Principiante.Posiciones_Pares;
import Principiante.Suma_Matriz;

/**
 *
 * @author Froyo
 */

public class Examen {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {   
        //                      Problema 1. Filtrar valores.
        
        // Creamos un arreglo con 15 enteros.
        int arregloPar[] = new int[15];
        
        // Llamada a función llenar.
        Filtrar_Valores.llenar(arregloPar);
        
        // Llamada a función imprimir.
        System.out.println("Arreglo de 15 enteros con números pares.");
        Filtrar_Valores.imprimir(arregloPar);
        System.out.println("");
        
        //                      Problema 2. Comparar arreglos.
        
        // Creamos dos arreglos con 10 enteros c/u.
        int arregloIgual1[] = new int[10];
        int arregloIgual2[] = new int[10];
        
        // Llamamos a la función guardarNum.
        System.out.println("Primer arreglo.");
        Principiante.Comparación.guardarNum(arregloIgual1);
        System.out.println("");
        
        System.out.println("Segundo arreglo.");
        Principiante.Comparación.guardarNum(arregloIgual2);
        System.out.println("");
        
        // Llamamos a la función imprimir.
        System.out.println("Primer arreglo.");
        Principiante.Comparación.imprimir(arregloIgual1);
        System.out.println("Segundo arreglo.");
        Principiante.Comparación.imprimir(arregloIgual2);
        System.out.println("");
        
        // Llamamos a la función comparar.
        Principiante.Comparación.comparar(arregloIgual1, arregloIgual2);
        System.out.println("");
        
        //                      Problema 3. Comparar arreglos similares.
        
        // Creamos dos arreglos con 10 enteros c/u.
        int arregloSim1[] = new int[10];
        int arregloSim2[] = new int[10];
        
        // Llamada a función guardarNum.
        System.out.println("Primer arreglo.");
        Principiante.Comparación_Similar.guardarNum(arregloSim1);
        System.out.println("");
        
        System.out.println("Segundo arreglo.");
        Principiante.Comparación_Similar.guardarNum(arregloSim2);
        System.out.println("");
        
        // Llamamos a la función imprimir.
        System.out.println("Primer arreglo");
        Principiante.Comparación_Similar.imprimir(arregloSim1);
        System.out.println("Segundo arreglo");
        Principiante.Comparación_Similar.imprimir(arregloSim2);
        System.out.println("");
        
        // Llamamos a la función compararSim.
        
        //                      Problema 5. Arreglo con Posiciones Pares.
        // Creamos un arreglo con 15 enteros.
        int arregloPosiciones[] = new int[15];
         // Llamada a función llenar.
        Posiciones_Pares.llenar(arregloPosiciones);
        
        // Llamada a función imprimir.
        System.out.println("Arreglo en donde las posiciones PARES, SOLO tienen valores PARES y en las IMPARES puede haber TANTO pares\n" +
        "como impares.");
        Posiciones_Pares.imprimir(arregloPosiciones);
        System.out.println("");
      
        //                      Problema 6. Verificar suma en matriz.

        int[][] matriz = new int[4][4];
        Suma_Matriz.llenar(matriz);
        System.out.println("La matriz es: ");
        Suma_Matriz.imprimirMatriz(matriz);
        System.out.println("Suma de filas:");
        Suma_Matriz.sumaFilas(matriz);
        System.out.println("Suma de columnas:");
        Suma_Matriz.sumaColumnas(matriz);
        
           
       //Intermedios
       
        //                      Problema 1. Insertar valores en arreglo.
       int[] arreglo = new int[15];
       Insertar_Valores.llenar(arreglo);
       
        //                      Problema 2. Borrar valores en arreglo.       
       int[] arregloVal = new int[15];
       Borrar_Valores.eliminar(arregloVal);
    }    
}