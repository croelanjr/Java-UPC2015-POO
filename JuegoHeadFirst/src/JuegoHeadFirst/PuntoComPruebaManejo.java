package JuegoHeadFirst;

import java.util.ArrayList;

public class PuntoComPruebaManejo {
    public static void main (String[] args) {
        JuegoSimplePuntoCom punto = new JuegoSimplePuntoCom();
        int[] posicion = {2,3,4};
        ArrayList<String> ubicacion = new ArrayList<String>();
        ubicacion.add(String.valueOf(posicion[0]));
        ubicacion.add(String.valueOf(posicion[1] + 1));
        ubicacion.add(String.valueOf(posicion[2] + 2));        
        punto.setCeldasUbicacion(ubicacion);
        String UsuarioAdivino = "1";
        String resultado = punto.comprobandoSuUbicacion(UsuarioAdivino);
        
        String pruebaResultado = "Mierda..Cayo!!";

        if (resultado.equals("GOLPEANDO")) {
            pruebaResultado = "PASANDO";
        }

        System.out.println(pruebaResultado);
    }
}
