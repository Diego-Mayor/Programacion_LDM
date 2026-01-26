package BPrimiticaCodigo;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Primitiva {

    private static final int NUMEROS_POR_BOLETO = 6;
    private static final int MAX_NUMERO = 49;

    public static void main(String[] args) {
        int cantidadBoletos = 5;

        for (int i = 1; i <= cantidadBoletos; i++) {
            System.out.println("Boleto " + i + ": " + generarBoleto());
        }
    }

    public static String generarBoleto() {
        Random random = new Random();
        Set<Integer> numeros = new HashSet<>();

        while (numeros.size() < NUMEROS_POR_BOLETO) {
            numeros.add(random.nextInt(MAX_NUMERO) + 1);
        }

        Set<Integer> ordenados = new TreeSet<>(numeros);
        int reintegro = random.nextInt(10);

        return ordenados + " | Reintegro: " + reintegro;
    }
}
