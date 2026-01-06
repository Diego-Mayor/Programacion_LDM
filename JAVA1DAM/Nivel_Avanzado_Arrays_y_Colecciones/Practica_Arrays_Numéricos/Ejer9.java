package Nivel_Avanzado_Arrays_y_Colecciones.Practica_Arrays_Numéricos;

import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {
        /*9. Mostrar el array al revés
        Crea un array de 7 enteros (valores literales). Recórrelo y muestra sus elementos en orden inverso
        (del último al primero). */
        Scanner leer = new Scanner(System.in);
        int[] numeros = {1,2,3,4,5,6,7};

       
        System.out.println("Arrays en orden: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " ");
        }
         System.out.println("Arrays inverso: ");
        for (int i = 6; i >= 0; i--) {
             System.out.println(numeros[i]);
        }
    }
}
