package Nivel_Intermedio_Operadores_y_Condicionales;

import java.util.Scanner;

public class Ejer8 {
    public static void main(String[] args) {
        /*8. El mayor de tres. Escribe un programa que lea tres números enteros y nos diga cuál es el
        mayor. */

        Scanner leer = new Scanner(System.in);

        int num1, num2, num3, mayor;

        System.out.println("Ingrese el primer numero.");
        num1 = leer.nextInt();

        System.out.println("Ingrese el segundo numero.");
        num2 = leer.nextInt();

        System.out.println("Ingrese el tercer numero.");
        num3 = leer.nextInt();

       mayor = Math.max(Math.max(num1, num2),num3);
        System.out.println("El numero mayor es: " + mayor);

    }
}
