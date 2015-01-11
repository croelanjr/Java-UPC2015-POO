package NotasPromedios;

class Notas {
    private double pc1;
    private double pc2;
    private double pa1;
    private double tp;
    private double tf;


    public Notas()
    {
        
    }

    public Notas(double pc1, double pc2, double pa1, double tp, double tf) {
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.pa1 = pa1;
        this.tp = tp;
        this.tf = tf;
    }

    public double getPc1() {
        return pc1;
    }

    public void setPc1(double pc1) {
        this.pc1 = pc1;
    }

    public double getPc2() {
        return pc2;
    }

    public void setPc2(double pc2) {
        this.pc2 = pc2;
    }

    public double getPa1() {
        return pa1;
    }

    public void setPa1(double pa1) {
        this.pa1 = pa1;
    }

    public double getTp() {
        return tp;
    }

    public void setTp(double tp) {
        this.tp = tp;
    }

    public double getTf() {
        return tf;
    }

    public void setTf(double tf) {
        this.tf = tf;
    }

    double getNotaFinal()
    {
        double n1 = this.getPc1();
        double n2 = this.getPc2();
        double n3 = this.getPa1();
        double n4 = this.getTp();
        double n5 = this.getTf();
        return (n1 * 0.15) + (n2 * 0.15) + (n3 * 0.20) + (n4 * 0.20) + (n5 * 0.30);
    }

    double getDevolucionNotaTrabajoFinal()
    {
        double ntf = this.getNotaFinal();
        double ntfaltante = 12.5 - ntf;
        return ntfaltante / 0.30;
    }


    double getPromedioFinalSalon(double[] notasalon) {
        double suma = 0;
        for(int i = 0; i < notasalon.length; i++)
        {
          suma = suma + notasalon[i];
        }
        return suma / notasalon.length;
    }

    double getNotaMayorSalon(double[] notasalon) {
        double mayor = notasalon[0];
        for(int i = 0; i < notasalon.length; i++)
        {
            if(mayor < notasalon[i])
            {
                mayor = notasalon[i];
            }
        }
        return mayor;
    }

    double getNotaMenorSalon(double[] notasalon) {
        double menor = notasalon[0];
        for(int i = 0; i < notasalon.length; i++)
        {
            if(menor > notasalon[i])
            {
                menor = notasalon[i];
            }
        }
        return menor;     
    }
    
    

}


