/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Logica;

import benedictoxvi.Datos.BDAutenticar;
import benedictoxvi.Util.Result;
import benedictoxvi.Entidades.Usuario;
import benedictoxvi.Util.ResultType;
import benedictoxvi.Validaciones.BVAutenticar;
/**
 *
 * @author JOHN
 */
public class BLAutenticar {
    
    BDAutenticar bd = new BDAutenticar();
    
    public Result AutenticarUsuario(Usuario pusuario)
    {
        BVAutenticar aut = new BVAutenticar();
        Result rs = aut.ValidarAutenticacion(pusuario);
        
        if (rs.getTipo() == ResultType.Ok)
        {
            return bd.AutenticarUsuario(pusuario);
        }
        else
        {
            return rs;
        }
    }
}
