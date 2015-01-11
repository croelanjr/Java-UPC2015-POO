package SistemaTarjetaCredito;

import java.util.*;
import java.lang.*;

public class Bancos {
    private final List<Clientes> cliente;
    
    public Bancos()
    {
        cliente = new ArrayList<>();
    }
    
    public void crearCliente(Clientes client)
    {
        cliente.add(client);
    }
    
    public void crearCliente(List<Clientes> cliente)
    {
        for(Clientes obj: cliente)
        {
            this.cliente.add(obj);
        }
    }

    public void listarInformacion()
    {
        for(Clientes obj: cliente)
        {
            System.out.println(" Cliente: " + obj.getId() +  ", Nombre : " + obj.getNombre() + ", Direccion: " + obj.getDireccion() + ", Telefono: " + obj.getTelefono() + ", Correo: " + obj.getCorreo());
        } 
    }   
    
    public void ClienteIdTarjetActivo(String id)
    {
        Clientes cliente = buscarIdTarjetaActivo(id);
        if(cliente != null)
        {
            System.out.println("Cliente : " + id + " Tarjeta Activada");
        }
    }
    
    private Clientes buscarIdTarjetaActivo(String id)
    {
     for(Clientes obj: cliente)
     
         if(obj.getId().equals(id))
         {
             return obj;
         }
         return null;
    }

    public void ListadoClienteId(String id)
    {
        Clientes cliente = buscarListadoClienteId(id);
        if(cliente != null)
        {
            System.out.println(cliente);
        }
    }
    
    private Clientes buscarListadoClienteId(String id)
    {
     for(Clientes obj: cliente)
     
         if(obj.getId().equals(id))
         {
             return obj;
         }
         return null;
    }
    
    
}


