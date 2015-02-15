package BatallaNaval;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class BatallaNavalTest {

    Tableros tablero = new Tableros();
    
    @Test
    public void comprobarDeLosTablerosInicialesVacios()
    {
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        assertFalse(tablero.comprobarSiEstaVacioPropio(null));
        assertFalse(tablero.comprobarSiEstaVacioEnemigo(null));
        System.out.println("++++++++++++++++++++++++++++++++++++++");
    }

    @Test
    public void valideLaPosicionDelBarcoYNoEsteOcupado()
    {
        Tableros tabla = new Tableros();
        System.out.println("************** CELDA OCUPADA*****************");
        String posiciones;
        posiciones = "A3";
        assertEquals("no ocupado", tabla.buscarLaCeldaubicada(posiciones, "propio"));
        posiciones = "D6";
        assertEquals("ocupado", tabla.buscarLaCeldaubicada(posiciones, "propio"));
        posiciones = "E7";
        assertEquals("no ocupado", tabla.buscarLaCeldaubicada(posiciones, "propio"));
        posiciones = "B6";
        assertEquals("no ocupado", tabla.buscarLaCeldaubicada(posiciones, "enemigo"));
        posiciones = "C2";
        assertEquals("ocupado", tabla.buscarLaCeldaubicada(posiciones, "enemigo"));
        posiciones = "G1";
        assertEquals("no ocupado", tabla.buscarLaCeldaubicada(posiciones, "enemigo"));
        System.out.println("*****************************************************");
    }

    
    @Test
    public void permitaPonerUnBarcoEnUnTablero()
    {
        Tableros tabla = new Tableros();
        String posiciones;
        posiciones = "A3";
        assertEquals("registrado", tabla.ponerLaCeldaubicada(posiciones, "propio"));
        posiciones = "D6";
        assertEquals("ubicado", tabla.ponerLaCeldaubicada(posiciones, "propio"));
        posiciones = "E7";
        assertEquals("registrado", tabla.ponerLaCeldaubicada(posiciones, "propio"));
        posiciones = "B6";
        assertEquals("registrado", tabla.ponerLaCeldaubicada(posiciones, "propio"));
        posiciones = "G1";
        assertEquals("registrado", tabla.ponerLaCeldaubicada(posiciones, "enemigo"));
        posiciones = "C2";
        assertEquals("ubicado", tabla.ponerLaCeldaubicada(posiciones, "enemigo"));
        posiciones = "F2";
        assertEquals("registrado", tabla.ponerLaCeldaubicada(posiciones, "enemigo"));
        posiciones = "E4";
        assertEquals("registrado", tabla.ponerLaCeldaubicada(posiciones, "enemigo"));
        System.out.println("***********************REGISTRO******************");
        tabla.pantalla();
        System.out.println("*************************************************");
    }
    
    @Test
    public void permitaHacerUnMovimientoDeUnJugador()
    {
        Tableros tabla = new Tableros();
        String posiciones;
        posiciones = "A3";
        tabla.agregarCeldaubicada(posiciones, "propio");
        posiciones = "D6";
        tabla.agregarCeldaubicada(posiciones, "propio");
        posiciones = "E7";
        tabla.agregarCeldaubicada(posiciones, "propio");
        posiciones = "B6";
        tabla.agregarCeldaubicada(posiciones, "propio");
        posiciones = "G1";
        tabla.agregarCeldaubicada(posiciones, "enemigo");
        posiciones = "C2";
        tabla.agregarCeldaubicada(posiciones, "enemigo");
        posiciones = "F2";
        tabla.agregarCeldaubicada(posiciones, "enemigo");
        posiciones = "E4";
        tabla.agregarCeldaubicada(posiciones, "enemigo");
        System.out.println("+++++++++++++++Movimiento++++++++++++++++");
        tabla.pantalla();
        String buscarbarco;
        String jugador;
        String movimiento;
        buscarbarco = "B6";
        jugador = "propio";
        movimiento = "C8";
        tabla.moverElbarco(buscarbarco, jugador, movimiento);
        buscarbarco = "F2";
        jugador = "enemigo";
        movimiento = "G3";
        tabla.moverElbarco(buscarbarco, jugador, movimiento);        
        System.out.println("*****************************************");  
    }
    
    @Test
    public void permitaValidadSiAlguienGanoElJuego()
    {
        Tableros tabla = new Tableros();
        String posiciones;
        posiciones = "A3";
        tabla.agregarCeldaubicada(posiciones, "propio");
        posiciones = "D6";
        tabla.agregarCeldaubicada(posiciones, "propio");
        posiciones = "E7";
        tabla.agregarCeldaubicada(posiciones, "propio");
        posiciones = "B6";
        tabla.agregarCeldaubicada(posiciones, "propio");
        posiciones = "G1";
        tabla.agregarCeldaubicada(posiciones, "enemigo");
        posiciones = "C2";
        tabla.agregarCeldaubicada(posiciones, "enemigo");
        posiciones = "F2";
        tabla.agregarCeldaubicada(posiciones, "enemigo");
        posiciones = "E4";
        tabla.agregarCeldaubicada(posiciones, "enemigo");
        System.out.println("***********GANADORES**********************");
        String eliminar;
        String jugador;
        jugador = "propio";
        eliminar = "E7";
        tabla.eliminandoCeldaUbicada(jugador, eliminar);
        jugador = "enemigo";
        eliminar = "E4";
        tabla.eliminandoCeldaUbicada(jugador, eliminar);        
        jugador = "propio";
        eliminar = "B6";
        tabla.eliminandoCeldaUbicada(jugador, eliminar);
        tabla.pantalla();
        tabla.ganadores();
        System.out.println("********FIN DE GANADORES************");
    }
}
