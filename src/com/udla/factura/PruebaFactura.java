/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udla.factura;

import java.util.Scanner;

/**
 *
 * @author
 */
public class PruebaFactura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de pieza");
        String numeroPieza = scanner.nextLine();

        System.out.println("Ingrese la descripcion");
        String descripcion = scanner.nextLine();

        System.out.println("Ingrese la cantidad");
        int cantidad = scanner.nextInt();

        System.out.println("Ingrese el precio");
        double precio = scanner.nextDouble();
        
        Factura factura = new Factura("", "", 0, 0);
       
        factura.setNumeroPieza(numeroPieza);
        factura.setDescripcion(descripcion);
        factura.setCantidad(cantidad);
        factura.setPrecio(precio);
        
        System.out.println("--------------------------------");
        System.out.println("Factura ferreterias Don Quijote");
        System.out.println("Numero de Pieza:"+factura.getNumeroPieza());
        System.out.println("Descripcion:"+factura.getDescripcion());
        System.out.println("Cantidad:"+factura.getCantidad());
        System.out.println("Precio:"+factura.getPrecio());
        System.out.println("--------------------------------");
        
        
        double monto=factura.obtenerMontoFactura();
        
        System.out.println("Su monto es:"+monto);
        

    }

}
