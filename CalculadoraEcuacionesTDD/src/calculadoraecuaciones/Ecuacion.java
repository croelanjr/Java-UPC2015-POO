package calculadoraecuaciones;

public class Ecuacion {
    private double a;
    private double b;
    private double c;

    public Ecuacion(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double calcularX1(){
       return(-b + calcularDiscriminante())/(2*a);
    }
    
    public double calcularX2(){
        return (-b - calcularDiscriminante())/(2*a);
    }
    
    private double calcularDiscriminante(){
        return Math.sqrt(b*b-4*a*c);
        
    }
    
}
