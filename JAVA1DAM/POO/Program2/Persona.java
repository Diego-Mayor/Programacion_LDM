package POO.Program2;

public class Persona {

    private String dni;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void imprime() {
        System.out.println(nombre + " " + apellido + " con el " + dni);
    }

    // Getters
    public String getdni() {
        return dni;
    }

    public String getnombre() {
        return nombre;
    }

    public String getapellido() {
        return apellido;
    }

    public int getedad() {
        return edad;
    }

    // Setters
    public void setdni(String dni) {
        this.dni = dni;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }

    // Métodos lógicos
    public boolean esMayorEdad() {
        return edad >= 18;
    }

    public boolean esJubilado() {
        return edad >= 65;
    }
}
