package POO.Agenda_Contacto;

public class Contacto {
    //  ATRIBUTOS
    private String nombre;
    private String telefono;
    private String correoelectronico;

    // CONSTRUCTOR
    public Contacto(String nombre, String telefono, String correoelectronico) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoelectronico = correoelectronico;
    }

    

    @Override
    public String toString() {
        return "Contacto nombre," + nombre + " telefono" + telefono + ", correoelectronico=" + correoelectronico;
    }

    public void imprimir(){
        System.out.println(toString());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }
    

}
