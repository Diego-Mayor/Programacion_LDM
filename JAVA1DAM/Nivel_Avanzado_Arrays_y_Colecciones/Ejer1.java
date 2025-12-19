package Nivel_Avanzado_Arrays_y_Colecciones;

class Ejer1 {
    public static void main(String[] args) {
        
        /*Cree un array de 5 números enteros.
        Asigna manualmente los valores (por ejemplo: 10, 20, 30, 40, 50).
        Muestra en pantalla todos los valores del array, uno por línea. */

        // creo un arrays con 5 elemntos
        int[] numeros = {10, 20, 30, 40, 50};

        //Mostrar pòr pantalla 
        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);

        }

        System.out.println("Ahora con un forech");

        for (int n : numeros) {
            System.out.println(n);
            
        }


    }

    
}