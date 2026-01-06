package Nivel_Avanzado_Arrays_y_Colecciones.Practica_Arrays_Numéricos;

import java.util.Arrays;

public class Ejer5 {
    public static void main(String[] args) {
        /*5. Contar elementos que cumplen una condición
        Crea un array de N enteros con valores aleatorios entre MIN y MAX (valores que introduce el
        usuario). Cuenta cuántos números son pares y cuántos son impares. Muestra ambos resultados.
        Implementa los métodos:
        // Devuelve un nuevo array con n con valores aleatorios entre min y max
        static int[] generaAleatorios(int n, int min, int max)
        // Devuelve cuántos pares o impares hay en a
        static int contarParesImpares(int[] a, boolean pares) */
        int n = 20; // Tamaño del array
        int min = 1; // Valor mínimo
        int max = 100; // Valor máximo
        int [] aleatorios = generaAleatorios(n, min, max);
        int cantidadPares = contarParesImpares(aleatorios, true);
        int cantidadImpares = contarParesImpares(aleatorios, false);

        System.out.println("Números generados:");
        System.out.println(Arrays.toString(aleatorios));
        System.out.println("Cantidad de pares: " + cantidadPares);
        System.out.println("Cantidad de impares: " + cantidadImpares);

        
    }
    public static int [] generaAleatorios(int n , int min, int max){
        int [] aleatorios = new int[n];
        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = (int)(Math.random() * (max - min + 1));
        }
        return aleatorios;
    }


    public static int contarParesImpares(int [] a, boolean pares){
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if (pares) {  // quieres contar pares
                if (a[i] % 2 == 0) {
                    contador++;
                }
            } else {      // quieres contar impares
                if (a[i] % 2 != 0) {
                    contador++;
                }
            }
        }
        return contador;
    }
}
