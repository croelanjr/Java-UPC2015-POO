/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Entidades;

/**
 *
 * @author milton
 */
public class Aula {
     private int codigoAula;
     private String descripcion;
     private int capacidad;

    public Aula(int pCodigoAula, String pDescripcion, int pCapacidad)
    {
        this.codigoAula = pCodigoAula;
        this.descripcion = pDescripcion;
        this.capacidad = pCapacidad;
    }
    public int getCodigoAula() {
        return codigoAula;
    }

    public void setCodigoAula(int CodigoAula) {
        this.codigoAula = CodigoAula;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.capacidad = Capacidad;
    }
     
}
