package Nivel_Intermedio_Metodos_de_Strings; 

public class Ejer1 {
    public static void main(String[] args) {
        /*1. Crea un programa que, dada una cadena de texto (se introducirá directamente en una
        variable), la muestre tanto en mayúsculas como en minúsculas. */

        String texto = "Hola a todos";

        // pasar a minusculas

        String enMinusculas = texto.toLowerCase();

           System.out.println(enMinusculas);

        // pasar a mayusculas

        String enMayuscuylas = texto.toUpperCase();
        
            System.out.println(enMayuscuylas);
    }
}
