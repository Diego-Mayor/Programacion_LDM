package Nivel_Avanzado_Control_de_Flujo;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        /*3. Operaciones combinadas con asignación. Escribe un algoritmo que lea un número y
        realice las siguientes operaciones en orden:

        a) súmale 5 (+=)
        b) multiplícalo por 3 (*=)
        c) réstale 7 (-=) Muestra el resultado final.*/

        Scanner leer = new Scanner(System.in);

        System.out.println("Sumar 5");
        int suma = leer.nextInt();

        System.out.println("La Suma es: ");
        suma+=5;
        System.out.println(suma);


        System.out.println("Multiplicar por 3: ");
        int multiplicar = leer.nextInt();

        System.out.println("La Multiplicacion es: ");
        multiplicar*=3;
        System.out.println(multiplicar);



        System.out.println("Restarle 7: ");
        int resta = leer.nextInt();

        System.out.println("Resta: ");
        resta-=7;
        System.out.println(resta);


    }
}
