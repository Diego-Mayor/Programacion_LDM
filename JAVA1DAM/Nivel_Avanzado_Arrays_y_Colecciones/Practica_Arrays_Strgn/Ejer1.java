package Nivel_Avanzado_Arrays_y_Colecciones.Practica_Arrays_Strgn;

public class Ejer1 {
    public static void main(String[] args) {
        /*1. Lista de nombres (mostrar todos)
    Declara un array de String con 5 nombres de personas (por ejemplo, "Ana", "Luis", etc.). Recorre el
    array con un bucle for y muestra todos los nombres por pantalla, uno por línea. */

    String [] nombres= new String[5];

    nombres[0]="Ana";
    nombres[1]="Luis";
    nombres[2]="Zuly";
    nombres[3]="Diego";
    nombres[4]="Max";

    for (int i = 0; i < nombres.length; i++) {
        System.out.println("[" + nombres[i] + "]");
        }
    }
}