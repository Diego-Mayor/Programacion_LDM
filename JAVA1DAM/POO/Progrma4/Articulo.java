package JAVA1DAM.POO.Progrma4;

public class Articulo {
    private String nombre;
    private double precio;
    private static final double iva = 0.21;
    public int cuantosQuedan;

    
    public Articulo(String nombre, double precio, int cuantosQuedan) {
        this.nombre = nombre;
        this.precio = precio;
        this.cuantosQuedan = cuantosQuedan;
    }

    

     public void imprimirA() {
        double pvp = precio + (precio * iva);
        System.out.println(
            nombre + " - Precio:" + precio + "€ - IVA:21% - PVP:" + pvp + "€"
        );
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static double getIva() {
        return iva;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }
    
}

