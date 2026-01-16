package POO.Program1;

public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }


    public void imprime(){
        System.out.println("(" + x + "," + y + ")");
    }

    public void desplaza(int dx, int dy){
        x += dx;
        y += dy;
    }

    public double distancia(Punto p) {
    int dx = p.x - x;
    int dy = p.y - y;
    return Math.sqrt(dx * dx + dy * dy);
    }


}
