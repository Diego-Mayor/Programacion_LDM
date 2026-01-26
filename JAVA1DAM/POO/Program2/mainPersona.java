package POO.Program2;

import java.util.Scanner;

public class mainPersona {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // ===== PERSONA 1 =====
        System.out.println("Introduce los datos de la PERSONA 1");

        System.out.print("DNI: ");
        String dni1 = leer.nextLine();

        if (!Persona.validarDni(dni1)) {
            System.out.println("ERROR: DNI de la PERSONA 1 no válido");
            leer.close();
            return;
        }

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

        System.out.print("DNI: ");
        String dni2 = leer.nextLine();

        if (!Persona.validarDni(dni2)) {
            System.out.println("ERROR: DNI de la PERSONA 2 no válido");
            leer.close();
            return;
        }

        System.out.print("Nombre: ");
        String nombre2 = leer.nextLine();

        System.out.print("Apellido: ");
        String apellido2 = leer.nextLine();

        System.out.print("Edad: ");
        int edad2 = leer.nextInt();
        leer.nextLine(); // limpiar buffer

        Persona pers2 = new Persona(dni2, nombre2, apellido2, edad2);

        // ===== MOSTRAR RESULTADOS =====
        System.out.println("\n--- PERSONA 1 ---");
        pers1.imprime();
        System.out.println(pers1.esMayorEdad() ? "Es mayor de edad" : "No es mayor de edad");
        System.out.println(pers1.esJubilado() ? "Es jubilado" : "No es jubilado");

        System.out.println("\n--- PERSONA 2 ---");
        pers2.imprime();
        System.out.println(pers2.esMayorEdad() ? "Es mayor de edad" : "No es mayor de edad");
        System.out.println(pers2.esJubilado() ? "Es jubilado" : "No es jubilado");

        System.out.println("\nDiferencia de edad entre PERSONA 1 y PERSONA 2: "
                + pers1.diferenciaEdad(pers2) + " años");

        leer.close();
    }
}
