package POO.Santander;


import java.util.ArrayList;

public class Banco {

    private ArrayList<Cuenta> cuentas;
    private int contadorIBAN;

    public Banco() {
        cuentas = new ArrayList<>();
        contadorIBAN = 0;
    }

    private String generarIBAN() {
        return String.format("ES%04d", contadorIBAN++);
    }

    public void agregarCuenta(String nombre, double saldoInicial) {
        if (saldoInicial < Cuenta.SALDO_MINIMO) {
            System.out.println("Saldo inicial inválido.");
            return;
        }

        Cliente cliente = new Cliente(nombre);
        Cuenta cuenta = new Cuenta(generarIBAN(), cliente, saldoInicial);
        cuentas.add(cuenta);
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public Cuenta getCuenta(int indice) {
        if (indice < 0 || indice >= cuentas.size()) return null;
        return cuentas.get(indice);
    }

    public void eliminarCuenta(int indice) {
        if (indice >= 0 && indice < cuentas.size()) {
            cuentas.remove(indice);
        }
    }
}
