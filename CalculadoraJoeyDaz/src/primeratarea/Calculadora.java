package primeratarea;

import java.util.Arrays;

public class Calculadora {
    
    private String resulta;
    

    public static int agregar(String resulta) {
        int mensaje = 0;
        if(resulta == "" || resulta == null)
        {
            mensaje = 0;
        }
        else if(resulta != null )
        {
            String[] cadena = resulta.split("\\D+");
            for(int a = 0; a < cadena.length; a++)
            {
            if("".equals(cadena[0]))
                cadena[0] = "0";
            }
            for(int i = 0; i < cadena.length; i++)
            {            
                if(Integer.parseInt(cadena[i]) < 1001)
                {
                    mensaje = mensaje + Integer.parseInt(cadena[i]);
                }
            }
        }
        return mensaje;
    }
}