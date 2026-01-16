package POO.Program2;

public class Persona {
    private String  dni;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona (String dni,String nombre,String apellidos, int edad){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellidos;
        this.edad = edad;
    }
    public void imprime(){
        System.out.println(nombre + " " + apellido + " con " + dni + " Es mayor de edad");
    }


}
