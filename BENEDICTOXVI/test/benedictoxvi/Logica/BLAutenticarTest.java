package benedictoxvi.Logica;

import benedictoxvi.Entidades.Usuario;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BLAutenticarTest {
    
    @Test
    public void testAutenticarUsuario() {
        System.out.println("AutenticarUsuario");
        
        Usuario pusuario = new Usuario();
        pusuario.setUsuario("Administrador");
        pusuario.setContrasenha("Windows1@");
        
        BLAutenticar instance = new BLAutenticar();
        Result expResult = new Result(ResultType.Ok, "Usuario correcto", null);
        Result result = instance.AutenticarUsuario(pusuario);
        
        System.out.println(result.getMensaje());
        assertEquals(expResult.getMensaje(), result.getMensaje());
        assertEquals(expResult.getTipo(), result.getTipo()); 
    }
}
