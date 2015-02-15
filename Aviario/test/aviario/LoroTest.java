package aviario;

import model.Loro;
import appinterfaces.IAve;
import junit.framework.Assert;
import org.junit.Test;

public class LoroTest {
    @Test
    public void loroDebeReconocerComportamientoDeAve(){
        String codigo = "LO001";
        String nombre = "Loro";
        double precio = 100.00;
        String nombreCientifico = "Lorus";
        IAve loro = new Loro(codigo,nombre,precio,nombreCientifico);
        loro.volar();
        loro.cantar();
        String retornado = loro.getNombreCientifico();
        Assert.assertEquals(nombreCientifico,retornado);
    }
}
