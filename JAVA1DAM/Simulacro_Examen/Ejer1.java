package Simulacro_Examen;

public class Ejer1 {
    public static void main(String[] args) {
        int max = 10;
        int [] regalos = {5,1,7,2,9,3};
        //int max = 8;
        //int [] regalos = {2,3,1,2};
        System.out.print("Regalos: ");
        for (int i = 0; i < regalos.length; i++) {
            System.out.print(regalos[i] + " ");
        }


        int vueltas = calcularViajes(max, regalos);
        System.out.println("Vueltas: " + vueltas);

    }
    public static int calcularViajes(int max, int[] regalos){
        int suma = 0;
        int viajes = 0;
        for (int i = 0; i < regalos.length; i++) {
            suma +=  regalos[i];
            if( max <= suma){
                viajes++;
            }else{
                System.out.println(suma);

            }
        }
        System.out.println();
        return viajes;
    }
}
