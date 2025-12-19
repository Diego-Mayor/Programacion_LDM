package Nivel_Avanzado_Control_de_Flujo;

import java.util.Scanner;

public class Ejer10 {
    public static void main(String[] args) {
    /*10. Pase VIP. Escribe un algoritmo que pida la edad y si tiene el pelo largo, y diga 'True' si
    tiene pase VIP, y 'False' si no. Tienen pase VIP las personas de 18 años o más que además
    tienen el pelo largo.*/

        Scanner leer = new Scanner(System.in);

        //Vriables

        int edad = 0;
        boolean peloLargo;

        //Pedir informacion al usuario

        System.out.println("Ingrese la edad: ");
        edad = leer.nextInt();

        System.out.println("Tiene cabello largo S/N");
        peloLargo = leer.hasNextBoolean();

        //Algoritmo operacion del programa

        if(edad > 18 && peloLargo == true){
            System.out.println("Tiene pase vip");
        }else {
            System.out.println("No tiene pase Vip No cumples con los requisitos");
        }



    }

}
