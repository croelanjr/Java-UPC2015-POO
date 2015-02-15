package Calificaciones;

import junit.framework.Assert;
import org.junit.Test;

public class CalificacionPracticaTest {
    
    @Test
       public void calificacionPracticaDebeCalcularPromedioFinal(){
        System.out.println("Calificación Práctica debe calcular Promedio Final");
        
        double examenParcial = 10;
        double examenFinal = 12;
        double tb1 = 15;
        double tb2 = 17;
        double proyecto = 13;
        
        CalificacionPractica calificacion = new CalificacionPractica();
        calificacion.setExamenParcial(examenParcial);
        calificacion.setExamenFinal(examenFinal);
        calificacion.setTb1(tb1);
        calificacion.setTb2(tb2);        
        calificacion.setProyecto(proyecto);
        
        double resultadoEsperado = 0.15 * examenParcial + 0.25 * examenFinal + 0.10 * tb1 + 0.10 * tb2 + 0.40 * proyecto;
        
        double resultadoObtenido = calificacion.calcularPromedioFinal();
        
        Assert.assertEquals(resultadoObtenido, resultadoEsperado, 0.01);
        
    }
}
