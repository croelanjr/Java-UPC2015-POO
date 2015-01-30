package EnterosIngles;

/*
Numero Enteros a su representación en ingles

Se le pide desarrollar un Componente que toma un numero entero y retorna 
su correspondiente descripción en ingles.
Es decir, si el entero es 1, el resultado será “one”. Si el entero es 23 
el resultado será “twenty three” y así sucesivamente. 


Realice la solución aplicando la metodología TDD (Test Driven Development). 

1.- Realizar el test para uno (1) 2 puntos

2.- Realizar el Test para dos (2) 2 puntos

3.- Realizar el Test para veinte (20) 2 puntos

4.- Realizar el Test de veintiuno (21) a veinte nueve (29) 2 puntos

5.- Realizar el Test para treinta (30) a treinta y nueve (39) 2 puntos

6.- Realizar el Test para cuarenta (40) a  noventa y nueve (99) 3 puntos

7.- Realizar el Test para cien (100) 3 puntos
 
8.- Realizar el Test para 101 y realizar refactoring 4 puntos

*/

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnterosInglesTest {


@Test
public void pantallaTest()
{
    //datos
    //Ejecutar
    Traductor traductor = new Traductor();
    //Verificar
    System.out.println(traductor.getNumeroEntero());
    System.out.println(traductor.getLetra());
}
    
@Test
public void traducirInglesParaUno()
{
    //datos
    int traducir = 1;
    //Ejecutar
    Traductor traductor = new Traductor();
    //Verificar
    assertEquals("one", traductor.verificar(traducir));
}

@Test
public void traducirInglesParaDos()
{
    //datos
    int traducir = 2;
    //Ejecutar
    Traductor traductor = new Traductor();
    //Verificar
    assertEquals("two", traductor.verificar(traducir));
}

@Test
public void traducirInglesParaVeinte()
{
    //datos
    int traducir = 20;
    //Ejecutar
    Traductor traductor = new Traductor();
    //Verificar
    assertEquals("twenty", traductor.verificar(traducir));
}

@Test
public void traducirInglesParaVeinteUnoAVentinueve()
{
    //datos hacer con arreglo simple
    int traducir = 0;
    int comprobar[] = {21,22,23,24,25,26,27,28,29};
    for(int i = 0; i < comprobar.length; i++)
    {
        traducir = comprobar[i];
    }
    
    String resultado = null;
    String letra[] = {"twenty one", "twenty two", "twenty three", "twenty four", 
        "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine"};
    for(int j = 0; j < letra.length; j++)
    {
        resultado = letra[j];
    }
    //Ejecutar
    Traductor traductor = new Traductor();
    //Verificar
    assertEquals(resultado, traductor.verificar(traducir));  
}

@Test
public void traducirInglesParaTreintaATreintinueve()
{
    //datos hacer con arreglo simple
    int traducir = 0;
    int comprobar[] = {30,31,32,33,34,35,36,37,38,39};
    for(int i = 0; i < comprobar.length; i++)
    {
        traducir = comprobar[i];
    }
    
    String resultado = null;
    String letra[] = {"tirthy", "tirthy one", "tirthy two", "tirthy three", "tirthy four", 
        "tirthy five", "tirthy six", "tirthy seven", "tirthy eight", "tirthy nine"};
    for(int j = 0; j < letra.length; j++)
    {
        resultado = letra[j];
    }
    //Ejecutar
    Traductor traductor = new Traductor();
    //Verificar
    assertEquals(resultado, traductor.verificar(traducir));  
}

@Test
public void traducirInglesParaCuarentaANoventinueve()
{
    //datos hacer con arreglo simple
    int traducir = 0;
    String resultado = null;
    Traductor obtener = new Traductor();
    ArrayList<Integer> numero = obtener.getNumeroEntero();
    ArrayList<String> letra = obtener.getLetra();
    //ejecutar
    for(int i = 40; i < 99; i++)
    {
        if(i == numero.get(i))
        {
            traducir = numero.get(i);
            resultado = letra.get(i);
        }
    }
    Traductor traductor = new Traductor();
    assertEquals(resultado, traductor.verificar(traducir));
}

@Test
public void traducirInglesParaCien()
{
    //datos
    int traducir = 100;
    //Ejecutar
    Traductor traductor = new Traductor();
    //Verificar
    assertEquals("hundred", traductor.verificar(traducir));
}

@Test
public void traducirInglesParaCientoUno()
{
    //datos
    int traducir = 101;
    //Ejecutar
    Traductor traductor = new Traductor();
    //Verificar
    assertEquals("one hundred one", traductor.verificar(traducir));
}

}
