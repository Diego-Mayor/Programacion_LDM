package Nivel_Avanzado_Bucles_y_Repeticiones;

import java.util.Scanner;

public class Ejer11 {
    public static void main(String[] args) {

    /*11. Escribe un programa que muestre la suma de X precios que introduzca el usuario (siendo X
    un número que indica el usuario).*/

    Scanner leer = new Scanner(System.in);
    double precios = 0;
    int contador = 0;
    double suma = 0;


    for(;;){
        System.out.println("Ingresame los precios");
        contador++;
        precios = leer.nextDouble();
        suma += precios;
        if (contador < 5) {
            System.out.println(suma);    
        }else{
            break;
        }
        
    }
    
    }
}