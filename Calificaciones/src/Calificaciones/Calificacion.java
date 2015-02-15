package calificaciones;

public abstract class Calificacion {
    
    protected double examenParcial;
    protected double examenFinal;

    public Calificacion() {
        this.examenParcial = 0.0;
        this.examenFinal = 0.0;
    }
 
    public abstract double calcularPromedioFinal();

    public double getExamenFinal() {
        return examenFinal;
    }

    public void setExamenFinal(double examenFinal) {
        this.examenFinal = examenFinal;
    }

   
   

    public double getExamenParcial() {
        return examenParcial;
    }

    public void setExamenParcial(double examenParcial) {
        this.examenParcial = examenParcial;
    }
      
}
