package benedictoxvi.Datos;
import benedictoxvi.Entidades.*;
import benedictoxvi.Util.Result;
import benedictoxvi.Util.ResultType;
import benedictoxvi.Validaciones.*;
import java.util.ArrayList;
import java.util.List;

public class BDComprobanteCompra {
   
    public String buscarCompra(ComprobanteCompra BEEntidades){
        return new Result(ResultType.Ok, "Buscando los datos espere un momento por favor...", "").getMensaje();
    }
    public String altaCompra(ComprobanteCompra BEEntidades){
        return new Result(ResultType.Ok, "La Compra ha sido dado de alta satisfactoriamente", "").getMensaje();
    }
     
    
    
}
