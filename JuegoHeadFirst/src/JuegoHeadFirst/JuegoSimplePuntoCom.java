package JuegoHeadFirst;

import java.util.List;

public class JuegoSimplePuntoCom
{
private List<String> CeldasUbicacion;

public void setCeldasUbicacion(List<String> ubicacion) {
        CeldasUbicacion = ubicacion;
    }

public String comprobandoSuUbicacion(String UsuarioAdivino) {
        String resultado = "MISS";
        
        int indexado = CeldasUbicacion.indexOf(UsuarioAdivino);
        if(indexado >= 0)
        {
            CeldasUbicacion.remove(indexado);
            if(CeldasUbicacion.isEmpty())
            {
                resultado = "MUERTO";
            }
            else
            {
                resultado = "GOLPEANDO";
            }
        }
        return resultado;
    } 
public boolean isValid(String nombreUsuario)
{
    return ("ARAÑA".equals(nombreUsuario));
}
}

