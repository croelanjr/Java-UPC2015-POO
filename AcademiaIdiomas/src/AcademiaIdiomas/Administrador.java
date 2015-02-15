package AcademiaIdiomas;

import java.util.ArrayList;

class Administrador {
    protected String nombre;
    protected int edad;

    public Administrador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Administrador() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public String buscaredad(int edades)
    {
        String nivel = null;
        if(edades < 5)
            nivel = "infante";
        else if(5 > edades || edades <= 12)
            nivel = "niño";
        else if(12 > edades || edades <= 17)
            nivel = "joven";
        else if(17 < edades)
            nivel = "adulto";
        return nivel;
    }
    
    public double getPrecio(int edades)
    {
        double precio = 0.0;
        Administrador tomar = new Administrador();
        String niveles = tomar.buscaredad(edades);
        if(niveles == "infante")
            precio = 150.00;
        else if(niveles == "niño")
            precio = 200.00;
        else if(niveles == "joven")
            precio = 220.00;
        else if(niveles == "adulto")
            precio = 250.00;
        return precio;
    }
    
    public double obtenerActividad(int participar)
    {
        double precioactividad = 0.0;
        if(participar == 1)
            precioactividad = 10.00;
        else if(participar == 2)
            precioactividad = 18.00;
        else if(participar == 3)
            precioactividad = 26.00;
        else if(participar == 4)
            precioactividad = 35.00;
        return precioactividad;
    }
    
    
    public String recibir(int edades, ArrayList<Administrador> alumnos) {
        String mensaje = null;
        for(int i = 0; i < alumnos.size(); i++)
        {
            Administrador op = alumnos.get(i);
            if(edades == op.getEdad())
            {
                mensaje = op.buscaredad(edades);
            }
        }
        return mensaje;
    } 
}

class Matricula extends Administrador
{
    public double obtenerMatricula(int edades, ArrayList<Administrador> alumnos) {
        double monto = 0.0;
        for(int i = 0; i < alumnos.size(); i++)
        {
            Administrador ope = alumnos.get(i);
            if(edades == ope.getEdad())
            {
                monto = ope.getPrecio(edades);
            }
        }
        return monto; 
    }
}

class Actividad extends Administrador
{
    public double determinePrecioActividad(int edades, int participar, ArrayList<Administrador> alumnos) {
        double montoactividad = 0.0;
        double monto = 0.0;
        for(int i = 0; i < alumnos.size(); i++)
        {
            Administrador oper = alumnos.get(i);
            if(edades == oper.getEdad())
            {
                monto = oper.getPrecio(edades);
                montoactividad = oper.obtenerActividad(participar);
            }
        }
        return montoactividad;    
    }

    public double determinePagoCorrespondiente(int edades, int participar, ArrayList<Administrador> alumnos) {
        double montoactividad = 0.0;
        double monto = 0.0;
        double total = 0.0;
        for(int i = 0; i < alumnos.size(); i++)
        {
            Administrador oper = alumnos.get(i);
            if(edades == oper.getEdad())
            {
                monto = oper.getPrecio(edades);
                montoactividad = oper.obtenerActividad(participar);
                total = monto + montoactividad;
            }
        }
        return total;         
    }
    
}