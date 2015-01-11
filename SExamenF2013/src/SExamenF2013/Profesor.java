package SExamenF2013;

public abstract class Profesor {
    private String nombreCompleto;
    private int anosExperiencia;
    private String codigo;
    private int horasMensualesTrabajo;
    
    public Profesor()
    {
        
    }


    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public int getHorasMensualesTrabajo() {
        return horasMensualesTrabajo;
    }

    public void setHorasMensualesTrabajo(int horasMensualesTrabajo) {
        this.horasMensualesTrabajo = horasMensualesTrabajo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
 
    public abstract double getTotalMensualAPagar();
}