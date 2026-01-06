package Nivel_Avanzado_Arrays_y_Colecciones.Practica_Matrices;

public class Ejer2 {
    public static void main(String[] args) {
        /*2. Tablas de multiplicar en la matriz.
        Crea una matriz de tamaño 10×10 donde m[i][j] = (i+1) * (j+1) (tabla del 1 al 10). Muestra la matriz
        y, además, permite consultar el valor de m[a-1][b-1] para una pareja (a,b) que introduce el usuario.
        Métodos sugeridos:
        static int[][] tablasMultiplicar(int n)
        static void imprimirMatriz(int[][] m)
        static int valorTabla(int[][] m, int a, int b) */
        int n = 10;
        System.out.println("Tabla de multiplicar del 1 al 10:");
        int[][] matriz = tablasMultiplicar(n);
        imprimirMatriz(matriz);
        int a = 4;
        int b = 5;
        System.out.println("El valor de la tabla en la posicion (" + a + "," + b + ") es: " + valorTabla(matriz, a, b));
        
    }
    public static int[][] tablasMultiplicar(int n){
        int[][] matriz = new int[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (i + 1) * (j + 1);
            }
        }
        return matriz;
    }
    public static void imprimirMatriz(int[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int valorTabla(int[][] m, int a, int b){
        return m[a - 1][b - 1];
    }
}
