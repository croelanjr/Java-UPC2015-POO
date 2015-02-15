package Calificaciones;

import org.junit.*;
import static org.junit.Assert.*;

public class CalificacionTradicionalTest {
    
  @Test
  public void calificacionTradicionalDebeCalcularElPromedioSegunFormulaTradicional(){
      System.out.println("Calificacion Tradicional debe calcular Promedio Final");
      double examenParcial = 10;
      double examenFinal = 15;
      double pc1 = 14;
      double pc2 = 15;
      
      CalificacionTradicional calificacion  = new CalificacionTradicional();
      calificacion.setExamenParcial(examenParcial);
      calificacion.setExamenFinal(examenFinal);
      calificacion.setPc1(pc1);
      calificacion.setPc2(pc2);
      
      double resultadoEsperado = 0.30*examenParcial + 0.30*examenFinal + 0.20 * pc1 + 0.20 *pc2;
      
      double resultadoObtenido = calificacion.calcularPromedioFinal();
      
      assertEquals(resultadoEsperado, resultadoObtenido, 0.01);
 
  }
}
