package POO.Agenda_Contacto;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> listaContactos = new ArrayList<>();

    public Agenda() {
    }

    public void verContactos() {

    if (listaContactos.isEmpty()) {
        System.out.println("No hay contactos");
    } else {
        for (int i = 0; i < listaContactos.size(); i++) {
            System.out.println(i + ". " + listaContactos.get(i));
        }
    }

    
    }
    
}












/* 🧩 Resumen mental ultra simple
Acción	Método
Crear lista	new ArrayList<>()
Agregar	.add(objeto)
Saber tamaño	.size()
Obtener elemento	.get(indice)
Borrar	.remove(indice)
Ver si está vacía	.isEmpty()

import java.util.ArrayList;

public class EjemploArrayList {

    public static void main(String[] args) {

        // ================================
        // 1️⃣ CREAR UN ARRAYLIST
        // ================================
        ArrayList<String> lista = new ArrayList<>();

        // ================================
        // 2️⃣ AGREGAR ELEMENTOS
        // ================================
        lista.add("Maria");
        lista.add("Juan");
        lista.add("Pedro");

        System.out.println("Lista después de agregar elementos:");
        System.out.println(lista);
        System.out.println();

        // ================================
        // 3️⃣ SABER EL TAMAÑO
        // ================================
        System.out.println("Tamaño de la lista: " + lista.size());
        System.out.println();

        // ================================
        // 4️⃣ RECORRER CON FOR (USANDO ÍNDICE)
        // ================================
        System.out.println("Recorrer con for clásico:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + ". " + lista.get(i));
        }
        System.out.println();

        // ================================
        // 5️⃣ RECORRER CON FOR-EACH
        // ================================
        System.out.println("Recorrer con for-each:");
        for (String nombre : lista) {
            System.out.println(nombre);
        }
        System.out.println();

        // ================================
        // 6️⃣ ACCEDER A UN ELEMENTO ESPECÍFICO
        // ================================
        String primerElemento = lista.get(0);
        System.out.println("Primer elemento: " + primerElemento);
        System.out.println();

        // ================================
        // 7️⃣ BORRAR UN ELEMENTO POR ÍNDICE
        // ================================
        lista.remove(1); // Borra el elemento en posición 1

        System.out.println("Lista después de borrar posición 1:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + ". " + lista.get(i));
        }
        System.out.println();

        // ================================
        // 8️⃣ COMPROBAR SI ESTÁ VACÍA
        // ================================
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía");
        } else {
            System.out.println("La lista NO está vacía");
        }
        System.out.println();

        // ================================
        // 9️⃣ BORRAR TODO
        // ================================
        lista.clear();

        System.out.println("Después de usar clear():");
        System.out.println("Tamaño: " + lista.size());

        if (lista.isEmpty()) {
            System.out.println("Ahora la lista está vacía");
        }
    }
}
*/