package Nivel_Avanzado_Control_de_Flujo;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        /*1. Incremento de edad. Escribe un algoritmo que lea la edad de una persona y muestre su
        edad al año siguiente usando el operador ++.*/

        Scanner leer = new Scanner(System.in);

        int edad;

        System.out.println("ingrese su edad: ");
        edad = leer.nextInt();

        edad++;

        System.out.println("Su nueva edad al año siguiente sea de: " +  edad);

    }
}
