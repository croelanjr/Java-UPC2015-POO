package EmpresaFlores;

import java.util.logging.Logger;

class Flor {
    private String tipo;
    private String color;
    private int precio;
    
    public Flor()
    {
   
    }

    public Flor(String tipo, String color, int precio) {
        this.tipo = tipo;
        this.color = color;
        this.precio = precio;
    }

     public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    void juntar(Flor f2) {
        this.tipo = tipo;
        this.color = color;
        this.precio = precio + f2.getPrecio();   
    }
}
