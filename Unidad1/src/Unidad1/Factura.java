package Unidad1;

import java.util.*;

public class Factura {
    private String empresa;
    private String ruc;
    private String direccion;
    private String numeroFactura;
    private Date Fechapago;
    private double SubTotal;
    private double igv;
    private double Total;

    private List<FacturaDetalle> facturaDetalle;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Date getFechapago() {
        return Fechapago;
    }

    public void setFechapago(Date Fechapago) {
        this.Fechapago = Fechapago;
    }

    public double getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(double SubTotal) {
        this.SubTotal = SubTotal;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public List<FacturaDetalle> getFacturaDetalle() {
        return facturaDetalle;
    }

    public void setFacturaDetalle(List<FacturaDetalle> facturaDetalle) {
        this.facturaDetalle = facturaDetalle;
    }

  
    
    
    
}
