package TarjetasPromociones;

class Clientes {
    private String nombre;
    private String dni;
    private String codigo;
    private String fecha;
    private int punto;
    private String tipo;

    public Clientes(String nombre, String dni, String codigo, String fecha, int punto, String tipo) {
        this.nombre = nombre;
        this.dni = dni;
        this.codigo = codigo;
        this.fecha = fecha;
        this.punto = punto;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPunto() {
        return punto;
    }

    public void setPunto(int punto) {
        this.punto = punto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
