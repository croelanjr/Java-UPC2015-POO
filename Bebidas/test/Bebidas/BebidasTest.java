/*
Una distribuidora de Bebidas “SED S.A” necesita de un sistema de control de 
ingresos/salidas de productos a su Almacén.
 
Los proveedores y productos deberán ser cargados al sistema previamente, 
registrando lo siguiente por cada uno:
 
Proveedor
Código del proveedor, RUC, nombre, dirección, teléfono, correo.
Producto
Nombre del producto, descripción, precio, unidad de medida (paquete, 
caja, litros).
 
El Administrador requiere testear lo siguiente:
 
El registro al sistema de 3 Proveedores, deberá utilizar el patrón de diseño 
Singleton para cargar a memoria a estos Proveedores (2 puntos)
El registró al sistema de 3 Productos, deberá utilizar el patrón de diseño 
Singleton para cargar a memoria a estos Productos (2 puntos)
Validar la no existencia de un Proveedor dado un código de proveedor, 
utilice el mismo Singleton respectivo. (2 punto)
Validar la no existencia de un Producto dado un código de producto, 
utilice el mismo Singleton respectivo. (2 punto)
El registro de ingreso de dos productos provistos por dos proveedores 
distintos al Almacén, valide la existencia de cada producto que ingrese 
al Almacén dado su código, valide también la existencia del proveedor, 
no olvide ingresar la cantidad de productos respectivamente y las 
validaciones hágalas con el Singleton respectivo. (4 puntos)
La salida de una cantidad determinada de productos del almacén 
(actualice su stock). (3 puntos)
El costo total de todos los productos existentes en el Almacén. (3 puntos)
El stock de productos dado un código de producto, es decir, realice su 
búsqueda en el Almacén. (2 puntos)
 */
package Bebidas;

import org.junit.Test;
import static org.junit.Assert.*;

public class BebidasTest {
    
@Test
public void verificarElEstadoDeSingleton()
{
    Administrador administra = Administrador.getInstancia();
    
    if(administra != null)
    {
        System.out.println("Sistema de Almacen ya es Patron de Diseño Singleton");
    }
        
}

@Test
public void elRegistroAlSistemaDeTresProveedores()
{
    Administrador operacion = new Administrador();
    Proveedor registro1 = new Proveedor("123", "Carbonstar", "10102604291", "Dalias 883", "croelanjr@gamil");
    Proveedor registro2 = new Proveedor("124", "CBS Corporation", "10102604292", "Cutervo 1999", "ventas@cbs.com");
    Proveedor registro3 = new Proveedor("125", "Amaleto", "10102604293", "Sicuani 1705", "amaleto@amaleto.com");
    operacion.agregarProveedor(registro1);
    operacion.agregarProveedor(registro2);
    operacion.agregarProveedor(registro3);
    System.out.println("*************************************************");
    operacion.listarpantalla();
    System.out.println("*************************************************");
}

@Test
public void elRegistroDelSistemaDeTresProductos()
{
    Administrador operacion = new Administrador();
    Producto producto1 = new Producto("botella1", "botella plastica", 5.50, "paquete", 20, "123");
    Producto producto2 = new Producto("tapa2", "tapa azul", 12.50, "caja", 13,  "124");
    Producto producto3 = new Producto("agua20", "Agua desilada", 0.56, "litro", 4, "125");
    operacion.agregarProducto(producto1);
    operacion.agregarProducto(producto2);
    operacion.agregarProducto(producto3);
    System.out.println("**********************************************");
    operacion.listarpantallaProducto();
    System.out.println("**********************************************");
}

@Test
public void validarLaExistenciaDeUnProveedor()
{
    Administrador operacion = new Administrador();
    Proveedor registro1 = new Proveedor("123", "Carbonstar", "10102604291", "Dalias 883", "croelanjr@gamil");
    Proveedor registro2 = new Proveedor("124", "CBS Corporation", "10102604292", "Cutervo 1999", "ventas@cbs.com");
    Proveedor registro3 = new Proveedor("125", "Amaleto", "10102604293", "Sicuani 1705", "amaleto@amaleto.com");
    operacion.agregarProveedor(registro1);
    operacion.agregarProveedor(registro2);
    operacion.agregarProveedor(registro3);
    System.out.println("***********************************************");
    String buscarcodigo = "127";
    operacion.validarProveedor(buscarcodigo);
    System.out.println("***********************************************");
}

@Test
public void validarLaExistenciaDeUnProducto()
{
    Administrador operacion = new Administrador();
    Producto producto1 = new Producto("botella1", "botella plastica", 5.50, "paquete", 20, "123");
    Producto producto2 = new Producto("tapa2", "tapa azul", 12.50, "caja", 13,  "124");
    Producto producto3 = new Producto("agua20", "Agua desilada", 0.56, "litro", 4, "125");
    operacion.agregarProducto(producto1);
    operacion.agregarProducto(producto2);
    operacion.agregarProducto(producto3);
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
    String buscarcodigo = "tapa3";
    operacion.validarProducto(buscarcodigo);
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
}

@Test
public void ingresoDeDosProductos()
{
    Administrador operacion = new Administrador();
    Proveedor registro1 = new Proveedor("123", "Carbonstar", "10102604291", "Dalias 883", "croelanjr@gamil");
    Proveedor registro2 = new Proveedor("124", "CBS Corporation", "10102604292", "Cutervo 1999", "ventas@cbs.com");
    Proveedor registro3 = new Proveedor("125", "Amaleto", "10102604293", "Sicuani 1705", "amaleto@amaleto.com");
    operacion.agregarProveedor(registro1);
    operacion.agregarProveedor(registro2);
    operacion.agregarProveedor(registro3);
    Producto producto1 = new Producto("botella1", "botella plastica", 5.50, "paquete", 20, "123");
    Producto producto2 = new Producto("tapa2", "tapa azul", 12.50, "caja", 13,  "124");
    Producto producto3 = new Producto("agua20", "Agua desilada", 0.56, "litro", 4, "125");
    operacion.agregarProducto(producto1);
    operacion.agregarProducto(producto2);
    operacion.agregarProducto(producto3);
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
    String buscarcodigo = "tapa2";
    String buscarproveedor = "124";
    int nuevoingreso = 10;
    operacion.ingresoProducto(buscarproveedor, buscarcodigo, nuevoingreso);
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
    
}

@Test
public void salidaDeUnaCantidadDeterminadaDeProductosDelAlmacen()
{
    Administrador operacion = new Administrador();
    Producto producto1 = new Producto("botella1", "botella plastica", 5.50, "paquete", 20, "123");
    Producto producto2 = new Producto("tapa2", "tapa azul", 12.50, "caja", 13,  "124");
    Producto producto3 = new Producto("agua20", "Agua desilada", 0.56, "litro", 4, "125");
    operacion.agregarProducto(producto1);
    operacion.agregarProducto(producto2);
    operacion.agregarProducto(producto3);
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
    String buscar = "agua20";
    int descontar = 2;
    operacion.salidaDeStock(buscar,descontar); 
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
}


@Test
public void costoTotalDeTodosLosProductosExistentes()
{
    Administrador operacion = new Administrador();
    Producto producto1 = new Producto("botella1", "botella plastica", 5.50, "paquete", 20, "123");
    Producto producto2 = new Producto("tapa2", "tapa azul", 12.50, "caja", 13,  "124");
    Producto producto3 = new Producto("agua20", "Agua desilada", 0.56, "litro", 4, "125");
    operacion.agregarProducto(producto1);
    operacion.agregarProducto(producto2);
    operacion.agregarProducto(producto3);
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
    operacion.costoTotalProductos();
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
}


@Test
public void realiceSubusquedaEnElAlmacen()
{    
    Administrador operacion = new Administrador();
    Producto producto1 = new Producto("botella1", "botella plastica", 5.50, "paquete", 20, "123");
    Producto producto2 = new Producto("tapa2", "tapa azul", 12.50, "caja", 13,  "124");
    Producto producto3 = new Producto("agua20", "Agua desilada", 0.56, "litro", 4, "125");
    operacion.agregarProducto(producto1);
    operacion.agregarProducto(producto2);
    operacion.agregarProducto(producto3);
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
    String buscar = "tapa2";
    operacion.buscarAlmacen(buscar);
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
}
}
