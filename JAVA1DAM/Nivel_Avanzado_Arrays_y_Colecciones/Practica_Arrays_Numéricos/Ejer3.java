package Nivel_Avanzado_Arrays_y_Colecciones.Practica_Arrays_Numéricos;

public class Ejer3 {
    public static void main(String[] args) {
        /*3. Sumar todos los valores
        Crea un array de 8 enteros con valores literales. Recórrelo y muestra la suma total de todos los
        números. */

        int [] enteros = {5,4,6,8,8,4,8,1};
        int suma = 0;
        for (int i = 0; i < enteros.length; i++) {
            suma +=enteros[i];
        }
        System.out.println(suma);
    }
}
