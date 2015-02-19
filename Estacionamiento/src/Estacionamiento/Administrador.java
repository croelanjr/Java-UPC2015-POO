package Estacionamiento;

import java.util.ArrayList;

class Administrador {
    
    private static final Administrador instancia = new Administrador();
    
    private ArrayList<Clientes> cliente;
    private Clientes nombre;
    private Clientes dni;
    private Clientes numero;
    private Clientes tipo;
    
    public Administrador()
    {
        cliente = new ArrayList<>();
    }
    
    public static Administrador getInstancia()
    {
        return instancia;
    }

    public void registrarCliente(Clientes registro) {
        cliente.add(registro);
    }
    
    public void registrarCliente(ArrayList<Clientes> clientes)
    {
        for(Clientes obj: cliente)
        {
            this.cliente.add(obj);
        }
    }

    public void listarpantalla() {
        for(Clientes obj: cliente)
        {
            System.out.println("Cliente: " + obj.getNombre());;
        } 
    }

    public double calculoFactor(int numero, String tipo)
    {
        double monto = 0;
        if(tipo == "vip")
            monto = ( 0.9 * (numero + 1)) / numero;
        else if(tipo == "frecuente")
            monto = ( 1.0 * (numero)) / (numero + 1);
        else if(tipo == "regular")
            monto = 100 * ( 3 / 10);
        return monto;
    }
    
    public void totalFactores(ArrayList<Clientes> registro) {
        double monto = 0.0;
        double total = 0.0;
        for(int i = 0; i < registro.size(); i++)
        {
            Clientes op = registro.get(i);
            if(op.getTipo() == "vip")
                monto = ( 0.9 * (op.getNumero() + 1)) / op.getNumero();
            else if(op.getTipo() == "frecuente")
                monto = ( 1.0 * (op.getNumero())) / (op.getNumero() + 1);
            else if(op.getTipo() == "regular")
                monto = 100 * ( 3 / 10);
        
            total = total + monto;
            System.out.println("monto " + Math.round(monto*100) / 100.00);
        }
        System.out.println("Total de los Factores : " + Math.round(total * 100) / 100.00);
    }    

    public int cantidadClientesRegistrado(ArrayList<Clientes> registro) {
        int contador = 0;
        double monto = 0.0;
        double total = 0.0;
        for(int i = 0; i < registro.size(); i++)
        {
            Clientes op = registro.get(i);
            if(op.getTipo() == "vip")
                monto = ( 0.9 * (op.getNumero() + 1)) / op.getNumero();
            else if(op.getTipo() == "frecuente")
                monto = ( 1.0 * (op.getNumero())) / (op.getNumero() + 1);
            else if(op.getTipo() == "regular")
                monto = 100 * ( 3 / 10);
        
            total = total + monto;
            contador = contador + 1;
        }
        System.out.println("*****************************************************");
        System.out.println("Total: " + Math.round(total * 100) / 100.00);
        System.out.println("La Cantidad de Clientes Registrados : " + contador);
        System.out.println("*****************************************************");
        return contador;
    }

    public void valorFactorCliente(ArrayList<Clientes> registro, String buscardni) {
        int contador = 0;
        double monto = 0.0;
        double total = 0.0;
        for(int i = 0; i < registro.size(); i++)
        {
            Clientes op = registro.get(i);
            if(buscardni == op.getDni())
            {
            if(op.getTipo() == "vip")
            {
                monto = ( 0.9 * (op.getNumero() + 1)) / op.getNumero();
            }
            else if(op.getTipo() == "frecuente")
            {
                monto = ( 1.0 * (op.getNumero())) / (op.getNumero() + 1);
            }
            else if(op.getTipo() == "regular")
            {
                monto = 100 * ( 3 / 10);
            }
            double factor = calculoFactor(0, buscardni);
            System.out.println("*********************************************");
            System.out.println("El Cliente con DNI : " + op.getDni() + " el factor crediticio es : " + monto);
            System.out.println("**********************************************");   
            }
        }
    }
}