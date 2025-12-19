package Nivel_Intermedio_Operadores_y_Condicionales;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        /*2. El mayor de dos números. Escribe un programa que pida 2 números enteros y muestre el
        mayor.*/

        Scanner leer = new Scanner(System.in);

        int num1,num2;

        System.out.println("Ingresar numero 1: ");
        num1 = leer.nextInt();

        System.out.println("Ingresar numero 2: ");
        num2 = leer.nextInt();

        if (num1 > num2){
            System.out.println("Es mayor el numero " + num1);
        } else if (num2 > num1) {
            System.out.println("Es mayor el numero " + num2);
        } else if (num1 == num2) {
            System.out.println("Son numeros iguales");
        }

    }
}
