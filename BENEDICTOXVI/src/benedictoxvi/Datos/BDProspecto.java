/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Datos;

import benedictoxvi.Entidades.*;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;

/**
 *
 * @author JOHN
 */
public class BDProspecto {
        
    public String BuscarProspecto(Prospecto BEEntidades){
        return new Result(ResultType.Ok, "Datos grabados correctamente.", "").getMensaje();
    }
    public String GrabarProspecto(Prospecto BEEntidades){
        return new Result(ResultType.Ok, "Datos grabados correctamente.", "").getMensaje();
    }
    public String EliminarProspecto(Prospecto BEEntidades){
        return new Result(ResultType.Ok, "Datos grabados correctamente.", "").getMensaje();
    }
    public String AltaProspecto(Prospecto BEEntidades){
        
    return new Result(ResultType.Ok, "Prospecto dado de alta satisfactorio.", "").getMensaje();
    
    }    
    
}
