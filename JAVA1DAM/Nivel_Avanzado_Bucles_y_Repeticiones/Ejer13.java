package Nivel_Avanzado_Bucles_y_Repeticiones;

public class Ejer13 {
    
public static void main(String[] args) {
    /**13. Escribe un programa que sume independientemente los números pares y los impares entre 1
    y 10, y luego muestra por pantalla ambas sumas.*/

    int pares = 0;
    int impares = 0;
    int contador = 1;
    
     while (contador <= 10) {
        if(contador % 2 == 0){
            pares += contador;
        }else if(contador % 2 == 1){
            impares += contador;
        }
        contador++;
     }

     System.out.println("Los numeros Impares son : " + impares);
     System.out.println("Los numeros Pares son: " + pares);

    
}
}
