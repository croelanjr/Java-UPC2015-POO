package solucionpractica101;

import java.math.RoundingMode;
import java.util.Date;
import java.util.List;

public class Factura {
    private String empresa;
    private String ruc;
    private Date fecha;
    private String numeroFactura;
    private List<DetalleFactura> items;
    private double subTotal;
    private final double IGV = 0.18;
    private double total;
    

    public Factura(String empresa, String ruc, Date fecha, String numeroFactura) {
        this.empresa = empresa;
        this.ruc = ruc;
        this.fecha = fecha;
        this.numeroFactura = numeroFactura;
    }

    public void setItems(List<DetalleFactura> items) {
        this.items = items;
        this.subTotal = sumaItems();
        this.total = subTotal * (1.00 + IGV);
    }
    
    private double sumaItems() 
    {
        double suma = 0.0;
        for(DetalleFactura obj: items)
        {
            suma = suma + (obj.getCantidad() * obj.getPrecio());
        }
        return suma;
    }
    
    public String getNumeroFactura() {
        return numeroFactura;
    }

    @Override
    public String toString() {
        return "Factura{" + "empresa=" + empresa + ", ruc=" + ruc + ", fecha=" + fecha + ", numeroFactura=" + numeroFactura + ", items=" + items + ", subTotal=" + subTotal + ", IGV=" + IGV + ", total=" + total + '}';
    }
}
