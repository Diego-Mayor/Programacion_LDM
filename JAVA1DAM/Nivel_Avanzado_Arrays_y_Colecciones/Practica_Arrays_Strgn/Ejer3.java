package Nivel_Avanzado_Arrays_y_Colecciones.Practica_Arrays_Strgn;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        /*3. Contar cuántos nombres empiezan por una letra
        Pide al usuario que introduzca 8 nombres y guárdalos en un array de String. Luego, pide una letra
        (por ejemplo, 'A') y muestra cuántos nombres empiezan por esa letra, sin distinguir entre
        mayúsculas y minúsculas. Ejemplo:
        Introduce 8 nombres: ...
        Introduce una letra: A
        Hay 3 nombres que empiezan por 'A'. */


        Scanner leer = new Scanner(System.in);

        // creo en arrays de 8 posiciones
        String [] nombres = new String[8];

        int contador = 0;

        for (int i = 0; i < nombres.length; i++) {
            contador++;
            System.out.println("Ingresa los nombres " + contador + ":" );
            nombres[i] = leer.nextLine();
        }

        System.out.println("Ingresa la inicial del nombre a buscar:");
        String letra = leer.nextLine();
        int cantidad = 0;

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].toLowerCase().startsWith(letra)) {
                cantidad++;
            }
        }
        System.out.println("Hay " + cantidad + " Nombres que empiezan por: " + letra);



    }
}
