package bancosingleton;

import java.util.Calendar;

public class BancoSingleton {

    public static void main(String[] args) {
        //Banco banco = new Banco();
        
        Banco banco = Banco.getInstancia();
        
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
