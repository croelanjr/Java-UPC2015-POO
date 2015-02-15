package Bebidas;

public class Producto {
    private String codigoproducto;
    private String descripcion;
    private double precio;
    private String unidad;
    private int stock;
    private String codigoproveedor;

    public Producto(String codigoproducto, String descripcion, double precio, 
            String unidad, int stock, String codigoproveedor) {
        this.codigoproducto = codigoproducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.unidad = unidad;
        this.stock = stock;
        this.codigoproveedor = codigoproveedor;
    }

    public String getCodigoproducto() {
        return codigoproducto;
    }

    public void setCodigoproducto(String codigoproducto) {
        this.codigoproducto = codigoproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }  

    public String getCodigoproveedor() {
        return codigoproveedor;
    }

    public void setCodigoproveedor(String codigoproveedor) {
        this.codigoproveedor = codigoproveedor;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
}
