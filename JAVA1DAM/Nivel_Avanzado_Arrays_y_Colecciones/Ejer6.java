package Nivel_Avanzado_Arrays_y_Colecciones;

public class Ejer6 {
    public static void main(String[] args) {
        /*Cambia el segundo elemento de un array por otro valor.*/

        int [] numeros = {10,12,12,13,14,15,15};
        
        numeros[1] = 11;
        numeros[6] = 16;

        for (int i : numeros) {
            System.out.println(i);
        }

    }
}