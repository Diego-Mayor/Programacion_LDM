package Simulacro_Examen;

import java.util.Scanner;

public class Ejer3 {

    public static void main(String[] args) {
        char[][] mapa = {
                {'.', '.', 'T', '.'},
                {'X', '.', 'X', '.'},
                {'.', 'T', '.', 'X'},
                {'.', '.', '.', 'P'}
        };

        int resultado = simularExploracionInteractiva(mapa);
        System.out.println("\nResultado final: " + resultado);
    }

    public static int simularExploracionInteractiva(char[][] mapa) {
        Scanner sc = new Scanner(System.in);

        int fila = 0;
        int col = 0;
        int tesoros = 0;

        imprimirLeyenda();
        System.out.println("\nInicio:");
        imprimirMapaConJugador(mapa, fila, col);

        while (true) {
            System.out.print("\nIntroduce movimiento (W/A/S/D, Q=diagonal arriba-izq, E=diagonal abajo-der, X=salir): ");
            String entrada = sc.nextLine().trim().toUpperCase();

            if (entrada.isEmpty()) continue;

            char mov = entrada.charAt(0);

            if (mov == 'X') { // salir (ojo: aquí X es "salir" del teclado, no pared del mapa)
                System.out.println("Has salido del juego.");
                return tesoros;
            }

            int filaAnt = fila;
            int colAnt = col;

            switch (mov) {
                case 'W': fila--; break;
                case 'S': fila++; break;
                case 'A': col--; break;
                case 'D': col++; break;
                case 'Q': fila--; col--; break;
                case 'E': fila++; col++; break;
                default:
                    System.out.println("Movimiento inválido. Usa W/A/S/D (o Q/E).");
                    continue;
            }

            // fuera del mapa
            if (!esPosicionValida(mapa, fila, col)) {
                System.out.println("Te saliste del mapa. Fin.");
                return -1;
            }

            char casilla = mapa[fila][col];

            // pared
            if (casilla == 'X') {
                System.out.println("Hay una pared (X). No puedes pasar. Te quedas en tu sitio.");
                fila = filaAnt;
                col = colAnt;
                imprimirMapaConJugador(mapa, fila, col);
                continue;
            }

            // tesoro
            if (casilla == 'T') {
                tesoros++;
                mapa[fila][col] = '.';
                System.out.println("¡Encontraste un tesoro! Total: " + tesoros);
            }

            // imprimir tablero tras moverse
            imprimirMapaConJugador(mapa, fila, col);

            // meta
            if (casilla == 'P') {
                System.out.println("¡Llegaste a P! Fin.");
                return tesoros;
            }
        }
    }

    public static boolean esPosicionValida(char[][] mapa, int f, int c) {
        return f >= 0 && f < mapa.length && c >= 0 && c < mapa[0].length;
    }

    public static void imprimirLeyenda() {
        System.out.println("LEYENDA DEL TABLERO:");
        System.out.println("  .  = camino libre");
        System.out.println("  X  = pared (no puedes pasar)");
        System.out.println("  T  = tesoro (se suma 1)");
        System.out.println("  P  = meta / salida");
        System.out.println("  @  = jugador (tu posición)");
        System.out.println("\nCONTROLES:");
        System.out.println("  W = arriba, S = abajo, A = izquierda, D = derecha");
        System.out.println("  Q = diagonal arriba-izquierda, E = diagonal abajo-derecha");
        System.out.println("  X = salir del juego (solo teclado)");
    }

    public static void imprimirMapaConJugador(char[][] mapa, int filaJ, int colJ) {
        for (int f = 0; f < mapa.length; f++) {
            for (int c = 0; c < mapa[0].length; c++) {
                if (f == filaJ && c == colJ) System.out.print("@ ");
                else System.out.print(mapa[f][c] + " ");
            }
            System.out.println();
        }
    }
}
