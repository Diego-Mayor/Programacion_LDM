package Nivel_Intermedio_Metodos_de_Strings;

public class Ejer2 {
    public static void main(String[] args) {
        /*2. Crea un programa que, dadas dos cadenas de texto, indique mediante true o false si son
        iguales o no, además de si son iguales sin diferenciar entre mayúsculas y minúsculas. */

        String texto1 = "hola Mundo",texto2 = "hola mundo";

        System.out.println("Son iguales :" + texto1.equals(texto2));
        System.out.println("Son iguales sin verificar tipo de letra: " + texto1.equalsIgnoreCase(texto2));
 
    }
    
}
