/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Entidades;

import java.util.Date;

/**
 *
 * @author milton
 */
public class TipoCambio {
    private String codigoMoneda;
    private String descripcionMoneda;
    private double tipoCambioCompra;
    private double tipoCambioVenta;
    private Date fecha;

    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    public void setCodigoMoneda(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    public String getDescripcionMoneda() {
        return descripcionMoneda;
    }

    public void setDescripcionMoneda(String descripcionMoneda) {
        this.descripcionMoneda = descripcionMoneda;
    }

    public double getTipoCambioCompra() {
        return tipoCambioCompra;
    }

    public void setTipoCambioCompra(double tipoCambioCompra) {
        this.tipoCambioCompra = tipoCambioCompra;
    }

    public double getTipoCambioVenta() {
        return tipoCambioVenta;
    }

    public void setTipoCambioVenta(double tipoCambioVenta) {
        this.tipoCambioVenta = tipoCambioVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
