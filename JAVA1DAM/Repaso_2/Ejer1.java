package Repaso_2;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el numero");
        int num = leer.nextInt();

        if(num > 0){
            System.out.println("El numero es positivo: " + num);
        }else if(num < 0){
            System.out.println("El numero es negativo");
        }else if(num == 0 ){
            System.out.println("El cero es neutral");
        }
    }
}
