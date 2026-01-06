package Repaso_1;

public class Ejer8 {
    public static void main(String[] args) {
        /*Crea una matriz de 2×3 con valores literales.
        Recórrela y muéstrala por pantalla en formato tabla (filas en líneas separadas).
        👉 Objetivo:
        Aprender a usar m.length y m[i].length */
        int[][] numeros = new int[2][3];
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j]= (i + 1) * (j + 2);
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
    }
}
