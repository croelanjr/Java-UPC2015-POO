package TvMasacre;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class TvMasacreTest {
    
    Participante participante1 = new Participante("Croelan Grandez", "10260429", 19, "Masacre", "Muerte", 30, 50, 10);
    Participante participante2 = new Participante("Pasteur Colonia", "10260430", 18, "Masacre", "Destruccion", 51, 52, 14);
    Participante participante3 = new Participante("Rosa Oliver", "10260431", 17, "Masacre", "Nuclear", 32, 53, 15);
    Participante participante4 = new Participante("Miguel Grau", "10260432", 20, "Publico", "", 0, 52, 11);
    Participante participante5 = new Participante("Manuel Ramos", "10260433", 21, "Televidente", "", 0, 53, 12);
    Participante participante6 = new Participante("Jose Diaz", "10260434", 22, "Masacre", "Nuclear", 38, 17, 15);    

    @Test
    public void listadoDeLosParticipantes(){
        //datos
        ArrayList<Participante> registro = new ArrayList<Participante>();
        //Ejecutar
        registro.add(participante1);
        registro.add(participante2);
        registro.add(participante3);
        registro.add(participante4);
        registro.add(participante5);
        registro.add(participante6);
        //Verificar
        Administrador opera = new Administrador();
        System.out.println("************************************************");
        System.out.println("Participante\tEdad\t\tTipo/Equipo\tPuntaje");
        opera.listapantalla(registro);
        System.out.println("************************************************");
    }
    
    @Test
    public void conocerAlConcursanteGanador()
    {
        ArrayList<Participante> registro = new ArrayList<Participante>();
        //Ejecutar
        registro.add(participante1);
        registro.add(participante2);
        registro.add(participante3);
        registro.add(participante4);
        registro.add(participante5);
        registro.add(participante6);
        //Verificar
        Concursante operacion = new Concursante();
        System.out.println("******************* Consulta del Concursante Ganador ***************");
        operacion.verificarGanador(registro);
        System.out.println("********************************************************************");
    }

    @Test
    public void crearUnConcursanteDeCualquierTipoConSusDatosCompleto()
    {
        ArrayList<Participante> registro = new ArrayList<Participante>();
        //Ejecutar
        registro.add(participante1);
        registro.add(participante2);
        registro.add(participante3);
        registro.add(participante4);
        registro.add(participante5);
        registro.add(participante6);
        //Verificar
        Administrador opera = new Administrador();
        Participante participante7 = new Participante("Clark Kent", "10260435", 22, "Publico", "", 0, 20, 35);
        System.out.println("******************* Listado Nuevo Concursante ***************");
        opera.agregarRegistro(participante7);
        opera.listapantalla(registro);
        opera.listapantalla();
        System.out.println("********************************************************************");
    }

    @Test
    public void deseaRecibirMensajePorMenorDeEdad()
    {
        ArrayList<Participante> registro = new ArrayList<Participante>();
        //Ejecutar
        registro.add(participante1);
        registro.add(participante2);
        registro.add(participante3);
        registro.add(participante4);
        registro.add(participante5);
        registro.add(participante6);
        //Verificar
        Concursante operacion = new Concursante();
        System.out.println("******************* Verificacion de Menor Edad A Los Concursantes  ***************");
        operacion.verificaMenorEdad(registro);
        System.out.println("**********************************************************************************");
    }

    @Test
    public void deboPonerConocerLaCantidadTotalDeConcursantesQueParticipan()
    {
        ArrayList<Participante> registro = new ArrayList<Participante>();
        //Ejecutar
        registro.add(participante1);
        registro.add(participante2);
        registro.add(participante3);
        registro.add(participante4);
        registro.add(participante5);
        registro.add(participante6);
        //Verificar
        Concursante operacion = new Concursante();
        Administrador opera = new Administrador();
        System.out.println("******************* Reportes Totales De Los Concursantes  ***************");
        opera.listapantalla(registro);
        operacion.getTotalPuntajeConcursante(registro);
        System.out.println("**********************************************************************************");
    }
}
