package POO.Program2;

public class Persona {

    // Atributos privados (encapsulamiento)
    private static final int MAYORIA_EDAD = 18;
    private final String dni;
    private String nombre;
    private String apellido;
    private int edad;


    // Constructor
    public Persona(String dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Método para imprimir información
    public void imprime() {
        System.out.println("DNI: " + dni +
                " | Nombre: " + nombre +
                " | Apellido: " + apellido +
                " | Edad: " + edad);
    }

    // Métodos lógicos (apartado D2)
    public boolean esMayorEdad() {
        return edad >= MAYORIA_EDAD;
    }

    public boolean esJubilado() {
        return edad >= 65;
    }

    public int diferenciaEdad(Persona p) {
        return Math.abs(this.edad - p.edad);
    }

    public static boolean validarDni(String dni) {
    if (dni.length() != 9) {
        return false; // Si no son 9 caracteres, ya no es válido
    }

    boolean esValido = true;

    // Verificamos los 8 primeros caracteres como dígitos
    for (int i = 0; i < 8; i++) {
        if (!Character.isDigit(dni.charAt(i))) {
            esValido = false;
            break;
        }
    }

    // Verificamos el último carácter como letra
    if (esValido && !Character.isLetter(dni.charAt(8))) {
        esValido = false;
    }

    return esValido;
}


    // Getters
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    // Setters
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
