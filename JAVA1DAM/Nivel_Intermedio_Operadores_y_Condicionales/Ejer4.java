package Nivel_Intermedio_Operadores_y_Condicionales;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        /*4. Múltiplos. Escribe un programa que pida dos números (A y B) y muestre un mensaje por
        pantalla indicando si A es múltiplo de B.*/

        Scanner leer = new Scanner(System.in);

        // Variables
        int a,b;

        //Leer
        System.out.println("Ingresar numero 1: ");
        a = leer.nextInt();

        System.out.println("Ingresar numero 2: ");
        b = leer.nextInt();

        //Algoritmo


        if(b == 0){
            System.out.println("No se puede dividir por cero.");
        } else if(a % b == 0){
            System.out.println("Es multiplo.");
        }else{
            System.out.println("No es multiplo.");
        }
    }
}
