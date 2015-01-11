package JuegoHeadFirst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JuegoAyudas {
    
    private InputStream entra;
    
    public JuegoAyudas()
    {
        entra = System.in; 
    }

    public void setEntra(InputStream entra) {
        this.entra = entra;
    }
    
    public String getEntradaUsuario(String prompt) {
        String entradaLinea = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(entra));
            entradaLinea = is.readLine();
            //if (entradaLinea.length() == 0) return null;
        }
        catch (IOException e) 
        {
            System.out.println("IOException: " + e);
        }
        return entradaLinea;
    }
}