
package benedictoxvi.Validaciones;
import benedictoxvi.Entidades.*;
import benedictoxvi.Util.*;
import benedictoxvi.Util.ResultType;

public class BVComprobanteCompra {
     public String ValidarCampo(ComprobanteCompra BEEntidades)
    {
        Result rs = new Result();
        StringBuilder sb = new StringBuilder();
        //sb.append(Common.IsNullOrEmpty(BEEntidades.getConcepto())? "nombre inválido,": "");
        sb.append(Common.IsMinorOrEqualsZero(BEEntidades.getMoneda())? "Moneda inválido,": "");        
        sb.append(Common.IsMinorOrEqualsZero(BEEntidades.getNumero())? "Numero inválido,": "");
        sb.append(Common.IsNullOrEmpty(BEEntidades.getEmpresa())? "Empresa inválido,": "");
        sb.append(Common.IsNullOrEmpty(BEEntidades.getFecha_emision())? "Fecha inválido,": "");        
        sb.append(Common.IsNullOrEmpty(BEEntidades.getFecha_vencimiento())? "Fecha inválido,": "");        
        sb.append(Common.IsNullOrEmpty(BEEntidades.getFecha_pago())? "Fecha inválido,": "");        
        //sb.append(Common.IsMinorOrEqualsZero(BEEntidades.getSubtotal())? "nombre inválido,": "");
        //sb.append(Common.IsMinorOrEqualsZero(BEEntidades.getIGV())? "nombre inválido,": "");
        //sb.append(Common.IsMinorOrEqualsZero(BEEntidades.getTotal())? "nombre inválido,": "");
        sb.append(Common.IsNullOrEmpty(BEEntidades.getEstado())? "nombre inválido,": "");        
        rs.SetResult(ResultType.Advertencia, "Error de campo", sb.toString());
        return rs.toString();  
        
    }   
}
