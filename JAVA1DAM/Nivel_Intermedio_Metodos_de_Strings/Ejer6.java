package Nivel_Intermedio_Metodos_de_Strings;

import java.util.Scanner;

class Ejer6 {
    public static void main(String[] args) {
        /*6. Crea un programa que pida al usuario introducir una cadena de texto y un separador (podrá
        ser una o varias letras). Luego separará la cadena introducida en dos partes donde esté ese
        separador. */

        // Hola que tal estas
        // que
        // Hola
        // tal estas

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una cadena de texto");
        String cadena = leer.nextLine();

        System.out.println("Ingresa un separador");
        String separador = leer.nextLine();

        int pos = cadena.indexOf(separador);
        

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