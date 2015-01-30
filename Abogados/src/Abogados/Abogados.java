package Abogados;

import java.util.ArrayList;

class Abogados {
    
    private double total = 0;
    private ArrayList<Double> montototal = new ArrayList<Double>();
    private ArrayList<Double> totalabogado = new ArrayList<Double>();
    
    public double factores(String especialidad)
    {
        double factor = 0;
        if(especialidad == "laboral")
            factor = 2.5;
        else if(especialidad == "civil")
            factor = 3.0;
        else if(especialidad == "penal")
            factor = 4.5;
        return factor;
    }
    
    public ArrayList<Double> getCalcularNatural(ArrayList<Natural> natural) {
        for(int i = 0; i < natural.size(); i++)
        {
            Natural persona = natural.get(i);
            this.total = (persona.getMonto() * 10) + (factores(persona.getEspecialidad()) * 500);    
            montototal.add(total);
        }
        System.out.println(montototal);
        return montototal;
    }

    public ArrayList<Double> getCalcularJuridica(ArrayList<Juridica> juridica) {
        for(int i = 0; i < juridica.size(); i++)
        {
            Juridica persona = juridica.get(i);
            this.total = (persona.getMonto() * factores(persona.getEspecialidad()) + 1500.0);    
            montototal.add(total);
        }
        System.out.println(montototal);
        return montototal;
    }

    public ArrayList getPagarAbogado(ArrayList<Natural> natural, ArrayList<Juridica> juridica) {
        double totalnatural = 0.0;
        double totaljuridica = 0.0;
        int topen = natural.size();
        int topej = juridica.size();
        for(int i = 0; i < topen; i++)
        {
            Natural personan = natural.get(i);
            totalnatural = (personan.getMonto() * 10) + (factores(personan.getEspecialidad()) * 500);    
            Juridica personaj = juridica.get(i);
            totaljuridica = (personaj.getMonto() * factores(personaj.getEspecialidad()) + 1500.0);    
            totalabogado.add(totalnatural + totaljuridica);
        }
        System.out.println(totalabogado);
        return totalabogado;
    }    
}
