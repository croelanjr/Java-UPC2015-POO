package SExamenF2013;

import org.junit.Test;
import static org.junit.Assert.*;

public class AdministradorTest {
    
@Test
public void DeberiaPoderRegistrarProfesorTiempoParcial()
{
    //Datos
    String nombreCompleto = "Croelan Grandez";
    String codigo = "123456";
    int anosExperiencia = 5;
    String nivelProfesional = "I";
    int horasMensualesTrabajo = 50;
    Profesor profesor = new ProfesorTiempoParcial(codigo, nombreCompleto, anosExperiencia, 
            nivelProfesional, horasMensualesTrabajo);
    //Ejecutar
    Administrador administrador = new Administrador();
    administrador.RegistrarProfesor(profesor);
    //Verificar
    Profesor profesorAux = administrador.buscarprofesor(codigo);
    assertNotNull(profesorAux);
    assertEquals("Croelan Grandez", profesor.getNombreCompleto());
    
}
    
@Test
public void DeberiaPoderRegistrarProfesorTiempoCompleto()
{
    //Datos
    String nombreCompleto = "Ana Maria Leon";
    int anosExperiencia = 5;
    String facultad = "Ing. Electronica";
    String codigo ="789012";
    int horasMensualesTrabajo = 160; 
    Profesor profesor = new ProfesorTiempoCompleto(codigo, nombreCompleto, anosExperiencia, 
            facultad, horasMensualesTrabajo);
    //Ejecutar
    Administrador administrador = new Administrador();
    administrador.RegistrarProfesor(profesor);
    //Verificar
    Profesor profesorAux = administrador.buscarprofesor(codigo);
    assertNotNull(profesorAux);
    assertEquals("Ana Maria Leon", profesor.getNombreCompleto());  
}

@Test(expected = AdministradorException.class)
public void DeberiaValidarDuplicidadCodigo()
{
    //datos
    String nombreCompleto = "Croelan Grandez";
    String codigo = "123456";
    int anosExperiencia = 3;
    String nivelProfesional = "I";
    int horasMensualesTrabajo = 50;
    Profesor profesor1 = new ProfesorTiempoParcial(codigo, nombreCompleto, anosExperiencia, 
    nivelProfesional, horasMensualesTrabajo);
    
    nombreCompleto = "Croelan Grandez";
    anosExperiencia = 5;
    String facultad = "Ing. Electronica";
    codigo ="123456";
    horasMensualesTrabajo = 160; 
    Profesor profesor2 = new ProfesorTiempoCompleto(codigo, nombreCompleto, anosExperiencia, 
            facultad, horasMensualesTrabajo);
    
    
    //Ejecutar
    Administrador administrador = new Administrador();
    administrador.RegistrarProfesor(profesor1);
    administrador.RegistrarProfesor(profesor2);

    
 }

@Test(expected = AdministradorException.class)
public void DeberiaValidarDatosDelProfesorARegistrar()
{
    //datos
    String nombreCompleto = "Croelan Grandez";
    String codigo = "";
    int anosExperiencia = 3;
    String nivelProfesional = "I";
    int horasMensualesTrabajo = 50;
    Profesor profesor1 = new ProfesorTiempoParcial(codigo, nombreCompleto, anosExperiencia, 
    nivelProfesional, horasMensualesTrabajo);
    //Ejecutar
    Administrador administrador = new Administrador();
    administrador.RegistrarProfesor(profesor1);  
 }

@Test
public void deberiaCalcularTotalAPagar()
{
    //datos
    String nombreCompleto = "Croelan Grandez";
    String codigo = "123456";
    int anosExperiencia = 3;
    String nivelProfesional = "I";
    int horasMensualesTrabajo = 50;
    Profesor profesor1 = new ProfesorTiempoParcial(codigo, nombreCompleto, anosExperiencia, 
    nivelProfesional, horasMensualesTrabajo);
    //Ejecutar
    Administrador administrador = new Administrador();
    administrador.RegistrarProfesor(profesor1);
    
    double totalAPagar = administrador.getTotalAPagar(codigo);
    
    assertEquals(2500, totalAPagar,0);
}

}
