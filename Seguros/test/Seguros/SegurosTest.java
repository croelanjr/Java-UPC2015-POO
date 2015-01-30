package Seguros;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class SegurosTest {
    
@Test
public void calcularPrimaDeCarroTransportePublico()
{
    //datos
    Seguros seguro1 = new Seguros("Croelan Grandez", "10260429", 1998, "publico", 14000.00);
    Seguros seguro2 = new Seguros("Croelan Grandez", "10260429", 2012, "privado", 34000.00);
    Seguros seguro3 = new Seguros("Croelan Grandez", "10260429", 2015, "lujo", 78000.00);
    //ejecutar
    Seguros obtener = new Seguros();
    ArrayList<Seguros> seguro = new ArrayList<>();
    seguro.add(seguro1);
    seguro.add(seguro2);
    seguro.add(seguro3);
    //verificar
    assertEquals(4775.56, obtener.calcularPrimaPublico(seguro),0);
}

@Test
public void calcularPrimaDeCarroTransportePrivado()
{
    //datos
    Seguros seguro1 = new Seguros("Croelan Grandez", "10260429", 1998, "publico", 14000.00);
    Seguros seguro2 = new Seguros("Croelan Grandez", "10260429", 2012, "privado", 34000.00);
    Seguros seguro3 = new Seguros("Croelan Grandez", "10260429", 2015, "lujo", 78000.00);
    //ejecutar
    Seguros obtener = new Seguros();
    ArrayList<Seguros> seguro = new ArrayList<>();
    seguro.add(seguro1);
    seguro.add(seguro2);
    seguro.add(seguro3);
    //verificar
    assertEquals(15980.0, obtener.calcularPrimaPrivado(seguro),0);
}

@Test
public void calcularTotalAPagarPorUnCliente()
{
    //datos
    Seguros seguro1 = new Seguros("Croelan Grandez", "10260429", 1998, "publico", 14000.00);
    Seguros seguro2 = new Seguros("Croelan Grandez", "10260429", 2012, "privado", 34000.00);
    Seguros seguro3 = new Seguros("Croelan Grandez", "10260429", 2015, "lujo", 78000.00);
    //ejecutar
    Seguros obtener = new Seguros();
    ArrayList<Seguros> seguro = new ArrayList<>();
    seguro.add(seguro1);
    seguro.add(seguro2);
    seguro.add(seguro3);
    //verificar
    System.out.println("************************************************************************");
    System.out.println("Cliente        *   DNI      *  Transporte    *  Año   * Precio * Prima");
    assertEquals(30115.56, obtener.calcularTotalPrimaCliente(seguro),0);
}

}
