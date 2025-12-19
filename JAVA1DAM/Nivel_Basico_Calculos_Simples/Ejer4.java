package Nivel_Basico_Calculos_Simples;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        /*4. Promedio de dos números. Escribe un algoritmo que calcule el promedio de dos números
        introducidos por el usuario.*/

        Scanner leer = new Scanner(System.in);

        double num1,num2,promedio;

        System.out.println("Ingrese numero 1: ");
        num1 = leer.nextDouble();

        System.out.println("Ingrese numero 2: ");
        num2 = leer.nextDouble();

        promedio = (num1 + num2) / 2;

        System.out.println("El promedio es: " + promedio);

    }
}
