/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author milton
 */
public abstract class BaseComprobante {
    protected String serie;
    protected String nroCorrelativo;
    protected TipoComprobante tipoComprobante;
    protected Date fechaEmision;
    protected Date fechaVencimiento;
    protected Date fechaPago;
    protected String nroGuiaRemisionRemitente;
    protected String nroGuiaRemisionTransportista;
    protected String nroRuc;
    protected String nombreCliente;
    protected double subtotal;
    protected double IGV;
    protected double total;
    protected String observaciones;
    protected TipoCambio tipoCambio;
    protected ArrayList<ComprobanteDetalle> detalle;

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNroCorrelativo() {
        return nroCorrelativo;
    }

    public void setNroCorrelativo(String nroCorrelativo) {
        this.nroCorrelativo = nroCorrelativo;
    }

    public TipoComprobante getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(TipoComprobante tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getNroGuiaRemisionRemitente() {
        return nroGuiaRemisionRemitente;
    }

    public void setNroGuiaRemisionRemitente(String nroGuiaRemisionRemitente) {
        this.nroGuiaRemisionRemitente = nroGuiaRemisionRemitente;
    }

    public String getNroGuiaRemisionTransportista() {
        return nroGuiaRemisionTransportista;
    }

    public void setNroGuiaRemisionTransportista(String nroGuiaRemisionTransportista) {
        this.nroGuiaRemisionTransportista = nroGuiaRemisionTransportista;
    }

    public String getNroRuc() {
        return nroRuc;
    }

    public void setNroRuc(String nroRuc) {
        this.nroRuc = nroRuc;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIGV() {
        return IGV;
    }

    public void setIGV(double IGV) {
        this.IGV = IGV;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public TipoCambio getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(TipoCambio tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public ArrayList<ComprobanteDetalle> getDetalle() {
        return detalle;
    }

    public void setDetalle(ArrayList<ComprobanteDetalle> detalle) {
        this.detalle = detalle;
    }
    
    public void CalcularTotales()
    {
        for(ComprobanteDetalle e: detalle)
        {
           this.subtotal = this.subtotal + e.getValorVenta();
        }
        this.IGV = this.IGV * this.subtotal;
        this.total = this.IGV + this.subtotal;
    }
}
