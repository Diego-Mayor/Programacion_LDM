package EuromillonesCodigo;

import java.util.*;
import java.util.stream.Collectors;

public class EuroMillonesAleatorio {
    public static void main(String[] args) {
        generar(1);
    }

    public static void generar(int cantidad) {
        Random rand = new Random();
        System.out.println("Generando " + cantidad + " combinaciones Euromillones:");
        System.out.println("=====================================");

        for (int i = 1; i <= cantidad; i++) {
            Set<Integer> numerosSet = new HashSet<>();
            while (numerosSet.size() < 5) {
                numerosSet.add(rand.nextInt(50) + 1);
            }
            List<Integer> numeros = numerosSet.stream()
                    .sorted()
                    .collect(Collectors.toList());

            Set<Integer> estrellasSet = new HashSet<>();
            while (estrellasSet.size() < 2) {
                estrellasSet.add(rand.nextInt(12) + 1);
            }
            List<Integer> estrellas = estrellasSet.stream()
                    .sorted()
                    .collect(Collectors.toList());

            System.out.printf("Boleto %d: %s + Estrellas %s%n",
                    i, numeros, estrellas);
        }
    }
}
