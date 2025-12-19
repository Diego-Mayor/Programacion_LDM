package Nivel_Avanzado_Arrays_y_Colecciones;

public class Ejer5 {
    public static void main(String[] args) {
        /*Muestra el primer y el último elemento de un array de números. */

        int [] numeros = {3,4,5,6,7,8,5,6,7};

        int i = 0;
        int j = numeros.length - 1;
        
        System.out.println(numeros[i]);
        System.out.println(numeros[j]);
    }
}