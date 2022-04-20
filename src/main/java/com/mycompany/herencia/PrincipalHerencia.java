/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.herencia;

/**
 *
 * @author PC-11
 */
public class PrincipalHerencia {

    public static void main(String[] args) {
           var gatoMama = new Gato(7);
        
        gatoMama.setColor("plomo");
        gatoMama.setNombre("Mishi");
        gatoMama.setRaza("Mestizo");
        gatoMama.setPropietario("Mauricio");
        gatoMama.setYearNacimiento(2017);
        
        
        System.out.println(gatoMama.getNombre());
        System.out.println(gatoMama.calcularVidasRestantes());
        System.out.println(gatoMama.getPropietario());
        
        
        
    }
        
    
}
