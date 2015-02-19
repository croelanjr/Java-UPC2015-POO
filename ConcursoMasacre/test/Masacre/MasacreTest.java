package Masacre;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class MasacreTest {

    @Test
    public void registroValidacionEdad() {
        Administrador validar = new Administrador();
        ArrayList<Participante> lista = new ArrayList<Participante>();
        Participante Participante1 = new Participante("Marco", "Ramirez", "43155850", 20, "fan Masacre", "equipo muerte", "", "", 10, 20, 10);
        Participante Participante2 = new Participante("Mario", "Ramos", "4315580", 40, "fan Masacre", "equipo destruccion", "", "", 12, 10, 14);
        Participante Participante3 = new Participante("Rosa", "Perez", "43159850", 29, "fan Masacre", "equipo nuclear", "", "", 13, 9, 12);
        Participante Participante4 = new Participante("Pedro", "Ramirez", "43125850", 17, "publico", "", "miraflores", "", 13, 13, 0);
        Participante Participante5 = new Participante("Antonio", "Gonsalez", "43165850", 32, "publico", "", "lima", "", 12, 12, 0);
        Participante Participante6 = new Participante("Maria", "Croelan", "43155950", 23, "televidente", "", "", "942950563", 14, 15, 0);

        lista.add(Participante1);
        lista.add(Participante2);
        lista.add(Participante3);
        lista.add(Participante4);
        lista.add(Participante5);
        lista.add(Participante6);
        int buscar;
        buscar = 18;
        validar.getValidarEdad(lista, buscar);
    }

    @Test
    public void ConcursanteGanador() {
        Administrador Ganador = new Administrador();
        ArrayList<Participante> lista = new ArrayList<Participante>();
        Participante Participante1 = new Participante("Marco", "Ramirez", "43155850", 20, "fan Masacre", "equipo muerte", "", "", 10, 20, 15);
        Participante Participante2 = new Participante("Mario", "Ramos", "4315580", 40, "fan Masacre", "equipo destruccion", "", "", 12, 10, 17);
        Participante Participante3 = new Participante("Rosa", "Perez", "43159850", 29, "fan Masacre", "equipo nuclear", "", "", 13, 9, 19);
        Participante Participante4 = new Participante("Pedro", "Ramirez", "43125850", 17, "publico", "", "miraflores", "", 23, 13, 0);
        Participante Participante5 = new Participante("Antonio", "Gonsalez", "43165850", 32, "publico", "", "lima", "", 52, 12, 0);
        Participante Participante6 = new Participante("Maria", "Croelan", "43155950", 23, "televidente", "", "", "942950563", 14, 15, 0);

        lista.add(Participante1);
        lista.add(Participante2);
        lista.add(Participante3);
        lista.add(Participante4);
        lista.add(Participante5);
        lista.add(Participante6);
        Ganador.getLista(lista);
        Ganador.getParticipanteGanador(lista);
    }
    
    
    @Test
    public void CrearConcursante() {
        Administrador Crear = new Administrador();
        ArrayList<Participante> lista = new ArrayList<Participante>();
        Participante Participante1 = new Participante("Marco", "Ramirez", "43155850", 20, "fan Masacre", "equipo muerte", "", "", 10, 20, 10);
        Participante Participante2 = new Participante("Mario", "Ramos", "4315580", 40, "fan Masacre", "equipo destruccion", "", "", 12, 10, 14);
        Participante Participante3 = new Participante("Rosa", "Perez", "43159850", 29, "fan Masacre", "equipo nuclear", "", "", 13, 9, 12);
        Participante Participante4 = new Participante("Pedro", "Ramirez", "43125850", 17, "publico", "", "miraflores", "", 13, 13, 0);
        Participante Participante5 = new Participante("Antonio", "Gonsalez", "43165850", 32, "publico", "", "lima", "", 12, 12, 0);
        Participante Participante6 = new Participante("Maria", "Croelan", "43155950", 23, "televidente", "", "", "942950563", 14, 15, 0);

        lista.add(Participante1);
        lista.add(Participante2);
        lista.add(Participante3);
        lista.add(Participante4);
        lista.add(Participante5);
        lista.add(Participante6);
        
        Participante Participante7 = new Participante("Oliver", "Leon", "55635950", 27, "televidente", "", "", "942956663", 18, 18, 0);
        Crear.getCreandoParticipante(Participante7);
    }
    
    @Test
    public void VerificarMenorEdad() {
        Administrador Crear = new Administrador();
        ArrayList<Participante> lista = new ArrayList<Participante>();
        Participante Participante1 = new Participante("Marco", "Ramirez", "43155850", 20, "fan Masacre", "equipo muerte", "", "", 10, 20, 10);
        Participante Participante2 = new Participante("Mario", "Ramos", "4315580", 40, "fan Masacre", "equipo destruccion", "", "", 12, 10, 14);
        Participante Participante3 = new Participante("Rosa", "Perez", "43159850", 29, "fan Masacre", "equipo nuclear", "", "", 13, 9, 12);
        Participante Participante4 = new Participante("Pedro", "Ramirez", "43125850", 17, "publico", "", "miraflores", "", 13, 13, 0);
        Participante Participante5 = new Participante("Antonio", "Gonsalez", "43165850", 32, "publico", "", "lima", "", 12, 12, 0);
        Participante Participante6 = new Participante("Maria", "Croelan", "43155950", 23, "televidente", "", "", "942950563", 14, 15, 0);

        lista.add(Participante1);
        lista.add(Participante2);
        lista.add(Participante3);
        lista.add(Participante4);
        lista.add(Participante5);
        lista.add(Participante6);
        
        Crear.getVerificarMenorEdad(lista);
    }    
    
    @Test
    public void VerificarCantidadTotal() {
        Administrador Crear = new Administrador();
        ArrayList<Participante> lista = new ArrayList<Participante>();
        Participante Participante1 = new Participante("Marco", "Ramirez", "43155850", 20, "fan Masacre", "equipo muerte", "", "", 10, 20, 10);
        Participante Participante2 = new Participante("Mario", "Ramos", "4315580", 40, "fan Masacre", "equipo destruccion", "", "", 12, 10, 14);
        Participante Participante3 = new Participante("Rosa", "Perez", "43159850", 29, "fan Masacre", "equipo nuclear", "", "", 13, 9, 12);
        Participante Participante4 = new Participante("Pedro", "Ramirez", "43125850", 17, "publico", "", "miraflores", "", 13, 13, 0);
        Participante Participante5 = new Participante("Antonio", "Gonsalez", "43165850", 32, "publico", "", "lima", "", 12, 12, 0);
        Participante Participante6 = new Participante("Maria", "Croelan", "43155950", 23, "televidente", "", "", "942950563", 14, 15, 0);

        lista.add(Participante1);
        lista.add(Participante2);
        lista.add(Participante3);
        lista.add(Participante4);
        lista.add(Participante5);
        lista.add(Participante6);   
        Crear.getVerificarCantidadTotal(lista);
    }
}