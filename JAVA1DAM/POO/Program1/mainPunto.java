package POO.Program1;

public class mainPunto {
    public static void main(String[] args) {

        Punto p1 = new Punto(3, 4);
        Punto p2 = new Punto(7, 1);

        // se usa para devolver el valor de una variable privada.
        p1.getX();
        p1.getY();

        // se usa para modificar o establecer un nuevo valor para una variable privada.
        //p1.setX();
        //p2.setY();

        //
        p1.imprime();
        p2.imprime();

        //-----------------------------------------------------------------
        System.out.println("Punto desplazados");
        p1.desplaza(2,-1);
        p1.imprime();

        System.out.println("Distancia entre p1 y p2:");
        double d = p1.distancia(p2);
        System.out.println(d);

        //-----------------------------------------------------------------
        System.out.println("Al azar en tre -100 y 100");
        int x = (int)(Math.random() * 201) - 100;
        int y = (int)(Math.random() * 201) - 100;



        Punto alazarP = new Punto(x, y);

        alazarP.imprime();


    }
}
