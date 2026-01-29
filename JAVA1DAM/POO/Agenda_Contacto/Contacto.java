public package JAVA1DAM.POO.Agenda_Contacto;

import java.util.ArrayList;

class Contacto {
    // Atributos
    private String nombre;
    private int telefono;
    private String correoElectronico;

    // Constructor
    public Contacto(String nombre, int telefono, String correoEletronico){
        this.nombre = nombre;
        this.telefono = telefono;
        this.correoElectronico = correoEletronico;
    }
    //

    public String toString() {
        return "Agenda [nombre" + nombre + ", telefono=" + telefono + ", correoElectronico=" + correoElectronico + "]";
    }

    public void imprimir(){
        System.out.println(toString());
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public int gettlefono(){
        return telefono;
    }

    public String getcorreoElectronico(){
        return correoElectronico;
    }

    // SETTERS

    public void setnombre(String nombre){
        this.nombre = nombre;
    }

    public void settelefono(int telefono){
        this.telefono = telefono;
    }

    public void setcorreoEletronico(String correoEletronico){
        this.correoElectronico = correoEletronico;
    }

}