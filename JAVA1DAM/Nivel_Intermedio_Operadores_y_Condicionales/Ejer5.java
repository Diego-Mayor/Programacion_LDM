package Nivel_Intermedio_Operadores_y_Condicionales;

import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        /*Mayor o menor de edad. Escribe un programa que pide la edad por teclado y nos muestra
        el mensaje de “Eres mayor de edad” o el mensaje de “Eres menor de edad”.*/

        Scanner leer = new Scanner(System.in);

        int edad;


        System.out.println("Ingrese su edad para verificar si eres mayor o menor de edad: ");
        edad = leer.nextInt();

       if(edad >= 18){
           System.out.println("Eres mayor de edad.");
       }else {
           System.out.println("No eres mayor de edad.");
       }



    }
}
