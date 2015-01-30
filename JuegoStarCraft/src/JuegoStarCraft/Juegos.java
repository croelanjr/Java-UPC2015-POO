package JuegoStarCraft;

import java.util.ArrayList;

class Juegos {
    
   private String nombre;
   private String liga;
   private int puntos;
   private ArrayList<String> nuevogame = new ArrayList<String>();

    public Juegos(String nombre, String liga, int puntos) {
        this.nombre = nombre;
        this.liga = liga;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int CalcularGanadorLiga(ArrayList<Juegos> juegos) {
        int puntajetotal = 0;
        for(int i = 0; i < juegos.size(); i++)
        {
            Juegos game = juegos.get(i);
            this.nombre = game.getNombre();
            this.liga = game.getLiga();
            this.puntos = game.getPuntos();
            if(puntos > puntajetotal)
            {
                puntajetotal = puntos;
            }
        }
        return puntajetotal;
    }

    public int CalcularMayorPuntaje(ArrayList<Juegos> juegos) {
        int total = 0;
        int total1 = 0;
        int total2 = 0;
        int mayorPuntaje = 0;
        
        for(int i = 0; i < juegos.size(); i++)
        {
            Juegos game = juegos.get(i);
            this.nombre = game.getNombre();
            this.liga = game.getLiga();
            this.puntos = game.getPuntos();
            if(game.getLiga()== "Platino"){
                total = total + puntos;
            }
            else if(game.getLiga() == "Oro")
            {
                total1 = total1 + puntos;
            }
            else if(game.getLiga() == "Plata")
            {
                total2 = total2 + puntos;

            }
        }
        nuevogame.add(total + " " + total1 + " " + total2);
        int punta[] = {total,total1,total2};
        
        int p = 0;
        for(int l = 0; l < punta.length; l++)
        {
            if(p < punta[l])
                p = punta[l];
        }
        //System.out.println("" + p);
        return p;
    }
}
