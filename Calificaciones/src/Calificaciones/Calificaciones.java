package Calificaciones;

class Calificar {

    double getMayorNotas(double[] nota) {
        double mayor = nota[0];
        for(int i = 0; i < nota.length; i++)
        {
            if(mayor < nota[i])
            {
                mayor = nota[i];
            }
        }
        return mayor;
    }

    double getMenorNotas(double[] nota) {
       double menor = nota[0];
        for(int i = 0; i < nota.length; i++)
        {
            if(menor > nota[i])
            {
                menor = nota[i];
            }
        }
        return menor;        
    }

    String getMayorIndice(double[] nota) {
        double mayorindice = nota[0];
        int indice = 0;
        for(int i = 0; i < nota.length; i++)
        {
            if(nota[i] > mayorindice)
            {
                mayorindice = nota[i];
            }
        }
        double duplica = 0;
        for(int j = 0; j < nota.length; j++)
        {
            if(mayorindice == nota[j])
            {
                indice = j;
                duplica = nota[j];
            }
        }
        return duplica + " " + indice;
    }
    

}


public class Calificaciones {
    public static void main(String[] args) {
        double nota[] = {20, 15, 13, 12, 17, 18, 11, 8, 14, 20};
        Calificar califica = new Calificar();
        System.out.println("La nota mayor es : " + califica.getMayorNotas(nota));
        System.out.println("La nota menor es : " + califica.getMenorNotas(nota));
        System.out.println("La nota mayor en el indice es : " + califica.getMayorIndice(nota));
    }
}
