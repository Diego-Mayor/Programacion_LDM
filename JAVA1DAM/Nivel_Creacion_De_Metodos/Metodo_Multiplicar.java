package Nivel_Creacion_De_Metodos;

import java.util.Scanner;

public class Metodo_Multiplicar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1, num2;
        int res;

        System.out.println("Ingresa Primer Numero: ");
        num1 = leer.nextInt();

        System.out.println("Ingresa Segundo Numero: ");
        num2 = leer.nextInt();

        res = multiplicar(num1,num2);
        System.out.println(res);

    }

    public static int multiplicar(int a, int b){
        return a * b;
    }
    
}
