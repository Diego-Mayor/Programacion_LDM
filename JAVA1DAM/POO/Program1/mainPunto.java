package POO.Program1;

public class mainPunto {
    public static void main(String[] args) {

        // Creación de objetos (instancias) de la clase Punto
        Punto p1 = new Punto(3, 4);
        Punto p2 = new Punto(7, 1);
        Punto p3 = new Punto(-3, 7);

        // Uso de getters para acceder a atributos privados
        // (aunque aquí no se imprimen, solo se llaman)
        p1.getX();
        p1.getY();

        // Uso de setters (comentados)
        // Sirven para modificar atributos privados
        //p1.setX();
        //p2.setY();

        // Llamada a métodos del objeto
        p1.imprime();
        p2.imprime();

        //-----------------------------------------------------------------
        System.out.println("Punto desplazados");

        // Se desplaza el punto p1
        p1.desplaza(2,-1);
        p1.imprime();

        System.out.println("Distancia entre p1 y p2:");

        // Se calcula la distancia entre dos objetos Punto
        double d = p1.distancia(p2);
        System.out.println(d);

        //-----------------------------------------------------------------
        System.out.println("Al azar en tre -100 y 100");

        // Generación de valores aleatorios entre -100 y 100
        int x = (int)(Math.random() * 201) - 100;
        int y = (int)(Math.random() * 201) - 100;

        // Creación de un objeto Punto con valores aleatorios
        Punto alazarP = new Punto(x, y);

        // Se imprime el punto generado al azar
        alazarP.imprime();
    }
}
