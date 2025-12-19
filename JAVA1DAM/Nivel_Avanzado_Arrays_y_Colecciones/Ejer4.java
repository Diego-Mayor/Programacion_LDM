package Nivel_Avanzado_Arrays_y_Colecciones;

class Ejer4 {
    public static void main(String[] args) {
        /*Crea un array con los nombres de cinco frutas y muéstralo por consola. */

        String[] frutas = {"Manzana","Pera","papaya","melon","piña"};

        for(int i = 0; i < frutas.length; i++){
            System.out.println((i + 1) + "." + frutas[i]) ;
        }

         // También podrías usar un bucle for-each:
        // for (String fruta : frutas) {
        //     System.out.println(fruta);
        // }
        

    }

    
}