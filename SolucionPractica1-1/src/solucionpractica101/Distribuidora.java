package solucionpractica101;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {

        private List<Factura> facturas;
    
        public Distribuidora()
        {
            facturas = new ArrayList<>();
        }
    public void guardarFactura(Factura factura)
    {
        facturas.add(factura);
    }
    public void guardarFactura(List<Factura> facturas)
    {
        for(Factura obj: facturas)
        {
            this.facturas.add(obj);
        }
    }
    public void listarFacturas()
    {
        for(Factura obj: facturas)
        {
            System.out.println("Factura Nro. " + obj.getNumeroFactura());
        }
    }
    public void imprimirFactura(String numeroFactura)
    {
     Factura factura = buscarFactura(numeroFactura);
     if(factura != null)
     {
         System.out.println("Factura: " + factura);
         
     }
    }

    private Factura buscarFactura(String numeroFactura) 
    {
        for(Factura obj: facturas) 
        {
            if(obj.getNumeroFactura().equals(numeroFactura))
            {
                return obj;
            }
        }
        return null;
    }
}
    
