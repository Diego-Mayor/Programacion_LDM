package Nivel_Intermedio_Operadores_y_Condicionales;

import java.util.Scanner;

public class Ejer12 {
    public static void main(String[] args) {
        /*12. Días del mes. Realiza un programa que pida el mes como un número entero entre uno y
        doce e imprima el número de días que tiene dicho mes.*/

        Scanner leer = new Scanner(System.in);

        int mes;

        System.out.println("Ingrese el número del mes (1-12): ");
        mes = leer.nextInt();

        switch (mes){
            case 1:
                System.out.println("ENERO TIENE 31 DIAS");
                break;
            case 2:
                System.out.println("FEBRERO TIENE 28 DIAS");
                break;
            case 3:
                System.out.println("MARZO TIENE 31 DIAS");
                break;
            case 4:
                System.out.println("ABRIL TIENE 30 DIAS");
                break;
            case 5:System.out.println("MAYO TIENE 31 DIAS");
                break;
            case 6:
                System.out.println("JUNIO TIENE 30 DIAS");
                break;
            case 7:
                System.out.println("JULIO TIENE 31 DIAS");
                break;
            case 8:
                System.out.println("AGOSTO TIENE 31 DIAS");
                break;
            case 9:
                System.out.println("SEPTIEMBRE TIENE 30 DIAS");
                break;
            case 10:
                System.out.println("OCTUBRE TIENE 31 DIAS");
                break;
            case 11:
                System.out.println("NOVIEMBRE TIENE 30 DIAS");
                break;
            case 12:
                System.out.println("DICIEMBRE TIENE 31 DIAS");
                break;
            default:
                System.out.println("\"NUMERO MAL INGRESADO. DEBE SER ENTRE 1 Y 12.\"");
        }
    }
}
