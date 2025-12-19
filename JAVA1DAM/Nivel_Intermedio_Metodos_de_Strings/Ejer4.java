package Nivel_Intermedio_Metodos_de_Strings;

public class Ejer4 {
    public static void main(String[] args) {
         /*4. Crea un programa que, dadas dos cadenas de texto: una frase F y una palabra P, muestre por
        pantalla:
        • Si F contiene P.
        • Si F empieza por P.
        • Si F termina por P. */

        String f = "Hola mundo";
        String p = "Mundo";

        System.out.println("Cadena F contine cadena P: " + f.contains(p));
        System.out.println("Cadena F empieza por P: " + f.startsWith(p));
        System.out.println("Cadena F termina con la cadena P: " + f.endsWith(p));
    }

    
}