/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.poo.clase1;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author profesores
 */
public class TestFlores {

    
    
    @Test
    public void deberiaSumarPrecioDeDiezOMasFlores(){
        
        Flor f1 = new Flor("Violeta", "azul", 30);
        Flor f2 = new Flor("Rosa", "roja", 40);
        Flor f3 = new Flor("Girasol", "amarilla", 50);
        Flor f4 = new Flor("Violeta", "azul", 30);
        Flor f5 = new Flor("Rosa", "roja", 40);
        Flor f6 = new Flor("Girasol", "amarilla", 50);
        Flor f7 = new Flor("Violeta", "azul", 30);
        Flor f8 = new Flor("Rosa", "roja", 40);
        Flor f9 = new Flor("Girasol", "amarilla", 50);        
        Flor f10 = new Flor("Girasol", "amarilla", 50);        
        
        ArrayList<Flor> flores = new ArrayList<>();
        flores.add(f2);
        flores.add(f3);
        flores.add(f4);
        flores.add(f5);
        flores.add(f6);
        flores.add(f7);
        flores.add(f8);
        flores.add(f9);
        flores.add(f10);
        
        f1.juntar(flores);
        
        
        assertEquals(410, f1.getPrecio(),0);
    }
    
    @Test
    public void deberiaSumarPrecioDeTresFlores(){
        
        Flor f1 = new Flor("Violeta", "azul", 30);

        Flor f2 = new Flor("Rosa", "roja", 40);
        
        Flor f3 = new Flor("Girasol", "amarilla", 50);
        
        f1.juntar(f2);
        f1.juntar(f3);
        
        assertEquals(120, f1.getPrecio(),0);
    }
    
    
    @Test
    public void deberiaSumarPrecioDeDosFlores() {

        

        Flor f1 = new Flor("Violeta", "azul", 30);

        Flor f2 = new Flor("Rosa", "roja", 40);

        System.out.println("Hay una " + f2.getTipo() + " de  color:"
                + f2.getColor());

        System.out.println("y cada una cuesta: " + f1.getPrecio() + " y "
                + f2.getPrecio());

        f1.juntar(f2);

        System.out.println("Combinados en un ramo cuestan: " 
                + f1.getPrecio());
        
        assertEquals(70, f1.getPrecio(), 0);

    }

}
