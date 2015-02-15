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
public class BVUsuario {
    
    public Result ValidarNuevoUsuario(Usuario pusuario)
    {
         StringBuilder sb = new StringBuilder();         
         sb.append((Common.IsNullOrEmpty(pusuario.getNombre()))?".Nombre inválido\n":"");
         sb.append((Common.IsNullOrEmpty(pusuario.getApellidoPaterno()))?".Apellido paterno inválido\n":"");
         sb.append((Common.IsNullOrEmpty(pusuario.getApellidoMaterno()))?".Apellido materno inválido\n":"");
         sb.append((Common.IsNullOrEmpty(pusuario.getNroDocumento()))?".Número de documento inválido\n":"");
         sb.append((Common.IsNullOrEmpty(pusuario.getEmail()))?".Email inválido\n":"");
         sb.append((Common.IsNullOrEmpty(pusuario.getCargo()))?".Cargo inválido\n":"");
         sb.append((Common.IsMinorOrEqualsZero(pusuario.getRol().getCodigoRol()))?".Rol inválido\n":"");
         sb.append((Common.IsNullOrEmpty(pusuario.getContrasenha()))?".Contraseña inválido\n":"");
         sb.append((Common.IsNullOrEmpty(pusuario.getConfirmContrasenha()))?".Confirmación de contraseña inválida\n":"");
    
         if (!Common.IsMinorOrEqualsZero(sb.length()))
             return new Result(ResultType.Error, "Valide los campos antes de grabar.", sb.toString());
         else
             return new Result(ResultType.Ok, "La validación pasó sin errores.", null);
    }
    
    public Result ModificarUsuario(Usuario pusuario)
    {
         StringBuilder sb = new StringBuilder();         
         sb.append((Common.IsMinorOrEqualsZero(pusuario.getCodigo()))?".Código inválido\n":"");
         sb.append((Common.IsNullOrEmpty(pusuario.getNombre()))?".Nombre inválido\n":"");
         sb.append((Common.IsNullOrEmpty(pusuario.getApellidoPaterno()))?".Apellido paterno inválido\n":"");
         sb.append((Common.IsNullOrEmpty(pusuario.getApellidoMaterno()))?".Apellido materno inválido\n":"");
         sb.append((Common.IsNullOrEmpty(pusuario.getNroDocumento()))?".Número de documento inválido\n":"");
         sb.append((Common.IsNullOrEmpty(pusuario.getEmail()))?".Email inválido\n":"");
         sb.append((Common.IsNullOrEmpty(pusuario.getCargo()))?".Cargo inválido\n":"");
         sb.append((Common.IsMinorOrEqualsZero(pusuario.getRol().getCodigoRol()))?".Rol inválido\n":"");
         sb.append((Common.IsNullOrEmpty(pusuario.getContrasenha()))?".Contraseña inválido\n":"");
         sb.append((Common.IsNullOrEmpty(pusuario.getConfirmContrasenha()))?".Confirmación de contraseña inválida\n":"");
    
         if (!Common.IsMinorOrEqualsZero(sb.length()))
             return new Result(ResultType.Error, "Valide los campos antes de modificar.", sb.toString());
         else
             return new Result(ResultType.Ok, "La validación pasó sin errores.", null);
    }
    
}
