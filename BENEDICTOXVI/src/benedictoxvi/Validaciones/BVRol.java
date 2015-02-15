/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Validaciones;

import benedictoxvi.Entidades.Rol;
import benedictoxvi.Util.Common;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;

/**
 *
 * @author milton
 */
public class BVRol {
    
    public Result ValidarNuevoRol(Rol pRol)
    {
         StringBuilder sb = new StringBuilder();         
         sb.append((Common.IsNullOrEmpty(pRol.getNombreRol()))?".Nombre inválido\n":"");
         sb.append((Common.IsNullOrEmpty(pRol.getDescripcionRol()))?".Descripción inválida\n":"");
         sb.append((pRol.getModulos() == null || Common.IsMinorOrEqualsZero(pRol.getModulos().size())) ?".El rol no tiene módulos asignados\n":"");
         
         if (!Common.IsMinorOrEqualsZero(sb.length()))
             return new Result(ResultType.Error, "Valide los campos antes de grabar.", sb.toString());
         else
             return new Result(ResultType.Ok, "La validación pasó sin errores.", null);
    }
            
    public Result ValidarEdicionRol(Rol pRol)
    {
         StringBuilder sb = new StringBuilder();         
         sb.append((Common.IsMinorOrEqualsZero(pRol.getCodigoRol()))?".Código inválido\n":"");
         sb.append((Common.IsNullOrEmpty(pRol.getNombreRol()))?".Nombre inválido\n":"");
         sb.append((Common.IsNullOrEmpty(pRol.getDescripcionRol()))?".Descripción inválida\n":"");
         sb.append((pRol.getModulos() == null || Common.IsMinorOrEqualsZero(pRol.getModulos().size())) ?".El rol no tiene módulos asignados\n":"");
         
         if (!Common.IsMinorOrEqualsZero(sb.length()))
             return new Result(ResultType.Error, "Valide los campos antes de modificar.", sb.toString());
         else
             return new Result(ResultType.Ok, "La validación pasó sin errores.", null);
    }
       
    
}
