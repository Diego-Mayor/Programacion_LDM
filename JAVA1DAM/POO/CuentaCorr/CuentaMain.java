package POO.CuentaCorr;

public class CuentaMain {
    public static void main(String[] args) {
        System.out.println("==============================");

        System.out.println("imprimir los objetos");
        
        Cuenta c1 = new Cuenta("ES4800837434323", 100000000);
        Cuenta c2 = new Cuenta("ZH4800837434323", 234000);
        Cuenta c3 = new Cuenta("ES4800823424323", 23400);

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
    }
    
}
