package Nivel_Avanzado_Bucles_y_Repeticiones;

import java.util.Scanner;

public class Ejer12 {
    public static void main(String[] args) {

    /*12. Escribe un programa que pida 5 números al usuario y muestre por pantalla cuántos de esos
    números son positivos y cuántos negativos.*/
    
        Scanner leer = new Scanner(System.in);

        int contador = 0;
        int positivos = 0;
        int negativos = 0;
        int num;

        do {
            System.out.print("Introduce un número: ");
            num = leer.nextInt();

            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            }

            contador++;

        } while (contador < 5);

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
    }
}
