package Simulacro_Examen;
public class Examen_Rec_1{
    public static void main(String[] args) {
        int [] numeros = {9,2,7,4,5};
        //int [] numeros = {1,3,5,5};
        int segundo = segundo_max(numeros);
        System.out.println(segundo);

    }
    public static int segundo_max(int [] a){
        int mayor = a[0];
        int segundo = 0;


        for (int i = 0; i < a.length; i++) {
            if(a[i] > mayor){
                segundo = mayor;
                mayor = a[i];
            }else if (a[i] < mayor && a[i] > segundo) {
                segundo = a[i];
            }
        }
        return segundo;
    }
}
