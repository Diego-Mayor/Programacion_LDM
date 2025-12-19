package Nivel_Avanzado_Arrays_y_Colecciones.Practica_Arrays_Numéricos;

import java.net.Socket;
import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        /*2. Leer un array por teclado
        Declara un array de 6 enteros. Pide al usuario que introduzca los números con Scanner y guárdalos
        en el array. Después, muéstralos todos en una sola línea. */
        Scanner leer = new Scanner(System.in);

        int [] numero = new int[6];

        System.out.println("Ingresa los valores a ingresar");
        for (int i = 0; i < numero.length; i++) {
            numero[i] = leer.nextInt();
        }

        System.out.println("Los numeros guardados son: ");
        for (int i = 0; i < numero.length; i++) {
            System.out.println( numero[i]);
        }

    }
}
