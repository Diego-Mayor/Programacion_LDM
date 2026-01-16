package POO.Program2;

import java.util.Scanner;

public class mainPersona {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa el dni");
        String dni = leer.nextLine();

        System.out.println("Ingresa el nombre");
        String nombre = leer.nextLine();

        System.out.println("Ingresa el apellido");
        String apellido = leer.nextLine();

        System.out.println("Ingresa el edad");
        int edad = leer.nextInt();




        Persona p1 = new Persona(dni, nombre, apellido, edad);

        Persona p2 = new Persona(dni, nombre, apellido, edad);

        p1.imprime();
    }
}
