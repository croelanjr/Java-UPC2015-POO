package Orion;

import java.util.ArrayList;

class Planilla {

    private String trabajador;
    private String dni;
    private double sueldo;
    private int horas;
    private double ventas;
    private ArrayList<String> lista = new ArrayList<String>();

    public Planilla(String trabajador, String dni, double sueldo, int horas, double ventas) {
        this.trabajador = trabajador;
        this.dni = dni;
        this.sueldo = sueldo;
        this.horas = horas;
        this.ventas = ventas;
    }
    
    public Planilla() {
    }

    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double Comision(double ventas)
    {
        double porcentaje = 0;
        if(ventas < 1700.00)
            porcentaje = 0.0;
        else if (1700.00 >= ventas || ventas < 2500.00)
            porcentaje = 0.03;
        else if (2500.00 >= ventas || ventas < 3200.00)
            porcentaje = 0.05;
        else if (3200.00 >= ventas || ventas < 3700.00)
            porcentaje = 0.07;
        else if (3700.00 >= ventas)
            porcentaje = 1.0;
        return porcentaje;
    }

    public String listarpantalla(ArrayList<Planilla> planillas) {
        int indice = 0;
        double total = 0.0;
        for(int i = 0; i < planillas.size(); i++)
        {
            Planilla plan = planillas.get(i);
            this.trabajador = plan.getTrabajador();
            this.dni = plan.getDni();
            this.sueldo = plan.getSueldo();
            this.horas = plan.getHoras();
            this.ventas = plan.getVentas();
            System.out.println("*************************************************");
            System.out.println("Trabajador: " + trabajador + " DNI: " + dni);
            System.out.println("Sueldo Básico: S/. " + sueldo);
            System.out.println("Horas Extras : " + horas + " Monto: S/. " + getCalculoExtra(horas));
            System.out.println("Ventas realizadas: " + ventas + " Comisión : S/." + getCalculoComision(ventas));
            System.out.println("Sueldo Total del Trabajador: S/. " + getCalculoSueldoTotal(sueldo, horas, ventas));
            System.out.println("*************************************************");             
            indice = indice + 1;
            total = total + getCalculoSueldoTotal(sueldo, horas, ventas);
        }
        return "Planilla Total de la Empresa de " + indice + " trabajadores : S/. " + total;  
    }

    public double getCalculoExtra(int horas) {
        return horas * 5.0;
    }

    public double getCalculoComision(double ventas) {
        return Math.round((ventas * Comision(ventas)*100))/100.00;
    }

    public double getCalculoSueldoTotal(double sueldo, int horas, double ventas) {
        return sueldo + getCalculoExtra(horas) + getCalculoComision(ventas);
    }

    public double getTotalEmpresa(ArrayList<Planilla> planillas) {
        double total = 0.0;
        for(int i = 0; i < planillas.size(); i++)
        {
            Planilla plan = planillas.get(i);
            this.sueldo = plan.getSueldo();
            this.horas = plan.getHoras();
            this.ventas = plan.getVentas();
            total = total + getCalculoSueldoTotal(sueldo, horas, ventas);
        }
        return total;
    }    
}