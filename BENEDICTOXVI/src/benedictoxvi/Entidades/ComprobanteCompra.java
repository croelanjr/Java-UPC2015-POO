/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Entidades;

/**
 *
 * @author milton
 */
public class ComprobanteCompra extends BaseComprobante {
            
            private int concepto;
            private double moneda;
            private double numero;
            private String empresa;
            private String fecha_emision;
            private String fecha_vencimiento;
            private String fecha_pago;
            private double igv; 
            private String estado;
    public ComprobanteCompra(){
    
    }
    public ComprobanteCompra(int concepto, double moneda, double numero, String empresa, String fecha_emision, String fecha_vencimiento, String fecha_pago, double igv, String estado) {
        this.concepto = concepto;
        this.moneda = moneda;
        this.numero = numero;
        this.empresa = empresa;
        this.fecha_emision = fecha_emision;
        this.fecha_vencimiento = fecha_vencimiento;
        this.fecha_pago = fecha_pago;
        this.igv = igv;
        this.estado = estado;
    }

    public int getConcepto() {
        return concepto;
    }

    public void setConcepto(int concepto) {
        this.concepto = concepto;
    }

    public double getMoneda() {
        return moneda;
    }

    public void setMoneda(double moneda) {
        this.moneda = moneda;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(String fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
            
            
                    
}
