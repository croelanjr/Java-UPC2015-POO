package DisciplinaTdd;
/*
Teoria
1.- Explique como funciona Java y y porque se dice que es multiplataforma
RE:Java es un lenguaje de programacion y se basa en la programacion orientada a
objetos, tiene su propia portabilidad de Java Virtual Machine para ejecutar
los codigos de bytes, es multiplataforma porque puede ejecutar en cualquier
sistem operativo como windows, Linux, Unix, Mac en cualquier CPU.
2.- Cual es la diferencia entre un objeto y una clase
RE: Objeto es como la instancia de una clase y una clase es de forma abstracta 
a un objeto.
3.- Describa la Anatomia de una clase
RE: una clase es una plantilla que define la forma de un objeto. Especifica 
los datos y el codigo que actua sobre ellos. se declara su forma y naturaleza
exactas.
class nombredeclase{
int variable;
String variable;
}
4.- Explique lo que es una SOBREESCRITURA o un OVERRIDE
La SOBREESCRITURA es la forma por la cual una clase que hereda puede re-definir 
los métodos de su clase Padre, de esta manera puede crear nuevos métodos con 
el mismo nombre de su superClase

5.- Explique el ciclo de desarrollo de TDD
es una práctica de ingenieria de sofware que involucra otras dos prácticas: 
Escribir las pruebas primero (Test First Development) y Refactorización 
(Refactoring).
*/

public class UPprincipal {
    public static void main(String[] args) {
        Profesor profesorTutor = new Profesor("Alfonzo Ugarte", 3, 16.50);
                
        System.out.println("Nombre: " + profesorTutor.getNombre());
        System.out.println("Calculo al dia por Docente : " + profesorTutor.getCalculoDia());
        System.out.println("Monto a Pagar al Docente : " + profesorTutor.getTotalAPagar());
    }
}
