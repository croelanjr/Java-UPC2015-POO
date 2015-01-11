package SExamenF2013;

public class ProfesorTiempoParcial extends Profesor {

    private String nivelProfesional;

    public ProfesorTiempoParcial(String codigo, String nombreCompleto, int anosExperiencia,
            String nivelProfesional, int horasMensualesTrabajo) {
        this.setCodigo(codigo);
        this.setNombreCompleto(nombreCompleto);
        this.setAnosExperiencia(anosExperiencia);
        this.setHorasMensualesTrabajo(horasMensualesTrabajo);
        this.nivelProfesional = nivelProfesional;
    }

    @Override
    public double getTotalMensualAPagar() {
        double rpta = 0.0;
        double numeroHorasTrabajo = this.getHorasMensualesTrabajo();
        int anosExperiencia = this.getAnosExperiencia();
        if (anosExperiencia <= 5) {
            rpta = numeroHorasTrabajo * 50;
        } else {
            rpta = numeroHorasTrabajo * 70;
        }
        return rpta;
    }

    public String getNivelProfesional() {
        return nivelProfesional;
    }

    public void setNivelProfesional(String nivelProfesional) {
        this.nivelProfesional = nivelProfesional;
    }

}
