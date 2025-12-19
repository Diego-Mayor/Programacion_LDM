package Nivel_Intermedio_Metodos_de_Strings;

public class Ejer10 {
    public static void main(String[] args) {
        /* Ejercicio 3: Detectar si termina en “ing”
        Usa endsWith()
        Salida:
        "playing" → "Termina en ing"
        "play" → "No termina en ing" */

        String texto = "hola mundo playing";
        boolean buscar = texto.endsWith("ing");
        System.out.println(buscar);
    }
}
