package Vendedores;
/*
1. Completar con clase, objeto, metodo, atributo
1. El valor de mis atributos puede ser diferente al de mis semejantes........
2. Yo me comporto como una plantilla.......
3. A mi me gusta hacer cosas.............
4. Yo puedo tener muchos metedos.........
5. Yo represento al estado...........
6. Yo represento el comportamiento........
7. Yo estoy en los objetos............
8. Yo vivo en memoria..........
9. Yo soy usado para crear instancias..........
10. Mi estado puede cambiar ...............
11. Yo declaro metodos.................
12. Yo puedo cambiar en ejecución...........
13. Tu y yo somo personas pero tu y yo somos diferentes.........
14. Yo recibo los mensajes de otros...........

2.- Indique ud. cuales serian las variables de clase y cuales las variables de
metodo

public class Algo{
private String numero;  ... Variables de clase
private String saludo;  ....Variables de clase

public void saludo(){
System.out.println("Hola" + saludo);
}
public int obtenerNumero(){
int numero = 10; Variables de metodos.
return numero;

3.- Dada la siguiente declaración, responder lo siguiente:
int[] numeroEnteros = {11,10,13,14,11,10,30};
- El numero de posiciones que tiene el arreglo ... desde 0 a 6
- Longitud del arreglo .... 7
- Nombre de Arreglo ... numeroEnteros
- Tipo de dato del Arreglo ..... int (Integer)

4.- Se necesita poder declarar un arreglo de longitud 2 para almacenar objetos
de tipo Alumno. Tambien tiene que instanciar los objetos y asignarlo a las 
posiciones del arreglo.

String tipoAlumno[] = {"Pregrado", "Epe"};
System.out.println("El alumno que estudia en la mañana pertenece al " + tipoAlumno[0]);
System.out.println("El alumno que estudia en la noche y gente que trabaja pertenece al " + tipoAlumno[1]);

5.- Diseñe una diagrama de Clases basandose en UML de una situacion real
                            Vehiculo
                        dueno = String
                        puertas = int
                        ruedas = int
                        Vehiculo()
                        Caracteristicas()
                                |
                 ----------------------------
                 |                           |
                Auto                      Camioneta
              automatico=boolean          tara = float, carga = float;
              Auto()                      Camioneta()
              Caracteristica()            Caracteristica()
              Subir()                     cargar()
              Bajar()                     tara()
*/

class Vendidas {

    String getMayorVenta(String[] mes, double[] ventas) {
       double mayor = ventas[0];
       int indice = 0;
       for(int i = 0; i < ventas.length; i++)
       {
           if(mayor < ventas[i])
           {
               mayor = ventas[i];
               indice = i;
           }
       }
       return "Es es el mes de " + mes[indice] + ", por el monto de S/. " + mayor + " Nuevos Soles.";
    }

    String getMenorVenta(String[] mes, double[] ventas) {
       double menor = ventas[0];
       int indice = 0;
       for(int i = 0; i < ventas.length; i++)
       {
           if(menor > ventas[i])
           {
               menor = ventas[i];
               indice = i;
           }
       }
       return "Es es el mes de " + mes[indice] + ", por el monto de S/. " + menor + " Nuevos Soles.";
    }

    double getComisionVenta(double[] ventas) {
        double suma = 0;
        for(int i = 0; i < ventas.length; i++)
        {
            suma = suma + ventas[i];
        }
        if(suma > 20000.0)
        {
            return suma * 0.15;
        }
        else
        {
            return 0;
        }
 }
}


public class Vendedor {
    public static void main(String[] args) {
         String mes[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
         "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre"};
         double ventas[] = {1200.00, 3000.00, 4000.00, 1000.00, 800.00, 300.00,
         1500.00, 4500.00, 2300.00, 3240.00, 1230.00, 1100.00};
         Vendidas venta = new Vendidas();
         System.out.println("Reportes de Ventas por Vendedor");
         System.out.println("El mes que más vendió : " + venta.getMayorVenta(mes, ventas));
         System.out.println("El mes que menos vendió: " + venta.getMenorVenta(mes,ventas));
         System.out.println("La comisión del Vendedor: S/. " + venta.getComisionVenta(ventas) + " Nuevos Soles.");
    }

}
