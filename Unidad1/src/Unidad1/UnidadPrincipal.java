package Unidad1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UnidadPrincipal {
    public static void main(String[] args) {
        Factura factura = new Factura();
        factura.setEmpresa("CARBONSTAR LTD. EMPRESA INDUSTRIAL S.A.C.");
        factura.setRuc("20512645098");
        factura.setDireccion("Jr. Sicuani 1615 Cercado de Lima");
        factura.setNumeroFactura("001-0004563");
      
        FacturaDetalle item1 = new FacturaDetalle();
        item1.setNumeroLinea(1);
        item1.setDescripcion("Toner para impresora IBM 1130");
        item1.setCantidad(12);
        item1.setPrecio(100);
        item1.setTotal(1200);
        
        FacturaDetalle item2 = new FacturaDetalle();
        item2.setNumeroLinea(2);
        item2.setDescripcion("Toner para impresora IBM 1150");
        item2.setCantidad(10);
        item2.setPrecio(10);
        item2.setTotal(100);
        
        List<FacturaDetalle> items = new ArrayList<FacturaDetalle>();
        items.add(item1);
        items.add(item2);
        
        factura.setFacturaDetalle(items);
        
        double suma = 0.0;
        for(FacturaDetalle obj: items)
        {
            suma = suma + obj.getTotal();
        }
        System.out.println("El Total de la Factura: " +  suma);
        
        if(suma > 700.00)
        {
            System.out.println("Pedir el Comprobante de Retención.");
        }
        else
        {
            System.out.println("No Pedir el Comprobante de Retención");
        }
    }
}
