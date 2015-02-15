package benedictoxvi.Datos;

import benedictoxvi.Entidades.*;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;
import benedictoxvi.Validaciones.*;

public class BDComprobanteVenta {
    
    public String buscarVenta(ComprobanteVenta BEEntidades){
        return new Result(ResultType.Ok, "Buscando los datos espere un momento por favor...", "").getMensaje();
    }
    public String altaVenta(ComprobanteVenta BEEntidades){
        return new Result(ResultType.Ok, "La venta ha sido dado de alta satisfactoriamente", "").getMensaje();
    }
    
    
}
