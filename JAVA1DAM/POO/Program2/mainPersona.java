package POO.Program2;

import java.util.Scanner;

public class mainPersona {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // ===== PERSONA 1 =====
        System.out.println("Introduce los datos de la PERSONA 1");

        System.out.print("DNI: ");
        String dni1 = leer.nextLine();

        System.out.print("Nombre: ");
        String nombre1 = leer.nextLine();

        System.out.print("Apellido: ");
        String apellido1 = leer.nextLine();

        System.out.print("Edad: ");
        int edad1 = leer.nextInt();
        leer.nextLine(); // limpiar buffer

        Persona pers1 = new Persona(dni1, nombre1, apellido1, edad1);

        // ===== PERSONA 2 =====
        System.out.println("\nIntroduce los datos de la PERSONA 2");

<<<<<<< HEAD
        System.out.print("DNI: ");
        String dni2 = leer.nextLine();

        System.out.print("Nombre: ");
        String nombre2 = leer.nextLine();
=======
        Rectangulo p1 = new Rectangulo(dni, nombre, apellido, edad);

        Rectangulo p2 = new Rectangulo(dni, nombre, apellido, edad);
>>>>>>> ecf8249 (nuevas funciones en POO)

        System.out.print("Apellido: ");
        String apellido2 = leer.nextLine();

        System.out.print("Edad: ");
        int edad2 = leer.nextInt();

        Persona pers2 = new Persona(dni2, nombre2, apellido2, edad2);

        // ===== MOSTRAR RESULTADOS =====
        System.out.println("\n--- PERSONA 1 ---");
        pers1.imprime();
        System.out.println("Mayor de edad: " + pers1.esMayorEdad());
        System.out.println("Jubilado: " + pers1.esJubilado());

        System.out.println("\n--- PERSONA 2 ---");
        pers2.imprime();
        System.out.println("Mayor de edad: " + pers2.esMayorEdad());
        System.out.println("Jubilado: " + pers2.esJubilado());
    }
}
