package Repaso_2;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar primer numero: ");
        int num = leer.nextInt();

        if(num % 2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }
}
