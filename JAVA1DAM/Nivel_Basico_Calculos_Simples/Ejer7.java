package Nivel_Basico_Calculos_Simples;

import java.util.Scanner;

public class Ejer7 {
    public static void main(String[] args) {

        /*7. Precio con descuento. Escribe un algoritmo que calcule el precio final de un producto al
        que se le aplica un descuento del 20%.*/


        Scanner leer = new Scanner(System.in);

        int iva,producto,descuentoIva, productoConIva;

        System.out.println("Ingresa precio de producto C/IVA");
        producto = leer.nextInt();

        System.out.println("Ingresa IVA del producto");
        iva = leer.nextInt();

        descuentoIva =  iva % 100;

        productoConIva = producto - descuentoIva ;

        System.out.println("Precio de Producto: " + producto + "€");
        System.out.println("IVA: " + iva + "%");
        System.out.println("Total S/IVA: " + productoConIva + "€");
    }
}
