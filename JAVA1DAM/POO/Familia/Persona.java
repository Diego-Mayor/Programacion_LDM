package POO.Familia;

import java.util.ArrayList;

public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;

    private Persona conyuge;
    private Persona progenitorA;
    private Persona progenitorB;

    private final ArrayList<Persona> hermanos = new ArrayList<>();
    private final ArrayList<Persona> hijos = new ArrayList<>();

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // ===== getters/setters necesarios =====
    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public int getEdad() { return edad; }

    public Persona getConyuge() { return conyuge; }
    public Persona getProgenitorA() { return progenitorA; }
    public Persona getProgenitorB() { return progenitorB; }

    public ArrayList<Persona> getHermanos() { return new ArrayList<>(hermanos); }
    public ArrayList<Persona> getHijos() { return new ArrayList<>(hijos); }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    public void setEdad(int edad) { this.edad = edad; }

    public void setConyuge(Persona p) {
        if (p == this) return;
        this.conyuge = p;
        if (p != null && p.conyuge != this) p.setConyuge(this); // bidireccional
    }

    public void setProgenitorA(Persona p) { this.progenitorA = p; }
    public void setProgenitorB(Persona p) { this.progenitorB = p; }

    public String nombreCompleto() {
        return (nombre + " " + apellidos).trim();
    }

    // ===== addHijo =====
    public void addHijo(Persona hijo) {
        if (hijo == null || hijo == this) return;

        if (!hijos.contains(hijo)) hijos.add(hijo);

        // Fijar progenitores en el hijo: primero A, luego B; si ambos, sobreescribe A.
        if (hijo.progenitorA == null) hijo.progenitorA = this;
        else if (hijo.progenitorB == null && hijo.progenitorA != this) hijo.progenitorB = this;
        else hijo.progenitorA = this;

        // Hermandad automática entre todos los hijos
        for (Persona otro : hijos) {
            if (otro != hijo) {
                hijo.addHermano(otro);
                otro.addHermano(hijo);
            }
        }
    }

    // ===== addHermano =====
    public void addHermano(Persona hermano) {
        if (hermano == null || hermano == this) return;

        // Si yo no tengo progenitores definidos, copio los del hermano
        if (this.progenitorA == null) this.progenitorA = hermano.progenitorA;
        if (this.progenitorB == null) this.progenitorB = hermano.progenitorB;

        // Si NO comparten progenitor, forzamos mi A al A del hermano (como dice el enunciado)
        if (!compartenProgenitor(this, hermano)) {
            this.progenitorA = hermano.progenitorA;
        }

        if (!hermanos.contains(hermano)) hermanos.add(hermano);
        if (!hermano.hermanos.contains(this)) hermano.hermanos.add(this);
    }

    private boolean compartenProgenitor(Persona a, Persona b) {
        return (a.progenitorA != null && (a.progenitorA == b.progenitorA || a.progenitorA == b.progenitorB)) ||
               (a.progenitorB != null && (a.progenitorB == b.progenitorA || a.progenitorB == b.progenitorB));
    }

    // ===== printInfoFamilia =====
    public void printInfoFamilia() {
        System.out.println("---------");
        System.out.println("Nombre: " + nombreCompleto());

        System.out.println("Progenit@r: " +
                (progenitorA == null ? "Sin progenit@r" : progenitorA.nombreCompleto())
                + ". Progenit@r: " +
                (progenitorB == null ? "Sin progenit@r" : progenitorB.nombreCompleto()));

        System.out.print("Hermanos: ");
        if (hermanos.isEmpty()) System.out.println("Sin hermanos");
        else {
            for (Persona h : hermanos) System.out.print(h.nombreCompleto() + ",");
            System.out.println();
        }

        System.out.print("Hijos: ");
        if (hijos.isEmpty()) System.out.println("Sin hijos");
        else {
            for (Persona h : hijos) System.out.print(h.nombreCompleto() + ",");
            System.out.println();
        }
    }
}
