package Nivel_Intermedio_Metodos_de_Strings;

import java.net.Socket;
import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) {
        /*Crea un programa que, dado un texto, muestre por pantalla todas las palabras en líneas
        distintas. Si tiene comas o puntos, no aparecerán tampoco */

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa la primera cadena: ");
        String cadena = leer.nextLine();

        System.out.println("Ingresa la segunda cadena");
        String cadena2 = leer.nextLine();

        
        String p2 = "PRIMERO DE DAM";

        System.out.println("----------------- EJEMPLO 1 ----------------------");

        // pasar a minusculas

        String enMinusculas = cadena.toLowerCase();

           System.out.println(enMinusculas);

        // pasar a mayusculas

        String enMayuscuylas = cadena.toUpperCase();
        
            System.out.println(enMayuscuylas);


        System.out.println("----------------- EJEMPLO 2 ----------------------");

       

        System.out.println("Son iguales :" + cadena.equals(cadena2));
        System.out.println("Son iguales sin verificar tipo de letra: " + cadena.equalsIgnoreCase(cadena2));
 

        System.out.println("----------------- EJEMPLO 3 ----------------------");

        System.out.println(cadena.substring(0,3).toUpperCase() + cadena2.substring(0,3).toUpperCase());

        System.out.println("----------------- EJEMPLO 4 ----------------------");

        System.out.println("Cadena F contine cadena P: " + cadena.contains(cadena2));
        System.out.println("Cadena F empieza por P: " + cadena.startsWith(cadena2));
        System.out.println("Cadena F termina con la cadena P: " + cadena.endsWith(cadena2));


        System.out.println("----------------- EJEMPLO 5 ----------------------");


        System.out.println("CADENA ORIGINAL: " + cadena);
        System.out.println("Cadena modificada: " + cadena.replace(cadena2, p2));


        System.out.println("----------------- EJEMPLO 6 ----------------------");

        int pos = cadena.indexOf(cadena2);
        

        if (pos != -1) {
            String parte1 = cadena.substring(0,pos);
            String parte2 = cadena.substring(pos);
            
            System.out.println("Parte 1: " + parte1);
            System.out.println("Parte 2: " + parte2);
        }else{
            System.out.println("No se encuentra el separador dentro de la cadena ");
        }
    }
}
