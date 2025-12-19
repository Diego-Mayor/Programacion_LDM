package Nivel_Practica_Tres_Metodos;

import java.net.Socket;
import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        /*Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad o no.
        Implementa y utiliza la función:
        boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario */

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int edad = leer.nextInt();

        System.out.println(Mayor_O_Menor(edad));

    }

    public static boolean Mayor_O_Menor(int a){
        if(a >= 18)
            return true;
        else 
            return false;
    }


    
}
