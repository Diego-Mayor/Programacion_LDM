package Nivel_Basico_Calculos_Simples;

import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {
        /*6. Precio con IVA. Escribe un algoritmo que calcule el precio de venta de un producto a partir
        de su precio sin IVA, suponiendo que el IVA es del 21%.*/

        Scanner leer = new Scanner(System.in);

        int iva,producto,opIva, productoConIva;

        System.out.println("Ingresa precio de producto S/IVA");
        producto = leer.nextInt();

        System.out.println("Ingresa IVA del producto");
        iva = leer.nextInt();

        opIva =  iva % 100;

        productoConIva = opIva + producto;

        System.out.println("Precio de Producto: " + producto + "€");
        System.out.println("IVA: " + iva + "%");
        System.out.println("Total C/IVA: " + productoConIva + "€");


    }
}
