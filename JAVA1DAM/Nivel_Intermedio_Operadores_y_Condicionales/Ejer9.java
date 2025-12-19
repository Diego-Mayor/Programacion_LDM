package Nivel_Intermedio_Operadores_y_Condicionales;

import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {
        /*9. El día de la semana. Escribe un programa que pida el día de la semana (del 1 al 7) y
        muestre por pantalla el día correspondiente (lunes, martes...). Si introducimos otro número
        mostrará un mensaje de error.*/

        Scanner leer = new Scanner(System.in);

        int dia;

        System.out.println("Ingrese el dia de la semana: ");
        dia = leer.nextInt();

        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Eror de numero");
        }
    }
}
