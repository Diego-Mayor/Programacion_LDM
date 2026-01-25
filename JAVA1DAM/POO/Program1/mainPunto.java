package POO.Program1;

public class mainPunto {
    public static void main(String[] args) {

        // Creación de objetos (instancias) de la clase Punto
        Punto p1 = new Punto(5, 0);
        Punto p2 = new Punto(10, 10);
        Punto p3 = new Punto(-3, 7);
        Punto alazarP4 = new Punto(0, 0);

        // Uso de getters para acceder a atributos privados
        // (aunque aquí no se imprimen, solo se llaman)
        //p1.getX();
        //p1.getY();
        System.out.println("==========================================");

        // Uso de setters
        // Sirven para modificar atributos privados
        p1.setX(4);
        p1.setY(4);
        p2.setX(8);
        p2.setY(8);
        p3.setX(-5);
        p3.setY(6);

        // Llamada a métodos del objeto
        p1.imprime();
        p2.imprime();
        p3.imprime();

        //-----------------------------------------------------------------
        System.out.println("==========================================");

        System.out.println("Punto desplazados");

        // Se desplaza el punto p1
        p1.desplaza(2,-1);
        p1.imprime();

        System.out.println("==========================================");

        System.out.println("Distancia entre p1 y p2:");

        // Se calcula la distancia entre dos objetos Punto
        double d = p1.distancia(p2);
        System.out.println(d);

        //-----------------------------------------------------------------
        System.out.println("==========================================");

        System.out.println("Al azar en tre -100 y 100");

        // Generación de valores aleatorios entre -100 y 100
        int x = (int)(Math.random() * 201) - 100;
        int y = (int)(Math.random() * 201) - 100;

        // Creación de un objeto Punto con valores aleatorios
        Punto alazarP = new Punto(x, y);

        // Se imprime el punto generado al azar
        alazarP.imprime();
        
        System.out.println("==========================================");
        System.out.println("Modificamos x e y en un solo metodo");

        // Metodo modifica en un solo metodo x e y
        p1.setXY(2, 7);
        p2.setXY(5, 9);
        p3.setXY(-2, 8);

        p1.imprime();
        p2.imprime();
        p3.imprime();

        System.out.println("==========================================");
        System.out.println("Imprimo el nuevo punto al azar");
        Punto.puntoAleatorio();
        alazarP.imprime();


    }
}
