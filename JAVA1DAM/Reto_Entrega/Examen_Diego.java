package Reto_Entrega;

import java.util.Scanner;

public class Examen_Diego {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int dia, mes;

        System.out.print("Ingresa el día: ");
        dia = leer.nextInt();

        System.out.print("Ingresa el mes: ");
        mes = leer.nextInt();

        System.out.println("====================");
        System.out.println("La estación es " + calcularEstacion(dia, mes));
    }

    public static String calcularEstacion(int dia, int mes) {

        // Validación básica de mes
        if (mes < 1 || mes > 12) {
            return "Error: mes inválido";
        }

        // Validación básica de día
        if (dia < 1 || dia > 31) {
            return "Error: día inválido";
        }

        // Estaciones por mes
        if (mes >= 3 && mes <= 5) {
            return "Primavera";
        } else if (mes >= 6 && mes <= 8) {
            return "Verano";
        } else if (mes >= 9 && mes <= 11) {
            return "Otoño";
        } else {
            return "Invierno";
        }
    }
}
