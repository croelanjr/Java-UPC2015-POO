package Orion;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrionTest {

    @Test
    public void ListarPantallaTest()
    {
        Planilla planilla1 = new Planilla("Croelan Grandez", "10260429", 750.00, 8, 1200.00);
        Planilla planilla2 = new Planilla("Pasteur Colonia", "10260430", 850.00, 12, 2200.00);
        Planilla planilla3 = new Planilla("Elmer Casteñeda", "10260432", 790.00, 4, 3000.00);
        Planilla planilla4 = new Planilla("Rosa Oliver", "10260434", 900.00, 0, 3500.00);
        Planilla planilla5 = new Planilla("Patricia Galvez", "10260436", 810.00, 2, 0.00);
        ArrayList<Planilla> planillas = new ArrayList<>();
        planillas.add(planilla1);
        planillas.add(planilla2);
        planillas.add(planilla3);
        planillas.add(planilla4);
        planillas.add(planilla5);
        System.out.println();
        System.out.println("Reporte de Trabajadores");
        System.out.println("-----------------------");
        System.out.println(planilla1.listarpantalla(planillas));  
    }

    @Test
    public void calculoHorasExtrasDeCadaTrabajador()
    {
        Planilla planilla1 = new Planilla("Croelan Grandez", "10260429", 750.00, 8, 1200.00);
        Planilla planilla2 = new Planilla("Pasteur Colonia", "10260430", 850.00, 12, 2200.00);
        Planilla planilla3 = new Planilla("Elmer Casteñeda", "10260432", 790.00, 4, 3000.00);
        Planilla planilla4 = new Planilla("Rosa Oliver", "10260434", 900.00, 0, 3500.00);
        Planilla planilla5 = new Planilla("Patricia Galvez", "10260436", 810.00, 2, 0.00);
        Planilla extra = new Planilla();
        assertEquals(40.00, extra.getCalculoExtra(planilla1.getHoras()),0);
        assertEquals(60.00, extra.getCalculoExtra(planilla2.getHoras()),0);
        assertEquals(20.00, extra.getCalculoExtra(planilla3.getHoras()),0);
        assertEquals( 0.00, extra.getCalculoExtra(planilla4.getHoras()),0);
        assertEquals(10.00, extra.getCalculoExtra(planilla5.getHoras()),0);   
    }

    @Test
    public void calculoComisionDeCadaTrabajador()
    {
        Planilla planilla1 = new Planilla("Croelan Grandez", "10260429", 750.00, 8, 1200.00);
        Planilla planilla2 = new Planilla("Pasteur Colonia", "10260430", 850.00, 12, 2200.00);
        Planilla planilla3 = new Planilla("Elmer Casteñeda", "10260432", 790.00, 4, 3000.00);
        Planilla planilla4 = new Planilla("Rosa Oliver", "10260434", 900.00, 0, 3500.00);
        Planilla planilla5 = new Planilla("Patricia Galvez", "10260436", 810.00, 2, 0.00);
        Planilla extra = new Planilla();
        assertEquals(0.00, extra.getCalculoComision(planilla1.getVentas()),0);
        assertEquals(66.00, extra.getCalculoComision(planilla2.getVentas()),0);
        assertEquals(150.00, extra.getCalculoComision(planilla3.getVentas()),0);
        assertEquals(245.00, extra.getCalculoComision(planilla4.getVentas()),0);
        assertEquals(0.00, extra.getCalculoComision(planilla5.getVentas()),0);
    }
    
    @Test
    public void calculoDelSueldoTotalDelTrabajador()
    {
        Planilla planilla1 = new Planilla("Croelan Grandez", "10260429", 750.00, 8, 1200.00);
        Planilla planilla2 = new Planilla("Pasteur Colonia", "10260430", 850.00, 12, 2200.00);
        Planilla planilla3 = new Planilla("Elmer Casteñeda", "10260432", 790.00, 4, 3000.00);
        Planilla planilla4 = new Planilla("Rosa Oliver", "10260434", 900.00, 0, 3500.00);
        Planilla planilla5 = new Planilla("Patricia Galvez", "10260436", 810.00, 2, 0.00);
        Planilla extra = new Planilla();
        assertEquals(790.00, extra.getCalculoSueldoTotal(planilla1.getSueldo(), planilla1.getHoras(), planilla1.getVentas()),0);
        assertEquals(976.00, extra.getCalculoSueldoTotal(planilla2.getSueldo(), planilla2.getHoras(), planilla2.getVentas()),0);
        assertEquals(960.00, extra.getCalculoSueldoTotal(planilla3.getSueldo(), planilla3.getHoras(), planilla3.getVentas()),0);
        assertEquals(1145.00, extra.getCalculoSueldoTotal(planilla4.getSueldo(), planilla4.getHoras(), planilla4.getVentas()),0);
        assertEquals(820.00, extra.getCalculoSueldoTotal(planilla5.getSueldo(), planilla5.getHoras(), planilla5.getVentas()),0);
    }
    
    @Test
    public void calculoPlanillaTotalDeLaEmpresa()
    {
        Planilla planilla1 = new Planilla("Croelan Grandez", "10260429", 750.00, 8, 1200.00);
        Planilla planilla2 = new Planilla("Pasteur Colonia", "10260430", 850.00, 12, 2200.00);
        Planilla planilla3 = new Planilla("Elmer Casteñeda", "10260432", 790.00, 4, 3000.00);
        Planilla planilla4 = new Planilla("Rosa Oliver", "10260434", 900.00, 0, 3500.00);
        Planilla planilla5 = new Planilla("Patricia Galvez", "10260436", 810.00, 2, 0.00);
        ArrayList<Planilla> planillas = new ArrayList<>();
        planillas.add(planilla1);
        planillas.add(planilla2);
        planillas.add(planilla3);
        planillas.add(planilla4);
        planillas.add(planilla5);
        assertEquals(4691.00, planilla1.getTotalEmpresa(planillas),0);
    }
}
