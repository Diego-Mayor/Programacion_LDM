package Nivel_Avanzado_Arrays_y_Colecciones;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        /* 🧠 Ejercicio 2: Leer y mostrar números desde teclado
           1. Pide al usuario que ingrese 5 números enteros.
           2. Guarda esos números en un array.
           3. Muestra todos los números ingresados en el mismo orden.
        */

        Scanner leer = new Scanner(System.in);

        // Crear un array de 5 enteros
        int[] numeros = new int[5];

        // Llenar el array con los valores ingresados por el usuario
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = leer.nextInt(); // Guarda el número en la posición i
        }

        System.out.println("\nLos números ingresados son:");
        
        // Mostrar los valores del array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        leer.close(); // Cerrar el scanner (buena práctica)
    }
}
