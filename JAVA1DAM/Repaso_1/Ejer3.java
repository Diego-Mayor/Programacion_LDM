package Repaso_1;

public class Ejer3 {
    public static void main(String[] args) {
        /*Imprime los números del 1 al 10 usando do-while. */
        int numeros = 1;
        do {
            System.out.println(numeros);
            numeros++;
        } while (numeros <= 10);

        System.out.println("-------------------");
        System.out.println("Numeros del 10 al 1");
        int revelnum= 10;
        do {
            System.out.println(revelnum);
            revelnum--;
        } while (revelnum >= 1);

    }
}
