package DisciplinaTdd;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestModuloPago {
    
    @Test
    public void CalcularElNumeroHorasTipoRol()
    {
        //Datos

        //Ejecutar
        Profesor profesorDocente = new Profesor("Miguel Grau", 1, 60.00);
        Profesor profesorTutor = new Profesor("Alfonzo Ugarte", 3, 16.50);
        Profesor profesorAuxiliar = new Profesor("Alan Garcia", 7, 29.00);
        //Verificar
        assertEquals(60.0, profesorDocente.getCalculoDia(),0);
        assertEquals(49.5, profesorTutor.getCalculoDia(),0);
        assertEquals(203.0, profesorAuxiliar.getCalculoDia(),0);
    }
   
 
    
    @Test
    public void RealizarCalculoFinalPago()
    {
        //Ejecutar
        Profesor profesorDocente = new Profesor("Miguel Grau", 1, 60.00);
        Profesor profesorTutor = new Profesor("Alfonzo Ugarte", 3, 16.50);
        Profesor profesorAuxiliar = new Profesor("Alan Garcia", 7, 29.00);
        //Verificar
        assertEquals(1800.0, profesorDocente.getTotalAPagar(),0);
        assertEquals(1485.0, profesorTutor.getTotalAPagar(),0);
        assertEquals(6090.0, profesorAuxiliar.getTotalAPagar(),0);        
    }
    
}
