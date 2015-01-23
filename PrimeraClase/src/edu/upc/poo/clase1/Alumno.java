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
public class Alumno {

    String nombre;
    String codigo;
    private double nota1;
    private double nota2;

    public Alumno() {

    }

    public Alumno(String nombre, String codigo, double nota1,
            double nota2) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    
    
    
    public double promedioNotas() {
        return (nota1 + nota2) / 2.0;
    }

    private void imprimirAlumno() {
        System.out.println("El alumno es "
                + nombre);

    }

}
