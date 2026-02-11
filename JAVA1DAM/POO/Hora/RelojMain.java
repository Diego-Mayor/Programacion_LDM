package POO.Hora;

public class RelojMain {
    public static void main(String[] args) {

       Reloj r1 = new Reloj(0, 25, 59);
       Reloj r2 = new Reloj(1, 20, 45);
       Reloj r3 = new Reloj(12, 1, 2);


       r1.imprimir();
       r2.imprimir();
       r3.imprimir();


       r1.dimeLaHora();
       r1.imprimir();
    }
}
