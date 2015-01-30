package JuegoStarCraft;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class JuegoStarCraftTest {
    
   @Test
   public void obtenerAlGanadorDeUnaLiga()
   {
       
       Juegos juego1 = new Juegos("Croelan Grandez", "Platino", 100);
       Juegos juego2 = new Juegos("Rosa Oliver", "Platino", 150);
       Juegos juego3 = new Juegos("Pasteur Colonia" , "Platino", 120);
       Juegos juego4 = new Juegos("Manuel Ramos", "Oro", 130);
       Juegos juego5 = new Juegos("Jose Diaz", "Oro", 170);
       Juegos juego6 = new Juegos("Cecilia Camargo", "Oro", 100);
       Juegos juego7 = new Juegos("Alfonso Ugarte", "Plata", 80);
       Juegos juego8 = new Juegos("Francisco Bolognesi", "Plata", 70);
       Juegos juego9 = new Juegos("Miguel Grau", "Plata", 60);
       ArrayList<Juegos> juegos = new ArrayList<>();
       juegos.add(juego1);
       juegos.add(juego2);
       juegos.add(juego3);
       juegos.add(juego4);
       juegos.add(juego5);
       juegos.add(juego6);
       juegos.add(juego7);
       juegos.add(juego8);
       juegos.add(juego9);
       System.out.println("El Ganador de la Liga : " + juego1.CalcularGanadorLiga(juegos));
       assertEquals(170,juego1.CalcularGanadorLiga(juegos));   
   }
    
   @Test
   public void obtenerLigaConMayorPuntaje()
   {
       
       Juegos juego1 = new Juegos("Croelan Grandez", "Platino", 100);
       Juegos juego2 = new Juegos("Rosa Oliver", "Platino", 150);
       Juegos juego3 = new Juegos("Pasteur Colonia" , "Platino", 120);
       Juegos juego4 = new Juegos("Manuel Ramos", "Oro", 130);
       Juegos juego5 = new Juegos("Jose Diaz", "Oro", 170);
       Juegos juego6 = new Juegos("Cecilia Camargo", "Oro", 100);
       Juegos juego7 = new Juegos("Alfonso Ugarte", "Plata", 80);
       Juegos juego8 = new Juegos("Francisco Bolognesi", "Plata", 70);
       Juegos juego9 = new Juegos("Miguel Grau", "Plata", 60);
       ArrayList<Juegos> juegos = new ArrayList<>();
       juegos.add(juego1);
       juegos.add(juego2);
       juegos.add(juego3);
       juegos.add(juego4);
       juegos.add(juego5);
       juegos.add(juego6);
       juegos.add(juego7);
       juegos.add(juego8);
       juegos.add(juego9);
       System.out.println("La Liga con Mayor Puntaje : " + juego1.CalcularMayorPuntaje(juegos));
       assertEquals(400,juego1.CalcularMayorPuntaje(juegos));   
   }
}
