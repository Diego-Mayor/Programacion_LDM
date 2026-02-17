package POO.Grafico2D;

public class Punto {

    private String nombre;
    private int x;
    private int y;

    public Punto(String nombre, int x, int y) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
    }

    public String getNombre() { return nombre; }
    public int getX() { return x; }
    public int getY() { return y; }
}
