package Nivel_Basico_Calculos_Simples;

import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
     /*5. Nota media de 4 asignaturas. Escribe un algoritmo que calcule la nota media de un alumno
     que ha cursado 4 asignaturas.*/

        Scanner leer = new Scanner(System.in);

        double nota1,nota2,nota3,nota4,promedio,cuantasAsignaturasSon = 0;

        System.out.println("Ingrese nota 1: ");
        nota1 = leer.nextDouble();

        System.out.println("Ingrese nota 2: ");
        nota2 = leer.nextDouble();

        System.out.println("Ingrese nota 3: ");
        nota3 = leer.nextDouble();

        System.out.println("Ingrese nota 4: ");
        nota4 = leer.nextDouble();

        System.out.println("Cantidad de Asignaturas: ");
        cuantasAsignaturasSon = leer.nextDouble();

        promedio = (nota1 + nota2 + nota3 + nota4) / cuantasAsignaturasSon;

        System.out.println("El promedio es: " + promedio);

    }
}
