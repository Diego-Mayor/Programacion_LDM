package Nivel_Creacion_De_Metodos;

import java.util.Scanner;

public class Metodo_Menu_Opcciones {
    public static void main(String[] args) {
        // Llamamos al menú desde el main
        Menu();
    }

    // Método para pedir un número al usuario
    public static int dato() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int dato = leer.nextInt();
        return dato;
    }

    // Método que muestra el menú y controla las opciones
    public static void Menu() {
        int opcion;
        do {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Saludo de buenos días");
            System.out.println("2. Saludo de buenas tardes");
            System.out.println("3. Saludo de buenas noches");
            System.out.println("4. Salir");

            opcion = dato(); // Pedir opción al usuario

            switch (opcion) {
                case 1:
                    System.out.println("Hola, buenos días!");
                    break;
                case 2:
                    System.out.println("Buenas tardes!");
                    break;
                case 3:
                    System.out.println("Buenas noches!");
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }

        } while (opcion != 4); // Repetir hasta que el usuario elija salir
    }
}
