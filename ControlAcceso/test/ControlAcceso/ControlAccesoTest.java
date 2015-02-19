package ControlAcceso;

import org.junit.Test;
import static org.junit.Assert.*;

public class ControlAccesoTest {

    Persona persona1 = new Persona("Croelan Grandez", "10260429", "Carbonstar0", "proveedor");
    Persona persona2 = new Persona("Pasteur Colonia", "10260430", "Carbonstar1", "proveedor");
    Persona persona3 = new Persona("Rosa Oliver", "10260431", "Carbonstar2", "proveedor");
    Persona persona4 = new Persona("Manuel Ramos", "10260432", "Carbonstar3", "proveedor");
    Persona persona5 = new Persona("Miguel Grau", "10260433", "Carbonstar4", "proveedor");
    Persona persona6 = new Persona("Julio Leon", "10260434", "", "invitado");
    Persona persona7 = new Persona("Anita Leon", "10260435", "", "invitado");
    Persona persona8 = new Persona("Jose Diaz", "10260437", "", "invitado");
    Persona persona9 = new Persona("Jorge Ho", "10260438", "", "invitado");
    Persona persona10 = new Persona("Juan Lopez", "10260439", "", "invitado");
    Persona persona11 = new Persona("Julieta Roma", "10260440", "Carbonstar5", "proveedor");    

    @Test
    public void verificarQueNoExistaRegistradoUnaPersona()
    {
        Administrador opera = new Administrador();
        opera.agregarRegistro(persona1);
        opera.listarpantalla();
    }
    

}
