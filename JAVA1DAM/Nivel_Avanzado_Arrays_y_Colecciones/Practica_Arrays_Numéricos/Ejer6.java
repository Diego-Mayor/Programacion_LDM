package Nivel_Avanzado_Arrays_y_Colecciones.Practica_Arrays_Numéricos;

public class Ejer6 {
    public static void main(String[] args) {
        /*6. Array de booleanos
        Crea un array de 6 valores booleanos con valores alternados true y false. Recórrelo e imprime por
        pantalla el número total de valores true. Implementa el método:
        // Devuelve un array de tamaño n con true/false alternos
        static boolean[] alternarBooleanos(int n) */
        int n = 6;

        boolean [] mortrar = alternarBooleanos(n);
        System.out.println("Array de booleanos:");
        System.out.println(java.util.Arrays.toString(mortrar));
        int contador = 0;
        for (int i = 0; i < mortrar.length; i++) {
            if (mortrar[i] == true) {
                contador++;
            }
        }
        System.out.println("Número total de valores true: " + contador);
    }
    public static boolean [] alternarBooleanos(int n){
        boolean [] verdaderoFalse = new boolean[n];

        for (int i = 0; i < verdaderoFalse.length; i++) {
            if(i == 0 || i % 2 == 0)
            verdaderoFalse[i] = true;
        else{
            verdaderoFalse[i]= false;
        }
    }
        return verdaderoFalse;
    }
}
