package Producto;

import java.util.ArrayList;

class Administrador {
    private ArrayList<Producto> catalogo = new ArrayList<Producto>();

    public ArrayList<Producto> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Producto> catalogo) {
        this.catalogo = catalogo;
    }    

    public void adicionar(Producto producto) {
        this.catalogo.add(producto);
    }
    
    public double sumarPrecios() {
        double suma = 0;
        for(Producto p: catalogo)
        {
            suma = suma + p.getPrecio();
        }
        return suma;
    }
}
