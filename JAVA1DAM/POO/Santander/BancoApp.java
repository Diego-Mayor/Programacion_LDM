package POO.Santander;


import java.util.Scanner;

public class BancoApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        int opcion;

        do {
            System.out.println("""
                    1. Ver cuentas
                    2. Agregar cuenta
                    3. Ingresar dinero
                    4. Retirar dinero
                    5. Salir
                    """);

            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    if (banco.getCuentas().isEmpty()) {
                        System.out.println("No hay cuentas.");
                    } else {
                        for (int i = 0; i < banco.getCuentas().size(); i++) {
                            System.out.println(i + ". " + banco.getCuentas().get(i));
                        }
                    }
                }
                case 2 -> {
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Saldo inicial: ");
                    double saldo = sc.nextDouble();
                    banco.agregarCuenta(nombre, saldo);
                }
                case 3 -> {
                    System.out.print("Cuenta: ");
                    int i = sc.nextInt();
                    System.out.print("Cantidad: ");
                    double c = sc.nextDouble();
                    Cuenta cuenta = banco.getCuenta(i);
                    if (cuenta != null && cuenta.ingresar(c)) {
                        System.out.println("Ingreso correcto.");
                    } else {
                        System.out.println("Error.");
                    }
                }
                case 4 -> {
                    System.out.print("Cuenta: ");
                    int i = sc.nextInt();
                    System.out.print("Cantidad: ");
                    double c = sc.nextDouble();
                    Cuenta cuenta = banco.getCuenta(i);
                    if (cuenta != null && cuenta.retirar(c)) {
                        System.out.println("Retirada correcta.");
                    } else {
                        System.out.println("Error.");
                    }
                }
            }

        } while (opcion != 5);
    }
}
