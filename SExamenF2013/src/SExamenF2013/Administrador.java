package SExamenF2013;

import java.util.ArrayList;
import java.util.List;

public class Administrador {
    private List<Profesor> profesores;
    
    public Administrador()
    {
        profesores = new ArrayList<Profesor>();
    }
    
    public void RegistrarProfesor(Profesor profesor) {
        Profesor profesorAux = buscarprofesor(profesor.getCodigo());
        if(profesorAux != null)
        {
            throw new AdministradorException("Codigo de Profesor duplicado");
        }   
            if(validarProfesor(profesor))
            profesores.add(profesor);   
    }

    public Profesor buscarprofesor(String codigo) {
        Profesor rpta = null;
        for(Profesor profesor: profesores)
        {
            if(profesor.getCodigo().equals(codigo))
            {
                rpta = profesor;
                break;
            }
        }
        return rpta;
    }

    private boolean validarProfesor(Profesor profesor) {
        boolean rpta = true;
        if(profesor.getCodigo()== null || profesor.getCodigo().isEmpty())
        {
         throw new AdministradorException("Codigo de Profesor no puede ser vacios");
        }
        if(profesor.getNombreCompleto()== null || profesor.getNombreCompleto().isEmpty())
        {
            throw new AdministradorException("Nombre Completo de Profesor no puede ser vacios");
        }
        if(profesor.getAnosExperiencia()<0)
        {
            throw new AdministradorException("Años de Experiencia de Profesor no puede ser vacios");
        }
        
        
        if(profesor instanceof ProfesorTiempoParcial)
        {
            if(profesor.getHorasMensualesTrabajo() > 80)
            {
             throw new AdministradorException("Horas Mensuales de Profesor no puede ser vacios");   
            }
            if(((ProfesorTiempoParcial)profesor).getNivelProfesional() == null 
                    || ((ProfesorTiempoParcial)profesor).getNivelProfesional().isEmpty())
            {
                throw new AdministradorException("Nivel de Profesional de Profesor no puede ser vacios");
            }
            }
        else
        {
            if(profesor.getHorasMensualesTrabajo() > 160)
            {
             throw new AdministradorException("Horas Mensuales de Profesor no puede ser vacios");   
            }
            if(((ProfesorTiempoCompleto)profesor).getFacultad() == null 
                    || ((ProfesorTiempoCompleto)profesor).getFacultad().isEmpty())
            {
                throw new AdministradorException("Facultad de Profesor no puede ser vacios");
            }                
                }
        
        return rpta;
    }

    public double getTotalAPagar(String codigo) {
        double rpta = 0;
        Profesor profesor = buscarprofesor(codigo);
        if(profesor != null)
            rpta = profesor.getTotalMensualAPagar();
        return rpta;
    }
    
}
