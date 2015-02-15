
package benedictoxvi.Logica;
import benedictoxvi.Entidades.*;
import benedictoxvi.Datos.*;
import benedictoxvi.Validaciones.*;

public class BLComprobanteCompra {
    private BDComprobanteCompra ObjBDComprobanteCompra = new BDComprobanteCompra();
    private BVComprobanteCompra  BVValidacion = new BVComprobanteCompra();
    private String Resultado = "";
    
    public String buscarCompra(ComprobanteCompra BEEntidades){
        Resultado = ObjBDComprobanteCompra.buscarCompra(BEEntidades);
        return Resultado;
    }
    public String altaCompra(ComprobanteCompra BEEntidades){
             String CampoValidado =  BVValidacion.ValidarCampo(BEEntidades);
        if ("".equals(CampoValidado)){
            Resultado =  ObjBDComprobanteCompra.altaCompra(BEEntidades);
        }
        return Resultado;
    }    
}
