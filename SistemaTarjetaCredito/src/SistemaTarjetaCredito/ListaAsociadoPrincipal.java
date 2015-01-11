package SistemaTarjetaCredito;
/*
Parte de Teorica:
1.- Cual es la diferencia entre variables primitivas y objetos.
RE: Variables primitivas almacenan directamente un valor que siempre pertenece 
al rango de ese tipo como por ejemplo int, y Variables objetos almacenan 
direcciones y no valores directamente. Una referencia a un objeto es la 
dirección de un área en memoria destinada a representar ese objeto.
2.- Cual es la diferencia entre un objeto y una clase:
RE: Objeto es como la instancia de una clase y una clase es de forma abstracta 
a un objeto.
3.- Describe la anatomia de una clase:
RE: una clase es una plantilla que define la forma de un objeto. Especifica 
los datos y el codigo que actua sobre ellos. se declara su forma y naturaleza
exactas.
class nombredeclase{
int variable;
String variable;
}
4.- Complete con clase, objeto, metodo, atributo:
1. Tu y yo somos personas pero tu y yo somos diferentes: Personas clase, Tu y yo objetos.
2. Yo me comporto como una plantilla: clase
3. Yo recibo los mensajes de otros: metodos
4. Yo represento es estado: Clase
5. Yo represento el comportamiento:Atributo
6. Yo vivo en memoria: Atributo

5.- Explique que es sobreescritura de metodos y en que casos lo aplicamos.
La Sobreescritura es la forma por la cual una clase que hereda puede re-definir 
los métodos de su clase Padre, de esta manera puede crear nuevos métodos con 
el mismo nombre de su superClase
*/
import java.util.*;
import java.lang.*;

public class ListaAsociadoPrincipal {
    public static void main(String[] args) {
        Clientes cliente1 = new Clientes("10260429", "Croelan Grandez", "981342988", "Jr. Cutervo 1999", "croelanjr@gmail.com");
        List<Tarjetas> informacion1 = new ArrayList<>();
        Tarjetas card1 = new Tarjetas(cliente1, "454589000", "Dorada", "Activo");
        informacion1.add(card1);
        cliente1.setInformacion(informacion1);
        
        
        Tarjetas card2 = new Tarjetas(cliente1, "454589001", "Platinum", "No Activo");
        informacion1.add(card2);
        cliente1.setInformacion(informacion1);
                
        Clientes cliente2 = new Clientes("10501013", "Ana Grandez", "981342989", "Jr. Sicuani 1615", "anamaria@gmail.com");
        List<Tarjetas> informacion2 = new ArrayList<>();
        Tarjetas card3 = new Tarjetas(cliente2, "454589002", "Clasica", "Activo");
        informacion2.add(card3);
        cliente2.setInformacion(informacion2);
        /*
        Tarjetas card4 = new Tarjetas(cliente2, "454589003", "Dorada", "No Activo");
        informacion2.add(card4);
        cliente2.setInformacion(informacion2);
        */
        Bancos banco = new Bancos();
        System.out.println(" <Clientes Creados> ......");
        banco.crearCliente(cliente1);
        banco.crearCliente(cliente2);
        
        System.out.println("Listados de Clientes Creados: ");
        banco.listarInformacion();
        System.out.println("Activación una tarjeta con el cliente");
        banco.ClienteIdTarjetActivo(cliente1.getId());
        //banco.ClienteIdTarjetActivo(cliente2.getId());        
        System.out.println("Lista de Información de un cliente basado por ID");
        banco.ListadoClienteId(cliente1.getId());
        //banco.ListadoClienteId(cliente2.getId());   
    }
}
