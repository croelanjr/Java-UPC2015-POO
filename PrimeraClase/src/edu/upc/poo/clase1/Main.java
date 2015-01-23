/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.poo.clase1;

/**
 *
 * @author profesores
 */
public class Main {
    
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();
        alumno1.nombre = "Miryan";
        alumno1.codigo = "u2014002";
        alumno1.setNota1(15);
        alumno1.setNota2(20);
        
        Alumno alumno2 = new Alumno("Jose", "u2014001",
                    13, 17);
    }
    
}
