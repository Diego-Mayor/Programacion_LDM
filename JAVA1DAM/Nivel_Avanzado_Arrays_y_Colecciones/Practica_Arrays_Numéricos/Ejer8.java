package Nivel_Avanzado_Arrays_y_Colecciones.Practica_Arrays_Numéricos;

import java.util.Scanner;

public class Ejer8 {
    public static void main(String[] args) {
        /*8. Modificar datos en el array
        Crea un array de 5 enteros con valores literales. Pide al usuario una posición (0–4) y un nuevo valor.
        Modifica la posición indicada con el nuevo valor. Muestra el array final por pantalla. Implementa el
        método: static void imprimir(int[] a) */
        Scanner leer = new Scanner(System.in);

        int[] numeros = {10,20,30,40,50,60};
        System.out.println("Ingresa la posicion 0 - 4: ");
        int posición = leer.nextInt();
        System.out.println("Ingresa el valor a cambiar: ");
        int nuevoValor = leer.nextInt();
        System.out.println("Array original: ");
        imprimir(numeros);
        numeros[posición]= nuevoValor;
        System.out.println("Array modificado: ");
        imprimir(numeros); 
        
    }
    public static void imprimir(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
}

