package Nivel_Intermedio_Operadores_y_Condicionales;

import java.util.Scanner;

public class Ejer11 {
    public static void main(String[] args) {
        /*11. Porcentajes de hombres y mujeres. Escribe un programa que pida cuantas mujeres y
        hombres hay en un aula y muestre el porcentaje de mujeres y hombres que hay. También
        mostrará un mensaje indicando si hay más mujeres, o más hombres o si hay los mismos.*/

        Scanner leer = new Scanner(System.in);

        double women, man, total;
        double totalMujeres, totalHombres;

        System.out.println("Ingrese cuantas mujeres hay: ");
        women = leer.nextDouble();

        System.out.println("Ingrese cuantos hombres hay: ");
        man = leer.nextDouble();

        total = man + women;

        totalMujeres = women / total * 100;
        totalHombres = man / total * 100;

        if(totalMujeres > totalHombres){
            System.out.println("Hay mas mujeres." + totalMujeres);
        }else if(totalHombres > totalMujeres) {
            System.out.println("Hay mas hombres." + totalHombres);
        }else {
            System.out.println("Son iguales.");
        }
    }
}
