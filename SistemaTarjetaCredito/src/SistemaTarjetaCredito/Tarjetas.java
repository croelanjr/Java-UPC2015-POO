package SistemaTarjetaCredito;

import java.lang.*;

public class Tarjetas {
    private Clientes id;
    private String codigobarra;
    private String tipotarjeta;
    private String activacion;
    private String estado;
    private String listado;

    public Tarjetas(Clientes id, String codigobarra, String tipotarjeta, String activacion) {
        this.id = id;
        this.codigobarra = codigobarra;
        this.tipotarjeta = tipotarjeta;
        this.activacion = activacion;
    }

    public Clientes getId() {
        return id;
    }

    public String getCodigobarra() {
        return codigobarra;
    }

    public String getActivacion() {
        return activacion;
    }

    public String getTipotarjeta() {
        return tipotarjeta;
    } 

    public void setId(Clientes id) {
        this.id = id;
    }

    public void setCodigobarra(String codigobarra) {
        this.codigobarra = codigobarra;
    }

    public void setTipotarjeta(String tipotarjeta) {
        this.tipotarjeta = tipotarjeta;
    }

    public void setActivacion(String activacion) {
        this.activacion = activacion;
    }
    
    
    @Override
    public String toString() 
    {
        if(activacion == "Activo")
        {
           estado = activacion;
           return "Tarjetas{" + "Código: " + id.getId() + ", Tipo de Tarjeta: " + tipotarjeta + ", Nro. Tarjeta: " + codigobarra + ", Estado: " + estado + '}' + "\n";
        }
        return null;
    }
    

}

