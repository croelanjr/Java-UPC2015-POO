package bancosingleton;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    private static final Banco instancia = new Banco();

    private List<Cliente> clientes;

    public Banco() {
        clientes = new ArrayList<>();
    }
    
    public static Banco getInstancia()
    {
        return instancia;
    }

    public void agregarCliente(Cliente cliente) {

        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
   
}
