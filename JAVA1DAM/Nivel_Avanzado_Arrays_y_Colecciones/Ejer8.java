package Nivel_Avanzado_Arrays_y_Colecciones;

public class Ejer8 {
    public static void main(String[] args) {
        /*Elimina el primer elemento de un array.*/

        int [] num = {1,2,3,4,5};
        int [] nuevo = new int[num.length - 1];

        for(int i = 1; i < num.length; i++){
           nuevo[i - 1] = num[i];
        }
        num = nuevo;

        for (int ter : num) {
            System.out.println(ter);
        }

    }
}
