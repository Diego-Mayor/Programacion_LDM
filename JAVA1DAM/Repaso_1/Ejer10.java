package Repaso_1;

public class Ejer10 {
    public static void main(String[] args) {

        int[] numeros = {9,2,7,4,5};
        //int[] numeros = {1,3,5,5};
        //int[] numeros = {};

        boolean resultado = hay_repetidos(numeros);
        System.out.println(resultado);
    }
    public static boolean hay_repetidos(int[] a){
        boolean resultado = false ;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i] == a[j]){
                    System.out.println(a[i] +" ---- " + a[j]);
                    resultado = true;
                }else{
                    resultado = false;
                }
            }
        }
        return  resultado;
    }
}