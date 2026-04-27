package POO.ItereitorP;

import java.util.ArrayList;
import java.util.Iterator;

public class Ite_1 {
    public static void main(String[] args) {

        /*Fácil (El Filtro de Nombres): Crea un ArrayList de Strings con 10 nombres. Usa un
        Iterator para recorrer la lista y mostrar cada nombre por consola. */

        ArrayList<String> ciudades = new ArrayList<String>();

        ciudades.add("New York");
        ciudades.add("Tokyo");
        ciudades.add("Paris");
        ciudades.add("Cali");
        ciudades.add("Valencia");
        ciudades.add("Medellin");
        ciudades.add("Berlin");
        ciudades.add("Palma");
        ciudades.add("Roma");
        ciudades.add("Sevilla");


        System.out.println();
        System.out.println("Ciudades: ");
        System.out.println();
        Iterator<String> it = ciudades.iterator();
        while (it.hasNext()) {
           String ciudad = it.next();
           System.out.println(ciudad);
        }
    }
}
