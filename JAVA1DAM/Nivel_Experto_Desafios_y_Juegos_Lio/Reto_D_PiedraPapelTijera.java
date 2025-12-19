package Nivel_Experto_Desafios_y_Juegos_Lio;

import java.util.Random;
import java.util.Scanner;

public class Reto_D_PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String jugador1 = " ";
        Random maquiRandom = new Random();
        String terminar = "salir";
        String robotina = " ";
        int puntoj1 = 0, puntoj2 = 0, maquina = 0, rondas = 0, empate = 0;

        while (!jugador1.equalsIgnoreCase(terminar)) {
            rondas++;

            System.out.println("------------------------------------------------");
            // turno del jugador1
            System.out.println("jugador uno: " + "ronda = " + rondas);
            jugador1 = leer.nextLine();

            if (jugador1.equalsIgnoreCase(terminar)) {
                break;
            }

            System.out.println("-----------------------------------------------");

            maquina = maquiRandom.nextInt(3);

            // turno de la maquina robotina
            System.out.println("Jugador Virtual: " + "ronda = " + rondas);
            if (maquina == 0) {
                robotina = "piedra";
            } else if (maquina == 1) {
                robotina = "papel";
            } else if (maquina == 2) {
                robotina = "tijera";
            }
            System.out.println(robotina);

            System.out.println("------------------------------------------------");

            // Ganador y empate
            if (jugador1.equalsIgnoreCase(robotina)) {
                empate++;
                System.out.println("Empate, no suma puntos.");
            } else if (
                jugador1.equalsIgnoreCase("piedra") && robotina.equalsIgnoreCase("tijera") ||
                jugador1.equalsIgnoreCase("papel") && robotina.equalsIgnoreCase("piedra") ||
                jugador1.equalsIgnoreCase("tijera") && robotina.equalsIgnoreCase("papel")
            ) {
                puntoj1++;
                System.out.println("Gana jugador uno.");
            } else {
                puntoj2++;
                System.out.println("Gana robotina.");
            }

            System.out.println("Puntos jugador uno: " + puntoj1 +
                " Vs Puntos robotina: " + puntoj2 +
                " --- Empates: " + empate);
        }

        // Mensaje final al terminar el juego
        System.out.println("\nJuego terminado!");
        System.out.println("Total de rondas jugadas: " + rondas);
        System.out.println("Marcador final -> Jugador uno: " + puntoj1 +
            " | Robotina: " + puntoj2 +
            " | Empates: " + empate);
    }
}
