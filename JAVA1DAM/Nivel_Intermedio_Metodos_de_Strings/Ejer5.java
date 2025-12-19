package Nivel_Intermedio_Metodos_de_Strings;

public class Ejer5 {
    public static void main(String[] args) {
        /*5. Crea un programa que dadas una frase F, una palabra P1 y otra palabra P2. mostrará F
        sustituyendo todas las ocurrencias de P1 por P2. */

        String f = "Tenemos mas clases de Ingles y Base de datos";
        String p1 = "Ingles";
        String p2 = "Progrmamcion";

        System.out.println("CADENA ORIGINAL: " + f);
        System.out.println("Cadena modificada: " + f.replace(p1, p2));
        
    }
}
