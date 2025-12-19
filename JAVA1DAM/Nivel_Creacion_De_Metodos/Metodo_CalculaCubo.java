package Nivel_Creacion_De_Metodos;

public class Metodo_CalculaCubo {
    public static void main(String[] args) {
        int cubo = 5;
        int res = calculoDeCubo(cubo);
        System.out.println("El resultado es: " + res);
        
    }

public static int calculoDeCubo(int n){
   return n * n * n;
}
    
}
