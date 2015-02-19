package Estacionamiento;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/*
Se tiene los siguientes tipos de cliente con sus respectivas características:

•	VIP: nombre, dni, numero de autos
•	Frecuente:  nombre, dni,  número visitas acumuladas
•	Regular: nombre, dni

El factor de evaluación crediticio es:

VIP		: f = 0.9 * (número de autos + 1) / (número de autos) 
Frecuente	: f = 1.0 * (número de visitas) / (número de visitas + 1)
Regular	: f =  100 * (3/10) 
1.	El Administrador desea registrar 5 clientes con toda la información que le corresponde, deberá validar que no haya sido registrado anteriormente. (5 puntos)
2.	El Administrador desea calcular la suma de factores de evaluación de todos los clientes. (5 puntos)
3.	El Administrador desea calcular la cantidad de clientes registrados. (5 puntos)
4.	El Administrador desea saber el valor del factor de evaluación crediticia para un cliente dado, pasándole un DNI como parámetro. (5 puntos)
Aplique Polimorfismo y pruebas unitarias para cada respuesta en su solución.

*/

public class EstacionamientoTest {
    
@Test
public void comprobarSiElPatronDeDiseñoEsSingleton()
{
    Administrador comprobacion = Administrador.getInstancia();
    
    if(comprobacion != null)
    {
        System.out.println("El Sistema de Estacionamiento es Patron de Diseño Singleton");
    }
}
    
@Test
public void registrarCincoClientesContodaLaInformacion()
{
    Administrador opera = new Administrador();
    Clientes cliente1 = new Clientes("Croelan Grandez", "10260429", 3, "vip");
    Clientes cliente2 = new Clientes("Pasteur Colonia", "10260430", 5, "frecuente");
    Clientes cliente3 = new Clientes("Rosa Oliver", "10260431", 4, "regular");
    Clientes cliente4 = new Clientes("Manuel Ramos", "10260432", 6, "vip");
    Clientes cliente5 = new Clientes("Jose Diaz", "10260433", 7, "frecuente");
    opera.registrarCliente(cliente1);
    opera.registrarCliente(cliente2);
    opera.registrarCliente(cliente3);
    opera.registrarCliente(cliente4);
    opera.registrarCliente(cliente5);
    System.out.println("******************************************");
    opera.listarpantalla();
    System.out.println("******************************************");
}

@Test
public void calcularLaSumadeFactoresDeEvaluacionTodosLosClientes()
{
    Administrador opera = new Administrador();
    ArrayList<Clientes> registro = new ArrayList<>();
    Clientes cliente1 = new Clientes("Croelan Grandez", "10260429", 3, "vip");
    Clientes cliente2 = new Clientes("Pasteur Colonia", "10260430", 5, "frecuente");
    Clientes cliente3 = new Clientes("Rosa Oliver", "10260431", 4, "regular");
    Clientes cliente4 = new Clientes("Manuel Ramos", "10260432", 6, "vip");
    Clientes cliente5 = new Clientes("Jose Diaz", "10260433", 7, "frecuente");
    registro.add(cliente1);
    registro.add(cliente2);
    registro.add(cliente3);
    registro.add(cliente4);
    registro.add(cliente5);
    System.out.println("*********** Monto Total de los Factores *************");
    opera.totalFactores(registro);
    System.out.println("*****************************************************");
}

@Test
public void calcularLaCantidadDeClientesRegistrado()
{
    Administrador opera = new Administrador();
    ArrayList<Clientes> registro = new ArrayList<>();
    Clientes cliente1 = new Clientes("Croelan Grandez", "10260429", 3, "vip");
    Clientes cliente2 = new Clientes("Pasteur Colonia", "10260430", 5, "frecuente");
    Clientes cliente3 = new Clientes("Rosa Oliver", "10260431", 4, "regular");
    Clientes cliente4 = new Clientes("Manuel Ramos", "10260432", 6, "vip");
    Clientes cliente5 = new Clientes("Jose Diaz", "10260433", 7, "frecuente");
    registro.add(cliente1);
    registro.add(cliente2);
    registro.add(cliente3);
    registro.add(cliente4);
    registro.add(cliente5);
    assertEquals(5,opera.cantidadClientesRegistrado(registro));

}

@Test
public void saberElValorDeEvaluacionCrediticiaDeUnCliente()
{
    Administrador opera = new Administrador();
    ArrayList<Clientes> registro = new ArrayList<>();
    Clientes cliente1 = new Clientes("Croelan Grandez", "10260429", 3, "vip");
    Clientes cliente2 = new Clientes("Pasteur Colonia", "10260430", 5, "frecuente");
    Clientes cliente3 = new Clientes("Rosa Oliver", "10260431", 4, "regular");
    Clientes cliente4 = new Clientes("Manuel Ramos", "10260432", 6, "vip");
    Clientes cliente5 = new Clientes("Jose Diaz", "10260433", 7, "frecuente");
    registro.add(cliente1);
    registro.add(cliente2);
    registro.add(cliente3);
    registro.add(cliente4);
    registro.add(cliente5);
    String buscardni;
    buscardni = "10260429";
    opera.valorFactorCliente(registro, buscardni);
}
}