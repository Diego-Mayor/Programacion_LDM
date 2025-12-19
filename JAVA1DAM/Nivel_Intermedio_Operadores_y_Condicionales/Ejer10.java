package Nivel_Intermedio_Operadores_y_Condicionales;

import java.util.Scanner;

public class Ejer10 {
    public static void main(String[] args) {
        /*10. Temperatura. Escribe un programa que lea la temperatura en centígrados (entero) del día e
        imprima el tipo de clima de acuerdo a la siguiente lista:
        a. Temperatura menor que 10 => Frío
        b. Temperatura entre 10 y 19 => Templado
        c. Temperatura entre 20 y 29 => Caluroso
        d. Temperatura mayor que 29 => Tropical*/

        Scanner leer = new Scanner(System.in);

            int grados;

        System.out.println("Ingrese la temperatura");
        grados = leer.nextInt();

            if(grados == 10){
                System.out.println("El clima es frio: ");
            } else if (grados > 10 && grados <= 19) {
                System.out.println("El clima es templado");
            } else if (grados >= 20 && grados <=29) {
                System.out.println("El clima es caluroso");
            } else if (grados > 29) {
                System.out.println("El clima es tropical");
            }else {
                System.out.println(
                        "" +
                        "            .     .       *        .       .      *\n" +
                        "       *        .        .      *       .        *\n" +
                        "   .         *     .      .        *     .      .\n" +
                        "        .       /\\          *       .        *\n" +
                        "   *        .  /  \\  .        *       .    *\n" +
                        "        .     /    \\     .       *       .\n" +
                        "   .    *    /      \\    *    .       *\n" +
                        "        .   /        \\     .        *\n" +
                        "           /    _===_  \\              *\n" +
                        "   *      /    (o_o)    \\     .    *\n" +
                        "        ./    /( : )\\    \\.       .\n" +
                        "            (   : :   )    \n" +
                        "             (       ) \n" +
                        "               (___)  \n" +
                        "   . * . * . * . * . * . * . * . * . * . * .\n" +
                        "   *   M   U   C   H   O       F   R   I   O *\n" +
                        "   . * . * . * . * . * . * . * . * . * . * . .");
            }

    }
}
