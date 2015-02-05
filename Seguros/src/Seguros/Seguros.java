package Seguros;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

class Seguros {
    private String cliente;
    private String dni;
    private int aniofabricacion;
    private String transporte;
    private double mercado;
    Calendar fecha = new GregorianCalendar();
    private int anio = fecha.get(Calendar.YEAR);
    
    public Seguros()
    {
        
    }

    public Seguros(String cliente, String dni, int aniofabricacion, String transporte, double mercado) {
        this.cliente = cliente;
        this.dni = dni;
        this.aniofabricacion = aniofabricacion;
        this.transporte = transporte;
        this.mercado = mercado;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getAniofabricacion() {
        return aniofabricacion;
    }

    public void setAniofabricacion(int aniofabricacion) {
        this.aniofabricacion = aniofabricacion;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public double getMercado() {
        return mercado;
    }

    public void setMercado(double mercado) {
        this.mercado = mercado;
    }
    
        
    public double costoPrima(int aniofabricacion, String transporte, double mercado)
    {
        double precio = 0.0;
        if(transporte == "publico")
            precio = (( mercado * 1.15 ) / 2.25 ) - (((anio - aniofabricacion) / 100.0) * mercado);  
        else if(transporte == "privado")
            precio = ( mercado * 0.5 ) - (((anio - aniofabricacion) / 100.00) * mercado);
        else if(transporte == "lujo")
            precio = mercado * 0.12;
        return precio;
    }

    public double calcularPrimaPublico(ArrayList<Seguros> seguro) {
        double monto = 0.0;
        for(int i = 0; i < seguro.size(); i++)
        {
            Seguros recorrido = seguro.get(i);
            if( recorrido.getTransporte() == "publico"){
            this.cliente = recorrido.getCliente();
            this.dni = recorrido.getDni();
            this.transporte = recorrido.getTransporte();
            this.aniofabricacion = recorrido.getAniofabricacion();
            this.mercado = recorrido.getMercado();
            monto = costoPrima(aniofabricacion, transporte, mercado);
            }
        }
        System.out.println("***************************");
        System.out.println("Cliente : " + cliente);
        System.out.println("DNI: " + dni);
        System.out.println("Año de Fabricación: " + aniofabricacion);
        System.out.println("Transporte: " + transporte);
        System.out.println("Precio del Mercado: " + mercado);
        System.out.println("*****************************");
        System.out.println("Costo de la Prima : " + Math.round(monto*100) / 100.0);
        System.out.println("");
        return Math.round(monto*100) / 100.0;
    }

    public double calcularPrimaPrivado(ArrayList<Seguros> seguro) {
        double monto = 0.0;
        for(int i = 0; i < seguro.size(); i++)
        {
            Seguros recorrido = seguro.get(i);
            if( recorrido.getTransporte() == "privado"){
            this.cliente = recorrido.getCliente();
            this.dni = recorrido.getDni();
            this.transporte = recorrido.getTransporte();
            this.aniofabricacion = recorrido.getAniofabricacion();
            this.mercado = recorrido.getMercado();
            monto = costoPrima(aniofabricacion, transporte, mercado);
            }
        }
        System.out.println("***************************");
        System.out.println("Cliente : " + cliente);
        System.out.println("DNI: " + dni);
        System.out.println("Año de Fabricación: " + aniofabricacion);
        System.out.println("Transporte: " + transporte);
        System.out.println("Precio del Mercado: " + mercado);
        System.out.println("*****************************");
        System.out.println("Costo de la Prima : " + Math.round(monto*100) / 100.0);
        System.out.println("");
        return Math.round(monto*100) / 100.0;  
    }

    public double calcularTotalPrimaCliente(ArrayList<Seguros> seguro) {
        double total = 0.0;
        double monto = 0.0;
        for(int i = 0; i < seguro.size(); i++)
        {
            Seguros recorrido = seguro.get(i);
            this.cliente = recorrido.getCliente();
            this.dni = recorrido.getDni();
            this.transporte = recorrido.getTransporte();
            this.aniofabricacion = recorrido.getAniofabricacion();
            this.mercado = recorrido.getMercado();
            monto = Math.round(costoPrima(aniofabricacion, transporte, mercado)*100) / 100.00;
            System.out.println(cliente + "\t" + dni + "\t" + transporte 
                    + "\t\t" + aniofabricacion + "\t" + mercado + "\t" + monto);
            total = total + monto;
        }
        System.out.println("************************************************************************");
        System.out.println("El monto total a Pagar : S/. " + Math.round(total*100) / 100.0);
        return Math.round(total*100) / 100.0;   
    }  
}
