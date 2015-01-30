package EnterosIngles;

import java.util.ArrayList;

class Traductor {
    
    private String letter[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private String letter1[] = {"ten", "twenty", "tirthy", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private ArrayList<String> letra = new ArrayList<String>();
    private ArrayList<Integer> numero = new ArrayList<Integer>();
    
    public Traductor()
    {
     
    }

    public ArrayList<Integer> getNumeroEntero()
    {
        int ultimo = 0;
        for(int g = 0; g < 109; g++)
        {
            ultimo = ultimo + 1;
            numero.add(ultimo);
        }
        return numero;
    }

    public ArrayList<String> getLetra()
    {
        String linea = null;
        for(int i = 0; i < 9; i++)
        {
            linea = letter[i];
            letra.add(linea);
        }
        
        letra.add(letter1[0]);
        
        for(int o = 0; o < 9; o++)
        {
            linea = letter1[0] + " " + letter[o];
            letra.add(linea);
        }
        
        letra.add(letter1[1]);
        
        for(int p = 0; p < 9; p++)
        {
            linea = letter1[1] + " " + letter[p];
            letra.add(linea);
        }
        
        letra.add(letter1[2]);
        
        for(int p = 0; p < 9; p++)
        {
            linea = letter1[2] + " " + letter[p];
            letra.add(linea);
        }
        
        letra.add(letter1[3]);
        
        for(int p = 0; p < 9; p++)
        {
            linea = letter1[3] + " " + letter[p];
            letra.add(linea);
        }
        
        letra.add(letter1[4]);
        
        for(int p = 0; p < 9; p++)
        {
            linea = letter1[4] + " " + letter[p];
            letra.add(linea);
        }
        
        letra.add(letter1[5]);
        
        for(int p = 0; p < 9; p++)
        {
            linea = letter1[5] + " " + letter[p];
            letra.add(linea);
        }
        
        letra.add(letter1[6]);
        
        for(int p = 0; p < 9; p++)
        {
            linea = letter1[6] + " " + letter[p];
            letra.add(linea);
        }
        
        letra.add(letter1[7]);
        
        for(int p = 0; p < 9; p++)
        {
            linea = letter1[7] + " " + letter[p];
            letra.add(linea);
        }
        
        letra.add(letter1[8]);
        
        for(int p = 0; p < 9; p++)
        {
            linea = letter1[8] + " " + letter[p];
            letra.add(linea);
        }
        
        letra.add("hundred");
        
        for(int p = 0; p < 9; p++)
        {
            linea = letter[0] + " hundred " + letter[p];
            letra.add(linea);
        }
       return letra;
    }

    public String verificar(int traducir) {
        String traducida = null;
        int cantidad = getNumeroEntero().size();
        for(int i = 0; i < cantidad; i++)
        {
            Integer numerico = getNumeroEntero().get(i);
            String letraingles = getLetra().get(i);
            if(traducir == numerico)
            {
                traducida = letraingles;
            }
        }        
        return traducida;
    }
}
