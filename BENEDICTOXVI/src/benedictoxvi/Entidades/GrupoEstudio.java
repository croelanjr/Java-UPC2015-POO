/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author milton
 */
public class GrupoEstudio {
    private int CodigoGrupoEstudio;
    private String Nombre;
    private String Descripcion;
    private String NombreAcademia;
    private Date FechaInicio;
    private Date FechaFin;
    private String Estado;
    private ArrayList<GrupoEstudioDetale> Detalle;

    public int getCodigoGrupoEstudio() {
        return CodigoGrupoEstudio;
    }

    public void setCodigoGrupoEstudio(int CodigoGrupoEstudio) {
        this.CodigoGrupoEstudio = CodigoGrupoEstudio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getNombreAcademia() {
        return NombreAcademia;
    }

    public void setNombreAcademia(String NombreAcademia) {
        this.NombreAcademia = NombreAcademia;
    }
    
    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public ArrayList<GrupoEstudioDetale> getDetalle() {
        return Detalle;
    }

    public void setDetalle(ArrayList<GrupoEstudioDetale> Detalle) {
        this.Detalle = Detalle;
    }
 
    
}
