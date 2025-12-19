package Reto_Entrega;
import java.util.Scanner;

public class Domino {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String movida = ingresajugada(leer);
        boolean sN = validarJugada(movida);

        System.out.println("jugada: " + movida + "  Validar movimiento: " + sN);
    }

    public static String ingresajugada(Scanner leer){
        return leer.nextLine();
    }

    public static boolean validarJugada(String fichas){

        for (int i = 0; i < fichas.length(); i++) {
            if (fichas.charAt(i) == '-') {

                // fin de ficha anterior
                char ultimo = fichas.charAt(i - 1);

                // inicio de la siguiente
                char primero = fichas.charAt(i + 1);
                if (ultimo != primero) {

                    // dominó NO válido
                    return false;
                }
            }
        }
        // dominó válido
        return true;
    }
}
