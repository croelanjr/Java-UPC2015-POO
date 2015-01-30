package Criptografia;

class Criptografia {
    private String frase;
    
    public Criptografia()
    {
        
    }

    public Criptografia(String frase) {
        this.frase = frase;
    }


    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String conversionMurcielago(String frase) {
        char[] cadena = frase.toCharArray();
        StringBuffer mensaje = new StringBuffer();
        for(int i = 0; i < cadena.length; i++)
        {
            if(cadena[i] == '1')
            {
                mensaje.append('M');
            }
            else if(cadena[i] == '2')
            {
                mensaje.append('U');
            }
            else if(cadena[i] == '3')
            {
                mensaje.append('R');
            }
            else if(cadena[i] == '4')
            {
                mensaje.append('C');
            }
            else if(cadena[i] == '5')
            {
                mensaje.append('I');
            }
            else if(cadena[i] == '6')
            {
                mensaje.append('E');
            }
            else if(cadena[i] == '7')
            {
                mensaje.append('L');
            }
            else if(cadena[i] == '8')
            {
                mensaje.append('A');
            }
            else if(cadena[i] == '9')
            {
                mensaje.append('G');
            }
            else if(cadena[i] == '0')
            {
                mensaje.append('O');
            }
            else
            {
                mensaje.append(cadena[i]);
            }
         }
        System.out.println("La Frase (Murcielago): " + mensaje.toString());
        return mensaje.toString();
    }

    public String conversionAurelio(String frase) {
        char[] cadena = frase.toCharArray();
        StringBuffer mensaje = new StringBuffer();
        for(int i = 0; i < cadena.length; i++)
        {
            if(cadena[i] == '1')
            {
                mensaje.append('A');
            }
            else if(cadena[i] == '2')
            {
                mensaje.append('U');
            }
            else if(cadena[i] == '3')
            {
                mensaje.append('R');
            }
            else if(cadena[i] == '4')
            {
                mensaje.append('E');
            }
            else if(cadena[i] == '5')
            {
                mensaje.append('L');
            }
            else if(cadena[i] == '6')
            {
                mensaje.append('I');
            }
            else if(cadena[i] == '7')
            {
                mensaje.append('O');
            }
            else
            {
                mensaje.append(cadena[i]);
            }
         }
        System.out.println("La Frase (Aurelio): " + mensaje.toString());
        return mensaje.toString();
    }

    public String invertirConversion(String frase) {
        char[] cadena = frase.toCharArray();
        StringBuffer mensaje = new StringBuffer();
        for(int i = 0; i < cadena.length; i++)
        {
            if(cadena[i] == '$')
            {
                mensaje.append('N');
            }
            else if(cadena[i] == '%')
            {
                mensaje.append('S');
            }
            else if(cadena[i] == '#')
            {
                mensaje.append('A');
            }
            else if(cadena[i] == '?')
            {
                mensaje.append('E');
            }
            else if(cadena[i] == '&')
            {
                mensaje.append('R');
            }
            else if(cadena[i] == '!')
            {
                mensaje.append('P');
            }
            else if(cadena[i] == '+')
            {
                mensaje.append('O');
            }
            else
            {
                mensaje.append(cadena[i]);
            }
         }
        System.out.println("La frase (Invertida): " + mensaje.reverse().toString());
        String invertida = mensaje.reverse().toString();
        StringBuffer resultado = new StringBuffer(invertida);
        String invertido = resultado.reverse().toString();
        return invertido;
    }
    
    
}
