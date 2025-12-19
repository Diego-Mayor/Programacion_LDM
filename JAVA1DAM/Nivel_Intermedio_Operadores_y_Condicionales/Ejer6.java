package Nivel_Intermedio_Operadores_y_Condicionales;

import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {

        /*6. Positivo o negativo. Escribe un programa que pida un número y diga si es positivo o
        negativo. Consideraremos el cero como positivo.*/

        Scanner leer = new Scanner(System.in);

        int numero;


        System.out.println("Ingrese su edad para verificar si eres mayor o menor de edad: ");
        numero = leer.nextInt();

        if(numero > 0 ){
            System.out.println("Es positvo.");
        }else if (numero == 0){
            System.out.println("Es numero neutro.");
        }else {
            System.out.println("Es negativo");
        }

    }
}
