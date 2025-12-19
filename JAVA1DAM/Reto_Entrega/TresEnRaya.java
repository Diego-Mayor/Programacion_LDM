package Reto_Entrega;

import java.util.Random;
import java.util.Scanner;

public class TresEnRaya {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================================================");
        System.out.println("=== Juego Tres En Raya ===");
        System.out.println("====================================================================\n");

        String tablero = tamañoTablero(); // "123456789"
        char ganador = ' ';

        // Bucle principal del juego
        while (ganador == ' ' && !tableroLleno(tablero)) {

            // ------------------------------
            // Turno del usuario
            // ------------------------------
            int movimientoUsuario;
            do {
                mostrarTablero(tablero);
                movimientoUsuario = jugadaUsuario(sc);
                if (!esCasillaLibre(tablero, movimientoUsuario)) {
                    System.out.println("Casilla ocupada. Elige otra.");
                }
            } while (!esCasillaLibre(tablero, movimientoUsuario));

            tablero = marcarCasilla(movimientoUsuario, tablero, 'X');

            // Verificar si el usuario ganó
            ganador = comprobarGanador(tablero);
            if (ganador != ' ' || tableroLleno(tablero)) break;

            // ------------------------------
            // Turno de la máquina
            // ------------------------------
            System.out.println("\nTurno de la máquina...");
            tablero = jugadaMaquina(tablero);
        }

        // Mostrar tablero final y resultado
        mostrarTablero(tablero);
        System.out.println("====================================================================");
        if (ganador == 'X') {
            System.out.println("¡Gana el usuario!");
        } else if (ganador == 'O') {
            System.out.println("¡Gana la máquina!");
        } else {
            System.out.println("¡Empate!");
        }
        System.out.println("====================================================================");

        sc.close();
    }

    // Devuelve el tablero inicial
    public static String tamañoTablero() {
        return "123456789";
    }

    // Muestra el tablero en 3x3 con líneas de separación
    public static void mostrarTablero(String tablero){
        System.out.println("\n===================================");
        System.out.println(tablero.charAt(0)+" | " + tablero.charAt(1) + " | " + tablero.charAt(2));
        System.out.println("---------");
        System.out.println(tablero.charAt(3)+" | " + tablero.charAt(4) + " | " + tablero.charAt(5));
        System.out.println("---------");
        System.out.println(tablero.charAt(6)+" | " + tablero.charAt(7) + " | " + tablero.charAt(8));
        System.out.println("===================================\n");
    }

    // Pide al usuario su movimiento
    public static int jugadaUsuario(Scanner sc) {
        System.out.print("Ingresa tu movimiento (1-9): ");
        return sc.nextInt();
    }

    // Marca una casilla con la marca indicada ('X' o 'O')
    public static String marcarCasilla(int pos, String tablero, char marca) {
        int indice = pos - 1; // convertir 1–9 a 0–8
        String left = tablero.substring(0, indice);
        String right = tablero.substring(indice + 1);
        return left + marca + right;
    }

    // Comprueba si la casilla está libre
    public static boolean esCasillaLibre(String tablero, int pos) {
        int indice = pos - 1;
        char casilla = tablero.charAt(indice);
        return (casilla != 'X' && casilla != 'O');
    }

    // Turno de la máquina
    public static String jugadaMaquina(String tablero) {
        Random random = new Random();
        int pos;

        // Elegir una casilla libre
        do {
            pos = random.nextInt(9) + 1; // 1-9
        } while (!esCasillaLibre(tablero, pos));

        // Marcar la casilla libre con 'O'
        tablero = marcarCasilla(pos, tablero, 'O');

        return tablero; // devolver tablero actualizado
    }

    // Comprueba si hay ganador
    public static char comprobarGanador(String tablero) {
        // Filas
        if (tablero.charAt(0) == tablero.charAt(1) && tablero.charAt(1) == tablero.charAt(2)) return tablero.charAt(0);
        if (tablero.charAt(3) == tablero.charAt(4) && tablero.charAt(4) == tablero.charAt(5)) return tablero.charAt(3);
        if (tablero.charAt(6) == tablero.charAt(7) && tablero.charAt(7) == tablero.charAt(8)) return tablero.charAt(6);

        // Columnas
        if (tablero.charAt(0) == tablero.charAt(3) && tablero.charAt(3) == tablero.charAt(6)) return tablero.charAt(0);
        if (tablero.charAt(1) == tablero.charAt(4) && tablero.charAt(4) == tablero.charAt(7)) return tablero.charAt(1);
        if (tablero.charAt(2) == tablero.charAt(5) && tablero.charAt(5) == tablero.charAt(8)) return tablero.charAt(2);

        // Diagonales
        if (tablero.charAt(0) == tablero.charAt(4) && tablero.charAt(4) == tablero.charAt(8)) return tablero.charAt(0);
        if (tablero.charAt(2) == tablero.charAt(4) && tablero.charAt(4) == tablero.charAt(6)) return tablero.charAt(2);

        // Si nadie ha ganado todavía
        return ' ';
    }

    // Comprueba si el tablero está lleno (empate)
    public static boolean tableroLleno(String tablero) {
        for (int i = 0; i < 9; i++) {
            char c = tablero.charAt(i);
            if (c != 'X' && c != 'O') {
                return false; // hay al menos una casilla libre
            }
        }
        return true; // todas las casillas ocupadas
    }
}
