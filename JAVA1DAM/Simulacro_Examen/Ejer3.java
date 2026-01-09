package Simulacro_Examen;

public class Ejer3 {
    public static void main(String[] args) {
        // creamos el Arrays de mapa 
        char [][] mapa = {{'.', '.', 'T', '.'},
                          {'X', '.', 'X', '.'},
                          {'.', 'T', '.', 'X'},
                          {'.', '.', '.', 'P'}};

        // creo el array de movimientos
        char[] movimientos = {'W','S','A','D'};

        
    }

    public static int simularExploracion(char[][] mapa, char[] movimientos){
        int fila = 0;
        int columna = 0;
        int contadorTesoro = 0;

        for (int i = 0; i < movimientos.length; i++) {
            switch (movimientos[i]) {
                case 'W': // Arriba
                    fila--;
                    break;
                case 'S': // Abajo
                    fila++;
                    break; 
                case 'A':
                    columna--; // Izquierda
                    break;
                case 'D': // Derecha
                    columna++;
                    break;
                case 'Q': // Diagonal Arriba
                    fila--; // Sube
                    columna--; // Va a la Izquierda
                    break;
                case 'E': // Diagonal Abajo
                    fila++; //  Baja
                    columna++; // Va a la dereha                    
                    break;
            }
            if (!esPosicionValida(mapa, fila, columna)) {
            System.out.println("Te saliste del mapa");
            return -1;
        }
        char actual = mapa[fila][columna];
        }
    }

    public static boolean esPosicionValida(char[][] mapa, int f, int c){
        return (f >= 0 && f < mapa.length && c >= 0 && c < mapa[0].length);
    }
}
