package Abogados;

class Juridica {
    private String empresa;
    private String ruc;
    private String telefono;
    private String representante;
    private String especialidad;
    private double monto;
    
    public Juridica()
    {
        
    }

    public Juridica(String empresa, String ruc, String telefono, String representante, String especialidad, double monto) {
        this.empresa = empresa;
        this.ruc = ruc;
        this.telefono = telefono;
        this.representante = representante;
        this.especialidad = especialidad;
        this.monto = monto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
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
