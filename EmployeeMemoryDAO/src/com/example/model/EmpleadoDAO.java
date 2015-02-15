package com.example.model;

public interface EmpleadoDAO extends AutoCloseable 
{
    public void add(Empleado emp) throws EmpleadoException;
    public void update(Empleado emp) throws EmpleadoException;
    public void delete(int id) throws EmpleadoException;
    public Empleado findById(int id) throws EmpleadoException;
    public Empleado[] getAllEmpleados() throws EmpleadoException; 
    
}
