package TvMasacre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Administrador {
    private String Concursante;
    private int puntaje;
    ArrayList<Participante> registro = new ArrayList<Participante>();

    public Administrador(String Concursante, int puntaje) {
        this.Concursante = Concursante;
        this.puntaje = puntaje;
    }

    public Administrador() {
        
    }

    public String getConcursante() {
        return Concursante;
    }

    public void setConcursante(String Concursante) {
        this.Concursante = Concursante;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int calculoPuntaje(String tipo, int punto_Masacre, int cantidad_Mensaje, int punto_barra_llamada)
    {
        int puntaje = 0;
        if(tipo == "Masacre")
            puntaje = (cantidad_Mensaje * 3) + punto_barra_llamada + punto_Masacre;
        else if(tipo == "Publico")
            puntaje = (cantidad_Mensaje * 2) + (punto_barra_llamada * 3);
        else if(tipo == "Televidente")
            puntaje = (cantidad_Mensaje * 3) + (punto_barra_llamada * 3);
        return puntaje;
    }
    
    public void listapantalla(ArrayList<Participante> registro) {
        int puntajes = 0;
        for(int a = 0; a < registro.size(); a++)
        {
            Participante obj = registro.get(a);
            puntajes = calculoPuntaje(obj.getTipo(), obj.getPunto_Masacre(), obj.getCantidad_Mensaje(), obj.getPunto_barra_llamada());
            System.out.println(obj.getNombre() + "\t" + obj.getEdad() + "\t" + obj.getTipo() + " " + obj.getTipoMasacre() + "\t\t" + puntajes);
        }
    }

    public void agregarRegistro(Participante participante) {
        registro.add(participante);
    }

    public void listapantalla() {
        int puntajes = 0;
        for(int a = 0; a < registro.size(); a++)
        {
            Participante obj = registro.get(a);
            puntajes = calculoPuntaje(obj.getTipo(), obj.getPunto_Masacre(), obj.getCantidad_Mensaje(), obj.getPunto_barra_llamada());
            System.out.println(obj.getNombre() + "\t" + obj.getEdad() + "\t" + obj.getTipo() + " " + obj.getTipoMasacre() + "\t\t" + puntajes);
        }
    }
    
}

class Concursante extends Administrador
{

    public Concursante(String Concursante, int puntaje) {
        super(Concursante, puntaje);
    }

    public Concursante() {
    }

    public void verificarGanador(ArrayList<Participante> registro) {
        int puntajes = 0;
        ArrayList<Administrador> concursante = new ArrayList<>();
        for(int a = 0; a < registro.size(); a++)
        {
            Participante obj = registro.get(a);
            puntajes = calculoPuntaje(obj.getTipo(), obj.getPunto_Masacre(), obj.getCantidad_Mensaje(), obj.getPunto_barra_llamada());
            Administrador concurso = new Administrador(obj.getNombre(), puntajes);
            concursante.add(concurso);
        }
        int totalganador = concursante.get(0).getPuntaje();
        String ganador = concursante.get(0).getConcursante();
        for(int b = 0; b < concursante.size(); b++)
        {
            if(totalganador < concursante.get(b).getPuntaje())
            {
                totalganador = concursante.get(b).getPuntaje();
                ganador = concursante.get(b).getConcursante();
            }   
        }
        System.out.println("El concursante Ganador es : " + ganador + " " + totalganador);
    }

    public void verificaMenorEdad(ArrayList<Participante> registro) {
        for(int a = 0; a < registro.size(); a++)
        {
            Participante obj = registro.get(a);
            if(obj.getEdad() < 18)
            {
                System.out.println("El Concursante " + obj.getNombre() + " tiene " + obj.getEdad() + " años no puede participar");
            }
        }        
    }

    public void getTotalPuntajeConcursante(ArrayList<Participante> registro) {
        int puntajes = 0;
        int total = 0;
        for(int a = 0; a < registro.size(); a++)
        {
            Participante obj = registro.get(a);
            puntajes = calculoPuntaje(obj.getTipo(), obj.getPunto_Masacre(), obj.getCantidad_Mensaje(), obj.getPunto_barra_llamada());
            total = total + puntajes;
        }
        System.out.println("La Cantidad de Puntajes Totales de Los Concursantes : " + total);
    }
}