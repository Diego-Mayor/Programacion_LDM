package Reto_Entrega;

import java.util.Random;
import java.util.Scanner;

public class Piedra_Papel_Tijera {

    public static void main(String[] args) {
        System.out.println("Juego de piedra, papel o tijera");
        jugarPartida();
    }

    // Método principal del juego
    public static void jugarPartida() {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        String jugador1;
        String robotina;
        int puntoJ1 = 0, puntoJ2 = 0, empate = 0;
        int rondas = 0;

        String terminar = "salir";

        while (true) {
            // pedir jugada
            jugador1 = jugadaUsuario(leer);

            if (jugador1.equalsIgnoreCase(terminar)) {
                System.out.println("\nJuego terminado.");
                break;
            }
            // jugada de la máquina
            robotina = turnoRobotina(random);

            rondas++;
            System.out.println("\nRonda " + rondas + ":");
            System.out.println("Jugador: " + jugador1);
            System.out.println("Robotina: " + robotina);

            int resultado = ganador_Empate(jugador1, robotina);

            if (resultado == 0) {
                empate++;
            } else if (resultado == 1) {
                puntoJ1++;
            } else {
                puntoJ2++;
            }

            System.out.println("\nMarcador actual:");
            System.out.println("Jugador uno: " + puntoJ1 + " | Robotina: " + puntoJ2 + " | Empates: " + empate);
            System.out.println("------------------------------------------------\n");
        }

        // Mostrar resultado final
        System.out.println("\n=== Resultado Final ===");
        System.out.println("Jugador uno: " + puntoJ1 + " | Robotina: " + puntoJ2 + " | Empates: " + empate);

        if (puntoJ1 > puntoJ2) {
            System.out.println(" ¡Ganaste el juego!");
        } else if (puntoJ1 < puntoJ2) {
            System.out.println(" Robotina gana el juego.");
        } else {
            System.out.println("🔸 Empate general.");
        }


    }

    // Jugada del usuario
    public static String jugadaUsuario(Scanner leer) {
        System.out.print("Elige (piedra, papel o tijera) o escribe 'salir': ");
        String jugada = leer.nextLine().trim().toLowerCase();

        while (!jugada.equals("piedra") && !jugada.equals("papel") && !jugada.equals("tijera") && !jugada.equals("salir")) {
            System.out.println(" Opción no válida. Intenta de nuevo.");
            System.out.print("Elige (piedra, papel o tijera): ");
            jugada = leer.nextLine().trim().toLowerCase();
        }

        return jugada;
    }

    // Jugada aleatoria de la máquina
    public static String turnoRobotina(Random random) {
        int maquina = random.nextInt(3);
        String robotina = " ";

        if (maquina == 0) {
            robotina = "piedra";
        } else if (maquina == 1) {
            robotina = "papel";
        } else {
            robotina = "tijera";
        }

        return robotina;
    }

    // Determina el ganador o empate
    // Devuelve 0 = empate, 1 = gana jugador, 2 = gana robotina
    public static int ganador_Empate(String jugador1, String robotina) {
        if (jugador1.equalsIgnoreCase(robotina)) {
            System.out.println("🔸 Empate, nadie suma puntos.");
            return 0;
        } else if (
            jugador1.equalsIgnoreCase("piedra") && robotina.equalsIgnoreCase("tijera") ||
            jugador1.equalsIgnoreCase("papel") && robotina.equalsIgnoreCase("piedra") ||
            jugador1.equalsIgnoreCase("tijera") && robotina.equalsIgnoreCase("papel")
        ) {
            System.out.println(" Gana jugador uno.");
            return 1;
        } else {
            System.out.println(" Gana Robotina.");
            return 2;
        }
    }
}
