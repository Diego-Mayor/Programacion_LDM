package Nivel_Intermedio_Metodos_de_Strings;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        /*3. Crea un programa que, dadas tres cadenas de texto: nombre y dos apellidos, muestre un
        código de usuario (en mayúsculas) formado por la concatenación de las tres primeras letras
        de cada uno de ellos. Por ejemplo, si se introduce “Lionel”, “Tarazón” y “Alcocer” mostrará
        “LIOTARALC”. */

        String nombre = "Diego"; 
        String apellido1 = "Mayor";
        String apellido2 = "Rodriguez";

        System.out.println(nombre.substring(0,3).toUpperCase() + apellido1.substring(0,3).toUpperCase() + apellido2.substring(0,3).toUpperCase());

        


    }
    
}
