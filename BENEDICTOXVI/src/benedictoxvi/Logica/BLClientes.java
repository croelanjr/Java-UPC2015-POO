
package benedictoxvi.Logica;

import benedictoxvi.Datos.*;
import benedictoxvi.Entidades.*;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;
import benedictoxvi.Validaciones.*;


public class BLClientes {
    
    private BDCliente ObjClientes = new BDCliente();
    private BVCliente  BVValidacion = new BVCliente();
    private String Resultado = "";

    public String BuscarClientes(Clientes BEEntidades){
        Resultado = ObjClientes.BuscarCliente(BEEntidades);
        return Resultado;
    }

    public String GrabarCliente(Clientes BEEntidades){
        Result r =  BVValidacion.ValidarCampo(BEEntidades);
        if (r.getTipo().equals(ResultType.Ok)){
            return ObjClientes.GrabarCliente(BEEntidades);
        }
        else
         return r.getMensaje() + r.getDetalleMensaje();
    }

    public String EliminarCliente(Clientes BEEntidades)
    {
        Result r =  BVValidacion.ValidarCampo(BEEntidades);
        if (r.getTipo().equals(ResultType.Ok)){
          return  ObjClientes.EliminarCliente(BEEntidades);
        }
        else
          return r.getMensaje() + r.getDetalleMensaje();
    }
    
    public String ConvertirAProspecto(Clientes BEEntidades){
        Result r =  BVValidacion.ValidarCampo(BEEntidades);
        if (r.getTipo().equals(ResultType.Ok)){
        return ObjClientes.ConvertirAProspecto(BEEntidades);
        }
        else
         return r.getMensaje() + r.getDetalleMensaje();
    }
    
    public String LeerProspecto(Clientes BEEntidades){
       Result r =  BVValidacion.ValidarCampo(BEEntidades);
        if (r.getTipo().equals(ResultType.Ok)){         
            return ObjClientes.LeerProspecto(BEEntidades);       
        }        
        else
         return r.getMensaje() + r.getDetalleMensaje();
        
    }
    
    
}
