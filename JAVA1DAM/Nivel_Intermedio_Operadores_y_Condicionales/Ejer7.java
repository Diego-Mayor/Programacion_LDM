package Nivel_Intermedio_Operadores_y_Condicionales;

import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) {

        /*7. Mayor o iguales. Escribe un programa que pida 2 números enteros y muestre el mayor. Si
        son iguales, deberá mostrar el mensaje “Son iguales”.*/

        Scanner leer = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Ingresar  numero1: ");
        numero1 = leer.nextInt();

        System.out.println("Ingresar  numero2: ");
        numero2 = leer.nextInt();

        if (numero1 == numero2){
            System.out.println("Son iguales.");
        } else if (numero1 > numero2) {
            System.out.println("numero1 es mayor:  " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("numero2 es mayor: " + numero2);
        }
    }
}
