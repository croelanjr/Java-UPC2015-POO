/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Logica;

import benedictoxvi.Datos.BDRol;
import benedictoxvi.Entidades.Rol;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;
import benedictoxvi.Validaciones.BVRol;
import java.util.ArrayList;

/**
 *
 * @author milton
 */
public class BLRol {
    
    private BDRol bd = new BDRol();
    
    public Rol BuscarRol(Rol pRol)
    {
        return bd.BuscarRol(pRol);
    }
    
    public Result GuardarRol(Rol pRol)
    {
        BVRol bv =new BVRol();
        Result r  = bv.ValidarNuevoRol(pRol);

        if (r.getTipo() == ResultType.Ok)
            return bd.GuardarRol(pRol);
        else
            return r;
    }
    
    public Result ModificarRol(Rol pRol)
    {
        BVRol bv =new BVRol();
        Result r  = bv.ValidarEdicionRol(pRol);

        if (r.getTipo() == ResultType.Ok)
            return bd.ModificarRol(pRol);
        else
            return r;
    }
    
    public Result EliminarRol(Rol pRol)
    {
        return bd.EliminarRol(pRol);
    }
    
}
