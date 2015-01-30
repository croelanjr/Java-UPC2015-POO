package Bonus;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class BonusTest {
    
@Test
public void listaDeSistemaDePuntos()
{
    Bonus bonus1 = new Bonus("Croelan Grandez", "10260429", "29-01-2015", 123);
    Bonus bonus2 = new Bonus("Manuel Ramos", "10260428", "29-01-2015", 153);
    Bonus bonus3 = new Bonus("Rosa Oliver", "10260430", "29-01-2015", 163);
    Bonus bonus4 = new Bonus("Yndira Leon", "10260431", "30-01-2015", 173);
    Bonus bonus5 = new Bonus("Francisco Toro", "10260432", "29-01-2015", 180);
    Bonus bonus6 = new Bonus("Miguel Grau", "10260433", "29-01-2015", 193);
    Bonus bonus7 = new Bonus("Alfonso Ugarte", "10260434", "29-01-2015", 23);
    Bonus bonus8 = new Bonus("Simon Bolivar", "10260435", "29-01-2015", 223);
    ArrayList<Bonus> bonus = new ArrayList<>();
    bonus.add(bonus1);
    bonus.add(bonus2);
    bonus.add(bonus3);
    bonus.add(bonus4);
    bonus.add(bonus5);
    bonus.add(bonus6);
    bonus.add(bonus7);
    bonus.add(bonus8);
    System.out.println("Reporte de Cliente con Puntos");
    System.out.println("-----------------------------");
    System.out.println("******************************************************");
    System.out.println("Cliente        *   DNI     *     Fecha     *  Puntos ");
    System.out.println(bonus1.listarpantalla(bonus));
}
     
@Test
public void deboMostrarPuntosDeUnCliente()
{
    //Datos
    String dni = "10260430";
    //Ejecutar
    Bonus bonus = new Bonus();
    //Verificar
    System.out.println("**********************");
    System.out.println("**     CONSULTA     **");
    System.out.println("**********************");
    assertEquals("Rosa Oliver", bonus.getMostrarCliente(dni));
}

@Test
public void deboCalcularTransaccionesCliente()
{
    //Datos
    String dni = "10260430";
    Double monto = 2313.00;
    //Ejecutar
    Bonus bonus = new Bonus();
    //Verificar
    System.out.println("*********************************");
    System.out.println("**  CONSULTA DE TRANSACCIONES  **");
    System.out.println("*********************************");
    assertEquals(493, bonus.getCalcularCliente(dni, monto));
}

@Test
public void deboObservarTransaccionesCliente()
{
    //Datos
    String dni = "10260429";
    Double monto = 4000.00;
    //Ejecutar
    Bonus bonus = new Bonus();
    //Verificar
    System.out.println("*********************************");
    System.out.println("**  CONSULTA DE TRANSACCIONES  **");
    System.out.println("*********************************");
    assertEquals(694, bonus.getCalcularCliente(dni, monto));
}

@Test
public void deboMostrarCantidadPuntosTotalesTodosClientes()
{
    Bonus bonus1 = new Bonus("Croelan Grandez", "10260429", "29-01-2015", 123);
    Bonus bonus2 = new Bonus("Manuel Ramos", "10260428", "29-01-2015", 153);
    Bonus bonus3 = new Bonus("Rosa Oliver", "10260430", "29-01-2015", 163);
    Bonus bonus4 = new Bonus("Yndira Leon", "10260431", "30-01-2015", 173);
    Bonus bonus5 = new Bonus("Francisco Toro", "10260432", "29-01-2015", 180);
    Bonus bonus6 = new Bonus("Miguel Grau", "10260433", "29-01-2015", 193);
    Bonus bonus7 = new Bonus("Alfonso Ugarte", "10260434", "29-01-2015", 23);
    Bonus bonus8 = new Bonus("Simon Bolivar", "10260435", "29-01-2015", 223);
    ArrayList<Bonus> bonus = new ArrayList<>();
    bonus.add(bonus1);
    bonus.add(bonus2);
    bonus.add(bonus3);
    bonus.add(bonus4);
    bonus.add(bonus5);
    bonus.add(bonus6);
    bonus.add(bonus7);
    bonus.add(bonus8);
    System.out.println("Reporte de Cliente con Puntos Acumulados");
    System.out.println("----------------------------------------");
    System.out.println("******************************************************");
    System.out.println("Cliente        *   DNI     *     Fecha     *  Puntos ");
    assertEquals(1231,bonus1.calcularPuntosTotales(bonus));
}

}
