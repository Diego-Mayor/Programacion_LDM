package JAVA1DAM.POO.Progrma4;

public class ArticuloMain {
    public static void main(String[] args) {
        Articulo art = new Articulo("Pijama", 10, 1);

        System.out.println("==============================================");
        art.imprimirA();

        // Se cambia el precio
        art.setPrecio(12);

        // Se vuelve a imprimir
        art.imprimirA();

    }
}
