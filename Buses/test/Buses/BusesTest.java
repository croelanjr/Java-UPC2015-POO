package Buses;
/*
La Municipalidad de La Molina brinda un servicio gratuito de transporte 
para los vecinos de la zona que deseen visitar a la Municipalidad. 
Para lo cual dispone de 6 buses que circulan todo el día de 9 a 1 p.m. 
La capacidad máxima de cada bus es de 40 personas, no se permite 
transportar parados.

Para lograr hacer uso de este servicio es necesario inscribirse por 
internet, ingresando solo el número de DNI de la persona, 
la aplicación deberá verificar la disponibilidad del bus y 
obviamente de un sitio dentro del bus.

El criterio de distribución de pasajeros dentro de cada bus es 
cualquier algoritmo simple que ni bien encuentre un sitio vacío 
en algún bus le asigne su asiento respectivo. 

Se requiere saber la cantidad de personas registradas en cada 
bus al término del proceso de separación de pases.

La ubicación (número de bus y número de asiento) de una persona 
considerando que cada asiento está numerado del 1 al 40 en cada bus.

*/

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class BusesTest {

@Test
public void obtenerCantidadPersonaCadaBus()
{
    //Datos
    Bus bus1 = new Bus("A", 30, 0);
    Bus bus2 = new Bus("B", 23, 0);
    Bus bus3 = new Bus("C", 40, 0);
    Bus bus4 = new Bus("D", 13, 0);
    Bus bus5 = new Bus("E", 32, 0);
    Bus bus6 = new Bus("F", 5, 0);
    //Ejecutar
    ArrayList<Bus> buses = new ArrayList<>();
    buses.add(bus1);
    buses.add(bus2);
    buses.add(bus3);
    buses.add(bus4);
    buses.add(bus5);
    buses.add(bus6);
    System.out.println("Persona Registrado en cada bus: " + bus1.listar(buses));
}

@Test
public void obtenerCantidadDisponiblePersonaCadaBus()
{
    //Datos
    Bus bus1 = new Bus("A", 30, 0);
    Bus bus2 = new Bus("B", 23, 0);
    Bus bus3 = new Bus("C", 40, 0);
    Bus bus4 = new Bus("D", 13, 0);
    Bus bus5 = new Bus("E", 32, 0);
    Bus bus6 = new Bus("F", 5, 0);
    //Ejecutar
    ArrayList<Bus> buses = new ArrayList<>();
    buses.add(bus1);
    buses.add(bus2);
    buses.add(bus3);
    buses.add(bus4);
    buses.add(bus5);
    buses.add(bus6);
    System.out.println("Persona Disponible en cada bus: " + bus1.disponible(buses));
}

@Test
public void registrarAsientoDisponiblePersonaCadaBus()
{
    //Datos
    Bus bus1 = new Bus("A", 30, 3);
    Bus bus2 = new Bus("B", 23, 2);
    Bus bus3 = new Bus("C", 40, 1);
    Bus bus4 = new Bus("D", 13, 4);
    Bus bus5 = new Bus("E", 32, 5);
    Bus bus6 = new Bus("F", 5, 4);
    //Ejecutar
    ArrayList<Bus> buses = new ArrayList<>();
    buses.add(bus1);
    buses.add(bus2);
    buses.add(bus3);
    buses.add(bus4);
    buses.add(bus5);
    buses.add(bus6);
    System.out.println("Persona Para Registrar en cada bus: " + bus1.registrarAsientos(buses));
}

}
