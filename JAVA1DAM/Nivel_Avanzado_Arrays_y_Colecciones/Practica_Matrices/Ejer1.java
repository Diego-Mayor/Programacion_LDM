package Nivel_Avanzado_Arrays_y_Colecciones.Practica_Matrices;

public class Ejer1 {
    public static void main(String[] args) {
        /*Crear y mostrar una matriz
        Crea una matriz de 3×4 de enteros con valores literales y muéstrala por pantalla en formato tabla
        (filas en líneas separadas, valores alineados).
        Métodos sugeridos:
        static void imprimirMatriz(int[][] m)
        static int[][] matrizEjemplo() (opcional: devuelve la matriz fija para pruebas) */
        int[][] matriz = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println("Matriz de ejemplo:");
        imprimirMatriz(matriz);               


    }
    public static void imprimirMatriz(int[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }            System.out.println();
        }
    }

}
