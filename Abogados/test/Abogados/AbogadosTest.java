package Abogados;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class AbogadosTest {

@Test
public void calcularPagarPersonaNaturalUnAbogado()
{
    //Datos
    Abogados abogado = new Abogados();
    Natural Pnatural1 = new Natural("Croelan Grandez", "10260429", "981342988", "laboral", 1000.00);
    Natural Pnatural2 = new Natural("Rosa Oliver", "10260430", "981342989", "civil", 1500.00);
    Natural Pnatural3 = new Natural("Pasteur Colonia", "10260431", "98134308", "penal", 1200.00);
    //Ejecutar
    ArrayList<Natural> natural = new ArrayList<>();
    ArrayList<Double> resultado = new ArrayList<Double>();
    //Verificar
    natural.add(Pnatural1);
    natural.add(Pnatural2);
    natural.add(Pnatural3);
    double resulta[] = { 11250.0, 16500.0, 14250.0 };
    for(int i = 0; i < resulta.length; i++)
    {
        resultado.add(resulta[i]);
    }
    assertEquals(resultado, abogado.getCalcularNatural(natural));
}

@Test
public void calcularPagarPersonaJuridicaUnAbogado()
{
    //Datos
    Abogados abogado = new Abogados();
    Juridica Pjuridica1 = new Juridica("CBS Corporation", "20523295404", "81342988", "Fernando Belaunde", "laboral", 1700.00);
    Juridica Pjuridica2 = new Juridica("CarbonStar", "20512645098", "81342989", "Pastor Aleman", "civil", 1900.00);
    Juridica Pjuridica3 = new Juridica("Corporation Amaleto", "20557962560", "8134308", "Jack Bauer", "penal", 1200.00);
    //Ejecutar
    ArrayList<Juridica> juridica = new ArrayList<>();
    ArrayList<Double> resultado = new ArrayList<Double>();
    //Verificar
    juridica.add(Pjuridica1);
    juridica.add(Pjuridica2);
    juridica.add(Pjuridica3);
    double resulta[] = { 5750.0, 7200.0, 6900.0 };
    for(int i = 0; i < resulta.length; i++)
    {
        resultado.add(resulta[i]);
    }
    assertEquals(resultado, abogado.getCalcularJuridica(juridica));
}

@Test
public void calcularDebePagarAbogadoTodosSusCasos()
{
    //Datos
    Abogados abogado = new Abogados();
    Natural Pnatural1 = new Natural("Croelan Grandez", "10260429", "981342988", "laboral", 1000.00);
    Natural Pnatural2 = new Natural("Rosa Oliver", "10260430", "981342989", "civil", 1500.00);
    Natural Pnatural3 = new Natural("Pasteur Colonia", "10260431", "98134308", "penal", 1200.00);
    
    Juridica Pjuridica1 = new Juridica("CBS Corporation", "20523295404", "81342988", "Fernando Belaunde", "laboral", 1700.00);
    Juridica Pjuridica2 = new Juridica("CarbonStar", "20512645098", "81342989", "Pastor Aleman", "civil", 1900.00);
    Juridica Pjuridica3 = new Juridica("Corporation Amaleto", "20557962560", "8134308", "Jack Bauer", "penal", 1200.00);

    ArrayList<Juridica> juridica = new ArrayList<>();
    ArrayList<Natural> natural = new ArrayList<>();
    
    ArrayList<Double> resultado = new ArrayList<Double>();
    //Ejecutar
    natural.add(Pnatural1);
    natural.add(Pnatural2);
    natural.add(Pnatural3);
    
    juridica.add(Pjuridica1);
    juridica.add(Pjuridica2);
    juridica.add(Pjuridica3);
    double resulta[] = { 17000.0, 23700.0, 21150.0 };
    for(int i = 0; i < resulta.length; i++)
    {
        resultado.add(resulta[i]);
    }
    //verificar
    assertEquals(resultado, abogado.getPagarAbogado(natural, juridica));
}


}
