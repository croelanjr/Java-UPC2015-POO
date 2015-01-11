package solucionpractica101;

/*
Parte Teórica

1. Explique cómo funciona Java y porque se dice que es multiplataforma. (2 puntos)
RE: Java es un lenguaje de programación y se basa en la programación orientada 
a objetos, tiene su propia portabilidad de Java Virtual Machine para ejecutar 
los codigos de bytes, es multiplataforma porque puede ejecutar en cualquier 
sistema operativo como Windows, Linux, Unix, Mac en cualquier CPU.

2. Explique que significa la siguiente instrucción: (2 puntos)

Dog yorkshire = new Dog();
Dog bulldog = new Dog();

RE: Dog es una clase; yorshire y bulldog son objetos.

3. Respecto al ejemplo anterior si hacemos (2 puntos)

yorkshire = bulldog;

¿Cuántos objetos tenemos y cuantas referencias existen?

RE: Tenemos dos objetos y una refrencia.

4. Complete con clase, objeto, método, atributo (2 puntos)

1.	Tu y yo somos personas pero tu y yo somos diferentes:clase y objeto
2.	Yo me comporto como una plantilla : metodo
3.	Yo recibo los mensajes de otros : objeto
4.	Yo represento el estado : clase
5.	Yo represento el comportamiento : clase
6.	Yo vivo en memoria : atributo

5. Explique qué es sobreescritura de métodos y en que casos lo aplicamos. (2 puntos)

RE: La Sobreescritura de métodos es la forma por la cual una clase que hereda 
puede re-definir los métodos de su clase Padre, de esta manera puede crear 
nuevos métodos con el mismo nombre de su superClase


2.- PRACTICA
A usted le encargan modelar el área de ventas de una empresa distribuidora. 
Para lo cual si sistema debe poder imprimir en pantalla una factura con su 
detalle para un número de clientes.

Los datos de la factura son:
Razón social
RUC
Fecha
Numero Factura
Detalle de los objetos comprados
	- Cantidad
	- Producto
	- Precio
Subtotal
IGV
Total

Implementar un programa en java que me permita almacenar N facturas, 
me permita listar las facturas que existen (sólo su número de factura) 
y otro que me reciba el número de factura y lo imprima en pantalla.
*/



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DistriibuidoraPrincipal {
    public static void main(String[] args) {
        Factura factura1 = new Factura("CARBONSTAR", "20512645098", new Date(),"001-000344");
        List<DetalleFactura> items1 = new ArrayList<>();
        DetalleFactura detalle1 = new DetalleFactura(2,"Toner para Impresora HP 1100", 4223.00, factura1);
        items1.add(detalle1);
        factura1.setItems(items1);
        
        Factura factura2 = new Factura("CBS CORPORATION", "20523295404", new Date(), "001-000345");
        List<DetalleFactura> items2 = new ArrayList<>();
        DetalleFactura detalle2 = new DetalleFactura(1,"Toner para Impresora Xerox", 3523.00, factura2);
        items2.add(detalle2);
        factura2.setItems(items2);
        
        Distribuidora distribuidora = new Distribuidora();
        System.out.println("Guardando Las facturas");
        distribuidora.guardarFactura(factura1);
        distribuidora.guardarFactura(factura2);
        
        System.out.println("Listando las facturas");
        distribuidora .listarFacturas();
        
        System.out.println("Imprimiendo Facturas");
        distribuidora.imprimirFactura(factura1.getNumeroFactura());
        distribuidora.imprimirFactura(factura2.getNumeroFactura());
    }
}
