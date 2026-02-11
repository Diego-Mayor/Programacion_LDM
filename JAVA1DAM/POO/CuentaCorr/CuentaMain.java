package POO.CuentaCorr;

public class CuentaMain {
    public static void main(String[] args) {
        System.out.println("==============================");

        System.out.println("imprimir los objetos");

        Cuenta c1 = new Cuenta("ES4800837434323", 0);
        Cuenta c2 = new Cuenta("ZH4800837434323", 0);
        Cuenta c3 = new Cuenta("ES4800823424323", 0);

        System.out.println("Imprimir Informacion:");

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();

        System.out.println("==============================");
        System.out.println("Ingresar saldo.");
        c1.agregarDinero(-100);
        c2.agregarDinero(50);
        c3.agregarDinero(500);

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();

        System.out.println("==============================");
        System.out.println("Retirar saldo.");

        c1.retirardinero(20);
        c2.retirardinero(25);
        c3.retirardinero(250);

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();



    }

}
