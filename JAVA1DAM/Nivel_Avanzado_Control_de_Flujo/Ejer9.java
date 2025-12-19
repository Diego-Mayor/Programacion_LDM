package Nivel_Avanzado_Control_de_Flujo;

import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {
        /*9. Tiene Descuento. Escribe un algoritmo que pida la edad y diga 'True' si tiene derecho a
        descuento, y 'False' si no. Tienen descuento las personas mayores de 60 años y los niños de
        10 años o menos. 10*/

        Scanner leer = new Scanner(System.in);

        int edad = 0;

        System.out.println("Ingrese la edad: ");
        edad = leer.nextInt();

        if(edad >= 60 || edad <= 10){
            System.out.println("tiene derecho a descuanto");
        }else {
            System.out.println("no tiene derecho a descuento no esta dentro de la edad");
        }



    }
}
