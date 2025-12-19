package Nivel_Basico_Calculos_Simples;

import java.util.Scanner;

public class Ejer8 {
    public static void main(String[] args) {
        /*8. Conversión euros a dólares. Escribe un algoritmo que convierta una cantidad en euros a
        dólares, conociendo el valor del tipo de cambio.*/

        Scanner leer = new Scanner(System.in);

        double dolar,euro,conversion;

        System.out.println("Ingrese el valor del dolar: ");
        dolar = leer.nextDouble();

        System.out.println("Ingresar cuantos euros quieres cambiar: ");
        euro = leer.nextDouble();

        conversion = euro * dolar;

        System.out.println("Los dolares a recibir son: " + conversion);



    }
}
