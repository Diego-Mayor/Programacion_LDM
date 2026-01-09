package Simulacro_Examen;

public class Ejer2 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Ejercicio 2: recorridoDeSanta");

        int[][] mapa = {
            {1, 0, 2},
            {3, 4, 1},
            {0, 2, 5}
        };

        char[] movimientos = {'D', 'S', 'S', 'D'};

        int resultado = recorridoDeSanta(mapa, movimientos);
        System.out.println("El método devuelve: " + resultado);
    }

    public static int recorridoDeSanta(int[][] mapa, char[] movimientos) {
        int fila = 0;
        int columna = 0;

        System.out.print("Recorrido: Inicio  (0,0)");

        for (int i = 0; i < movimientos.length; i++) {
            switch (movimientos[i]) {
                case 'W': fila--; break;
                case 'S': fila++; break;
                case 'A': columna--; break;
                case 'D': columna++; break;
            }

            // Comprobar si se sale del mapa
            if (fila < 0 || fila >= mapa.length || columna < 0 || columna >= mapa[0].length) {
                System.out.println("  (" + fila + "," + columna + ") X fuera del mapa");
                return -1;
            }

            System.out.print(" (" + fila + "," + columna + ")");
        }

        System.out.println();
        System.out.println("En la posición final (" + fila + "," + columna + 
                           ") hay " + mapa[fila][columna] + " niños.");

        return mapa[fila][columna];
    }
}
