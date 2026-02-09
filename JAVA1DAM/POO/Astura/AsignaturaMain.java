package POO.Astura;

public class AsignaturaMain {
    public static void main(String[] args) {
        System.out.println("================================");
        System.out.println("primer objeto creado");
        Asignatura c1 = new Asignatura("Ipe", 552, "1Dam");
        Asignatura c2 = new Asignatura("programacion", 123, "1eso");
        Asignatura c3 = new Asignatura("Matematicas", 5, "6c");
        

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();

    }
}
