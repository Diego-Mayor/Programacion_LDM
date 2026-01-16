package Practica_Logica_Progrmacion;

import java.util.Scanner;

public class Logica1 {
    public static void main(String[] args) {
        /*🟢 Nivel básico (pensar en pasos y condiciones)
        1️⃣ Par o impar
        👉 Escribe un programa que reciba un número y diga si es par o impar.
        Pista lógica:
        Si el número % 2 == 0 → par
        Si no → impar */

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa un numero para saber si es par o impar");
        int num = leer.nextInt();

        int resultado;
        if(num < 0 ){
           System.out.println("el numero no puede ser negativo");
        }else if(num % 2 > 0){
            System.out.println("es impar");
        }else if (num % 2 == 0){
             System.out.println("el numero es par");
        }
    }
}
