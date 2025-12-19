package Nivel_Intermedio_Operadores_y_Condicionales;

import java.util.Scanner;

public class Ejer12D1 {
    public static void main(String[] args) {
        /*12. Días del mes. Realiza un programa que pida el mes como un número entero entre uno y
        doce e imprima el número de días que tiene dicho mes.*/

        Scanner leer = new Scanner(System.in);


        System.out.println("ingresa numero del mes: ");
        int mes = leer.nextInt();

    int [] diasDelMes = {31,29,31,30,31,30,31,31,30,31,30,31};
    String[] nombreDelMes = {"ENERO","FREBREO","MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};

        if (mes < 1 || mes > 12){
            System.out.println("Número fuera del rango de meses");
    }else {
            System.out.println("El mes es " + nombreDelMes[mes - 1]);
            System.out.println("Tiene " + diasDelMes[mes - 1] + " días.");
    }
    }

}
