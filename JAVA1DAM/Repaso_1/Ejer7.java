package Repaso_1;

public class Ejer7 {
    public static void main(String[] args) {
        /*Ejercicio 2: Comparar palabras con letras iguales al inicio
        Instrucciones:
        Crea dos palabras: "cama" y "casa".
        Compara con compareTo().
        Observa qué letra decide el orden y muestra un mensaje indicando cuál va primero.
        Objetivo: practicar la comparación letra por letra. */
        String palabra1 = "cama".toLowerCase();
        String palabra2 = "casa".toLowerCase();

        
        if(palabra1.compareTo(palabra2 ) < 0){
            System.out.println("La palabra que va primero es: " + palabra1);
        }else if(palabra1.compareTo(palabra2 ) > 0){
            System.out.println("La palabra que va primero es: " + palabra2);
        }
        for (int i = 0; i < palabra1.length() && i < palabra2.length(); i++) {
    if (palabra1.charAt(i) != palabra2.charAt(i)) {
        System.out.println("La letra que decide el orden es: " + palabra1.charAt(i));
        break;
    }
    }
    }
}   