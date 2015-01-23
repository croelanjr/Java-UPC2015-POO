package Triangulo;

import org.junit.Test;
import static org.junit.Assert.*;

public class TrianguloTest {
    
@Test
public void CalcularLongitudTest()
{
    //Datos
    Punto punto1 = new Punto(3, 2);
    Punto punto2 = new Punto(7, 3);
    //Ejecutar
    Recta recta = new Recta(punto1, punto2);
    //Verificar
    System.out.println("La longitud de la Recta es: " + recta.getCalcularLongitud());    
}

@Test
public void CalcularPendienteTest()
{
    //Datos
    Punto punto1 = new Punto(3, 2);
    Punto punto2 = new Punto(7, 3);
    //Ejecutar
    Recta recta = new Recta(punto1, punto2);
    //Verificar
    System.out.println("La Pendiente de la Recta es: " + recta.getCalcularPendiente());    
}

@Test
public void CalcularPuntoMedioTest()
{
    //Datos
    Punto punto1 = new Punto(3, 2);
    Punto punto2 = new Punto(7, 3);
    //Ejecutar
    Recta recta = new Recta(punto1, punto2);
    //Verificar
    System.out.println("El Punto Medio es : ( " + recta.getPmedioX() + ", " + recta.getPmedioY() + " )");
}
    
}
