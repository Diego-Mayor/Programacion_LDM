package Repaso_1;

import java.util.Scanner;

public class Ejer16 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese A: ");
        int a = leer.nextInt();

        System.out.println("Ingrese B: ");
        int b = leer.nextInt();

        int resultado = 1; // clave: empezar en 1

        for (int i = 0; i < b; i++) {
            resultado *= a;
        }

        System.out.println("El valor de A elevado a la potencia de B es: " + resultado);
    }
}
