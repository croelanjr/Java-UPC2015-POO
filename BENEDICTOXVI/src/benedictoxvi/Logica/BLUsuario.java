/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Logica;

import benedictoxvi.Datos.BDUsuario;
import benedictoxvi.Util.Result;
import benedictoxvi.Entidades.Usuario;
import benedictoxvi.Util.ResultType;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author JOHN
 */
public class BLUsuario {
    
    private BDUsuario bd = new BDUsuario();
    
    public Result GuardarUsuario(Usuario pusuario)
    {        
        //Validacion de password
        boolean isPasswordEquals = (pusuario.getContrasenha().equals(pusuario.getConfirmContrasenha()))?true:false;
        
        if(isPasswordEquals)
            if (!bd.ExisteUsuario(pusuario))
                return bd.GuardarUsuario(pusuario);
            else
                return new Result(ResultType.Error, "El usuario existe.", null);
        else
            return new Result(ResultType.Error, "Las contraseñas no coinsiden.", null);
    }
    
    public Result ModificarUsuario(Usuario pusuario)
    {
                //Validacion de password
        boolean isPasswordEquals = (pusuario.getContrasenha().equals(pusuario.getConfirmContrasenha()))?true:false;
        
        if(isPasswordEquals)
            return bd.ModificarUsuario(pusuario);
        else
            return new Result(ResultType.Error, "Las contraseñas no coinsiden.", null);
    }
    
    public Result EliminarUsuario(Usuario pusuario)
    {
        //Validar que no haya transacciones
        boolean ExistsTransaction = bd.ExisteTransacciones(pusuario.getCodigo());
        if(!ExistsTransaction)
            return bd.EliminarUsuario(pusuario);
        else
            return new Result(ResultType.Error, "No se puede eliminar porque existen transacciones vinculadas al usuario.", null);
    }
    
    public Usuario BuscarUsuarios(Usuario pusuario)
    {
        return bd.BuscarUsuarios(pusuario);   
    }
    
    public boolean ExisteUsuario(Usuario pusuario)
    {
        return bd.ExisteUsuario(pusuario);        
    }
    

    
    
}
