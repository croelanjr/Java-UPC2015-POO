/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Datos;
import benedictoxvi.Entidades.*;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;
import benedictoxvi.Validaciones.*;
/**
 *
 * @author JOHN
 */
public class BDCliente {
    
     BVCliente  BVValidacion = new BVCliente();
     public String BuscarCliente(Clientes BEEntidades){
         
         return new Result(ResultType.Ok, "Buscando los datos espere un momento por favor...", "").getMensaje();
     
     }
    public String GrabarCliente(Clientes BEEntidades){
        
        return new Result(ResultType.Ok, "Datos grabados correctamente.", "").getMensaje();
     
     }
     public String EliminarCliente(Clientes BEEntidades){
         
        return new Result(ResultType.Ok, "Datos grabados correctamente.", "").getMensaje();
     
     }
     
   public String ConvertirAProspecto(Clientes BEEntidades){
        return new Result(ResultType.Ok, "Convercion satisfactoria.", "").getMensaje();
                
    }
    
    public String LeerProspecto(Clientes BEEntidades){
        return new Result(ResultType.Ok, "Leectura de Prospecto en proceso.", "").getMensaje();
    }     

}
