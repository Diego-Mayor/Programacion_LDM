package Nivel_Avanzado_Arrays_y_Colecciones.Practica_Arrays_Strgn;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        /*2. Buscar un nombre en la lista
        Pide al usuario que introduzca 5 nombres y guárdalos en un array de String. Después, pide al
        usuario un nombre a buscar y muestra un mensaje indicando si ese nombre está o no está en el array.
        Ejemplo de salida:
        Introduce 5 nombres: ...
        Introduce un nombre a buscar: Ana
        Resultado: El nombre SÍ está en la lista. */
        Scanner leer = new Scanner(System.in);

        // arrays para guardar los 5 nombres
        String [] nombres = new String[5];

        int contador = 0;

        for (int i = 0; i < nombres.length; i++) {
            contador++;
            System.out.println("Ingresa  nombre a Guardar " + contador+":");
            nombres[i] = leer.nextLine();
        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Introduce el nombre a buscar: ");
            String buscar = leer.nextLine();
            if (nombres[i].equalsIgnoreCase(buscar)) {
                System.out.println("El nombre si esta en la lista");
                break;
            }else{
                System.out.println("el nombre no se ecuentra en la lista");
            }
        }

    }
}
