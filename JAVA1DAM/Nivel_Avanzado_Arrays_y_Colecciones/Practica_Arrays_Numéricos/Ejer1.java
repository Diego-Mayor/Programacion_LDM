package Nivel_Avanzado_Arrays_y_Colecciones.Practica_Arrays_Numéricos;

public class Ejer1 {
    public static void main(String[] args) {
        /*1. Crear y mostrar un array
        Crea un array de 5 enteros con valores literales a tu elección. Recórrelo con un bucle for y muestra
        todos sus elementos por pantalla. */

        System.out.println("Valores literals ingresado uno por uno");
        int [] valores = new int[4];

        valores [0] = 5;
        valores [1] = 6;
        valores [2] = 9;
        valores [3] = 1;

        System.out.println("Los pinto por pantalla uno a uno");

        System.out.println(valores [0]);
        System.out.println( valores [1]);
        System.out.println(valores [2]);
        System.out.println(valores [3]);

        System.out.println("los pinto por pantalla con un bucle");

        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }

    }
}
