/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Util;

/**
 *
 * @author milton
 */
public class Result {
    private String mensaje;
    private String detalleMensaje;
    private ResultType tipo;

    public Result()
    {
        this.mensaje = "";
        this.detalleMensaje = "";
        this.tipo = ResultType.None;
    }
    public Result(ResultType pTipo, String pMensaje, String pDetalleMensaje)
    {
        this.mensaje = pMensaje;
        this.detalleMensaje = pDetalleMensaje;
        this.tipo = pTipo;
    }
    
    public void SetResult(ResultType pTipo, String pMensaje, String pDetalleMensaje)
    {
        this.mensaje = pMensaje;
        this.detalleMensaje = pDetalleMensaje;
        this.tipo = pTipo;
    }
    
    public void SetResult(ResultType pTipo, String pMensaje)
    {
        this.mensaje = pMensaje;
        this.detalleMensaje = "";
        this.tipo = pTipo;
    }
    
    public void SetResult(ResultType pTipo)
    {
        this.tipo = pTipo;
    }
        
    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getDetalleMensaje() {
        return detalleMensaje;
    }

    public void setDetalleMensaje(String detalleMensaje) {
        this.detalleMensaje = detalleMensaje;
    }

    public ResultType getTipo() {
        return tipo;
    }

    public void setTipo(ResultType tipo) {
        this.tipo = tipo;
    }
    
    
    
}
