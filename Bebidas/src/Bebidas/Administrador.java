package Bebidas;

import java.util.ArrayList;

class Administrador {
    
    private static final Administrador instancia = new Administrador();
    
    private ArrayList<Proveedor> bdproveedor;
    private ArrayList<Producto> bdproducto;
    
    public Administrador()
    {
        bdproveedor = new ArrayList<>();
        bdproducto = new ArrayList<>();
    }

    public static Administrador getInstancia()
    {
        return instancia;
    }
    public void agregarProveedor(Proveedor registro) {
        bdproveedor.add(registro);
    }
    
    public void agregarProveedor(ArrayList<Proveedor> bdproveedor)
    {
        for(Proveedor obj: bdproveedor)
        {
            this.bdproveedor.add(obj);
        }
    }
    
    public void listarpantalla()
    {
        for(Proveedor obj: bdproveedor)
        {
            System.out.println("Proveedor: " + obj.getCodigo());
        }
    }

    public void agregarProducto(Producto producto) {
        bdproducto.add(producto);
    }

    public void agregarProducto(ArrayList<Producto> bdproducto)
    {
        for(Producto ob1: bdproducto)
        {
            this.bdproducto.add(ob1);
        }
    }
    
    public void listarpantallaProducto()
    {
        for(Producto ob1: bdproducto)
        {
            System.out.println("Producto: " + ob1.getCodigoproducto() +
                    "\t Descripcion : " + ob1.getDescripcion());
        }
    }
    
    public void validarProveedor(String buscarcodigo) {
        for(Proveedor obj: bdproveedor)
        {
            if(obj.getCodigo()!= buscarcodigo)
            System.out.println("El proveedor " + buscarcodigo + " NO EXISTE ");
            break;
        }  
    }

    public void buscarAlmacen(String buscar) {
        for(Producto ob1: bdproducto)
        {
            if(ob1.getCodigoproducto() == buscar)
            System.out.println("El stock del producto " + buscar + " es : " + ob1.getStock());
        }        
    } 

    public void validarProducto(String buscarcodigo) {
        for(Producto ob1: bdproducto)
        {
            if(ob1.getCodigoproducto() != buscarcodigo)
            System.out.println("El producto " + buscarcodigo + " NO EXISTE");
            break;
        }      
    }

    public void costoTotalProductos() {
        double total = 0.0;
        for(Producto ob1: bdproducto)
        {
            total = total + (ob1.getPrecio() * ob1.getStock());
        }
        System.out.println("El costo total es : " + total);
    }

    public void salidaDeStock(String buscar, int descontar) {
        int salidastock = 0;
        for(Producto ob1: bdproducto)
        {
            if(ob1.getCodigoproducto() == buscar)
            {
                salidastock = ob1.getStock() - descontar;
                ob1.setStock(salidastock);
            }
        }
        for(Producto ob2: bdproducto)
        {
            System.out.println(ob2.getCodigoproducto() + " " + ob2.getStock());
        }
    }

    public void ingresoProducto(String buscarproveedor, String buscarcodigo, int nuevoingreso) {
        int ingresostock = 0;
        for(Proveedor obj: bdproveedor)
        {
            if(obj.getCodigo() == buscarproveedor)
            {
                for(Producto obp: bdproducto)
                {
                    if(obp.getCodigoproducto() == buscarcodigo || obp.getCodigoproveedor() == buscarproveedor)
                    {
                        ingresostock = obp.getStock() + nuevoingreso;
                        obp.setStock(ingresostock);
                    }
                }
            }
        }
        for(Producto obpp: bdproducto)
        {
            System.out.println(obpp.getCodigoproducto() + " " + obpp.getStock());
        } 
    }
}
