package TvMasacre;

class Participante {

    private String nombre;
    private String dni;
    private int edad;
    private String tipo;
    private String tipoMasacre;
    private int punto_Masacre;
    private int cantidad_Mensaje;
    private int punto_barra_llamada;

    public Participante(String nombre, String dni, int edad, String tipo, String tipoMasacre, int punto_Masacre, int cantidad_Mensaje, int punto_barra_llamada) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.tipo = tipo;
        this.tipoMasacre = tipoMasacre;
        this.punto_Masacre = punto_Masacre;
        this.cantidad_Mensaje = cantidad_Mensaje;
        this.punto_barra_llamada = punto_barra_llamada;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoMasacre() {
        return tipoMasacre;
    }

    public void setTipoMasacre(String tipoMasacre) {
        this.tipoMasacre = tipoMasacre;
    }

    public int getPunto_Masacre() {
        return punto_Masacre;
    }

    public void setPunto_Masacre(int punto_Masacre) {
        this.punto_Masacre = punto_Masacre;
    }

    public int getCantidad_Mensaje() {
        return cantidad_Mensaje;
    }

    public void setCantidad_Mensaje(int cantidad_Mensaje) {
        this.cantidad_Mensaje = cantidad_Mensaje;
    }

    public int getPunto_barra_llamada() {
        return punto_barra_llamada;
    }

    public void setPunto_barra_llamada(int punto_barra_llamada) {
        this.punto_barra_llamada = punto_barra_llamada;
    }
}
