package Nivel_Avanzado_Arrays_y_Colecciones.Practica_Arrays_Strgn;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        /*4. Nombres más largos y más cortos
        Pide al usuario que introduzca 6 nombres de personas y guárdalos en un array de String. Al finalizar,
        el programa debe mostrar el nombre más corto y el más largo (y sus longitudes). Ejemplo:
        Nombre más corto: Ana (3 caracteres)
        Nombre más largo: Alejandro (9 caracteres) */

        Scanner leer = new Scanner(System.in);

        String [] nombres = new String[6];
        int contador = 0;

        for (int i = 0; i < nombres.length; i++) {
            contador++;
            System.out.println("Ingresa los nombres " + contador + ": ");
            nombres[i] = leer.nextLine();
        }

        int maslargo = nombres[0].length();
        int mascorto = nombres[0].length();

        for (int i = 1; i < nombres.length; i++) {
            int actual = nombres[i].length();

            if (actual < mascorto) {
                mascorto = actual;


            }else if (actual > maslargo) {
                maslargo = actual;
            }
        }
        System.out.println("Nombre mas largo: " +    + maslargo);
        System.out.println("Nombre mas corto: " + mascorto);


    }
}
