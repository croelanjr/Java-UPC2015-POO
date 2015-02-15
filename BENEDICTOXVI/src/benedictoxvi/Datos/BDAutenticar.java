/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Datos;

import benedictoxvi.Entidades.Usuario;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;
import java.util.ArrayList;

/**
 *
 * @author John
 */
public class BDAutenticar {
    
     public Result AutenticarUsuario(Usuario pusuario)
     {
         ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
         Usuario usuario1 = new Usuario();
         usuario1.setUsuario("Administrador");
         usuario1.setContrasenha("Windows1@");
         
         Usuario usuario2 = new Usuario();
         usuario2.setUsuario("mgonzales");
         usuario2.setContrasenha("mgonzales");
         
         usuarios.add(usuario1);
         usuarios.add(usuario2);
         
         
         for(Usuario item : usuarios)
         {
             if (item.getUsuario().equals(pusuario.getUsuario()) && item.getContrasenha().equals(pusuario.getContrasenha()))
             {
                  return new Result(ResultType.Ok, "Usuario correcto", null);
             }
         }
          return new Result(ResultType.Error, "Usuario o contraseña inválida.", null);
        
     }
}
