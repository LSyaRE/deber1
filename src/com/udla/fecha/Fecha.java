/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udla.fecha;

/**
 *
 * @author
 */
public class Fecha {

    private int dia;

    private int mes;

    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public String mostrarFecha() {
        return this.dia + "/" + this.mes + "/" + this.anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (anio > 1900 && anio < 3000) {
            this.anio = anio;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes > 0 && mes <= 12) {
            this.mes = mes;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia > 0 && dia <= 31) {
            this.dia = dia;
        }
    }

}
