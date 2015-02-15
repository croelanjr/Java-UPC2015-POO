package Bebidas;

public class Proveedor {
    private String codigo;
    private String nombre;
    private String ruc;
    private String direccion;
    private String correo;

    public Proveedor(String codigo, String nombre, String ruc, String direccion, String correo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.correo = correo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    } 
}
