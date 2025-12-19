package Nivel_Avanzado_Bucles_y_Repeticiones;

import java.util.Scanner;

public class Ejer8 {
    public static void main(String[] args) {
        /*8. Escribe un programa que muestre el resultado de multiplicar los números del 1 al 10.*/

        int suma = 1;
        for (int i = 1; i <= 10; i++) {
            suma *= i;
        }
        System.out.println(suma);
    }
}
