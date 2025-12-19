package Nivel_Intermedio_Operadores_y_Condicionales;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        /*3. Números en orden ascendente. Escribe un programa que lea dos números y los muestre en
        orden ascendente.*/


        Scanner leer = new Scanner(System.in);

        int num1,num2;


        System.out.println("Ingresar numero 1: ");
        num1 = leer.nextInt();

        System.out.println("Ingresar numero 2: ");
        num2 = leer.nextInt();

        if(num1 > num2){
            System.out.println("De menor a mayor: " + num2 + "," + num1);
        }else if (num2 > num1){
            System.out.println("De menor a mayor: " + num1 + "," + num2);
        }else {
            System.out.println("Son iguales. ");
        }


    }
}
