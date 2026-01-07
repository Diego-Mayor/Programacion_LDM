package Nivel_Avanzado_Arrays_y_Colecciones.Practica_Matrices;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        /*3. Sumas por filas y columnas.
        Pide F y C, crea una matriz F×C con números enteros leídos por teclado. Muestra la matriz y
        calcula: a) La suma de cada fila (vector de F elementos). b) La suma de cada columna (vector de C
        elementos). Muestra ambos vectores.
        Métodos sugeridos:
        static int[][] leerMatriz(Scanner sc, int f, int c)
        static int[] sumaFilas(int[][] m)
        static int[] sumaColumnas(int[][] m)
        static void imprimirMatriz(int[][] m)
        static void imprimirVector(int[] v) */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa f: ");
        int f = leer.nextInt();
        System.out.println("Ingresa c: ");
        int c = leer.nextInt();
        int[][] matriz = leerMatriz(leer, f, c);
        int[] filas = sumaFilas(matriz);




    }
    public static int[][] leerMatriz(Scanner leer, int f, int c){
        int[][] matris = new int[f][c];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print("ingresa los datos del arrays" + " " + i + " :");
                matris[i][j] = leer.nextInt();
            }
        }
        return matris;
    }
    public static int[] sumaFilas(int[][] m){
        int[] sumaFilas = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                sumaFilas[i] += m[i][j];
            }
        }
        return sumaFilas(m);

    }
    public static int[] sumaColumnas(int[][] m){
        int[] sumarColumnas = new int[m.length];
        for (int i = 0; i < sumarColumnas.length; i++) {
            for (int j = 0; j < sumarColumnas.length; j++) {
                sumarColumnas[j] += m[i][j];
            }
        }
        return sumarColumnas;
    }
    public static void imprimirMatriz(int[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println(m[i][j]);
            }
        }

    }
    public static void imprimirVector(int[] v){

    }

}
