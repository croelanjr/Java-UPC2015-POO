/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Entidades;

/**
 *
 * @author milton
 */
abstract class BasePersona {
    protected int codigo;
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected String sexo;
    protected String nroDocumento;
    protected String tipoDocumento;
    protected String estadoCivil;
    protected boolean estado;  
    protected String email;
    protected String telefono;
    
    
    public BasePersona()
    {}
    
    public BasePersona(int pCodigo, String pNombre, String pApellidoPaterno, String pApellidoMaterno)
    {
        this.codigo = pCodigo;
        this.nombre = pNombre;
        this.apellidoPaterno = pApellidoPaterno;
        this.apellidoMaterno = pApellidoMaterno; 
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    
    

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
     public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public String getApellidosNombres()
    {
        return this.apellidoPaterno + " " + this.apellidoMaterno + ", " + this.nombre;
    }

}
