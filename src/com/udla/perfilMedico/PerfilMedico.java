/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udla.perfilMedico;

import com.udla.fecha.Fecha;

/**
 *
 * @author jonas
 */
public class PerfilMedico {

    private String nombre;

    private String apellido;

    private String sexo;

    private Fecha fechaDeNacimiento;

    private int alturaEnCentimetros;

    private int pesoEnKilogramos;

    //Metodos
    public int mostrarEdad() {

        int edad = 2022 - this.fechaDeNacimiento.getAnio();

        if (edad < 0 || edad > 120) {
            edad = 0;
        }

        return edad;
    }

    public int mostrarFrecuenciaCardiacaMaxima() {
        return 220- this.mostrarEdad();
    }

    public String mostrarRangoFrecuenciaCardiacaEsperada() {
        String estado = "Muy Ligera";
        int fMax = this.mostrarFrecuenciaCardiacaMaxima();
        
        if (fMax>=34 && fMax<=54){
            estado = "Ligera";
        }
        if (fMax>=55 && fMax<=69){
            estado = "Ligera";
        }
        
        return estado ;
    }
    
    public double mostrarBMI(){
        double alturaEnMetros = alturaEnCentimetros/100; 
        return this.pesoEnKilogramos / (alturaEnMetros * alturaEnMetros);
    }

    public Fecha getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Fecha fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getPesoEnKilogramos() {
        return pesoEnKilogramos;
    }

    public void setPesoEnKilogramos(int pesoEnKilogramos) {
        this.pesoEnKilogramos = pesoEnKilogramos;
    }

    public int getAlturaEnCentimetros() {
        return alturaEnCentimetros;
    }

    public void setAlturaEnCentimetros(int alturaEnCentimetros) {
        this.alturaEnCentimetros = alturaEnCentimetros;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
