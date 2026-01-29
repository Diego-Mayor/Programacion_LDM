package POO.Agenda_Contacto;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    int contador = 0;
    static final int MAX_CONTACTOS = 100;
    Contacto [] contactos = new Contacto[MAX_CONTACTOS];
    
    public void verContactos(){
         if(contador == 0){
            System.out.println("No hay contactos");
         }else{
            for (int i = 0; i < contactos.length; i++) {
                System.out.println(i + " . " + contactos[i]);
            }
         }
       

    }

    public void agregarContacto(Scanner leer){
        if(contador >= MAX_CONTACTOS){
            System.out.println("Agenda esta llenna");
            }else{
                System.out.println("Ingrese nombre");
                String nombre = leer.nextLine();

                System.out.println("Ingrese telefono");
                String telefono = leer.nextLine();

                System.out.println("Ingrese correo electronico");
                String correoelectronico = leer.nextLine();

                contactos [contador] = new  Contacto(nombre,telefono,correoelectronico);

            }
    }


}
