package Nivel_Intermedio_Metodos_de_Strings;

public class Ejer8 {
    public static void main(String[] args) {
        /*Ejercicio 1: Cuenta vocales
        Dado un String, cuenta cuántas vocales tiene.
        Debes usar: charAt(), length()

        Salida esperada:
        "El texto tiene 4 vocales." */

        String saludo = "Hola buenos dias";

         int contador = 0;
        for (int i = 0; i < saludo.length(); i++) {
            char c = saludo.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
                contador++;
            }
        }
        System.out.println("tiene " + contador + " Vocales ");
    }
}
