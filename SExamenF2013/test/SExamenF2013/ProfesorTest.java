package SExamenF2013;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProfesorTest {
    
@Test
public void deberiaPoderRegistrarProfesorTiempoParcial()
{
    //Preparacion de Datos
    String nombreCompleto = "Croelan Grandez";
    int anosExperiencia = 5;
    String nivelProfesional = "I";
    int horasMensualesTrabajo = 50;
    String codigo ="123456";
    //Ejecucion 
    Profesor profesor = new ProfesorTiempoParcial(codigo, nombreCompleto, anosExperiencia, 
            nivelProfesional, horasMensualesTrabajo);
    //Varificacion
    assertEquals("123456", profesor.getCodigo());
    assertEquals("Croelan Grandez", profesor.getNombreCompleto());
    assertEquals(5, profesor.getAnosExperiencia());
    assertEquals("I", ((ProfesorTiempoParcial)profesor).getNivelProfesional());
    assertEquals(50, profesor.getHorasMensualesTrabajo());     
}

@Test
public void DeberiaPoderCalcularTotalMensualAPagar()
{
    //Preparacion de Datos
    String nombreCompleto = "Croelan Grandez";
    int anosExperiencia = 5;
    String nivelProfesional = "I";
    int horasMensualesTrabajo = 50;
    String codigo ="123456";
    //Ejecucion 
    Profesor profesor = new ProfesorTiempoParcial(codigo, nombreCompleto, anosExperiencia, 
            nivelProfesional, horasMensualesTrabajo);
    
    //Verificar
    assertEquals(2500, profesor.getTotalMensualAPagar(),0);   
}

@Test
public void deberiaPoderRegistrarProfesorTiempoCompleto()
{
    //Preparacion de Datos
    String nombreCompleto = "Croelan Grandez";
    int anosExperiencia = 5;
    String facultad = "Ing. Electronica";
    String codigo ="123456";
    int horasMensualesTrabajo = 160; 
    //Ejecucion
    Profesor profesor = new ProfesorTiempoCompleto(codigo, nombreCompleto, anosExperiencia, 
            facultad, horasMensualesTrabajo);
    //Varificacion
    assertEquals("123456", profesor.getCodigo());
    assertEquals("Croelan Grandez", profesor.getNombreCompleto());
    assertEquals(5, profesor.getAnosExperiencia());
    assertEquals("Ing. Electronica", ((ProfesorTiempoCompleto)profesor).getFacultad());
    assertEquals(160, profesor.getHorasMensualesTrabajo());
    
}
}
