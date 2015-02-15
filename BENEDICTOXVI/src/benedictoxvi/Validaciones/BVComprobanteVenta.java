/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Validaciones;
import benedictoxvi.Entidades.*;
import benedictoxvi.Util.*;
import benedictoxvi.Util.ResultType;
/**
 *
 * @author JOHN
 */
public class BVComprobanteVenta {
    
    
    
    public String ValidarCampo(ComprobanteVenta BEEntidades)
    {
        Result rs = new Result();
        StringBuilder sb = new StringBuilder();
        //sb.append(Common.IsMinorOrEqualsZero(BEEntidades.getConcepto())? "nombre inválido,": "");
        sb.append(Common.IsMinorOrEqualsZero(BEEntidades.getNumero())? "Numero inválido,": "");
        sb.append(Common.IsNullOrEmpty(BEEntidades.getEmpresa())? "Empresa inválido,": "");
        //sb.append(Common.IsMinorOrEqualsZero(BEEntidades.getSubtotal())? "nombre inválido,": "");
        //sb.append(Common.IsMinorOrEqualsZero(BEEntidades.getIGV())? "nombre inválido,": "");
        //sb.append(Common.IsMinorOrEqualsZero(BEEntidades.getTotal())? "nombre inválido,": "");
        sb.append(Common.IsMinorOrEqualsZero(BEEntidades.getMoneda())? "Moneda inválido,": "");
        sb.append(Common.IsNullOrEmpty(BEEntidades.getFecha_emision())? "Fecha inválido,": "");        
        sb.append(Common.IsNullOrEmpty(BEEntidades.getFecha_vencimiento())? "Fecha inválido,": "");        
        sb.append(Common.IsNullOrEmpty(BEEntidades.getFecha_pago())? "Fecha inválido,": "");        
        sb.append(Common.IsNullOrEmpty(BEEntidades.getObservaciones())? "Observacion inválido,": "");        
        sb.append(Common.IsNullOrEmpty(BEEntidades.getEstado())? "Esado inválido,": "");        
        rs.SetResult(ResultType.Advertencia, "Error de campo", sb.toString());
        return rs.toString();  
        
    }
}
