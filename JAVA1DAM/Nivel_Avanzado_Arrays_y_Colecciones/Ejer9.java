package Nivel_Avanzado_Arrays_y_Colecciones;

import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {
        /*Crea un array vacío y agrega tres elementos nuevos uno por uno.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("============================================");
        System.out.println("Ingresa los numeros a guardar");
        int num = leer.nextInt();

        System.out.println("============================================");

        int [] numeros = new int[num];// tamaño o dara el usuario

        for (int i = 0; i < num; i++) {
            System.out.println("Ingres los valores del arrays");
            int llenar = leer.nextInt();
            numeros[i] = llenar;
            System.out.println();


        }
        System.out.println(numeros);

    }
}
