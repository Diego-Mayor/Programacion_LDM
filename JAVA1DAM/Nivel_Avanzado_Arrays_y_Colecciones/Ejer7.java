package Nivel_Avanzado_Arrays_y_Colecciones;

import java.util.Arrays;

public class Ejer7 {
    public static void main(String[] args){
        int[] original = {1, 2, 3};
        int[] nuevo = new int[original.length + 1];

        for (int i = 0; i < original.length; i++) {
            nuevo[i] = original[i];
        }
        nuevo[nuevo.length - 1] = 4; // Agregar nuevo elemento al final

        original = nuevo;

         // Imprimir el array nuevo
        for (int num : nuevo) {
            System.out.println(num); 
            
        }
    }
}
