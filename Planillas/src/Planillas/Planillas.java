package Planillas;

import java.util.ArrayList;

class Planillas {
    private String nombre;
    private String dni;
    private String trabajadores;
    private double htSb;
    private double hecv;
    
    public Planillas()
    {
        
    }

    public Planillas(String nombre, String dni, String trabajadores, double htSb, double hecv) {
        this.nombre = nombre;
        this.dni = dni;
        this.trabajadores = trabajadores;
        this.htSb = htSb;
        this.hecv = hecv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(String trabajadores) {
        this.trabajadores = trabajadores;
    }

    public double getHtSb() {
        return htSb;
    }

    public void setHtSb(double htSb) {
        this.htSb = htSb;
    }

    public double getHecv() {
        return hecv;
    }

    public void setHecv(double hecv) {
        this.hecv = hecv;
    }
    
    public double calcular(String trabajadores, double htSb, double hecv)
    {
        double total = 0.0;
        if(trabajadores == "Obrero")
            total = (htSb * 25) + (hecv * 50);
        else if(trabajadores == "Administrativo")
            total = htSb + (hecv * 0.05);
        else if(trabajadores == "Practicante")
            total = htSb - (htSb * 0.12);
        return total;
    }
    
    public String buscartrabajor(String trabajadores, double htSb, double hecv)
    {
        String mensaje = null;
        if(trabajadores == "Obrero")
            mensaje = "Horas Trabajadas: " + (int) htSb + "\nHoras Extras: " + (int) hecv;
        else if(trabajadores == "Administrativo")
            mensaje = "Sueldo Base: " + htSb + "\nVolumen de Ventas: " + hecv;
        else if(trabajadores == "Practicante")
            mensaje = "Sueldo Base: " + htSb;
        return mensaje;
    }

    public String listarpantalla(ArrayList<Planillas> planilla) {
        int horatrabajada;
        int horaextras; 
        for(int i = 0; i < planilla.size(); i++)
        {
            Planillas cadena = planilla.get(i);
            this.nombre = cadena.getNombre();
            this.dni = cadena.getDni();
            this.trabajadores = cadena.getTrabajadores();
            this.htSb = cadena.getHtSb();
            this.hecv = cadena.getHecv();
            if(trabajadores == "Obrero")
            {
                horatrabajada = (int) htSb;
                horaextras = (int) hecv;                        
                System.out.println(nombre + "\t" + dni + "\t" + trabajadores + "\t" + "Horas Trabajadas : " + horatrabajada + " Horas Extras : " + horaextras);
            
            }
            else if(trabajadores == "Administrativo") 
            {
                System.out.println(nombre + "\t" + dni + "\t" + trabajadores + "\t" + "Sueldo Base : " + htSb + " Ventas : " + hecv); 
            }
            else if(trabajadores == "Practicante")
            {
                System.out.println(nombre + "\t" + dni + "\t" + trabajadores + "\t" + "Sueldo Base : " + htSb);                
            }
                   
        }
        return "++++++++++++++++++++++++++++++++++++++++++++++++";
    }

    public String validaregistro(String buscardni, ArrayList<Planillas> planilla) { 
        String mensaje = null;
        String mensajes = null;
        for(int i = 0; i < planilla.size(); i++)
        {
            Planillas cadena = planilla.get(i);
            if(buscardni.equals(cadena.getDni()))
            {
                mensaje = "Este trabajador con " + buscardni + " ESTA REGISTRADO";
                mensajes = "registrado";
                break;
            }
            else if(!buscardni.equals(cadena.getDni()))
            {          
                mensaje = "Este trabajador con " + buscardni + " NO ESTA REGISTRADO";
                mensajes = "no registrado";
            }        
        }
        System.out.println(mensaje);
        return mensajes;
    }

    public double listartotal(ArrayList<Planillas> planilla) {
        double totales = 0.0;
        double monto = 0.0;
        for(int i = 0; i < planilla.size(); i++)
        {
            Planillas cadena = planilla.get(i);
            this.nombre = cadena.getNombre();
            this.dni = cadena.getDni();
            this.trabajadores = cadena.getTrabajadores();
            this.htSb = cadena.getHtSb();
            this.hecv = cadena.getHecv();
            Planillas opera = new Planillas();
            monto = opera.calcular(trabajadores, htSb, hecv);
            System.out.println(nombre + "\t" + dni + "\t" +
                    trabajadores + "\t" + monto);
            totales = totales + monto;
        }
        System.out.println("Monto Total de los Trabajadores : " + totales);
        return totales;        
    }

    public int calcularCantidad(ArrayList<Planillas> planilla) {
        double totales = 0.0;
        double monto = 0.0;
        int contador = 0;
        for(int i = 0; i < planilla.size(); i++)
        {
            Planillas cadena = planilla.get(i);
            this.nombre = cadena.getNombre();
            this.dni = cadena.getDni();
            this.trabajadores = cadena.getTrabajadores();
            this.htSb = cadena.getHtSb();
            this.hecv = cadena.getHecv();
            Planillas opera = new Planillas();
            monto = opera.calcular(trabajadores, htSb, hecv);
            System.out.println(nombre + "\t" + dni + "\t" +
                    trabajadores + "\t" + monto);
            totales = totales + monto;
            contador = contador + 1;
        }
        System.out.println("Monto Total de los Trabajadores : " + totales);
        System.out.println("La Cantidad de Trabajadores : " + contador);
        return contador;
    }

    public String saberElSueldo(String buscar, ArrayList<Planillas> planilla) {
        String mensajes = null;
        double monto = 0.0;
        for(int i = 0; i < planilla.size(); i++)
        {
            Planillas cadena = planilla.get(i);
            if(buscar == cadena.getDni())
            {
                this.nombre = cadena.getNombre();
                this.dni = cadena.getDni();
                this.trabajadores = cadena.getTrabajadores();
                this.htSb = cadena.getHtSb();
                this.hecv = cadena.getHecv();
                mensajes = cadena.buscartrabajor(trabajadores, htSb, hecv);
                monto = cadena.calcular(trabajadores, htSb, hecv);
                System.out.println("******************************************");
                System.out.println("Nombre : " + nombre);
                System.out.println("DNI Nro. : " + dni);
                System.out.println("Tipo de Trabajador : " + trabajadores);
                System.out.println("Detalles : \n" + mensajes);
                System.out.println("Monto de la planilla : " + monto);
                System.out.println("******************************************");
            }     
        }
        return dni;        
    } 
}