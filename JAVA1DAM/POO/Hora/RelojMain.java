package POO.Hora;

public class RelojMain {
    public static void main(String[] args) {

        Reloj r1 = new Reloj(0, 25, 59);
        Reloj r2 = new Reloj(1, 20, 45);
        Reloj r3 = new Reloj(12, 1, 2);
        Reloj r4 = new Reloj(23, 59, 59);

        System.out.println("---- 24h ----");
        r1.imprimeHora();
        r2.imprimeHora();
        r3.imprimeHora();
        r4.imprimeHora();

        System.out.println("---- 12h ----");
        r1.imprimeHora12();
        r2.imprimeHora12();
        r3.imprimeHora12();
        r4.imprimeHora12();

        System.out.println("---- tick() ----");
        r4.imprimeHora();   // 23:59:59
        r4.tick();
        r4.imprimeHora();   // 0:0:0

        System.out.println("---- setReloj() ----");
        r1.setReloj(17, 0, 0);
        r1.imprimeHora();     // 17:0:0
        r1.imprimeHora12();   // 5pm:0:0
    }
}
