package POO.Program1;

// Clase Punto: representa un punto en el plano cartesiano
public class Punto {

    // Atributos privados → ENCAPSULACIÓN
    // Solo pueden accederse mediante getters y setters
    private int x;
    private int y;

    // Constructor: inicializa los valores del punto
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter: devuelve el valor de x
    public int getX() {
        return x;
    }

    // Getter: devuelve el valor de y
    public int getY() {
        return y;
    }

    // Setter: modifica el valor de x
    public void setX(int x){
        this.x = x;
    }

    // Setter: modifica el valor de y
    public void setY(int y){
        this.y = y;
    }

    // Método que imprime el punto en formato (x,y)
    public void imprime(){
        System.out.println("(" + x + "," + y + ")");
    }

    // Método que desplaza el punto sumando dx y dy
    public void desplaza(int dx, int dy){
        x += dx;
        y += dy;
    }

    // Método que calcula la distancia entre este punto y otro punto
    public double distancia(Punto p) {
        int dx = p.x - x;
        int dy = p.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
