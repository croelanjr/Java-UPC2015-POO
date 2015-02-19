package Estacionamiento;

class Clientes {
    private String nombre;
    private String dni;
    private int numero;
    private String tipo;

    public Clientes(String nombre, String dni, int numero, String tipo) {
        this.nombre = nombre;
        this.dni = dni;
        this.numero = numero;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
