/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Validaciones;

import benedictoxvi.Entidades.GrupoEstudio;
import benedictoxvi.Entidades.GrupoEstudioDetale;
import benedictoxvi.Util.Common;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;
import java.util.ArrayList;

/**
 *
 * @author milton
 */
public class BVGrupoEstudio {
       

public Result ValidarGrupoEstudio(GrupoEstudio pGrupoEstudio)
{
    StringBuilder sb = new StringBuilder();
    Result rs = new Result();
    
    sb.append(Common.IsNullOrEmpty(pGrupoEstudio.getNombre())? "nombre inválido,": "");
    sb.append(Common.IsNullOrEmpty(pGrupoEstudio.getDescripcion())? "descripción inválida,": "");
    sb.append(Common.IsNullOrEmpty(pGrupoEstudio.getNombreAcademia())? "Academia inválida,": "");
    
    if (sb.length() > 0) sb.append("\n");
    
    StringBuilder ssb = new StringBuilder();
    for(GrupoEstudioDetale detalle : pGrupoEstudio.getDetalle())
    {
        ssb.delete(0, ssb.length());
        //Validacion del curso
        if (detalle.getCurso() != null)
        {
            ssb.append(Common.IsNullOrEmpty(detalle.getCurso().getCodigoCurso())?"Debe ingresar el código del curso": "");
            ssb.append(Common.IsNullOrEmpty(detalle.getCurso().getNombreCurso())?"Debe ingresar el nombre del curso": "");
            ssb.append(Common.IsNullOrEmpty(detalle.getCurso().getSyllabus())?"Debe ingresar la url del syllabus": "");
        }
        else
        {
            ssb.append("curso inválido.");
        }
       
        //Validacion del instructor
        if(detalle.getInstructor() != null)
        {
            ssb.append((detalle.getInstructor().getCodigo() <= 0)?"Debe ingresar el nombre del curso": "");
            ssb.append(Common.IsNullOrEmpty(detalle.getInstructor().getApellidosNombres())?"Debe ingresar el nombre del instructor": "");        
        }
        else
        {
            ssb.append("instructor inválido.");
        }

        //Validacion del local
        if (detalle.getLocal() != null)
        {
            ssb.append((detalle.getLocal().getCodigoLocal() <= 0)?"código del local inválido": "");
            ssb.append(Common.IsNullOrEmpty(detalle.getLocal().getNombre())?"Debe ingresar el nombre del local": "");        
        }
        else
        {
            ssb.append("local no especificado.");
        }
        
        if (sb.length() > 0) 
        {
            ssb.append("\n");
            sb.append(ssb.toString());
            ssb.delete(0, ssb.length());
        }       
        
    }
        
    if (sb.length() > 0) 
    {
        rs.SetResult(ResultType.Error, sb.toString());
        return rs;
    }
    else
    {
        rs.SetResult(ResultType.Ok);
        return rs;
    }
    
}


}
