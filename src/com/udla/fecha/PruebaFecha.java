/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udla.fecha;

import java.util.Scanner;

/**
 *
 * @author
 */
public class PruebaFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el dia");
        int dia = scanner.nextInt();

        System.out.println("Ingrese el mes");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el año");
        int anio = scanner.nextInt();

        Fecha fecha = new Fecha(1, 1, 2000);

        fecha.setDia(dia);
        fecha.setMes(mes);
        fecha.setAnio(anio);
        
        System.out.println("--------------------------------");
        System.out.println("Fecha Ingresada");
        System.out.println("Dia:"+fecha.getDia());
        System.out.println("Mes:"+fecha.getMes());
        System.out.println("Año:"+fecha.getAnio());
        System.out.println("--------------------------------");
        
        String fechaSeparada = fecha.mostrarFecha();
        System.out.println("La fecha unida es:"+ fechaSeparada);
    }

}
