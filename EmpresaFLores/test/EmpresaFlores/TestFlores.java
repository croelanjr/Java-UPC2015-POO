package EmpresaFlores;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestFlores {

    @Test
    public void testMain() {
        int cantidad = 20;
        Flor f1 = new Flor("Violeta", "azul", 30);
        Flor f2 = new Flor("Rosa", "roja", 40);
        System.out.println("Hay una " + f2.getTipo() + " de  color:"
                + f2.getColor());
        System.out.println("y cada una cuesta: " + f1.getPrecio() + " y "
                + f2.getPrecio());
        f1.juntar(f2);
        System.out.println("Combinados en un ramo cuestan: " + f1.getPrecio());
    }

}
