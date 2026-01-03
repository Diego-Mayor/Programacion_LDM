package Nivel_Avanzado_Arrays_y_Colecciones.Practica_Arrays_Strgn;

import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        /*5. Comprobar si una lista de palabras está ordenada alfabéticamente
        Pide al usuario que introduzca 7 palabras y guárdalas en un array de String. Debes comprobar si las
        palabras están ordenadas en orden alfabético ascendente (de la “A” a la “Z”).
        El programa debe mostrar si las palabras están o no están ordenadas alfabéticamente.
        Pista: compara cada palabra con la siguiente usando compareTo(). */

        Scanner leer = new Scanner(System.in);

        String [] palabras = new String[7];

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Ingresa la palabras " + (i + 1) + ": ");
            palabras[i]=  leer.nextLine().toLowerCase();

        }
        /*Ahora toca recorrer el array para comparar cada palabra con la siguiente y decidir si el orden se rompe o no, usando una variable booleana. */
        boolean ordenadas = true;
        for (int i = 0; i < palabras.length; i++) {
            if (i < palabras.length - 1) {
                if (palabras[i].compareTo(palabras[i + 1]) > 0) {
                    ordenadas = false;
                    break;
                }
        if (ordenadas) {
            System.out.println("Las palabras están ordenadas alfabéticamente.");
        } else {
            System.out.println("Las palabras no están ordenadas alfabéticamente.");
        }
}
        }}}