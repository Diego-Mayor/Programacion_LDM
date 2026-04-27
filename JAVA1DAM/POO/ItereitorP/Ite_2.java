package POO.ItereitorP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ite_2 {
    public static void main(String[] args) {
        /*Intermedio (Limpieza de Inventario): Crea una lista de números enteros que representen
        el stock de productos. Usa Iterator para eliminar de la lista todos los productos cuyo
        stock sea inferior a 5. Muestra la lista final para comprobar que los elementos han sido
        eliminados correctamente sin lanzar una ConcurrentModificationException. */
        System.out.println("=================================");

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa lista de numeros enteros");


        ArrayList<Integer> numeros = new ArrayList<>();
        for(int i = 0; i <= 10; i++){
            Integer datos = leer.nextInt();
            numeros.add(datos);
        }

        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            int guardar = it.next();

            if (guardar < 5) {
                it.remove();
            }else{
                System.out.println(guardar + " ");
            }
        }
        System.out.println("=================================");

    }
}
