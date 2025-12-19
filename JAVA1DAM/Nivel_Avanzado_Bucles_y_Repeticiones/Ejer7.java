package Nivel_Avanzado_Bucles_y_Repeticiones;

import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) {
        /*7. Escribe un programa que muestre la suma de los números del A al B (valores que indica el
        usuario, supondremos que A >= B), solo de los números que sean múltiplos de 5.*/


        Scanner leer = new Scanner(System.in);

        int a,b,suma = 0;

        System.out.println("Ingrese el primer número (A):");
        a = leer.nextInt();

        System.out.println("Ingrese el segundo número (B):");
        b = leer.nextInt();

        for (int i = a; i <= b; i++){
            if (i % 5 == 0){
                suma+=i;
            }
        }
        System.out.println(suma);
    }

}
