package TarjetasPromociones;

import org.junit.Test;
import static org.junit.Assert.*;

public class TarjetasPromocionesTest {

    Clientes cliente1 = new Clientes("Croelan Grandez", "10260429", "1001", "14/02/2015", 120, "normal");
    Clientes cliente2 = new Clientes("Pasteur Colonia", "10260430", "1002", "15/02/2015", 130, "normal");
    Clientes cliente3 = new Clientes("Rosa Oliver", "10260431", "1003", "16/02/2015", 150, "normal");    
    Clientes cliente4 = new Clientes("Miguel Grau", "10260432", "1004", "14/02/2015", 160, "platinium");
    Clientes cliente5 = new Clientes("Manuel Ramos", "10260433", "1005", "15/02/2015", 170, "platinium");
    Clientes cliente6 = new Clientes("Jose Diaz", "10260434", "1006", "16/02/2015", 180, "platinium");
    Clientes cliente7 = new Clientes("Jorge Grau", "10260435", "1004", "14/02/2015", 160, "platinium");
    
@Test
public void permitaCrearUnClienteNormal()
{
    Administrador opera = new Administrador();
    opera.agregarCliente(cliente1);
    opera.agregarCliente(cliente2);
    opera.agregarCliente(cliente3);
    System.out.println("---------------------- Cliente Normal ----------------------------------");
    System.out.println("Cliente\t\tDNI\t\tCodigo\tFecha\t\tPuntos\tTipo");
    System.out.println("------------------------------------------------------------------------");
    opera.listapantalla();
    System.out.println("------------------------------------------------------------------------");
}

@Test
public void permitaCrearUnClientePlatinium()
{
    Administrador opera = new Administrador();
    opera.agregarCliente(cliente4);
    opera.agregarCliente(cliente5);
    opera.agregarCliente(cliente6);
    System.out.println("---------------------- Cliente Platinium -------------------------------");
    System.out.println("Cliente\t\tDNI\t\tCodigo\tFecha\t\tPuntos\tTipo");
    System.out.println("------------------------------------------------------------------------");
    opera.listapantalla();
    System.out.println("------------------------------------------------------------------------");
}

@Test
public void calcularLosPuntosDeUnClienteNormal()
{
    Administrador opera = new Administrador();
    opera.agregarCliente(cliente1);
    opera.agregarCliente(cliente2);
    opera.agregarCliente(cliente3);
    System.out.println("*************************** Puntos para Clientes Normales ********************");
    opera.calculoPuntos();
    System.out.println("******************************************************************************");
}

@Test
public void calcularLosPuntosDeUnClientePlatinium()
{
    Administrador opera = new Administrador();
    opera.agregarCliente(cliente4);
    opera.agregarCliente(cliente5);
    opera.agregarCliente(cliente6);
    System.out.println("*************************** Puntos para Clientes Platinium ********************");
    opera.calculoPuntos();
    System.out.println("*******************************************************************************");
}

@Test
public void conocerLosTotalesEnPuntosPorCanjearDetodosLosClientes()
{
    Administrador opera = new Administrador();
    opera.agregarCliente(cliente1);
    opera.agregarCliente(cliente2);
    opera.agregarCliente(cliente3);    
    opera.agregarCliente(cliente4);
    opera.agregarCliente(cliente5);
    opera.agregarCliente(cliente6);
    System.out.println("*************************** Totales de todos los Clientes *********************");
    opera.calculoTotales();
    System.out.println("*******************************************************************************");
}

@Test 
public void conocerLosTotalesEnPuntosPorCanjearDeLosClientesNormales()
{
    Administrador opera = new Administrador();
    opera.agregarCliente(cliente1);
    opera.agregarCliente(cliente2);
    opera.agregarCliente(cliente3);    
    System.out.println("*************************** Totales de Clientes Normales **********************");
    String buscar;
    opera.calculoTotales();
    System.out.println("*******************************************************************************");    
}

@Test
public void permitaComprobarCodigoUnicoDeUsuarioNoSeRepite()
{
    Administrador opera = new Administrador();
    opera.agregarCliente(cliente1);
    opera.agregarCliente(cliente2);
    opera.agregarCliente(cliente3);    
    opera.agregarCliente(cliente4);
    opera.agregarCliente(cliente5);
    opera.agregarCliente(cliente6);
    System.out.println("***********************************************");
    opera.comprobarregistro(cliente7);
    System.out.println("***********************************************");
}

@Test 
public void conocerLosTotalesEnPuntosPorCanjearDeLosClientesPlatinium()
{
    Administrador opera = new Administrador();
    opera.agregarCliente(cliente4);
    opera.agregarCliente(cliente5);
    opera.agregarCliente(cliente6);    
    System.out.println("*************************** Totales de Clientes Platinium **********************");
    String buscar;
    opera.calculoTotales();
    System.out.println("*******************************************************************************");    
}

}
