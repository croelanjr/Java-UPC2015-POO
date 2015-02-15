package bancosingleton;

public abstract class Cuenta {
    
    protected double balance;
    
    public Cuenta(double balance) {
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void depositar(double cantidad) {
        balance += cantidad;
    }
    
    @Override
    public String toString() {
        return getDescripcion() + ": El actual balance es " + balance;
    }
    
    public abstract boolean retirar(double cantidad);
    
    public abstract String getDescripcion();
    
}
