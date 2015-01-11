package NotasPromedios;
/*
Teoria
1.- Explique como funciona Java y y porque se dice que es multiplataforma
RE:Java es un lenguaje de programacion y se basa en la programacion orientada a
objetos, tiene su propia portabilidad de Java Virtual Machine para ejecutar
los codigos de bytes, es multiplataforma porque puede ejecutar en cualquier
sistem operativo como windows, Linux, Unix, Mac en cualquier CPU.
2.- Explique lo que es una SOBREESCRITURA o un OVERRIDE
La SOBREESCRITURA es la forma por la cual una clase que hereda puede re-definir 
los métodos de su clase Padre, de esta manera puede crear nuevos métodos con 
el mismo nombre de su superClase
3.- Diagrame una herencia usando UML diferente al caso planteado en los
materiales de Trabajo Autonomo.
                    Animal
                       |
        ---------------------------
        |         |       |       |
     Mamifero   Pez    Reptil    Ave
        |                         |
   ----------------            --------------
   |       |      |            |            |
Humano elefante perro         paloma      gaviota
                  |
           ------------------
           |       |        |
        Caniche Labrador Doberman

4.- Explique el ciclo de desarrollo de TDD
es una práctica de ingenieria de sofware que involucra otras dos prácticas: 
Escribir las pruebas primero (Test First Development) y Refactorización 
(Refactoring).
5.- JUNIT es un framework para hacer el test automatizados. Se le pide un 
ejemplo sencillo mostrando el uso de las anotaciones @Before, @Test
@Before: Indicamos que el siguiente método se debe ejecutar antes de cada test 
(precede al método setUp). Si tiene que preceder al método setUpClass, la 
notación será "@BeforeClass"
@Test: Indicamos a Junit que se trata de un método de Test. 
En versiones anteriores de JUnit los métodos tenían que tener un nombre 
con la siguiente estructura: "test". Con esta notación colocada delante de 
los métodos podemos elegir el nombre libremente.
package com.autentia.training.tutorialJUnit;  
  
import org.junit.AfterClass;  
import org.junit.Assert;  
import org.junit.BeforeClass;  
import org.junit.Test;  
  
public class pruebaTest {  
  
    @BeforeClass  
    public static void setUpClass() throws Exception {  
    //Inicialización general de variables, escritura del log...  
    }  
      
    @AfterClass  
    public static void tearDownClass() throws Exception {  
    //Liberación de recursos, escritura en el log...  
    }  
      
    @Before  
    public void setUp() {  
    //Inicialización de variables antes de cada Test  
    }  
      
    @After  
    public void tearDown() {  
    //Tareas a realizar después de cada test  
    }  
      
    @Test  
    public void comprobarAccion() {  
    //creamos el entorno necesario para la prueba  
    //Usamos alguna de las funciones arriba descritas   
    //para realizar la comprobación  
    }  
      
    public void funcionAuxiliar() {  
    //tareas auxiliares  
    }  
}  
*/
import org.junit.Test;
import static org.junit.Assert.*;

public class TestNotasPromedios {

@Test
public void CalcularNotaFinalPOO()
{
    //Datos
    //Notas(PC1,PC2,PA1,TP,TF)
    //Ejecutar
    Notas nota = new Notas(12.5, 13.0, 19.0, 20.0, 19.8);
    //Verificar
    assertEquals(17.565, nota.getNotaFinal(),0);
}

@Test
public void DevuelveNotaTrabajoFinal()
{
    //datos
    //Notas(PC1,PC2,PA1,TP,TF) que devuelva la nota TF
    //Ejecutar
    Notas nota1 = new Notas(12.5, 13.0, 19.0, 20.0,0);
    //Verificar
    assertEquals(2.916666666666667, nota1.getDevolucionNotaTrabajoFinal(),0);
}

@Test
public void DevuelvePromedioFinalSalon()
{
    //Datos
    double notasalon [] = {12.5, 16.0, 19.0, 11.0, 14.45, 17.9, 20.0};
    //Ejecutar
    Notas salon = new Notas();
    //Verificar
    assertEquals(15.835714285714285, salon.getPromedioFinalSalon(notasalon),0);
    
}

@Test
public void DevuelveNotaMayorSalon()
{
     //Datos
    double notasalon [] = {12.5, 16.0, 19.0, 11.0, 14.45, 17.9, 20.0};
    //Ejecutar
    Notas salon = new Notas();
    //Verificar
    assertEquals(20.0, salon.getNotaMayorSalon(notasalon),0);   
}
  
@Test
public void DevuelveNotaMenorSalon()
{
     //Datos
    double notasalon [] = {12.5, 16.0, 19.0, 11.0, 14.45, 17.9, 20.0};
    //Ejecutar
    Notas salon = new Notas();
    //Verificar
    assertEquals(11.0, salon.getNotaMenorSalon(notasalon),0);   
}
}
