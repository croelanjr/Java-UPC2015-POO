/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Validaciones;

import benedictoxvi.Entidades.Usuario;
import benedictoxvi.Util.Common;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;

/**
 *
 * @author milton
 */
public class BVAutenticar {
    
    public Result ValidarAutenticacion(Usuario pusuario)
    {
        Result rs = new Result();
        
        if (Common.IsNullOrEmpty(pusuario.getUsuario()))
        {
            rs.SetResult(ResultType.Error, "El usuario es inválido.");
        }
        else if (Common.IsNullOrEmpty(pusuario.getContrasenha()))
        {
            rs.SetResult(ResultType.Error, "La contraseña es inválida.");
        }
        else
        {
            rs.SetResult(ResultType.Ok,"Datos válidos.");
        }
        
        return rs;
    }
}
