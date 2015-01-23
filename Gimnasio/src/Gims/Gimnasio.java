package Gims;

import java.util.ArrayList;

class Gimnasio {
    private String cliente;
    private String meses;
    private String tipo;
    private double monto;
    private ArrayList<String> lista = new ArrayList<String>();

    public Gimnasio(String cliente, String meses, String tipo, double monto) {
        this.cliente = cliente;
        this.meses = meses;
        this.tipo = tipo;
        this.monto = monto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getMeses() {
        return meses;
    }

    public void setMeses(String meses) {
        this.meses = meses;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String listarpantalla(ArrayList<Gimnasio> gimnasio) {
        int indice = 0;
        for(int i = 0; i < gimnasio.size(); i++)
        {
            Gimnasio gimn = gimnasio.get(i);
            this.cliente = gimn.getCliente();
            this.meses = gimn.getMeses();
            this.tipo = gimn.getTipo();
            this.monto = gimn.getMonto();
            lista.add("Meses: " + meses + " tipo: " + tipo + " Monto: " + monto);
            indice = indice + 1;
        }
        return lista + "\nLa cantidad de pago es: " + indice;
    }

    public String listaconcargoPantalla(ArrayList<Gimnasio> gimnasio) {
        double total = 0.0;
        int indice = 0;
        for(int i = 0; i < gimnasio.size(); i++)
        {
            Gimnasio gimn = gimnasio.get(i);
            this.cliente = gimn.getCliente();
            this.meses = gimn.getMeses();
            this.tipo = gimn.getTipo();
            //this.monto = gimn.getMonto();
            if(tipo == "Tarjeta")
            {
                indice = indice + 1;
                this.monto = gimn.getMonto() + (gimn.getMonto() * 0.05);
                lista.add("Meses: " + meses + " tipo: " + tipo + " Monto: " + monto);
            }
            else
            {
                this.monto = gimn.getMonto();
                lista.add("Meses: " + meses + " tipo: " + tipo + " Monto: " + monto);   
            }
            total = total + monto;
        }
        
        return lista + "\nMonto Total: " + total + "\nLa Cantidad de Pago con Tarjeta: " + indice;
    }
}
