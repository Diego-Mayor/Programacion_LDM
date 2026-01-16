package Simulacro_Examen;

public class Examen_Rec_2 {
    public static void main(String[] args) {
      //String[] cadena ={"hola","mundo","java"};
        String[] cadena = {"BUENOS", "Dias","a" ,"todaS"};


        String texto = construir_frase_correcta(cadena);

        System.out.println(texto);


    }
    public static String construir_frase_correcta(String[] palabras){
        System.out.println();
        String frase = "";
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals("") || palabras[i].equals(" ")) {
                System.out.println("Error la cadena del arrays no puede tener espacios vacios");
            }
            frase += palabras[i].toLowerCase();
            if (i < palabras.length -1) {
                frase += " ";
            }
        }
        frase = frase.substring(0,1).toUpperCase() + frase.substring(1);
        frase += ".";
        return frase;
    }
}