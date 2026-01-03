package Repaso_1;

public class Ejer6 {
    public static void main(String[] args) {
        /*nstrucciones: Crea dos palabras, por ejemplo: "manzana" y "pera".
        Usa compareTo() para compararlas.
        Imprime un mensaje según el resultado:
        "La primera palabra va antes"
        "La primera palabra va después"
        "Son iguales"
        Objetivo:
        Ver cómo compareTo() decide el orden alfabético. */
        String palabra1 = "Manzana".toLowerCase();
        String palabra2 = "Pera".toLowerCase();

        if(palabra1.compareTo(palabra2) == 0){
            System.out.println("Son iguales. ");
        }else if(palabra1.compareTo(palabra2) > 0){
            System.out.println("La primera palabra va después: " + palabra1);
        }else if(palabra1.compareTo(palabra2) < 0){
            System.out.println("La primera palabra va antes: " + palabra1);
        }
        


    }
}
