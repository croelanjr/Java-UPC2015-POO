package ControlAcceso;

import java.util.ArrayList;

class Administrador {

    ArrayList<Persona> personas = new ArrayList<Persona>();
    private String mensaje;
    
    public Administrador()
    {
        
    }
    
    public void agregarRegistro(Persona persona) {
        //String mensaje = null;
        for(int a = 0; a < personas.size(); a++)
        {
            Persona obj = personas.get(a);
            if(obj.getDni().equals(persona.getDni()))
            {
                mensaje = "EXISTE" + persona.getDni();
                break;
            }
            else if(!obj.getDni().equals(persona.getDni()))
            {       
                personas.add(persona);
                mensaje = "NO EXISTE Y CREADO";
            }
        }
        System.out.println(mensaje);
        //return mensaje;
    }

    public void listarpantalla() {
        for(int a = 0; a < personas.size(); a++)
        {
            Persona obj = personas.get(a);
            System.out.println("Perona: " + obj.getDni());
        }
          System.out.println(personas.size());
    }
    
}
