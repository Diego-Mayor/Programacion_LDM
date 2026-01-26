package JAVA1DAM.POO.Program3;

public class RectanguloMain {
    public static void main(String[] args) {

        // Crear rectángulos
        Rectangulo r1 = new Rectangulo(0, 0, 5, 5);
        Rectangulo r2 = new Rectangulo(2, 3, 7, 9);

        // Imprimir coordenadas iniciales
        System.out.println("RECTÁNGULOS INICIALES");
        r1.imprimirCoordenada();
        r2.imprimirCoordenada();

        // Modificar coordenadas usando setters (C3)
        System.out.println("\nMODIFICANDO COORDENADAS DE r1");
        r1.setX1(1);
        r1.setY1(1);
        r1.setX2(6);
        r1.setY2(6);

        // Imprimir de nuevo
        System.out.println("\nRECTÁNGULOS TRAS MODIFICAR");
        r1.imprimirCoordenada();
        r2.imprimirCoordenada();

        // Mostrar área y perímetro
        System.out.println("\nÁREA Y PERÍMETRO DE r1");
        System.out.println("Perímetro: " + r1.perimetro());
        System.out.println("Área: " + r1.area());

        // Método completo de D3
        System.out.println("\nINFORMACIÓN COMPLETA DE r1");
        r1.imprimirInformacionCompleta();
    }
}
