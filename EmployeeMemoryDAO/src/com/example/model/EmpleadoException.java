package com.example.model;

public class EmpleadoException extends Exception {
    public EmpleadoException()
    {
        super();
    }
    
    public EmpleadoException(String mensaje)
    {
        super(mensaje);
    }
    
    public EmpleadoException(Throwable causa)
    {
        super(causa);
    }
    
    public EmpleadoException(String mensaje, Throwable causa)
    {
        super(mensaje, causa);
    }
}
