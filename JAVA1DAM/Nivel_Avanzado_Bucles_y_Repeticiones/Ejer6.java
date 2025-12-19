package Nivel_Avanzado_Bucles_y_Repeticiones;

import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {
        /*6. Escribe un programa que muestre la suma de los números del A al B (valores que indica el
        usuario, supondremos que A >= B), solo de los que números que sean mayores que 10.*/

        // A -> B

        Scanner leer = new Scanner(System.in);

        int a,b,suma = 0;

        System.out.println("Ingrese el primer número (A):");
        a = leer.nextInt();

        System.out.println("Ingrese el segundo número (B):");
        b = leer.nextInt();

        for (int i = a; i <= b; i++){
            if (i > 10){
                suma += i;
            }
        }
        System.out.println(suma);
        }
    }

