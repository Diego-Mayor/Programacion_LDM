package Nivel_Creacion_De_Metodos;

import java.util.Scanner;

public class Metodo_TablaMultiplicar {
    public static void main(String[] args) {
        /*Utiliza el método anterior para que, dado un número, calcule su tabla de
        multiplicar del 1 al 10. */

        mostrarTabla(dato());
    }

    public static int dato(){
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int dato = leer.nextInt();

        return dato;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static void mostrarTabla(int numero) {
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = multiplicar(numero, i); 
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
