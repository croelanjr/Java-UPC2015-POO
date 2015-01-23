package Triangulo;

class Recta {
    private Punto punto1;
    private Punto punto2;

    public Recta(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public double getCalcularLongitud() {
        double diferenciaX2 = Math.pow(punto2.getX() + punto1.getX(),2);
        double diferenciaY2 = Math.pow(punto2.getY() + punto1.getY(),2);
        double suma = diferenciaX2 + diferenciaY2;
        return Math.sqrt(suma);
    }

    public double getCalcularPendiente() {
        double diferenciaX = punto2.getX() - punto1.getX();
        double diferenciaY = punto2.getY() - punto1.getY();
        return diferenciaY / diferenciaX;
    }

    public double getPmedioX() {
        double sumaX = punto1.getX() + punto2.getX();
        return sumaX / 2.0;
    }

    public double getPmedioY() {
        double sumaY = punto1.getY() + punto2.getY();
        return sumaY / 2.0;
    }
   
}
