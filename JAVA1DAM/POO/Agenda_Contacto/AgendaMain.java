package POO.Agenda_Contacto;

import java.util.Scanner;

public class AgendaMain {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Objeto

        Agenda listas = new Agenda();
        System.out.println("Ingrese la opccion a ejecutar: \n"  + //
                        "• A - Ver contactos.\n" + //
                        "• B - Agregar contacto.\n" + //
                        "• C - Eliminar contacto.\n" + //
                        "• D - Buscar por nombre.\n" + //
                        "• E - Buscar por teléfono.\n" + //
                        "• F - Buscar por correo.\n" + //
                        "• G - Búsqueda global.\n" + //
                        "• H - Salir");

        String op = leer.nextLine();




        switch (op) {
            case "A":

                break;
            case "B":

                break;
            case "C":

                break;
            case "D":

                break;
            case "E":

                break;
            case "F":

                break;
             case "G":

                break;
            case "H":

                break;

            default:
                break;
        }
    }
}
