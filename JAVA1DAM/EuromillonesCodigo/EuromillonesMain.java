package EuromillonesCodigo;

import java.util.*;

public class EuromillonesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== EUROMILLONES GENERATOR ===");
            System.out.println("1. Generar boletos aleatorios");
            System.out.println("2. Ver estadísticas totales");
            System.out.println("3. Salir");
            System.out.print("Elige (1-3): ");

            int opcion;
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine(); // limpiar
                System.out.println("Debes escribir un número.");
                continue;
            }

            switch (opcion) {
                case 1 -> {
                    System.out.print("¿Cuántos boletos? ");
                    int cant;
                    try {
                        cant = sc.nextInt();
                        if (cant <= 0) {
                            System.out.println("La cantidad debe ser > 0.");
                            continue;
                        }
                    } catch (InputMismatchException e) {
                        sc.nextLine();
                        System.out.println("Debes escribir un número.");
                        continue;
                    }
                    generarAleatorios(cant);
                }
                case 2 -> mostrarEstadisticas();
                case 3 -> {
                    System.out.println("Saliendo...");
                    sc.close();
                    System.exit(0);
                }
                default -> System.out.println("Opción inválida");
            }
        }
    }

    private static void generarAleatorios(int cantidad) {
        Random rand = new Random();
        for (int i = 1; i <= cantidad; i++) {
            List<Integer> nums = generarNumeros(rand);
            List<Integer> est = generarEstrellas(rand);
            System.out.printf("Boleto %d: %s + Estrellas %s%n", i, nums, est);
        }
    }

    private static List<Integer> generarNumeros(Random rand) {
        Set<Integer> set = new HashSet<>();
        while (set.size() < 5) set.add(rand.nextInt(50) + 1);

        List<Integer> lista = new ArrayList<>(set);
        Collections.sort(lista);
        return lista;
    }

    private static List<Integer> generarEstrellas(Random rand) {
        Set<Integer> set = new HashSet<>();
        while (set.size() < 2) set.add(rand.nextInt(12) + 1);

        List<Integer> lista = new ArrayList<>(set);
        Collections.sort(lista);
        return lista;
    }

    private static void mostrarEstadisticas() {
        long nums = combinatoria(50, 5);
        long est = combinatoria(12, 2);
        System.out.printf("Combinaciones números (C(50,5)): %d%n", nums);
        System.out.printf("Combinaciones estrellas (C(12,2)): %d%n", est);
        System.out.printf("TOTAL POSIBLES: %d%n", nums * est);
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
