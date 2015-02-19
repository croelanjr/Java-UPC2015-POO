package ControlAcceso;

class Persona {

    private String nombre;
    private String dni;
    private String empresa;
    private String tipo;

    public Persona(String nombre, String dni, String empresa, String tipo) {
        this.nombre = nombre;
        this.dni = dni;
        this.empresa = empresa;
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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
