package Repaso_1;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        /*Pide un número al usuario y muestra su tabla de multiplicar (1 al 10). */
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para ver su tabla de multiplicar: ");
        int numero = sc.nextInt();
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
