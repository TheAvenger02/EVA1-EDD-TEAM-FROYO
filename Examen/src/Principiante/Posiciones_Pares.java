
package Principiante;

/**
 *
 * @author Froyo
 */
public class Posiciones_Pares {
            
 // Función que llena un arreglo con números enteros entre 1 y 100.
    public static void llenar(int[] arreglo) {
        
        // Creamos variable que determina los números pares.
        int numPar;
                        
        // Ciclo que determina si un la posición en el arreglo es par o no.
        for (int i = 0; i < arreglo.length; i++) {
            if(i %2 == 0){
               do {                
                numPar = (int)((Math.random() * 100) + 1); // Los valores aleatorios se guardan en la variable numPar.
                } while  (numPar % 2 != 0 && numPar != 0); // Mientras el residuo del número sea diferente de 0, el do seguirá generando números.
                arreglo[i] = numPar; // Cuando se genere un número par, se va a guardar dentro del arreglo. 
            }
            else{
                arreglo[i] = (int)((Math.random() * 100) + 1);
            }                                              
        }
    }
    
    // Función que imprime un arreglo.
    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[ " + arreglo[i]+ " ]");
        }
        System.out.println("");
    }
}