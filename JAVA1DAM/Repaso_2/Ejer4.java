package Repaso_2;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrsar edad: ");
        int edad = leer.nextInt();

        if(edad < 18){
            System.out.println("Es menor de edad.");
        }else if(edad > 18 && edad < 65){
            System.out.println("Es mayor de edad.");
        }else if(edad >= 65){
            System.out.println("Es jubilado.");
        }
    }
}
