package EuromillonesCodigo;

import java.util.*;

public class Euromillones {
    public static void main(String[] args) {
        System.out.println("Generando primeras 10 combinaciones...");
        mostrarPrimerasCombinaciones(10);
    }

    public static void mostrarPrimerasCombinaciones(int limite) {
        long totalNums = combinatoria(50, 5);
        long totalEst = combinatoria(12, 2);

        System.out.println("Números: " + totalNums + " combinaciones");
        System.out.println("Estrellas: " + totalEst + " combinaciones");
        System.out.println("TOTAL: " + (totalNums * totalEst));

        // Ejemplo simple: primeras combinaciones “en orden” (no aleatorias)
        List<List<Integer>> primerasNums = generarPrimerasCombinaciones(50, 5, limite);
        List<List<Integer>> primerasEst = generarPrimerasCombinaciones(12, 2, limite);

        for (int i = 0; i < limite; i++) {
            List<Integer> num = primerasNums.get(i % primerasNums.size());
            List<Integer> est = primerasEst.get(i % primerasEst.size());
            System.out.printf("Comb %d: %s + %s%n", i + 1, num, est);
        }
    }

    public static List<List<Integer>> generarPrimerasCombinaciones(int n, int k, int limite) {
        List<List<Integer>> result = new ArrayList<>();
        backtrackLimit(new ArrayList<>(), result, 1, n, k, limite);
        return result;
    }

    private static void backtrackLimit(List<Integer> current, List<List<Integer>> result,
                                       int start, int n, int k, int limite) {
        if (result.size() >= limite) return;

        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= n; i++) {
            current.add(i);
            backtrackLimit(current, result, i + 1, n, k, limite);
            current.remove(current.size() - 1);

            if (result.size() >= limite) return;
        }
    }

    private static long combinatoria(long n, long k) {
        if (k > n - k) k = n - k;
        long res = 1;
        for (int i = 0; i < k; i++) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
}
