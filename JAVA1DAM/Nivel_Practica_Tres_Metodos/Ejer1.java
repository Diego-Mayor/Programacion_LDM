package Nivel_Practica_Tres_Metodos;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        /*Escribe un programa que pida dos números reales por teclado y muestre por pantalla el resultado de
        multiplicarlos. Implementa y utiliza la función: */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el primer valor: ");
        double num1 = leer.nextInt();

        System.out.println("Ingresa el segundo valor: ");
        double num2 = leer.nextInt();

        double resultado = Multiplica(num1, num2);

        System.out.println("El resultado de la multiplicacion: " + resultado);


    }
    public static double Multiplica(double a, double b){
        return a*b;
    }
        
}
