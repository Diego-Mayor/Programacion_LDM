package POO.I_Lifo;

import java.util.Stack;

public class Lif_O {
    public static void main(String[] args) {
        /* Fácil (Historial de Navegación): Simula el botón "Atrás" de un navegador. Ve añadiendo
        URLs a una Stack. Luego, saca las últimas 3 URLs simulando que el usuario pulsa el botón
        de retroceso y muéstralas. */

        Stack<Integer> boton = new Stack<>();

        boton.push(1);
        boton.push(2);
        boton.push(3);
        boton.push(4);

        System.out.println(boton);

        // Desapilamos
        int elementos = boton.pop();

        System.out.println(elementos);


        // obtenemos el elemento de arriba de la pila
        int elementoSuperior = boton.peek();

        System.out.println(elementoSuperior);


    }
}
