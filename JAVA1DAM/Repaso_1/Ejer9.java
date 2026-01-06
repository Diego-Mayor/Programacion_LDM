package Repaso_1;

public class Ejer9 {
    public static void main(String[] args) {
        int [][] numeros = new int [5][5];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                numeros[i][j] = (int)(Math.random()*100);
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();   
        }
    }
}
