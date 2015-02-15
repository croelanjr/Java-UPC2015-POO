package benedictoxvi.Logica;

import benedictoxvi.Entidades.Prospecto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BLProspectoTest {
    
    @Test
    public void testBuscarAProspecto() {
        System.out.println("BuscarAProspecto");
        Prospecto BEEntidades = null;
        BLProspecto instance = new BLProspecto();
        String expResult = "";
        String result = instance.BuscarAProspecto(BEEntidades);
        assertEquals(expResult, result);
    }

    @Test
    public void testGrabarCliente() {
        System.out.println("GrabarCliente");
        Prospecto BEEntidades = null;
        BLProspecto instance = new BLProspecto();
        String expResult = "";
        String result = instance.GrabarCliente(BEEntidades);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testEliminarCliente() {
        System.out.println("EliminarCliente");
        Prospecto BEEntidades = null;
        BLProspecto instance = new BLProspecto();
        String expResult = "";
        String result = instance.EliminarCliente(BEEntidades);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testAltaProspecto() {
        System.out.println("AltaProspecto");
        Prospecto BEEntidades = null;
        BLProspecto instance = new BLProspecto();
        String expResult = "";
        String result = instance.AltaProspecto(BEEntidades);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
