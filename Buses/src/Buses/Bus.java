package Buses;

import java.util.ArrayList;
import java.util.List;

class Bus {
    private String buscodigo;
    private int disponible;
    private int registrar;
    private ArrayList<String> lista = new ArrayList<String>();
         
    public Bus()
    {
        
    }
    
    public Bus(String buscodigo, int disponible, int registrar) {
        this.buscodigo = buscodigo;
        this.disponible = disponible;
        this.registrar = registrar;
    }

    public String getBuscodigo() {
        return buscodigo;
    }

    public void setBuscodigo(String buscodigo) {
        this.buscodigo = buscodigo;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }

    public int getRegistrar() {
        return registrar;
    }

    public void setRegistrar(int registrar) {
        this.registrar = registrar;
    }

    public ArrayList<String> listar(ArrayList<Bus> buses) {
        for(int i = 0; i < buses.size(); i++)
        {
            Bus bus = buses.get(i);
            this.buscodigo = bus.getBuscodigo();
            this.disponible = bus.getDisponible();
            lista.add("Bus: " + buscodigo + " Registrado: " + disponible);
         }
        return lista;
    }

    public ArrayList<String> disponible(ArrayList<Bus> buses) {
        for(int i = 0; i < buses.size(); i++)
        {
            Bus bus = buses.get(i);
            this.buscodigo = bus.getBuscodigo();
            this.disponible = 40 - bus.getDisponible();
            lista.add("Bus: " + buscodigo + " Disponible: " + disponible);
         }
        return lista;
    }

    public ArrayList<String> registrarAsientos(ArrayList<Bus> buses) {
        String notifica = null;
        for(int i = 0; i < buses.size(); i++)
        {
            Bus bus = buses.get(i);
            this.buscodigo = bus.getBuscodigo();
            this.disponible = bus.getDisponible() + bus.getRegistrar();
            if(disponible == 41)
            {
                lista.add("Bus: " + buscodigo + " Nuevo Registro: " + "Asiento Lleno"); 
            }
            else
            {
                lista.add("Bus: " + buscodigo + " Nuevo Registro: " + disponible);
            }
        }
        return lista;
    }

    



    
    
    
}
