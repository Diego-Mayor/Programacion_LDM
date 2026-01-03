package Repaso_1;

import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        /*Pide números al usuario hasta que escriba 0 y muestra la suma total. */
        Scanner leer = new Scanner(System.in);
        int numero, suma = 0;       
        do {
            System.out.print("Introduce un número (0 para terminar): ");
            numero = leer.nextInt();
            suma += numero;
        } while (numero != 0);
        System.out.println("La suma total es: " + suma);
        
    }
}
