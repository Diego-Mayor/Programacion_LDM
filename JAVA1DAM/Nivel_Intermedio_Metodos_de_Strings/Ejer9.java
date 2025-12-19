package Nivel_Intermedio_Metodos_de_Strings;

public class Ejer9 {
    public static void main(String[] args) {

        String saludo = "Hola";
        String invertido = "";

        for (int i = saludo.length() - 1; i >= 0; i--) {
            invertido = invertido + saludo.charAt(i);
        }

        System.out.println(invertido);
    }
}
