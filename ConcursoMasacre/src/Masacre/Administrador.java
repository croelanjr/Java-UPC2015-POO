/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Masacre;

/**
 *
 * @author TOSHIBA
 */

import java.util.ArrayList;

class Administrador {
    private String ganador;
    private int puntaje;
    ArrayList<Administrador> resultado = new ArrayList<>();
    
    public Administrador(){
        
    }

    public Administrador(String ganador, int puntaje) {
        this.ganador = ganador;
        this.puntaje = puntaje;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public ArrayList<Administrador> getResultado() {
        return resultado;
    }

    public void setResultado(ArrayList<Administrador> resultado) {
        this.resultado = resultado;
    }

    public int CalculandoPuntaje(int cantidad_mensaje, int puntaje_barra_llamada, int puntaje_equipo, String tipodeparticipante) {
        int total = 0;
        if (tipodeparticipante == "fan Masacre") {
            total = (cantidad_mensaje * 3) + puntaje_barra_llamada + puntaje_equipo;
        } else if (tipodeparticipante == "publico") {
            total = (cantidad_mensaje * 2) + (puntaje_barra_llamada * 3);
        } else if (tipodeparticipante == "televidente") {
            total = (cantidad_mensaje * 3) + puntaje_barra_llamada;
        }
        return total;
    }    
    
    public void getLista(ArrayList<Participante> lista) {
        int punto_total = 0;
        for (int i = 0; i < lista.size(); i++) {
            Participante registro = lista.get(i);
            punto_total = CalculandoPuntaje(registro.getCantidad_mensaje(), registro.getPuntaje_barra_llamada(), registro.getPuntaje_equipo(), registro.getTipodeparticipante());
            System.out.println("Nombre : " + registro.getNombre() + " Puntos : " + punto_total);
        }        
    }
    
    public void getValidarEdad(ArrayList<Participante> lista, int buscar) {
        String mensaje = null;
        for (int i = 0; i < lista.size(); i++) {
            Participante registro = lista.get(i);
            if (buscar > registro.getEdad()) {
                System.out.println("El participante " + registro.getNombre() + "NO ACEpta");
            } else {
                System.out.println("El partcipante " + registro.getNombre() + " ACEpta");     
            }
        }
    }


    public void getParticipanteGanador(ArrayList<Participante> lista) {
        int puntaje = 0;
        for (int i = 0; i < lista.size(); i++) {
            Participante registro = lista.get(i);
            puntaje = CalculandoPuntaje(registro.getCantidad_mensaje(), registro.getPuntaje_barra_llamada(), registro.getPuntaje_equipo(), registro.getTipodeparticipante());
            Administrador resulta = new Administrador(registro.getNombre(), puntaje);
            resultado.add(resulta);
        }
        
        int total = resultado.get(0).getPuntaje();
        String ganador = resultado.get(0).getGanador();
        for (int a = 0; a < resultado.size(); a++) {
            if (resultado.get(a).getPuntaje() > total) {
                ganador = resultado.get(a).getGanador();
                total = resultado.get(a).getPuntaje();
            }
        }
        System.out.println("El ganador es : " + ganador + " " + total);
    }

    public void getCreandoParticipante(Participante participante) {
        ArrayList<Participante> creado = new ArrayList<>();
        creado.add(participante);
        System.out.println("Concursante Creado");
    }

    public void getVerificarMenorEdad(ArrayList<Participante> lista) {
        String mensaje = null;
        for (int i = 0; i < lista.size(); i++) {
            Participante registro = lista.get(i);
            if (18 > registro.getEdad()) {
                System.out.println("El participante " + registro.getNombre() + " " + registro.getEdad() + "");
            }
        }        
    }

    public void getVerificarCantidadTotal(ArrayList<Participante> lista) {
        int puntajes = 0;
        int total = 0;
        int contador = 0;
        for(int a = 0; a < lista.size(); a++)
        {
            Participante registro = lista.get(a);
            puntajes = CalculandoPuntaje(registro.getCantidad_mensaje(), registro.getPuntaje_barra_llamada(), registro.getPuntaje_equipo(), registro.getTipodeparticipante());
            total = total + puntajes;
            contador += 1;
        }
        System.out.println("La Cantidad Total de concursantes que participan : " + contador + " participantes.");
    }        
    }
