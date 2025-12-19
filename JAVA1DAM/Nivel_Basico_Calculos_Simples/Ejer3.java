package Nivel_Basico_Calculos_Simples;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        /*3. Celsius a Fahrenheit. Escribe un algoritmo que convierta una temperatura en grados
        Celsius a grados Fahrenheit. F = C × 9 / 5 + 32.*/

        Scanner leer = new Scanner(System.in);

        int grados,fahrenheit;

        System.out.println("Ingrese los grados: ");
        grados = leer.nextInt();

        fahrenheit = ((grados * 9) / 5) + 32;

        System.out.println("La conversion de grados a fahrenheit: " + fahrenheit);


    }
}
