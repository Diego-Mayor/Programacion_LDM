package Nivel_Avanzado_Bucles_y_Repeticiones;

import java.util.Scanner;

public class Ejer10 {
    public static void main(String[] args) {
        /*10. Escribe un programa que muestre la suma de 5 precios que introduzca el usuario.*/

        Scanner leer = new Scanner(System.in);
        double suma = 0;
        
        System.out.println("Introduce 5 precios:");
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Precio " + i + ": ");
            double precio = leer.nextDouble();
            suma += precio;
        }
        
        System.out.println("La suma de los 5 precios es: " + suma);
        
    }
}


