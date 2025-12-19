package Nivel_Avanzado_Arrays_y_Colecciones.Practica_Arrays_Numéricos;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[] numeroUsuario = new int[10];

        System.out.println("Ingresa los valores a guardar:");
        for (int i = 0; i < numeroUsuario.length; i++) {
            numeroUsuario[i] = leer.nextInt();
        }

        int max = maximo(numeroUsuario);
        int min = minimo(numeroUsuario);

        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
    }

    public static int maximo(int[] a) {
        int maximo = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > maximo) {
                maximo = a[i];
            }
        }
        return maximo;
    }
        public static int minimo(int[] a) {
        int minimo = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < minimo) {
                minimo = a[i];
            }
        }
        return minimo;
    }
}
