/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Logica;

import benedictoxvi.Datos.BDGrupoEstudio;
import benedictoxvi.Entidades.GrupoEstudio;
import benedictoxvi.Entidades.GrupoEstudioDetale;
import benedictoxvi.Entidades.Instructor;
import benedictoxvi.Util.Common;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;
import java.util.ArrayList; 
import benedictoxvi.Validaciones.BVGrupoEstudio;
/**
 *
 * @author milton
 */
public class BLGrupoEstudio {
   
private BDGrupoEstudio bd = new BDGrupoEstudio();
     
public ArrayList<GrupoEstudio> BuscarGrupoEstudio(GrupoEstudio pGrupoEstudio)
{
    try
    {
        return bd.BuscarGrupoEstudio(pGrupoEstudio);        
    }
    catch(Exception ex)
    {
        return null;
    }

}

public Result GuardarGrupoEstudio(GrupoEstudio pGrupoEstudio)
{
    Result rs = null;
    BVGrupoEstudio bv = new BVGrupoEstudio();
    rs = bv.ValidarGrupoEstudio(pGrupoEstudio);
    
    if(rs.getTipo() == ResultType.Error)
    {
       return rs;
    }   
    
    return bd.GuardarGrupoEstudio(pGrupoEstudio); 
}

public Result ModificarGrupoEstudio(GrupoEstudio pGrupoEstudio)
{
    BDGrupoEstudio bd = new BDGrupoEstudio();
    return bd.ModificarGrupoEstudio(pGrupoEstudio) ;
}

public Result EliminarGrupoEstudio(GrupoEstudio pGrupoEstudio)
{
    BDGrupoEstudio bd = new BDGrupoEstudio();
    return bd.EliminarGrupoEstudio(pGrupoEstudio) ;
}

}
