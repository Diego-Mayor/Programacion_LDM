package JAVA1DAM.POO.Program3;

public class Rectangulo {

    private int x1, y1, x2, y2;

    public Rectangulo(int x1, int y1, int x2, int y2) {
        if(x1 < x2 && y1 < y2){
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }else {
            System.err.println("Error de instanciar Rectangulo...");
        }
        
    }

    public void imprimirCoordenada() {
        System.out.println("Coordenadas: (" + x1 + "," + y1 + ") (" + x2 + "," + y2 + ")");
    }
    public double perimetro(){
        double ancho = x2 - x1;
        double alto = y2- y1;
        double p = 2 * (ancho + alto);
        return p;
    } 
    public double area(){
        double ancho = x2 - x1;
        double alto = y2 - y1;
        double ar = ancho * alto;
        return ar;
    }

    public void imprimirInformacionCompleta() {
    System.out.println("Coordenadas: (" + x1 + "," + y1 + ") (" + x2 + "," + y2 + ")");
    System.out.println("Área: " + area());
    System.out.println("Perímetro: " + perimetro());
    }

    public void setX1Y1(int x1, int y1) {
    if (x1 < this.x2 && y1 < this.y2) {
        this.x1 = x1;
        this.y1 = y1;
    } else {
        System.err.println("ERROR en setX1Y1: coordenadas inválidas");
        }
    }

    public void setX2Y2(int x2, int y2) {
    if (x2 > this.x1 && y2 > this.y1) {
        this.x2 = x2;
        this.y2 = y2;
    } else {
        System.err.println("ERROR en setX2Y2: coordenadas inválidas");
        }
    }

    public void setAll(int x1, int y1, int x2, int y2) {
    if (x1 < x2 && y1 < y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    } else {
        System.err.println("ERROR en setAll: coordenadas inválidas");
        }
    }






    // Getters
    public int getX1() { return x1; }
    public int getY1() { return y1; }
    public int getX2() { return x2; }
    public int getY2() { return y2; }

    // Setters
    public void setX1(int x1) { 
        if (x1 < x2){
            this.x1 = x1;
        }else{
            System.err.println("Error de instanciar Rectangulo...");
        }
    }
    public void setY1(int y1) { 
        if (y1 < y2){
            this.y1 = y1;
        }else{
            System.err.println("Error de instanciar Rectangulo...");
        }
        
     }
    public void setX2(int x2) { 
        if (x2 > x1){
            this.x2 = x2;
        }else{
            System.err.println("Error de instanciar Rectangulo...");
        }
         
    }
    public void setY2(int y2) { 
        if (y2 > y1){
            this.y2 = y2;
        }else{
            System.err.println("Error de instanciar Rectangulo...");
        }
        
     }
}
