package Nivel_Basico_Calculos_Simples;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        /*Perímetro de un rectángulo. Escribe un algoritmo que calcule el perímetro de un
        rectángulo a partir de la base y la altura.*/

        Scanner leer = new Scanner(System.in);

        int perimetro, altura, base;

        System.out.println("Ingresar Base");
        base = leer.nextInt();

        System.out.println("Ingresar Altura");
        altura = leer.nextInt();

        perimetro = (base * 2)  + (altura * 2);

        System.out.println("Area de un rectangulo es: " + perimetro);

    }
}
