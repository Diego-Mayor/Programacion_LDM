package POO.Agenda_Contacto;

import java.util.Scanner;

public class AgendaMain {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int op = 8;
        do {

            switch (op) {
                case 1:
                    System.out.println("Ver Contactatos");

                    break;
                case 2:
                    System.out.println("Agregar Contactos");

                    System.out.println("Nombre:");
                    String nom = leer.nextLine();

                    System.out.println("Telefono");
                    String tel = leer.nextLine();

                    System.out.println("Correo Electronico");
                    String email = leer.nextLine();

                     Contacto contados = new Contacto(nom,tel,email);

                case 3:
                    System.out.println("Elimonar COntacto");

                default:
                    break;
            }

        } while (op == 8);

    }
}
