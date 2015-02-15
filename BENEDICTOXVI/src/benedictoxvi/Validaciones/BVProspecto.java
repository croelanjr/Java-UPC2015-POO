
package benedictoxvi.Validaciones;

import benedictoxvi.Entidades.*;
import benedictoxvi.Util.Common;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;


public class BVProspecto {
 
    
    
    Result rs = new Result();
    StringBuilder sb = new StringBuilder();
  
    public String ValidarCampo(Prospecto BEEntidades){
            // Nombre, ApellidosPaterno, ApellidoMaterno, Email, NroDocumento, Telefono
        sb.append(Common.IsNullOrEmpty(BEEntidades.getNombre())? "nombre inválido,": "");
        sb.append(Common.IsNullOrEmpty(BEEntidades.getApellidoPaterno())? "nombre inválido,": "");
        sb.append(Common.IsNullOrEmpty(BEEntidades.getApellidoMaterno())? "nombre inválido,": "");
        sb.append(Common.IsNullOrEmpty(BEEntidades.getEmail())? "nombre inválido,": "");
        sb.append(Common.IsNullOrEmpty(BEEntidades.getNroDocumento())? "nombre inválido,": "");
        sb.append(Common.IsNullOrEmpty(BEEntidades.getTelefono())? "nombre inválido,": "");
        
        rs.SetResult(ResultType.Advertencia, "Error de campo", sb.toString());
        return rs.toString();
    }
    
    
    
    
}
