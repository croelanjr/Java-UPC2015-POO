package Bonus;

import java.util.ArrayList;

class Bonus {
    private String cliente;
    private String dni;
    private String fecha;
    private int punto;
    private double monto;

    public Bonus()
    {
        
    }
    public Bonus(String cliente, String dni, String fecha, int punto) {
        this.cliente = cliente;
        this.dni = dni;
        this.fecha = fecha;
        this.punto = punto;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPunto() {
        return punto;
    }

    public void setPunto(int punto) {
        this.punto = punto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
        
    public ArrayList<Bonus> listabonus()
    {
        Bonus bonus1 = new Bonus("Croelan Grandez", "10260429", "29-01-2015", 123);
        Bonus bonus2 = new Bonus("Manuel Ramos", "10260428", "29-01-2015", 153);
        Bonus bonus3 = new Bonus("Rosa Oliver", "10260430", "29-01-2015", 163);
        Bonus bonus4 = new Bonus("Yndira Leon", "10260431", "30-01-2015", 173);
        Bonus bonus5 = new Bonus("Francisco Toro", "10260432", "29-01-2015", 180);
        Bonus bonus6 = new Bonus("Miguel Grau", "10260433", "29-01-2015", 193);
        Bonus bonus7 = new Bonus("Alfonso Ugarte", "10260434", "29-01-2015", 23);
        Bonus bonus8 = new Bonus("Simon Bolivar", "10260435", "29-01-2015", 223);
        ArrayList<Bonus> bonus = new ArrayList<>();
        bonus.add(bonus1);
        bonus.add(bonus2);
        bonus.add(bonus3);
        bonus.add(bonus4);
        bonus.add(bonus5);
        bonus.add(bonus6);
        bonus.add(bonus7);
        bonus.add(bonus8);
        return bonus;
    }

    public String listarpantalla(ArrayList<Bonus> bonus) {
        int total = 0;
        for(int i = 0; i < bonus.size(); i++)
        {
            Bonus bonu = bonus.get(i);
            this.cliente = bonu.getCliente();
            this.dni = bonu.getDni();
            this.fecha = bonu.getFecha();
            this.punto = bonu.getPunto();
            System.out.println(cliente + "\t" + dni + "\t" + fecha + "\t" + punto);
            total = total + punto;
        }
        System.out.println("******************************************************");
        return "Total de Puntos de los Clientes: " + total;
    }

    public String getMostrarCliente(String dni) {
        Bonus obtener = new Bonus();
        ArrayList<Bonus> lista = obtener.listabonus();
        for(int i = 0; i < lista.size();i++)
        {   
            Bonus p = lista.get(i);
            if(dni == p.getDni())
            {
            this.cliente = p.getCliente();
            this.dni = p.getDni();
            this.fecha = p.getFecha();
            this.punto = p.getPunto();
                System.out.println("Cliente: " +  cliente);
                System.out.println("DNI: " + dni);
                System.out.println("Fecha: " + fecha);
                System.out.println("Puntos Acumulados: " + punto);
                System.out.println("**********************");
            }   
        }
        return cliente;
    }

    public Object getCalcularCliente(String dni, Double monto) {
        Bonus obtener = new Bonus();
        ArrayList<Bonus> lista = obtener.listabonus();
        for(int i = 0; i < lista.size();i++)
        {   
            Bonus p = lista.get(i);
            if(dni == p.getDni())
            {
            this.cliente = p.getCliente();
            this.dni = p.getDni();
            this.fecha = p.getFecha();
            int puntos = (int) (monto / 7.00);
            this.punto = p.getPunto() + puntos;
            System.out.println("Cliente: " +  cliente);
            System.out.println("DNI: " + dni);
            System.out.println("Fecha: " + fecha);
            System.out.println("Puntos Acumulados: " + punto);
            System.out.println("**********************");
            }   
        }
        return punto;

    }

    public int calcularPuntosTotales(ArrayList<Bonus> bonus) {
        int total = 0;
        for(int i = 0; i < bonus.size(); i++)
        {
            Bonus bonu = bonus.get(i);
            this.cliente = bonu.getCliente();
            this.dni = bonu.getDni();
            this.fecha = bonu.getFecha();
            this.punto = bonu.getPunto();
            System.out.println(cliente + "\t" + dni + "\t" + fecha + "\t" + punto);
            total = total + punto;
        }
        System.out.println("******************************************************");
        System.out.println("Total de Puntos de los Clientes: " + total);
        return total;
    }
}
