package AcademiaIdiomas;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class AcademiaIdiomasTest {

    @Test
    public void saberElNivelEnElCualDebeEstudiarUnAlumno()
    {
        //Datos
        Administrador alumno1 = new Administrador("Croelan Grandez", 4);
        Administrador alumno2 = new Administrador("Pasteur Colonia", 7);
        Administrador alumno3 = new Administrador("Manuel Ramos", 15);
        Administrador alumno4 = new Administrador("Carla Gomez", 20);
        ArrayList<Administrador> alumnos = new ArrayList<>();
        //Ejecutar
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        Administrador opera = new Administrador();
        //Verificar
        int edades;
        edades = 7;
        assertEquals("niño", opera.recibir(edades, alumnos));
        edades = 4;
        assertEquals("infante", opera.recibir(edades, alumnos));
        edades = 20;
        assertEquals("adulto", opera.recibir(edades, alumnos));
        edades = 15;
        assertEquals("joven", opera.recibir(edades, alumnos));
    }

    @Test
    public void devuelvaElPrecioAPagarPorConceptoDeMatriculaDelMes()
    {
        //Datos
        Administrador alumno1 = new Administrador("Croelan Grandez", 4);
        Administrador alumno2 = new Administrador("Pasteur Colonia", 7);
        Administrador alumno3 = new Administrador("Manuel Ramos", 15);
        Administrador alumno4 = new Administrador("Carla Gomez", 20);
        ArrayList<Administrador> alumnos = new ArrayList<>();
        //Ejecutar
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        Matricula precio = new Matricula();
        //Verificar
        int edades;
        edades = 7;
        assertEquals(200.00, precio.obtenerMatricula(edades, alumnos),0);
        edades = 4;
        assertEquals(150.00, precio.obtenerMatricula(edades, alumnos),0);
        edades = 20;
        assertEquals(250.00, precio.obtenerMatricula(edades, alumnos),0);
        edades = 15;
        assertEquals(220.00, precio.obtenerMatricula(edades, alumnos),0);
    }

    @Test
    public void determineDadoElNumeroDeActividades()
    {
        //Datos
        Administrador alumno1 = new Administrador("Croelan Grandez", 4);
        Administrador alumno2 = new Administrador("Pasteur Colonia", 7);
        Administrador alumno3 = new Administrador("Manuel Ramos", 15);
        Administrador alumno4 = new Administrador("Carla Gomez", 20);
        ArrayList<Administrador> alumnos = new ArrayList<>();
        //Ejecutar
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        Actividad actividad = new Actividad();
        //Verificar
        int edades;
        int participar;
        edades = 7;
        participar = 3;
        assertEquals(26.00, actividad.determinePrecioActividad(edades, participar, alumnos),0);
        edades = 4;
        participar = 1;
        assertEquals(10.00, actividad.determinePrecioActividad(edades, participar, alumnos),0);        
        edades = 15;
        participar = 2;
        assertEquals(18.00, actividad.determinePrecioActividad(edades, participar, alumnos),0);
        edades = 20;
        participar = 4;
        assertEquals(35.00, actividad.determinePrecioActividad(edades, participar, alumnos),0);
    }

    @Test
    public void devolverElPagoDeMesConMatriculaYActividad()
    {
        //Datos
        Administrador alumno1 = new Administrador("Croelan Grandez", 4);
        Administrador alumno2 = new Administrador("Pasteur Colonia", 7);
        Administrador alumno3 = new Administrador("Manuel Ramos", 15);
        Administrador alumno4 = new Administrador("Carla Gomez", 20);
        ArrayList<Administrador> alumnos = new ArrayList<>();
        //Ejecutar
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        Actividad actividad = new Actividad();
        //Verificar
        int edades;
        int participar;
        edades = 7;
        participar = 3;
        assertEquals(226.00, actividad.determinePagoCorrespondiente(edades, participar, alumnos),0);
        edades = 4;
        participar = 1;
        assertEquals(160.00, actividad.determinePagoCorrespondiente(edades, participar, alumnos),0);        
        edades = 15;
        participar = 2;
        assertEquals(238.00, actividad.determinePagoCorrespondiente(edades, participar, alumnos),0);
        edades = 20;
        participar = 4;
        assertEquals(285.00, actividad.determinePagoCorrespondiente(edades, participar, alumnos),0);
    }    
    
}