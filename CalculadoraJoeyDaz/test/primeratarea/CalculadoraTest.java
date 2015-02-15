package primeratarea;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.internal.matchers.StringContains.containsString;

public class CalculadoraTest {

    @Test
    public void agregarRetornaCeroCuandoLaEntradaEsVacia() {
        int resultado = Calculadora.agregar("");
        assertEquals(0, resultado);
    }

    @Test
    public void agregarRetornaCeroCuandoLaEntradaEsNula() {

        int resultado = Calculadora.agregar(null);
        assertEquals(0, resultado);
    }

    @Test
    public void agregarRetornaNumeroCuandoLaEntradaEsSimpleNumeroEnString() {

        int resultado = Calculadora.agregar("0");
        assertEquals(0, resultado);
        resultado = Calculadora.agregar("1");
        assertEquals(1, resultado);
        resultado = Calculadora.agregar("2");
        assertEquals(2, resultado);
        resultado = Calculadora.agregar("3");
        assertEquals(3, resultado);
    }

    @Test
    public void agregarRetornaNumeroCuandoLaEntradaSonVariosNumerosEnString() {
        int resultado = Calculadora.agregar("0,1,2,3,4,555");
        assertEquals(565, resultado);
    }

    @Test
    public void agregarRetornaSumaCuandoLaEntradaEsMultiplesNumerosEnStringConNuevaLineaComoDelimitador() {
        int resultado = Calculadora.agregar("1,2,3");
        assertEquals(6, resultado);
        resultado = Calculadora.agregar("3\n2");
        assertEquals(5, resultado);
        resultado = Calculadora.agregar("1\n2,3");
        assertEquals(6, resultado);
        resultado = Calculadora.agregar("1\n2\n3,4,5");
        assertEquals(15, resultado);
    }

    @Test
    public void agregarRetornaSumaCuandoLaEntradaEsMultipleNumerosEnString() {
        int resultado = Calculadora.agregar("0,3,3");
        assertEquals(6, resultado);
        resultado = Calculadora.agregar("0,2,2");
        assertEquals(4, resultado);
    }

    @Test
    public void agregarRetornaSumaIgnorandoCantidadesMayoresAMil() {
        int resultado = Calculadora.agregar("0,3,1001");
        assertEquals(3, resultado);
        resultado = Calculadora.agregar("0,3,1000");
        assertEquals(1003, resultado);
    }

     
    @Test
    public void agregarCuandoLaEntradaDefineDelimitadorYSeUsaDelimitador() {
        int resultado = Calculadora.agregar("//*\n1*2");
        assertEquals(3, resultado);
        resultado = Calculadora.agregar("//;\n1;2");
        assertEquals(3, resultado);
        resultado = Calculadora.agregar("//;\n1;2;3;4;5;6;7;8;9;10");
        assertEquals(55, resultado);        
    }
    
   /*//Recuerde que este ya es opcional
    @Test 
    public void agregarArrojaArgumentExceptionCuandoLaEntradaStringNoSigueLasReglas() {
        
        try {
            int resultado = Calculadora.agregar("1,-1");
            fail("expected IllegalArgumentException for agregar");
        } catch (IllegalArgumentException ex) {
            assertThat(ex.getMessage(), 
                    containsString(
                            String.format("string contiene [{0}], el cual no "
                                    + "corresponde con las reglas. Los numeros ingresados"
                                    + " no pueden ser negativos.", "-1")));
        }        
    }
    */
}
