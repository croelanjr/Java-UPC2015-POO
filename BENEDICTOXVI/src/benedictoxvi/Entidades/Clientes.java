/*
 * Clientes.java
 *
 * Created on 1 de diciembre de 2012, 03:51 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package benedictoxvi.Entidades;

/**
 *
 * @author JOHN
 */
public class Clientes extends BasePersona {
    
    
    public Clientes() {
    }
    
    
    private int celular;
    private String fechaContacto;

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getFechaContacto() {
        return fechaContacto;
    }

    public void setFechaContacto(String fechaContacto) {
        this.fechaContacto = fechaContacto;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    public int getCodigo() {
        return this.codigo;
        
    }

    public void setCodigo(int codigo) {
        this.codigo=codigo;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNroDocumento() {
        return this.nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getTipoDocumento() {
        return this.tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public String getApellidosNombres()
    {
        return this.apellidoPaterno + " " + this.apellidoMaterno + ", " + this.nombre;
    }*/

    public Clientes(int celular, String fechaContacto, boolean estado) {
        this.celular = celular;
        this.fechaContacto = fechaContacto;
        this.estado = estado;
    }
}
