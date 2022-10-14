/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udla.empleado;

import java.util.Scanner;

/**
 *
 * @author
 */
public class PruebaEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado empleado1 = new Empleado("", "", 0);
        Empleado empleado2 = new Empleado("", "", 0);

        for (int i = 0; i < 2; i++) {
            System.out.println("|------------------------------|");
            System.out.println("Ingrese el nombre:");
            String nombre = scanner.next();

            System.out.println("Ingrese el apellido paterno");
            String apellido = scanner.next();

            System.out.println("Ingrese el salario mensual");
            double salarioMensual = scanner.nextDouble();

            if (i == 0) {
                empleado1.setNombre(nombre);
                empleado1.setApellido(apellido);
                empleado1.setSalarioMensual(salarioMensual);
                System.out.println("Su salario anual es:" + empleado1.obtenerSalarioAnual());
            } else {
                empleado2.setNombre(nombre);
                empleado2.setApellido(apellido);
                empleado2.setSalarioMensual(salarioMensual);
                System.out.println("Su salario anual es:" + empleado2.obtenerSalarioAnual());
                System.out.println("|------------------------------|");

            }
        }

        empleado1.aumentarSalarioMensual();
        empleado2.aumentarSalarioMensual();

        System.out.println("El salario aumentado anual del empleado"
                + " " + empleado1.getNombre()
                + " " + empleado1.getApellido()
                + " " + "es:" + empleado1.obtenerSalarioAnual());
        System.out.println("Salario Mensual:"+empleado1.getSalarioMensual());
        System.out.println("|------------------------------|");
        
        System.out.println("El salario aumentado anual del"
                + " " + empleado2.getNombre()
                + " " + empleado2.getApellido()
                + " " + "es:" + empleado2.obtenerSalarioAnual());
        System.out.println("Salario Mensual:"+empleado1.getSalarioMensual());
        
    }

}
