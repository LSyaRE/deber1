/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udla.bmi;

/**
 *
 * @author
 */
public class BMI {

    private int pesoEnKilogramos;

    private float alturaEnMetros;

    public BMI(int pesoEnKilogramos, float alturaEnMetros) {
        this.pesoEnKilogramos = pesoEnKilogramos;
        this.alturaEnMetros = alturaEnMetros;
    }
    
    
    

    //Metodos 
    public String mostrarBMI() {
        double bmi = this.pesoEnKilogramos / (this.alturaEnMetros * this.alturaEnMetros);
        
        String estado = "Bajo Peso";
        
        if(bmi > 18.5 && bmi < 24.9){
            estado="Normal";
        }
        
        if(bmi > 25 && bmi < 29.9){
            estado="SobrePeso";
        }
        
        if(bmi > 30){
            estado="Obeso";
        }
        
        return estado+":"+bmi;
    }

    public float getEnAlturaMetros() {
        return alturaEnMetros;
    }

    public void setAlturaEnMetros(float alturaMetros) {
        if (alturaMetros > 0) {
            this.alturaEnMetros = alturaMetros;
        }
    }

    public int getPesoEnKilogramos() {
        return pesoEnKilogramos;
    }

    public void setPesoEnKilogramos(int pesoKilogramos) {
        if (pesoKilogramos > 0) {
            this.pesoEnKilogramos = pesoKilogramos;
        }
    }

}
