/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedictoxvi.Entidades;

/**
 *
 * @author milton
 */
public class Local {
    private int codigoLocal;
    private String nombre;
    private String direccion;
    private String ubicacionGoogleMaps;

    public Local(int pCodigoLocal, String pnombre, String pDireccion, String pUbicacionGoogleMaps)
    {
        this.codigoLocal = pCodigoLocal;
        this.nombre = pnombre;
        this.direccion = pDireccion;
        this.ubicacionGoogleMaps = pUbicacionGoogleMaps;
    }
    public int getCodigoLocal() {
        return codigoLocal;
    }

    public void setCodigoLocal(int codigoLocal) {
        this.codigoLocal = codigoLocal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUbicacionGoogleMaps() {
        return ubicacionGoogleMaps;
    }

    public void setUbicacionGoogleMaps(String ubicacionGoogleMaps) {
        this.ubicacionGoogleMaps = ubicacionGoogleMaps;
    }
}
