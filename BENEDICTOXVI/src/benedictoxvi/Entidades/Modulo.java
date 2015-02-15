/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Entidades;

/**
 *
 * @author milton
 */
public class Modulo {
    private String codigoModulo;
    private String nombreModulo;
    private String descripcionModulo;
    private boolean acceso;
    private boolean adicionar;
    private boolean editar;
    private boolean eliminar;

    public Modulo()
    {
    }
    public Modulo(String pCodigoModulo, String pNombreModulo, String pDescripcion, boolean pAcceso, boolean pAdicionar, boolean pEditar, boolean pEliminar)
    {
        this.codigoModulo = pCodigoModulo;
        this.nombreModulo = pNombreModulo;
        this.descripcionModulo = pDescripcion;
        this.acceso = pAcceso;
        this.adicionar = pAdicionar;
        this.editar = pEditar;
        this.eliminar = pEliminar;
    }
    
    public String getCodigoModulo() {
        return codigoModulo;
    }

    public void setCodigoModulo(String codigoModulo) {
        this.codigoModulo = codigoModulo;
    }

    public String getNombreModulo() {
        return nombreModulo;
    }

    public void setNombreModulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
    }

    public String getDescripcionModulo() {
        return descripcionModulo;
    }

    public void setDescripcionModulo(String descripcionModulo) {
        this.descripcionModulo = descripcionModulo;
    }

    public boolean isAcceso() {
        return acceso;
    }

    public void setAcceso(boolean acceso) {
        this.acceso = acceso;
    }

    public boolean isAdicionar() {
        return adicionar;
    }

    public void setAdicionar(boolean adicionar) {
        this.adicionar = adicionar;
    }

    public boolean isEditar() {
        return editar;
    }

    public void setEditar(boolean editar) {
        this.editar = editar;
    }

    public boolean isEliminar() {
        return eliminar;
    }

    public void setEliminar(boolean eliminar) {
        this.eliminar = eliminar;
    }
    
    
}
