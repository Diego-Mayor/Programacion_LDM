package Nivel_Experto_Desafios_y_Juegos_Lio;

import java.util.Scanner;

public class Reto_B_BarraDeVidaVideoJuego {
    public static void main(String[] args) {
        /*Enunciado
        Jugador con 100 puntos de vida. Se van leyendo daños (enteros ≥ 0) y se restan a la vida hasta que
        la vida sea ≤ 0. Al final, muestra “KO en X golpes” y la vida final (≤ 0).
        Sugerencias didácticas
        • Bucle REPETIR…MIENTRAS (al menos un golpe).
        • Variables: vida=100, golpe, golpes.
        Casos de prueba
        • Golpes: 20, 30, 60 → KO en 3 (vida final -10).
        • Golpes: 100 → KO en 1.*/

        Scanner leer = new Scanner(System.in);

        System.out.println("Juego de golpes ");

        int vida = 100, golpes = 0, daño, contador = 0;

        do {
            contador += 1;
            System.out.println("Ingrese golpes: ");
            daño = leer.nextInt();

            vida -= daño;
            golpes += daño;

        }while(vida > 0);

        System.out.println("KO en X  " + "Tienes de vida: " + vida  + " | " + "Daño recibido: " + golpes + " Golpes recibidos: " + contador );

    }
}
