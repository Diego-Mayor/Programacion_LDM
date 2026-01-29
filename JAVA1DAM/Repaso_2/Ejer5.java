package Repaso_2;

import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa la nota porfavor");
        int nota = leer.nextInt();

        if(nota >= 0 && nota < 5){
            System.out.println("Suspenso");
        }else if(nota >= 5 && nota <= 10){
            System.out.println("Aprovado");
        }

        if(nota > 6 && nota <= 8){
            System.out.println("Sobresaliente");
        }else if(nota > 8 && nota <= 10){
            System.out.println("Notable");
        }
        System.out.println("Las calificaciones no fueron dadas para manejar los tangos por ende manejo mi criterio");
    }
}
