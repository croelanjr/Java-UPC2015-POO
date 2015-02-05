package Planillas;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlanillasTest {
    
@Test
public void deberiaRegistrarNObrerosConTodaLaInformacion()
{
    ArrayList<Planillas> planilla = new ArrayList<>();
    Planillas personal1 = new Planillas("Leao Urbina", "10260428", "Obrero", 8, 3);
    Planillas personal2 = new Planillas("Jose Leon", "10260429", "Obrero", 4, 2);
    Planillas personal3 = new Planillas("Carlos Lay", "10260430", "Obrero",  6, 7);
    Planillas personal4 = new Planillas("Jorge Jara", "10260431", "Administrativo", 1200.00, 12000.00);
    Planillas personal5 = new Planillas("Pepe Lopez", "10260432", "Administrativo", 1400.00, 5000.00);
    Planillas personal6 = new Planillas("Carla Chavez", "10260433", "Practicante", 1300.00, 0);
    Planillas personal7 = new Planillas("Rosa Oliver", "10260434", "Practicante", 1500.00, 0);
    planilla.add(personal1);
    planilla.add(personal2);
    planilla.add(personal3);
    planilla.add(personal4);
    planilla.add(personal5);
    planilla.add(personal6);
    planilla.add(personal7);
    Planillas operaciones = new Planillas();
    System.out.println("++++++++++++++++++++++++++++++++");
    System.out.println("            Registro            ");
    System.out.println(operaciones.listarpantalla(planilla));
    
    String buscardni;
    buscardni = "10260434";
    assertEquals("registrado", operaciones.validaregistro(buscardni, planilla));
    
    buscardni = "10260435";
    assertEquals("no registrado", operaciones.validaregistro(buscardni, planilla));
    
    buscardni = "10260430";
    assertEquals("registrado", operaciones.validaregistro(buscardni, planilla)); 
}

@Test
public void calcularLaSumaDeSueldosDeTodosLostrabajadores()
{
    ArrayList<Planillas> planilla = new ArrayList<>();
    Planillas personal1 = new Planillas("Leao Urbina", "10260428", "Obrero", 8, 3);
    Planillas personal2 = new Planillas("Jose Leon", "10260429", "Obrero", 4, 2);
    Planillas personal3 = new Planillas("Carlos Lay", "10260430", "Obrero",  6, 7);
    Planillas personal4 = new Planillas("Jorge Jara", "10260431", "Administrativo", 1200.00, 12000.00);
    Planillas personal5 = new Planillas("Pepe Lopez", "10260432", "Administrativo", 1400.00, 5000.00);
    Planillas personal6 = new Planillas("Carla Chavez", "10260433", "Practicante", 1300.00, 0);
    Planillas personal7 = new Planillas("Rosa Oliver", "10260434", "Practicante", 1500.00, 0);
    planilla.add(personal1);
    planilla.add(personal2);
    planilla.add(personal3);
    planilla.add(personal4);
    planilla.add(personal5);
    planilla.add(personal6);
    planilla.add(personal7);
    Planillas operaciones = new Planillas();
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    System.out.println("            Registro            ");
    assertEquals(6964.0, operaciones.listartotal(planilla),0);    
}

@Test
public void calcularLaCantidaddetrabajadores()
{
    ArrayList<Planillas> planilla = new ArrayList<>();
    Planillas personal1 = new Planillas("Leao Urbina", "10260428", "Obrero", 8, 3);
    Planillas personal2 = new Planillas("Jose Leon", "10260429", "Obrero", 4, 2);
    Planillas personal3 = new Planillas("Carlos Lay", "10260430", "Obrero",  6, 7);
    Planillas personal4 = new Planillas("Jorge Jara", "10260431", "Administrativo", 1200.00, 12000.00);
    Planillas personal5 = new Planillas("Pepe Lopez", "10260432", "Administrativo", 1400.00, 5000.00);
    Planillas personal6 = new Planillas("Carla Chavez", "10260433", "Practicante", 1300.00, 0);
    Planillas personal7 = new Planillas("Rosa Oliver", "10260434", "Practicante", 1500.00, 0);
    planilla.add(personal1);
    planilla.add(personal2);
    planilla.add(personal3);
    planilla.add(personal4);
    planilla.add(personal5);
    planilla.add(personal6);
    planilla.add(personal7);
    Planillas operaciones = new Planillas();
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    System.out.println("            Registro            ");
    assertEquals(7, operaciones.calcularCantidad(planilla),0);    
}

@Test
public void saberElSueldoDeUnTrabajadorPasandoleDni()
{
    ArrayList<Planillas> planilla = new ArrayList<>();
    Planillas personal1 = new Planillas("Leao Urbina", "10260428", "Obrero", 8, 3);
    Planillas personal2 = new Planillas("Jose Leon", "10260429", "Obrero", 4, 2);
    Planillas personal3 = new Planillas("Carlos Lay", "10260430", "Obrero",  6, 7);
    Planillas personal4 = new Planillas("Jorge Jara", "10260431", "Administrativo", 1200.00, 12000.00);
    Planillas personal5 = new Planillas("Pepe Lopez", "10260432", "Administrativo", 1400.00, 5000.00);
    Planillas personal6 = new Planillas("Carla Chavez", "10260433", "Practicante", 1300.00, 0);
    Planillas personal7 = new Planillas("Rosa Oliver", "10260434", "Practicante", 1500.00, 0);
    planilla.add(personal1);
    planilla.add(personal2);
    planilla.add(personal3);
    planilla.add(personal4);
    planilla.add(personal5);
    planilla.add(personal6);
    planilla.add(personal7);
    Planillas operaciones = new Planillas();
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    System.out.println("            Registro            ");
    String buscar = "10260431";
    assertEquals("10260431", operaciones.saberElSueldo(buscar,planilla));    
}
}
