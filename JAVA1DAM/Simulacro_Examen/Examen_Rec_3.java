package Simulacro_Examen;

public class Examen_Rec_3 {
    public static void main(String[] args) {
        //int [] numeros = {9,2,7,4,5};
        int [] numeros = {1,3,5,5};

        boolean retorno = hay_repetidos(numeros);
        System.out.println("hay repetidos ==> "  + retorno);


        
        
    }
    public static  boolean  hay_repetidos(int [] a){
        for (int i = 0; i < a.length ; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if(a[i] == a[j]){
                    return true;
                }   
        }
        
    } 
    return false;
    }
}
    

