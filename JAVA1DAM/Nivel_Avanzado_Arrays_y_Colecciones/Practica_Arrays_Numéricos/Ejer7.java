package Nivel_Avanzado_Arrays_y_Colecciones.Practica_Arrays_Numéricos;

import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) {
        /*7. Buscar un número dentro del array
        Pide al usuario que introduzca 8 números y guárdalos en un array. Luego pide un número adicional
        y muestra si ese número está o no está dentro del array. Implementa el método:
        // Devuelve la posición de a en la que aparece b por primera vez,
        // si no aparece devuelve -1
        static int indiceDe(int[] a, int b) */
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa 8 valor a guardar en el arrays");
        int [] numeros = new  int[8];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= leer.nextInt();
        }
        System.out.println("Ingresa un numero a buscar en el array");
        int numBuscado = leer.nextInt();
        int resultado = indiceDe(numeros, numBuscado);
        if (resultado == -1) {
            System.out.println("Resultado de la busqueda: -1");
        } else {
            System.out.println("Resultado de la busqueda: "  + resultado);
        }       

    
    }
    public static int indiceDe(int[] a, int b){
        for (int i = 0; i < a.length; i++) {
            if(a[i] == b)
                return i;
        
        }
        return -1;
    }
}