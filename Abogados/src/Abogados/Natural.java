package Abogados;

class Natural {
    private String nombre;
    private String dni;
    private String telefono;
    private String especialidad;
    private double monto;
    
    public Natural()
    {
        
    }

    public Natural(String nombre, String dni, String telefono, String especialidad, double monto) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.monto = monto;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
}
