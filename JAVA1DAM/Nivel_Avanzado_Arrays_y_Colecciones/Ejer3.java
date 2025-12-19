package Nivel_Avanzado_Arrays_y_Colecciones;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int suma = 0;
        int[] num = new int[5]; // Array de 5 elementos

        // Pedir los números al usuario
        for (int i = 0; i < num.length; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            num[i] = leer.nextInt();
        }

        // Mostrar los números ingresados
        System.out.println("\nNúmeros ingresados:");
        for (int i = 0; i < num.length; i++) {
            System.out.println("[" + num[i] + "]");
        }

        // Sumar los números
        for (int i = 0; i < num.length; i++) {
            suma += num[i];
        }

        System.out.println("SUMA TOTAL: " + suma);

        leer.close();
    }
}
