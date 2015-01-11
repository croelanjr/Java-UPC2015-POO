package SExamenF2013;

public class ProfesorTiempoCompleto extends Profesor {

    private String facultad;

    public ProfesorTiempoCompleto(String codigo, String nombreCompleto, int anosExperiencia,
            String facultad, int horasMensualesTrabajo) {
        this.setCodigo(codigo);
        this.setNombreCompleto(nombreCompleto);
        this.setAnosExperiencia(anosExperiencia);
        this.setHorasMensualesTrabajo(horasMensualesTrabajo);
        this.facultad = facultad;
    }

    @Override
    public double getTotalMensualAPagar() {
        double rpta = 0.0;
        double numeroHorasTrabajo = this.getHorasMensualesTrabajo();
        int anosExperiencia = this.getAnosExperiencia();
        if (anosExperiencia <= 5) {
            rpta = numeroHorasTrabajo * 75;
        } else {
            rpta = numeroHorasTrabajo * 90;
        }
        return rpta;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

}
