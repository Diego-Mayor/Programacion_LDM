package Nivel_Avanzado_Control_de_Flujo;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        /*2. Suma acumulada. Escribe un algoritmo que lea un número y le sume otro usando +=. */

        Scanner leer = new Scanner(System.in);

        int sumar;


        System.out.println("ingrese su edad: ");
        sumar = leer.nextInt();


        sumar+= 30;


        System.out.println("Le sume 30 al valor i ngresado por el usuario con el operador += : " + sumar);






    }
}
