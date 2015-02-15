/*
 * Prospecto.java
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
public class Prospecto extends BasePersona {
    
    /** Creates a new instance of Prospecto */
    public Prospecto() {
        
    }
    private int celular;
    private String fechacontacto;
    private boolean escliente;

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getFechacontacto() {
        return fechacontacto;
    }

    public void setFechacontacto(String fechacontacto) {
        this.fechacontacto = fechacontacto;
    }

    public boolean isEscliente() {
        return escliente;
    }

    public void setEscliente(boolean escliente) {
        this.escliente = escliente;
    }
    
    
    
}
