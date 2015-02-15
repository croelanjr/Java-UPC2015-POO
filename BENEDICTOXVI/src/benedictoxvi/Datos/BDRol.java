/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Datos;

import benedictoxvi.Entidades.Rol;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;
import benedictoxvi.Validaciones.BVRol;
import java.util.ArrayList;

/**
 *
 * @author milton
 */
public class BDRol {
    public Rol BuscarRol(Rol pRol)
    {
        ArrayList<Rol> roles = new ArrayList<Rol>();
        
        Rol rol1 = new Rol();
        rol1.setCodigoRol(1);
        rol1.setNombreRol("Marketing");
        rol1.setDescripcionRol("Area de Publicidad");

        Rol rol2 = new Rol();
        rol2.setCodigoRol(1);
        rol2.setNombreRol("Recursos Humanos");
        rol2.setDescripcionRol("Captación de personal");

        
        Rol rol3 = new Rol();
        rol3.setCodigoRol(1);
        rol3.setNombreRol("Ventas");
        rol3.setDescripcionRol("Servicio de atencion al cliente");

        roles.add(rol1);
        roles.add(rol2);
        roles.add(rol3);
        
        for(Rol item : roles)
        {
            if(item.getNombreRol().equalsIgnoreCase(pRol.getNombreRol()))
                return item;
        }
        return null;
    }
    
    public Result GuardarRol(Rol pRol)
    {
         ArrayList<Rol> roles = new ArrayList<Rol>();
         roles.add(pRol);
        return new Result(ResultType.Ok, "El rol se grabo correctamente", null);        
    }
    
    public Result ModificarRol(Rol pRol)
    {
        ArrayList<Rol> roles = new ArrayList<Rol>();
        
        Rol rol1 = new Rol();
        rol1.setCodigoRol(1);
        rol1.setNombreRol("Marketing");
        rol1.setDescripcionRol("Area de Publicidad");

        Rol rol2 = new Rol();
        rol2.setCodigoRol(2);
        rol2.setNombreRol("Recursos Humanos");
        rol2.setDescripcionRol("Captación de personal");

        
        Rol rol3 = new Rol();
        rol3.setCodigoRol(3);
        rol3.setNombreRol("Ventas");
        rol3.setDescripcionRol("Servicio de atencion al cliente");

        roles.add(rol1);
        roles.add(rol2);
        roles.add(rol3);
        
        for(Rol item : roles)
        {
            if(item.getCodigoRol() == pRol.getCodigoRol())
            {
                item = pRol;
                return new Result(ResultType.Ok, "Rol modificado correctamente.", null);
            }
        }
        
        return new Result(ResultType.Error, "No se encontró el registro a actualizar.", null);
    }
    
    public Result EliminarRol(Rol pRol)
    {
         ArrayList<Rol> roles = new ArrayList<Rol>();
        
        Rol rol1 = new Rol();
        rol1.setCodigoRol(1);
        rol1.setNombreRol("Marketing");
        rol1.setDescripcionRol("Area de Publicidad");

        Rol rol2 = new Rol();
        rol2.setCodigoRol(2);
        rol2.setNombreRol("Recursos Humanos");
        rol2.setDescripcionRol("Captación de personal");

        
        Rol rol3 = new Rol();
        rol3.setCodigoRol(3);
        rol3.setNombreRol("Ventas");
        rol3.setDescripcionRol("Servicio de atencion al cliente");

        roles.add(rol1);
        roles.add(rol2);
        roles.add(rol3);
        
         int indexItem = -1; 
        for(int index=0; index < roles.size(); index++)
        {
            if(roles.get(index).getCodigoRol() == roles.get(index).getCodigoRol())
            {
                indexItem = index;
            }
        }
        
        if (indexItem > -1)
        {
            roles.remove(indexItem);
            return new Result(ResultType.Ok, "Rol eliminado correctamente.", null);            
        }
        else
        {
           return new Result(ResultType.Ok, "No se encontró el rol solicitado..", null);   
        }
    }
}
