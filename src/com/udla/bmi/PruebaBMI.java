/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.udla.bmi;

import java.util.Scanner;

/**
 *
 * @author
 */
public class PruebaBMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BMI bmi = new BMI(0,0);
        
        System.out.println("Ingrese el peso en kilogramos");
        int pesoEnKilogramos = scanner.nextInt();

        System.out.println("Ingrese la altura en metros");
        float alturaEnMetros = scanner.nextFloat();
        
        bmi.setAlturaEnMetros(alturaEnMetros);
        bmi.setPesoEnKilogramos(pesoEnKilogramos);
       
        System.out.println("Su BMI es"+" "+bmi.mostrarBMI());
        

    }

}
