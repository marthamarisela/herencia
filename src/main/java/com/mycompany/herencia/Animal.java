/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

import java.time.LocalDate;

/**
 *
 * @author PC-11
 */
public class Animal {
     private String nombre;
    private int yearNacimiento;
    private String color;
    private String raza;

   
    
    
    public int calcularEdad(){
        return LocalDate.now().getYear()-this.yearNacimiento;
    }
    //Getters and Setters
    //get da año y set devuelve el dato que se esta dando 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getYearNacimiento() {
        return yearNacimiento;
    }

    public void setYearNacimiento(int yearNacimiento) {
        this.yearNacimiento = yearNacimiento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
   
}
