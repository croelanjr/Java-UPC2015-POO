package DisciplinaTdd;

public class Profesor {
    private String nombre;
    private int tarifa;
    private double montoporHora;
    
    public Profesor()
    {     
    }

    Profesor(String nombre, int tarifa, double montoporHora) {
        this.nombre = nombre;
        this.tarifa = tarifa;
        this.montoporHora = montoporHora;
 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public double getMontoporHora() {
        return montoporHora;
    }

    public void setMontoporHora(double montoporHora) {
        this.montoporHora = montoporHora;
    }
    
    double getCalculoDia() {
        int numerotarifa = this.getTarifa();
        double preciotarifa = this.getMontoporHora();
        return numerotarifa * preciotarifa;
    }
    
    double getTotalAPagar()
    {
        double montoporDia = this.getCalculoDia();
        return montoporDia * 30;
    }
}
