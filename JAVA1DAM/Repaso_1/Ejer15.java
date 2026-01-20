package Repaso_1;

import java.util.Scanner;

public class Ejer15 {
    public static void main(String[] args) {
    /*21. Escribe un programa que pida al usuario tantas notas (entre 0 y 10) como quiera, hasta que
    introduzca un -1, y muestre por pantalla la nota media, cuántos aprobados (5 o más) y
    cuántos suspensos (menos de 5). */
    Scanner leer = new  Scanner(System.in);

    System.out.println("Ingresar las calificaciones de 0 a 10: ");

    int aprobado = 0;
    int reprobado = 0;
    int calificacion =leer.nextInt();;
    int suma = 0;
    int contador = 0;

    while(calificacion != -1){

        if( calificacion < -1 || calificacion > 10 ){
            System.out.println("Calificacion fuera de rango ");

        }else if(calificacion >= 0 && calificacion < 11){
            suma += calificacion; 
            contador++;
       }

       calificacion = leer.nextInt();

       if(calificacion >= 5){
        aprobado++;
       }else{
        reprobado++;
       }
    }
    
    
    System.out.println("Los aprovador son :" + aprobado);
    System.out.println("Los reprobados son : " + reprobado);
    System.out.println("Promedio de notas: " + (suma / 2));

    }
}
