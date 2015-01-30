package Criptografia;

import org.junit.Test;
import static org.junit.Assert.*;

public class CriptografiaTest {
    
@Test
public void desencriptarconversionMurcielagoCadaUnaLetraPorNumero()
{
    String frase = "40N 6ST0 Y8 8P30B6 67 423S0";
    //Ejecutar
    Criptografia criptografia = new Criptografia();
    //Verificar
    assertEquals("CON ESTO YA APROBE EL CURSO", criptografia.conversionMurcielago(frase));
}

@Test
public void desencriptarconversionAurelioCadaUnaLetraPorNumero()
{
    String frase = "57G34 T43M6N13";
    //StringBuffer resultado = new StringBuffer();
    //Ejecutar
    Criptografia criptografia = new Criptografia();
    //Verificar 
    assertEquals("LOGRE TERMINAR", criptografia.conversionAurelio(frase));
}

@Test
public void desencriptarInvertirConversionCadaUnaLetraPorSimbolo()
{
    String frase = "#T%?U!%?& #L %? #T%?";
    //Ejecutar
    Criptografia criptografia = new Criptografia();
    //Verificar
    assertEquals("ESTA ES LA RESPUESTA", criptografia.invertirConversion(frase));
}

}
