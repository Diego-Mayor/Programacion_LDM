package Repaso_2;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Igresar primer numero");
        int num1 = leer.nextInt();

        System.out.println("Ingresar sengundo numero");
        int num2 = leer.nextInt();

        if(num1 > num2){
            System.out.println("El primer numero es mayor:" + num1);
        }else if (num1 < num2) {
            System.out.println("El numero 2 en mayor");
           
        }else if(num1 == num2){
            System.out.println("Ambos numero ingresados son iguales");
        }
    }
}
