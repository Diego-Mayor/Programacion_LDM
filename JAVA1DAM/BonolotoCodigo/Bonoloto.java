package BonolotoCodigo;

import java.util.*;

public class Bonoloto {
    public static void main(String[] args) {

        System.out.println("--- GENERACIÓN DE 10 BOLETOS BONOLOTO ---\n");

        for (int i = 1; i <= 1; i++) {
            Set<Integer> boleto = generarBoleto();
            int reintegro = new Random().nextInt(10);

            System.out.println("Boleto " + i + ": " + boleto + " | Reintegro: " + reintegro);
        }
    }

    // Genera un boleto con 6 números únicos del 1 al 49
    public static Set<Integer> generarBoleto() {
        Set<Integer> numeros = new TreeSet<>(); // TreeSet para que salgan ordenados
        Random random = new Random();

        while (numeros.size() < 6) {
            numeros.add(random.nextInt(49) + 1);
        }
        return numeros;
    }
}
