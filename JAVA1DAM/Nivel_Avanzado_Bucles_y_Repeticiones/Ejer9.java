package Nivel_Avanzado_Bucles_y_Repeticiones;

import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {
        /*9. Escribe un programa que muestre el resultado de multiplicar los números del A al B (valores
        que indica el usuario, supondremos que A >= B).*/

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los valores a multiplicar de a hasta b");
        int a = leer.nextInt();
        int b = leer.nextInt();
        

        int mult = 1;


        for(int i = a; i <= b; i++){
            mult *= i;
        }
        System.out.println(mult);

    }
}
