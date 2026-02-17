package POO.Santander;


import java.util.ArrayList;

public class Cuenta {

    public static final double SALDO_MINIMO = -100;

    private String iban;
    private Cliente titular;
    private double saldo;
    private ArrayList<Movimiento> movimientos;

    public Cuenta(String iban, Cliente titular, double saldoInicial) {
        this.iban = iban;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.movimientos = new ArrayList<>();
    }

    public String getIban() {
        return iban;
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public boolean ingresar(double cantidad) {
        if (cantidad <= 0) return false;

        saldo += cantidad;
        movimientos.add(new Movimiento(Movimiento.Tipo.INGRESO, cantidad, "Ingreso"));
        return true;
    }

    public boolean retirar(double cantidad) {
        if (cantidad <= 0) return false;
        if (saldo - cantidad < SALDO_MINIMO) return false;

        saldo -= cantidad;
        movimientos.add(new Movimiento(Movimiento.Tipo.RETIRADA, cantidad, "Retirada"));
        return true;
    }

    @Override
    public String toString() {
        return titular.getNombre() + " | " + iban + " | Saldo: " + saldo + "€";
    }
}
