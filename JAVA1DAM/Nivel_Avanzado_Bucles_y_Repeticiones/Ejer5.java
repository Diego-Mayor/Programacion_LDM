package Nivel_Avanzado_Bucles_y_Repeticiones;

import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        /*5. Escribe un programa que muestre la suma de los números del A al B (valores que indica el
        usuario, supondremos que A >= B).*/

        Scanner leer = new Scanner(System.in);

        int a,b,suma = 0;

        System.out.println("Ingrese el primer número (A):");
        a = leer.nextInt();

        System.out.println("Ingrese el segundo número (B):");
        b = leer.nextInt();

        if (a > b){
            for (int i = b; i <= a; i++){
                suma += i;
            }

        }else {
            System.out.println("A debe ser mayor que B");
        }
        System.out.println(suma);
    }
}
