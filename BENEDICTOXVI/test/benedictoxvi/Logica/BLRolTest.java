package benedictoxvi.Logica;

import benedictoxvi.Entidades.Modulo;
import benedictoxvi.Entidades.Rol;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BLRolTest {
    
    @Test
    public void testBuscarRol() {
        System.out.println("BuscarRol");
        Rol pRol = new Rol();
        pRol.setNombreRol("Marketing");
        
        BLRol instance = new BLRol();
        Rol expResult = new Rol();
        expResult.setCodigoRol(1);
        expResult.setNombreRol("Marketing");
        expResult.setDescripcionRol("Area de Publicidad");
        
        Rol result = instance.BuscarRol(pRol);
        if ( expResult != null)
        System.out.println("Se encontró el Rol " + expResult.getNombreRol());
        
        assertEquals(expResult.getCodigoRol(), result.getCodigoRol());       
    }

    @Test
    public void testGuardarRol() {
        System.out.println("GuardarRol");
        ArrayList<Modulo> modulos = new ArrayList<Modulo>();
        Modulo mod1 = new Modulo("01", "Nueva Venta", "Nueva Venta", true, true, true, true);
        Modulo mod2 = new Modulo("02", "Nuevo requerimiento", "", true, true, true, true);
        Modulo mod3 = new Modulo("03", "Modificar venta", "", true, true, false, false);
        Modulo mod4 = new Modulo("04", "Nueva Proforma", "", true, false, true, true);
        Modulo mod5 = new Modulo("05", "Nuevos Clientes", "", true, true, false, true);
        modulos.add(mod1);
        modulos.add(mod2);
        modulos.add(mod3);
        modulos.add(mod4);
        modulos.add(mod5);
        
        Rol pRol = new Rol();
        pRol.setCodigoRol(4);
        pRol.setNombreRol("Supervisor");
        pRol.setDescripcionRol("Area de Supervisión");
        pRol.setModulos(modulos);
        
        BLRol instance = new BLRol();
        Result expResult = new Result(ResultType.Ok, "El rol se grabo correctamente", null);
        Result result = instance.GuardarRol(pRol);
        
        assertEquals(expResult.getDetalleMensaje(), result.getDetalleMensaje());
        assertEquals(expResult.getMensaje(), result.getMensaje()); 
        assertEquals(expResult.getTipo(), result.getTipo()); 
 
        System.out.println(expResult.getMensaje());
    }

    @Test
    public void testModificarRol() {
        System.out.println("ModificarRol");
        
        ArrayList<Modulo> modulos = new ArrayList<Modulo>();
        Modulo mod1 = new Modulo("01", "Nueva Venta", "Nueva Venta", true, true, true, true);
        Modulo mod2 = new Modulo("02", "Nuevo requerimiento", "", true, true, true, true);
        Modulo mod3 = new Modulo("03", "Modificar venta", "", true, true, false, false);

        modulos.add(mod1);
        modulos.add(mod2);
        modulos.add(mod3);
        
        Rol pRol = new Rol();
        pRol.setCodigoRol(1);
        pRol.setNombreRol("Marketing 5");
        pRol.setDescripcionRol("Area de Publicidad 4");        
        pRol.setModulos(modulos);
                
        BLRol instance = new BLRol();
        Result expResult = new Result(ResultType.Ok, "Rol modificado correctamente.", null);
        Result result = instance.ModificarRol(pRol);
       
        assertEquals(expResult.getDetalleMensaje(), result.getDetalleMensaje());
        assertEquals(expResult.getMensaje(), result.getMensaje()); 
        assertEquals(expResult.getTipo(), result.getTipo()); 
       System.out.println(expResult.getMensaje());
    }

    @Test
    public void testEliminarRol() {
        System.out.println("EliminarRol");
        Rol pRol = new Rol();
        pRol.setCodigoRol(1);
        pRol.setNombreRol("Marketing");
        pRol.setDescripcionRol("Area de Publicidad");
        
        BLRol instance = new BLRol();
        Result expResult = new Result(ResultType.Ok, "Rol eliminado correctamente.", null); 
        Result result = instance.EliminarRol(pRol);
        
        assertEquals(expResult.getDetalleMensaje(), result.getDetalleMensaje());
        assertEquals(expResult.getMensaje(), result.getMensaje()); 
        assertEquals(expResult.getTipo(), result.getTipo());    
        System.out.println(expResult.getMensaje());
    }
}
