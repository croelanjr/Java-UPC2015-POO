package Producto;

import org.junit.Test;
import static org.junit.Assert.*;

public class AdministradorTest {
     
@Test
public void obtenerSuma()
{
    // datos
    Producto producto1 = new Producto("001", "Microprocesador i5", 240.00);
    Producto producto2 = new Producto("002", "Mouse Logitech", 60.00);
    //Ejecutar
    Administrador administrador = new Administrador();
    administrador.adicionar(producto1);
    administrador.adicionar(producto2);
    double resultado;
    resultado = administrador.sumarPrecios();
    //Verificar
    assertEquals(producto1.getPrecio() + producto2.getPrecio(), resultado, 0.00);
}
    
}
