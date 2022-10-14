/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udla.empleado;

import java.util.Scanner;

/**
 *
 * @author jonas
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

        double empleado1Aumento = empleado1.getSalarioMensual() * 1.10;
        empleado1.setSalarioMensual(empleado1Aumento);

        double empleado2Aumento = empleado2.getSalarioMensual() * 1.10;
        empleado2.setSalarioMensual(empleado2Aumento);

        System.out.println("El salario anual del" + " "+empleado1.getNombre()+ " " + "es:" + empleado1.obtenerSalarioAnual());
        System.out.println("El salario anual del"+ " " + empleado2.getNombre()+ " " + "es:" + empleado2.obtenerSalarioAnual());

    }

}
