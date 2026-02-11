package POO.CuentaCorr;

public class Cuenta {
    private String numeroCuenta;
    private double saldo;


    public Cuenta(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        if(saldo >= 0){
            this.saldo = saldo;
        }else{
            System.out.println("Saldo no puede ser negativo");
            this.saldo = 0;
        }

    }

    public void imprimir(){
        System.out.println(numeroCuenta +": " + saldo);
    }

    public void agregarDinero(double cantidad){
        if(cantidad > 0){
            saldo = saldo + cantidad;
            System.out.println("Ingreso exitoso");
        }else{
            System.out.println("El ingreso no puede ser negativo");
        }

    }

    public boolean retirardinero(double cantidad){
        if(cantidad <= 0){
            System.out.println("La cantidad no puede ser negativa ");
            return false;
        }

        if (cantidad > saldo) {
            System.out.println("La cantidad a retirar no puede ser mayor que el saldo");
            return false;
        }

        saldo = saldo - cantidad;
        System.out.println("Retiro Exitoso");
        return true;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }


    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }


    public double getSaldo() {
        return saldo;
    }
}
