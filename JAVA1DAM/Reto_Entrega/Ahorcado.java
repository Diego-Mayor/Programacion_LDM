package Reto_Entrega;

import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("=====================================================================");
    System.out.println("=== JUEGO DEL AHORCADO ===");

    // 1. Pedir palabra secreta e inicializar palabra mostrada
    String palabraSecreta = pedirPalabraSecreta(sc);
    String palabraMostrada = inicializarPalabraMostrada(palabraSecreta);

    // 2. Inicializar intentos
    int intentosRestantes = 6;

    // 3. Bucle principal del juego
    while(intentosRestantes > 0 && !palabraCompleta(palabraMostrada)) {
        // Mostrar estado actual
        mostrarEstado(palabraMostrada, intentosRestantes);

        // Pedir letra
        char letraIngresada = pedirLetra(sc);

        // Comprobar si la letra está en la palabra
        boolean acierto = contieneLetra(palabraSecreta, letraIngresada);

        // Actualizar palabra mostrada si acertó, o restar intento si falló
        if(acierto) {
            palabraMostrada = descubrirLetras(palabraSecreta, palabraMostrada, letraIngresada);
        } else {
            intentosRestantes--;
        }
    }

    // 4. Mostrar estado final y resultado
    mostrarEstado(palabraMostrada, intentosRestantes);
    mostrarResultadoFinal(palabraSecreta, palabraCompleta(palabraMostrada));

    }

    // Pide la palabra secreta al usuario y la devuelve en minúsculas.
    public static String pedirPalabraSecreta(Scanner sc){
        System.out.println("Ingresa la palabra secreta: ");
        String palabraSecreta = sc.next();
        return palabraSecreta.toLowerCase();
    }

    // Devuelve una cadena con tantos guiones como letras tenga ‘secreta’.
    public static String inicializarPalabraMostrada(String palabraSecreta){
    String palabraMostrada = "";
    for(int i = 0; i < palabraSecreta.length(); i++){
        palabraMostrada += "_"; // sin espacio
    }
    return palabraMostrada;
}


    // Pide al usuario una letra y devuelve el primer carácter introducido.
    public static char pedirLetra(Scanner sc){
        String entradaUsuario = " ";
        System.out.println("Ingresa una letra: ");
        entradaUsuario = sc.next();
        char letraIngresada = entradaUsuario.charAt(0);
        return letraIngresada;
    }

    // Comprueba si la letra introducida está dentro de la palabra secreta.
    public static boolean contieneLetra(String palabraSecreta, char letraIngresada){
        int indice = palabraSecreta.indexOf(letraIngresada);
        if (indice >= 0) {
            System.out.println("¡GENIAL! ¡Continúa así, queda poco para ganar!");
            return true;
        } else {
            System.out.println("OOOH, pierdes un intento. Suerte para la próxima.");
            return false;
        }
    }

    // Devuelve la palabra mostrada tras descubrir las letras acertadas.
    public static String descubrirLetras(String palabraSecreta, String palabraMostrada, char letraIngresada){
        String nuevaMostrada = "";
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letraIngresada) {
                nuevaMostrada += letraIngresada; // descubres la letra
            } else {
                nuevaMostrada += palabraMostrada.charAt(i); // conservas guion o letra anterior
            }
        }
        return nuevaMostrada;
    }
    // Devuelve true si ‘mostrada’ ya no contiene guiones (palabra completa).
    // Devuelve true si ‘palabraMostrada’ ya no contiene guiones (palabra completa).
    public static boolean palabraCompleta(String palabraMostrada){
        for(int i = 0; i < palabraMostrada.length(); i++){
            if(palabraMostrada.charAt(i) == '_') {
                return false; // aún hay un guion, palabra incompleta
            }
        }
        return true; // no se encontraron guiones, palabra completa
    }



    // Muestra el estado actual del juego: palabra mostrada e intentos restantes.
    public static void mostrarEstado(String palabraMostrada, int intentosRestantes){
    System.out.println("Palabra: " + palabraMostrada);
    System.out.println("Intentos restantes: " + intentosRestantes);
    }

    // Muestra el resultado final: si ha ganado o perdido y la palabra secreta.
    public static void mostrarResultadoFinal(String palabraSecreta, boolean haGanado){
    if(haGanado){
        System.out.println("¡Felicidades! Has adivinado la palabra: " + palabraSecreta);
    } else {
        System.out.println("Se acabaron los intentos. La palabra era: " + palabraSecreta);
    }
}

}
