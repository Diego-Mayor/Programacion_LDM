package Repaso_1;

public class Ejer2 {
    public static void main(String[] args) {
        /*Imprime los números del 1 al 10 usando while. */

        int i = 1;
        while(i <= 10){
        System.out.println(i);
            i++;
        }
        System.out.println("-------------------");
        System.out.println("Numeros del 10 al 1");
        int reversenum = 10;
        while(reversenum >= 1){
            System.out.println(reversenum);
            reversenum--;
        }
    }
}
