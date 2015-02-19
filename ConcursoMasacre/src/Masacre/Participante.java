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
class Participante {

    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    private String tipodeparticipante;
    private String subtipoparticipante;
    private String distrito;
    private String numero;
    private int cantidad_mensaje;
    private int puntaje_barra_llamada;
    private int puntaje_equipo;

    public Participante(String nombre, String apellidos, String dni, int edad, String tipodeparticipante, String subtipoparticipante, String distrito, String numero, int cantidad_mensaje, int puntaje_barra_llamada, int puntaje_equipo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
        this.tipodeparticipante = tipodeparticipante;
        this.subtipoparticipante = subtipoparticipante;
        this.distrito = distrito;
        this.numero = numero;
        this.cantidad_mensaje = cantidad_mensaje;
        this.puntaje_barra_llamada = puntaje_barra_llamada;
        this.puntaje_equipo = puntaje_equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipodeparticipante() {
        return tipodeparticipante;
    }

    public void setTipodeparticipante(String tipodeparticipante) {
        this.tipodeparticipante = tipodeparticipante;
    }

    public String getSubtipoparticipante() {
        return subtipoparticipante;
    }

    public void setSubtipoparticipante(String subtipoparticipante) {
        this.subtipoparticipante = subtipoparticipante;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCantidad_mensaje() {
        return cantidad_mensaje;
    }

    public void setCantidad_mensaje(int cantidad_mensaje) {
        this.cantidad_mensaje = cantidad_mensaje;
    }

    public int getPuntaje_barra_llamada() {
        return puntaje_barra_llamada;
    }

    public void setPuntaje_barra_llamada(int puntaje_barra_llamada) {
        this.puntaje_barra_llamada = puntaje_barra_llamada;
    }

    public int getPuntaje_equipo() {
        return puntaje_equipo;
    }

    public void setPuntaje_equipo(int puntaje_equipo) {
        this.puntaje_equipo = puntaje_equipo;
    }
}
