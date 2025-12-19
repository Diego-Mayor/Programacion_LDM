package Nivel_Creacion_De_Metodos;

import java.util.Scanner;

public class Metodo_Par_Impar {
    public static void main(String[] args) {
        /* Implementa un método que dado un número 
        diga si éste es par. */

        int numero = pedir_int();
        boolean es_par = comprobar_par(numero);

        if (es_par)
            System.out.println("Es par!!");
        else
            System.out.println("Es impar!!");
        
    }

    // Pide un int al usuario y lo devuelve
    public static int pedir_int(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa el dato: ");
        int dato = leer.nextInt();
        return dato;
    }

    public static boolean comprobar_par(int numero){
        if(numero % 2 == 0){
            return true;
            //System.out.println("El numero es par");
        }else{
            return false;
            //System.out.println("El numero es impar");
        }
       
    }
    
}
