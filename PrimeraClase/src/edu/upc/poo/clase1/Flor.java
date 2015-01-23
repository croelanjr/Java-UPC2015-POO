/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.poo.clase1;

import java.util.ArrayList;

/**
 *
 * @author profesores
 */
public class Flor {
    private  String tipo;
    private  double precio;
    private  String color;

    public Flor(String tipo, String color, double precio) {
       this.tipo = tipo;
       this.color = color;
       this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    public void juntar(Flor f2) {
        this.precio = this.precio + f2.getPrecio();
    }

    public void juntar(ArrayList<Flor> flores) {
//        for(int i=0; i<flores.size(); i++){
//            Flor flor = flores.get(i);
//            this.precio += flor.getPrecio();
//        }
        
        for(Flor flor : flores){
            this.precio += flor.getPrecio();
        }
        
        
    }




 
    
}
