package SistemaTarjetaCredito;

import java.util.*;
import java.lang.*;

public class Clientes {
    private String id;
    private String nombre;
    private String telefono;
    private String direccion;
    private String correo;
    private List<Tarjetas> informacion;

    public Clientes(String id, String nombre, String telefono, String direccion, String correo) 
    {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
    }

    public void setInformacion(List<Tarjetas> informacion)
    {
        this.informacion = informacion;
    }
    
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    
    @Override
    public String toString() {
        return "Clientes{" + "Codigo: " + id + ", Nombre: " + nombre + ", Telefono :" + telefono + ", Direccion :" + direccion + ", Correo :" + correo + "\n" + ", Informacion :" + informacion + '}';
    } 
}
