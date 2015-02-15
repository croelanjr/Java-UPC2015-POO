
package benedictoxvi.Logica;
import benedictoxvi.Entidades.*;
import benedictoxvi.Datos.*;

import benedictoxvi.Validaciones.*;

public class BLProspecto {
    
   
    public BLProspecto() {
        
    }
    
       BDProspecto ObjProspecto = new BDProspecto();
       BVProspecto BVValidacion = new BVProspecto();
      String Resultado="";
    public String BuscarAProspecto(Prospecto BEEntidades){
        Resultado = ObjProspecto.BuscarProspecto(BEEntidades);
        return Resultado;
    }
    
    public String GrabarCliente(Prospecto BEEntidades){
        String CampoValidado =  BVValidacion.ValidarCampo(BEEntidades);
        if ("".equals(CampoValidado)){
            Resultado =  ObjProspecto.GrabarProspecto(BEEntidades);
        }
        return Resultado;
    }

    public String EliminarCliente(Prospecto BEEntidades)
    {
        String CampoValidado =  BVValidacion.ValidarCampo(BEEntidades);
        if ("".equals(CampoValidado)){
        Resultado =  ObjProspecto.EliminarProspecto(BEEntidades);
        }
        return Resultado;
    }
    
    public String AltaProspecto(Prospecto BEEntidades){
        String CampoValidado =  BVValidacion.ValidarCampo(BEEntidades);
        if ("".equals(CampoValidado)){
        Resultado =  ObjProspecto.AltaProspecto(BEEntidades);
        }
        return Resultado;
    }
    
}
