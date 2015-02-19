package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAOMemoryImpl implements EmpleadoDAO{

    private static Empleado[] empleadoArray =
            new Empleado[10];
    
    EmpleadoDAOMemoryImpl()
    {
        
    }
    
    @Override
    public void add(Empleado emp) throws EmpleadoException {
        if(empleadoArray[emp.getId()] != null) {
            throw new EmpleadoException("Error adicionar empleado, el documento de empleado ya existe " + emp.getId());
        }
        try {        
        empleadoArray[emp.getId()] = emp;
            } catch (ArrayIndexOutOfBoundsException e) {
            throw new EmpleadoException("Error adicionar empleado, el documento debe ser diferente " + empleadoArray.length);
        }
    }

    //@Override
    public void update(Empleado emp) throws EmpleadoException{
        if(empleadoArray[emp.getId()] == null) {
            throw new EmpleadoException("Error actualizar empleado, existe este empleado " + emp.getId());
        }
        try {        
        empleadoArray[emp.getId()] = emp;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new EmpleadoException("Error actualizar empleado, existe este empleado en " + empleadoArray.length);
        }
    }
    

    //@Override
    public void delete(int id) throws EmpleadoException {
        if(empleadoArray[id] == null) {
            throw new EmpleadoException("Error borrar empleado, no existe empleado " + id);
        }
        try {
        empleadoArray[id] = null;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new EmpleadoException("Error borrar empleado, documento no existe en " + empleadoArray.length);
        }        
    }

    //@Override
    public Empleado findById(int id) throws EmpleadoException {
        try {
        return empleadoArray[id];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new EmpleadoException("Error buscar empleado", e);
        }
    }

    @Override
    public Empleado[] getAllEmpleados() {
        List<Empleado> emps = new ArrayList<>();
        for(Empleado e: empleadoArray){
            if(e!=null){
                emps.add(e);
            }
        }
        return emps.toArray(new Empleado[0]);
    }

    @Override
    public void close() {
        System.out.println("No hay Conexión en la base datos para cerrar");
    }
    
}
