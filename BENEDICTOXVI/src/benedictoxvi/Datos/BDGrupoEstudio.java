/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Datos;

import benedictoxvi.Entidades.Curso;
import benedictoxvi.Entidades.GrupoEstudio;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
 
/**
 *
 * @author milton
 */
public class BDGrupoEstudio {
    
    
public ArrayList<GrupoEstudio> BuscarGrupoEstudio(GrupoEstudio pGrupoEstudio) throws FileNotFoundException
{
    try
    {    
        GrupoEstudio grupoEstudio1 = new GrupoEstudio();
        grupoEstudio1.setCodigoGrupoEstudio(1);
        grupoEstudio1.setDescripcion("Inteligencia de Negocios");
        grupoEstudio1.setDetalle(null);
        //Statement stm = con.createStatement();

        return null;
    }
    catch(Exception ex)
    {
        return null;
    }

}

public Result GuardarGrupoEstudio(GrupoEstudio pGrupoEstudio)
{
    return new Result(ResultType.Ok, "Datos grabados correctamente.", "");
}

public Result ModificarGrupoEstudio(GrupoEstudio pGrupoEstudio)
{
    return new Result(ResultType.Ok, "Datos modificados correctamente.", "");
}

public Result EliminarGrupoEstudio(GrupoEstudio pGrupoEstudio)
{
     GrupoEstudio ge1 = new GrupoEstudio();     
     ge1.setCodigoGrupoEstudio(1);
        
     GrupoEstudio ge2 = new GrupoEstudio(); 
     ge2.setCodigoGrupoEstudio(2);
     
     GrupoEstudio ge3 = new GrupoEstudio();     
     ge3.setCodigoGrupoEstudio(3);
               
     ArrayList<GrupoEstudio> gp = new ArrayList<GrupoEstudio>();
     gp.add(ge1);
     gp.add(ge2);
     gp.add(ge3);
     
       int indexItem = -1; 
        for(int index=0; index < gp.size(); index++)
        {
            if(gp.get(index).getCodigoGrupoEstudio() == pGrupoEstudio.getCodigoGrupoEstudio())
            {
                indexItem = index;
                break;
            }
        }
        
        if (indexItem > -1)
        {
            gp.remove(indexItem);
            return new Result(ResultType.Ok, "Grupo de estudio eliminado correctamente.", null);            
        }
        else
        {
           return new Result(ResultType.Ok, "No se encontró el grupo de estudio solicitado..", null);   
        }

}

}
