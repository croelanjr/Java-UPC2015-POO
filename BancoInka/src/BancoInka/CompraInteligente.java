package BancoInka;

/*
Teorica
1.- Explique un caso de negocio en el cual ud. aplicaria herencia.
Justifique con el adecuado diagrama de clases
RE:
                    Gerencia
                       |
        ---------------------------
        |         |       |       |
     Almacen   Factura   Contab    Produccion
        |         |                    |
   --------     --------            --------------
   |            |      |            |            |
inventario   cliente producto    materia       maquinarias
        

2.- En el caso anterior si aplica indique como aplicaría sobreescritura de
metodos, Sino aplica indique otro caso para justificar su respuesta.
RE:

Aplicaría sobreescritura o override para crear varios metodos, ya que cada tiene
sus labores de procedimientos.


3.- En la siguiente lista de notas por alumno escriba el algoritmo en Java para
obtener la mayor nota.
double []notas = {15,13,12,17,18,11,08,14,20};

for(int i = 0; i < notas.length; i++)
mayor = notas[0];
{
    if(mayor < notas[i])
    {
        mayor = notas[i];
    }
}
return mayor;

4.- De acuerdo al ejemplo anterior indique la nota menor
for(int i = 0; i < notas.length; i++)
menor = notas[0];
{
    if(menor > notas[i])
    {
        menor = notas[i];
    }
}
return menor;

5.- Por ultimo, si modificamos la lista de la siguiente manera:

double []notas = {20,15,13,12,17,18,11,08,14,20};

Cuales serían las notas mayores. Sugerencia devuelva los indices donde se
encuentran las notas mayores.
        double mayorindice = notas[0];
        int indice = 0;
        for(int i = 0; i < notas.length; i++)
        {
            if(notas[i] > mayorindice)
            {
                mayorindice = notas[i];
            }
        }
        double duplica = 0;
        for(int j = 0; j < notas.length; j++)
        {
            if(mayorindice == notas[j])
            {
                indice = j;
                duplica = notas[j];
            }
        }
        return duplica + " " + indice;
    }
*/
class OpcionCompra {
    
    private int opcion;
    private int anios;
    private double precio;
    private double cuotaInicial;
    private double diferencia;
    private int meses;
    private double numerodecuota;
    private double reenganche;
    private double cuotaMensualIntereses;
    private double CuotaAnualconIntereses;
    private double TotalCuota;
    private double porcentaje;

    String getCompra(int opcion, int anios, double precio) {
        if(anios == 2)
        {
            meses = 24;
            porcentaje = 0.30;
            numerodecuota = 25; 
            reenganche = precio * 0.50;
        }
        else
        {
            meses = 36;
            numerodecuota = 37;
            porcentaje = 0.40;
            reenganche = precio * 0.40;
        }
               
        if(opcion == 1)
        {
            cuotaInicial = precio * 0.20;
            diferencia = precio - cuotaInicial;
            cuotaMensualIntereses = diferencia * porcentaje;
            CuotaAnualconIntereses = (cuotaMensualIntereses * anios)+ diferencia;
            TotalCuota = CuotaAnualconIntereses / meses;
            return "La Cuota Inicial es : US$ " + cuotaInicial + " Dolares Americanos\n" + "La Cuota Mensual es : US$ " + TotalCuota + " Dolares Americanos.";            
        }
        else 
        {
            cuotaInicial = precio * 0.20;
            diferencia = precio - cuotaInicial;
            cuotaMensualIntereses = diferencia * porcentaje;
            CuotaAnualconIntereses = (cuotaMensualIntereses * anios) + diferencia;
            TotalCuota = CuotaAnualconIntereses / meses;
            return "La Cuota Inicial es : " + cuotaInicial + "\nLa Cuota Mensual es : " + TotalCuota +
            " Dolares Americanos\nReenganche de la compra inteligente de la cuota " + numerodecuota + " por el valor del auto " +  reenganche + 
                    " Dolares Americanos";
  
        }
    }
}


class CompraInteligente {
    public static void main(String[] args) {
        int opcion = 2;
        int anios = 3;
        double precio = 20000;
        OpcionCompra inteligente = new OpcionCompra();
        System.out.println("La opción de Compra Inteligente BANCO INKA es " + opcion);
        System.out.println("a " + anios + " años. " + "El precio del Vehiculo es US$ " + precio);
        System.out.println("----------------------------------------------------");
        System.out.println(inteligente.getCompra(opcion, anios, precio));
        inteligente.getCompra(opcion, anios, precio);
   }
}

