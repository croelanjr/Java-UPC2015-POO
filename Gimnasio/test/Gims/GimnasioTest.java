package Gims;

/*
Se tiene la siguiente situación: se debe de implementar un 
programa orientado a objetos que permita registrar los pagos 
mensuales de los clientes de un gimnasio “GIMS”, cada pago lo 
registra en una Boleta de Pago donde se registra el mes, 
el monto y el tipo de pago (tarjeta de crédito o efectivo).
El Administrador desea saber:

La cantidad de pagos que ha realizado el cliente.

Imprima los datos del Cliente y el monto total que ha 
pagado en todos los meses que concurrió, considerar que 
si pagó con tarjeta se le adiciona al pago un 5% del 
pago correspondiente del mes.

Cuantos pagos realizó con tarjeta.

Pruebe con estos datos:
Cliente: Juan Caro Ruiz
Boletas de Pago: 
mes	tipo        monto
Enero	tarjeta     200
Febrero	tarjeta     200
Marzo	efectivo    200

Identifique las clases, métodos, atributos que 
considere necesarios y desarrolle su programa.
*Considere que su programa puede atender los datos 
de un solo cliente.
*/

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class GimnasioTest {
    
@Test
public void ListarClienteTest()
{
    String cliente = "Juan Caro Ruiz";
    Gimnasio gym1 = new Gimnasio(cliente,"Enero", "Tarjeta", 200.00);
    Gimnasio gym2 = new Gimnasio(cliente,"Febrero", "Tarjeta", 200.00);
    Gimnasio gym3 = new Gimnasio(cliente,"Marzo", "Efectivo", 200.00);
    Gimnasio gym4 = new Gimnasio(cliente,"Abril", "Tarjeta", 200.00);
    Gimnasio gym5 = new Gimnasio(cliente,"Mayo", "Tarjeta", 200.00);
    Gimnasio gym6 = new Gimnasio(cliente,"Junio", "Efectivo", 200.00);
    Gimnasio gym7 = new Gimnasio(cliente,"Julio", "Efectivo", 200.00);
    Gimnasio gym8 = new Gimnasio(cliente,"Agosto", "Tarjeta", 200.00);
    Gimnasio gym9 = new Gimnasio(cliente,"Setiembre", "Tarjeta", 200.00);
    Gimnasio gym10 = new Gimnasio(cliente,"Octubre", "Efectivo", 200.00);
    Gimnasio gym11 = new Gimnasio(cliente,"Noviembre", "Tarjeta", 200.00);
    Gimnasio gym12 = new Gimnasio(cliente,"Diciembre", "Efectivo", 200.00);
    ArrayList<Gimnasio> gimnasio = new ArrayList<>();
    gimnasio.add(gym1);
    gimnasio.add(gym2);
    gimnasio.add(gym3);
    gimnasio.add(gym4);
    gimnasio.add(gym5);
    gimnasio.add(gym6);
    gimnasio.add(gym7);
    gimnasio.add(gym8);
    gimnasio.add(gym9);
    gimnasio.add(gym10);
    gimnasio.add(gym11);
    gimnasio.add(gym12);
    System.out.println();
    System.out.println("Cliente: " + cliente + "\n" + gym1.listarpantalla(gimnasio));  
}

@Test
public void ListarClienteConMontoTotal()
{
    String cliente = "Juan Caro Ruiz";
    Gimnasio gym1 = new Gimnasio(cliente,"Enero", "Tarjeta", 200.00);
    Gimnasio gym2 = new Gimnasio(cliente,"Febrero", "Tarjeta", 200.00);
    Gimnasio gym3 = new Gimnasio(cliente,"Marzo", "Efectivo", 200.00);
    Gimnasio gym4 = new Gimnasio(cliente,"Abril", "Tarjeta", 200.00);
    Gimnasio gym5 = new Gimnasio(cliente,"Mayo", "Tarjeta", 200.00);
    Gimnasio gym6 = new Gimnasio(cliente,"Junio", "Efectivo", 200.00);
    Gimnasio gym7 = new Gimnasio(cliente,"Julio", "Efectivo", 200.00);
    Gimnasio gym8 = new Gimnasio(cliente,"Agosto", "Tarjeta", 200.00);
    Gimnasio gym9 = new Gimnasio(cliente,"Setiembre", "Tarjeta", 200.00);
    Gimnasio gym10 = new Gimnasio(cliente,"Octubre", "Efectivo", 200.00);
    Gimnasio gym11 = new Gimnasio(cliente,"Noviembre", "Tarjeta", 200.00);
    Gimnasio gym12 = new Gimnasio(cliente,"Diciembre", "Efectivo", 200.00);
    ArrayList<Gimnasio> gimnasio = new ArrayList<>();
    gimnasio.add(gym1);
    gimnasio.add(gym2);
    gimnasio.add(gym3);
    gimnasio.add(gym4);
    gimnasio.add(gym5);
    gimnasio.add(gym6);
    gimnasio.add(gym7);
    gimnasio.add(gym8);
    gimnasio.add(gym9);
    gimnasio.add(gym10);
    gimnasio.add(gym11);
    gimnasio.add(gym12);
    System.out.println();
    System.out.println("Reporte de Boleta de Pago");
    System.out.println("Cliente: " + cliente + "\n" + gym1.listaconcargoPantalla(gimnasio));  
}

}
