package Nivel_Experto_Desafios_y_Juegos_Lio;

import java.util.Scanner;

public class Reto_A_CarritoSimpleCompras {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int n, j=0;
        double precio = 0 , subtotal = 0, descuento = 0, total = 0, iva = 0.21, totalIVA = 0, precioIva = 0;
        System.out.println("Cuantos articulos vas a comprar hoy ? ");
        n = lector.nextInt();


        while (n != j) {
            System.out.println("Dime el precio del producto");
            precio = lector.nextDouble();
            subtotal += precio;
            j++;

        }

        if (subtotal >= 100) {

            descuento = subtotal * 0.15;
            total = subtotal - descuento;

        } else {
            System.out.println("Tu compra no llega a 100€ por lo que no hay desuento :(");
        }

        precioIva = total * iva;
        totalIVA = total + precioIva;



        System.out.println("Numero de productos: " + n + " subtotal: " + subtotal + "€ descutento: " + descuento + "€ total: " + total + "€" + " el IVA añadido es: " + precioIva + "€ total con iva incluido: " + totalIVA + "€");
    }
}

