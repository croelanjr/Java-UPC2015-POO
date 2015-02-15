package bancosingleton;

public class CuentaNormal extends Cuenta{

   private final double creditoMaximo;
    
    public CuentaNormal(double balance) {
        this(balance, 0);
    }
    
    public CuentaNormal(double balance, double creditoMaximo) {
        super(balance);
        this.creditoMaximo = creditoMaximo;
    }
    
    @Override
    public boolean retirar(double cantidad) {
        if(cantidad <= balance + creditoMaximo) {
            balance -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getDescripcion() {
        return "Cuenta Normal";
    }
    
    
    
}
