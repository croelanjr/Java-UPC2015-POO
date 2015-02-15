package benedictoxvi.Logica;
import benedictoxvi.Entidades.*;
import benedictoxvi.Datos.*;
import benedictoxvi.Validaciones.*;

public class BLComprobanteVenta {
    
    
    private BDComprobanteVenta ObjBDComprobanteVenta = new BDComprobanteVenta();
    private BVComprobanteVenta  BVValidacion = new BVComprobanteVenta();
    private String Resultado = "";
    
    public String buscarVenta(ComprobanteVenta BEEntidades){
        Resultado = ObjBDComprobanteVenta.buscarVenta(BEEntidades);
        return Resultado;
    }
    public String altaVenta(ComprobanteVenta BEEntidades){
             String CampoValidado =  BVValidacion.ValidarCampo(BEEntidades);
        if ("".equals(CampoValidado)){
            Resultado =  ObjBDComprobanteVenta.altaVenta(BEEntidades);
        }
        return Resultado;
    }
}
