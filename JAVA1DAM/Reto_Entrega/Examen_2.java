package Reto_Entrega;

import java.util.Random;

public class Examen_2 {
    public static void main(String[] args) {
        System.out.println("====================");
        System.out.println(" Simulacion De La Cubeta De Lluvia");

        int dia = 0, finalCapacidad = Capacidad();

       while (finalCapacidad > 0) {
        dia++;


        int lluviaAlAzar = simulacionDeLluvia();
        int llenado = Capacidad() - lluviaAlAzar;

        System.out.println("Dias: " + dia + "Lluvia: " + llenado );


       }
    }

    public static int Capacidad(){
        return  100;
    }

    public static int simulacionDeLluvia(){
        int numeroAleatorio = (int) (Math.random() * 21);
        return numeroAleatorio;
    }

}