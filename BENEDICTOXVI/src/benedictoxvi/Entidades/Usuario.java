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
public class Usuario extends BasePersona {
    private String usuario;
    private String contrasenha;
    private String confirmContrasenha;
    private Date fechaIngreso;
    private String cargo;
    private String descripcionCargo;
    private Rol rol;

    public Usuario()
    {
        super();
    }
    public Usuario(int pCodigo, String pUsuario)
    {
        this.usuario = pUsuario;
        this.codigo = pCodigo;
    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public String getConfirmContrasenha() {
        return confirmContrasenha;
    }

    public void setConfirmContrasenha(String confirmContrasenha) {
        this.confirmContrasenha = confirmContrasenha;
    }
    
    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDescripcionCargo() {
        return descripcionCargo;
    }

    public void setDescripcionCargo(String descripcionCargo) {
        this.descripcionCargo = descripcionCargo;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol roles) {
        this.rol = roles;
    }
    
}
