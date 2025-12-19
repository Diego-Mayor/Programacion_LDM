package Nivel_Avanzado_Arrays_y_Colecciones;

public class Ejer10 {
    public static void main(String[] args) {

        int [] notas = new int[5];
        for (int i = 0; i < notas.length; i++) {
            notas[i] = i*2;
            System.out.println(notas[i]);
        }
    }
}
