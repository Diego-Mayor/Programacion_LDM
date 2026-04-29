package POO.ItereitorP.Ite3_Clase;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Ite_3 {
    public static void main(String[] args) {
        /*Difícil (Gestión de Alumnos): Crea una clase Alumno (nombre y nota). Genera un
        ArrayList con 5 alumnos. Usa un Iterator para buscar a los alumnos que tengan una
        nota inferior a 5; si la nota es un 4, "dale una o */

        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Juan", 3));
        alumnos.add(new Alumno("Ana", 4));
        alumnos.add(new Alumno("Luis", 7));
        alumnos.add(new Alumno("Marta", 2));
        alumnos.add(new Alumno("Pedro", 5));

        Iterator<Alumno> it = alumnos.iterator();
        while (it.hasNext()) {
            Alumno a = it.next();
            if(a.nota > 5){
                System.out.println(alumnos);
            }else if(a.nota == 4){
                it.remove();
            }
        }

        for (Alumno a : alumnos) {
        System.out.println(a.nombre + " = " + a.nota);
}

    }
}
