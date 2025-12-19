package Nivel_Avanzado_Bucles_y_Repeticiones;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        /*3. Escribe un programa que muestre los números del A al B (valores que indica el usuario,
        supondremos que A >= B) de 2 en 2.*/

        Scanner leer = new Scanner(System.in);

        int a,b;

        System.out.println("Ingrese el primer número (A):");
        a = leer.nextInt();

        System.out.println("Ingrese el segundo número (B):");
        b = leer.nextInt();

        if (a >= b){
            while (a >= b){
                System.out.println(a);
                a-=2;
            }
        }else {
            System.out.println("A debe ser mayor que B");

        }

        leer.close();


    }
}
