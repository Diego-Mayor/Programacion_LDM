package Nivel_Experto_Desafios_y_Juegos_Lio;

import java.util.Scanner;

public class Reto_C_PiedraPapelOTijeraMejorDe3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Juego de Piedra, Papel o Tijera (Mejor de 3)\n");

        int j1puntos = 0, j2puntos = 0, rondasJugadas = 0;

        // Se juega hasta que uno llegue a 2 puntos o se jueguen 3 rondas

        while (j1puntos < 3 && j2puntos < 3 && rondasJugadas < 3) {
            System.out.print("Jugador 1 (piedra/papel/tijera): ");
            String j1 = leer.nextLine();

            System.out.print("Jugador 2 (piedra/papel/tijera): ");
            String j2 = leer.nextLine();

            if (j1.equalsIgnoreCase(j2)) {
                System.out.println("Empate, no suma puntos.");
            } else if ((j1.equalsIgnoreCase("piedra") && j2.equalsIgnoreCase("tijera")) ||
                            (j1.equalsIgnoreCase("papel") && j2.equalsIgnoreCase("piedra")) ||
                            (j1.equalsIgnoreCase("tijera") && j2.equalsIgnoreCase("papel"))
            ) {
                j1puntos++;
                System.out.println("Jugador 1 gana la ronda!");
            } else {
                j2puntos++;
                System.out.println("Jugador 2 gana la ronda!");
            }

            rondasJugadas++;
            System.out.println("Marcador: J1 " + j1puntos + " - J2 " + j2puntos + "\n");
        }

        // Resultado final
        if (j1puntos > j2puntos) {
            System.out.println(" ¡Jugador 1 gana el juego!");
        } else if (j2puntos > j1puntos) {
            System.out.println(" ¡Jugador 2 gana el juego!");
        } else {
            System.out.println(" Empate en el mejor de 3.");
        }
    }
}
