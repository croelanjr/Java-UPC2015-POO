package TarjetasPromociones;

import java.util.ArrayList;

class Administrador {

    ArrayList<Clientes> registro = new ArrayList<Clientes>();
    
    public Administrador()
    {
    }
       
    public void agregarCliente(Clientes cliente) {
      
        registro.add(cliente);
    }
    
    public void agregarCliente(ArrayList<Clientes> registro)
    {
        for(int i = 0; i < registro.size(); i++)
        {
            Clientes cli = registro.get(i);
            this.registro.add(cli);
        }
    }

    public void listapantalla() {
        for(int a = 0; a < registro.size(); a++)
        {
            Clientes obj = registro.get(a);
            System.out.println(obj.getNombre() + "\t" + obj.getDni() + "\t" + obj.getCodigo() + "\t" + obj.getFecha() + "\t" + obj.getPunto() + "\t" + obj.getTipo());
        }
    }
    
    public double calculoConsumo(int punto, String tipo){
        double consumo = 0.0;
        if(tipo == "normal")
            consumo = (punto * 0.25) + 300;
        else if(tipo == "platinium")
            consumo = (punto * (punto * 0.1)) + (250 * (punto * 0.75));
        return consumo;
    }

    public void calculoPuntos() {
        double total = 0.0;
        for(int a = 0; a < registro.size(); a++)
        {
            Clientes obj = registro.get(a);
            total = calculoConsumo(obj.getPunto(), obj.getTipo());
            System.out.println(obj.getNombre() + "\t" + obj.getDni() + "\t" + obj.getCodigo() + "\t" + obj.getFecha() + "\t" + obj.getPunto() + "\t" + obj.getTipo() + "\t" + total);
        }
    }

    public void calculoTotales() {
        double monto = 0.0;
        double total = 0.0;
        for(int a = 0; a < registro.size(); a++)
        {
            Clientes obj = registro.get(a);
            monto = calculoConsumo(obj.getPunto(), obj.getTipo());
            System.out.println(obj.getNombre() + "\t" + obj.getDni() + "\t" + obj.getCodigo() + "\t" + obj.getFecha() + "\t" + obj.getPunto() + "\t" + obj.getTipo() + "\t" + monto);
            total = total + monto;
        }        
        System.out.println("Los Totales de los Clientes " + total);
    }

    public String comprobarregistro(Clientes cliente) {
        String mensaje = null;
        for(int c = 0; c < registro.size(); c++)
        {
            Clientes obj = registro.get(c);
            if(obj.getCodigo().equals(cliente.getCodigo()))
            {
                mensaje = "EXISTE";
                break;
            }
            else if(!obj.getCodigo().equals(cliente.getCodigo()))
            {       
                mensaje = "NO EXISTE";
            }
        }
        System.out.println(mensaje);
        return mensaje;
        }
    }