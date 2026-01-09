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
    if (regalos.length == 0) {
        return 0;
    }

    int suma = 0;
    int viajes = 1;
    System.out.print("Viaje " + viajes + ": ");

    for (int i = 0; i < regalos.length; i++) {

        // Si cabe el regalo en el viaje actual
        if (suma + regalos[i] <= max) {
            if (suma > 0) System.out.print(" + ");
            System.out.print(regalos[i]);
            suma += regalos[i];

        } else {
            // Termina un viaje y empieza otro
            System.out.println(" = " + suma);
            viajes++;
            suma = regalos[i];
            System.out.print("Viaje " + viajes + ": " + regalos[i]);
        }
    }

    // Imprimir el último viaje
    System.out.println(" = " + suma);

    return viajes;
    }
}