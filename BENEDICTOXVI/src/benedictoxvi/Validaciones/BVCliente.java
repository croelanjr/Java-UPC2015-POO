
package benedictoxvi.Validaciones;
import benedictoxvi.Entidades.*;
import benedictoxvi.Util.*;
import benedictoxvi.Util.ResultType;


public class BVCliente {
    
    
    Result rs = new Result();
    StringBuilder sb = new StringBuilder();
    public BVCliente() {
    }
    public Result ValidarCampo(Clientes BEEntidades){
            // Nombre, ApellidosPaterno, ApellidoMaterno, Email, NroDocumento, Telefono
        sb.append(Common.IsNullOrEmpty(BEEntidades.getNombre())? "nombre inválido,": "");
        sb.append(Common.IsNullOrEmpty(BEEntidades.getApellidoPaterno())? "nombre inválido,": "");
        sb.append(Common.IsNullOrEmpty(BEEntidades.getApellidoMaterno())? "nombre inválido,": "");
        sb.append(Common.IsNullOrEmpty(BEEntidades.getEmail())? "nombre inválido,": "");
        sb.append(Common.IsNullOrEmpty(BEEntidades.getNroDocumento())? "nombre inválido,": "");
        //
        sb.append(Common.IsNullOrEmpty(BEEntidades.getFechaContacto())? "nombre inválido,": "");
        
        if(sb.length() <= 0) return new Result(ResultType.Ok, "datos correctos", null);
        else return new Result(ResultType.Error, "datos incorrectos", sb.toString());        
    }
}
