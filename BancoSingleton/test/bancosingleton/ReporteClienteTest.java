package bancosingleton;

import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReporteClienteTest {

    @Test
    public void testGenerarReporte() {
        //Banco banco = new Banco();
        
        Banco banco = Banco.getInstancia();
        
        Banco banco2 = Banco.getInstancia();
        
        if(banco == banco2)
        {
            System.out.println("Banco y Banco2 son el mismo objeto");
        }
        
        
        inicializarClientes(banco);
        // Ejecutar el reporte de cliente
        ReporteCliente reporte = new ReporteCliente();
        reporte.setBanco(banco);
        reporte.generarReporte();
    }

    private static void inicializarClientes(Banco banco) {

        //A 180 dias
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 180);

        Cliente cliente1 = new Cliente("Jose", "Diaz");
        // Creamos diferentes clientes y sus cuentas
        banco.agregarCliente(cliente1);
        cliente1.agregarCuenta(new CuentaAPlazoFijo(500.00, cal.getTime()));
        cliente1.agregarCuenta(new CuentaNormal(200.00, 400.00));

        Cliente cliente2 = new Cliente("Armando", "Lopez");

        banco.agregarCliente(cliente2);
        cliente2.agregarCuenta(new CuentaNormal(200.00));
        cliente2.agregarCuenta(new CuentaAPlazoFijo(1500.00, cal.getTime()));

        Cliente cliente3 = new Cliente("Ana", "Loo");

        banco.agregarCliente(cliente3);
        cliente3.agregarCuenta(new CuentaNormal(200.00));
        cliente3.agregarCuenta(new CuentaAPlazoFijo(150.00, cal.getTime()));
    }

}
