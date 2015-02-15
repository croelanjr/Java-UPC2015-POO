package com.example.model;

public class EmpleadoDAOFactory {

    public EmpleadoDAO crearEmpleadoDAO()
    {
        return new EmpleadoDAOMemoryImpl();
    }
}
